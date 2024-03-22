import java.util.ArrayList;
import org.json.JSONObject;

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

    public String printJSON(JSONObject json) {
        System.out.println("Printing JSON...");
        return "ok";
    }

    // move the procedure to the right worker
    public void Hashing(String user, int procedure) {
    }

}
