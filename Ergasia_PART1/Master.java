import java.util.ArrayList;
//import org.json.JSONObject;

public class Master {

    private ArrayList<Worker> workers;
    private int numOfworkers;

    Master() {
    }

    public void intitializeWorkers() {
        for (int i = 0; i <= numOfworkers; i++) {
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
        int currentworker = (room.getOwner().hashCode()) % numOfworkers;// ?????
        (workers.get(currentworker)).AddRoom(room);
    }

}
