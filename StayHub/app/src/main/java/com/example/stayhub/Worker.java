import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Map;

public class Worker {

    public static ArrayList<Room> Rooms;

    Worker() {
    }

    public void AddRoom(Room room) {
        Worker.Rooms.add(room);
    }

    public void ViewReservations(String owner) {
        for (Room room : Rooms) {
            // check the rooms of the owner
            if (room.getOwner().equals(owner)) {
                // get the reservations for each owner's rooms
                for (Map.Entry<LocalDate, Reservation> res : (room.getReservationSystem()).getReservations()
                        .entrySet()) {
                    System.out.println(res);
                }
            }
        }
    }

    public void book(Room room, LocalDate Start, LocalDate End, String guestName) {
        room.getReservationSystem().makeReservation(Start, End, guestName, room);
    }

    // think how to pass the filters
    public void Search() {
    }
}
