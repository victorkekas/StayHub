package com.example.stayhub;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Map;

public class Worker {

    public ArrayList<Room> Rooms= new ArrayList<>() ;

    Worker() {
    }

    public void AddRoom(Room room) {
        this.Rooms.add(room);
        System.out.println("SUCCESSFULLY ADDED ROOM- VILLA :"+ room.getPropertyName() );
    }

    public void ViewReservations(String owner) {
        for (Room room : this.Rooms) {
            // check the rooms of the owner
            if (room.getOwner().equals(owner)) {
                // get the reservations for each owner's rooms
                for (Reservation res : ((room.getReservationSystem()).getReservations()).values()) {

                    System.out.println(res);
                }
            }
        }
    }

    public void book(Room room, LocalDate Start, LocalDate End, String guestName) {
        room.getReservationSystem().makeReservation(Start, End, guestName, room);
    }

    // think how to pass the filters
    public ArrayList<Room> Search(String info) {
        return null;
    }

    public ArrayList<Room> getRooms(){
        return (this.Rooms);
    }
}

