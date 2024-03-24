package com.example.stayhub;

import androidx.activity.SystemBarStyle;

import org.json.JSONObject;

import java.util.ArrayList;
//import org.json.JSONObject;

public class Master {
//TODO oi workers na einai osa kai ta TCP connections
    private ArrayList<Worker> workers= new ArrayList<>();

    private int numOfworkers= 3;

    Master() {
        intitializeWorkers();
    }

    public void intitializeWorkers() {
        for (int i = 0; i < numOfworkers; i++) {
            workers.add(new Worker());
        }
    }

    // move the procedure to the right worker
    public void SearchRoomsbyfilters(Room filterRoom) {// json in position of room
        // use map reduce
    }

    public void MakeReservation(Room room) {// json in position of room
        // use map reduce
    }

    // hash funciton for the room addition
    public void AddHash(Room room) {
        byte[] currentworker = (room.getOwner().getBytes());
        int tot =0;
        for(byte b:currentworker){
            tot+=b;
        }

        (workers.get(tot%numOfworkers)).AddRoom(room);
        System.out.println("-------------Hash Code ----------");
        System.out.println(tot%numOfworkers);
        System.out.println("---------------Total Reservations----------");
        System.out.println(workers.get(tot%numOfworkers).getRooms());

    }

    public void printJSON(JSONObject json) {
        System.out.println("Printing...");
    }

    public void ShowReservations(String managerName){
        for (Worker worker:workers){
            worker.ViewReservations(managerName);
        }
    }
}
