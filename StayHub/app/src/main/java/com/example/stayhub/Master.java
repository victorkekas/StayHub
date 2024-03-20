package com.example.stayhub;

import org.json.JSONObject;

public class Master {

    Worker worker1= new Worker();
    Worker worker2= new Worker();
    Worker worker3= new Worker();

    Master(){}

    public String printJSON(JSONObject json){
        System.out.println("Printing JSON...");
        return "ok";
    }

}
