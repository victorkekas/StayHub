package com.example.stayhub;

import java.util.Scanner;
import org.json.JSONObject;
import org.json.JSONException;

public class dummy {

    public static void main(String[] args) throws JSONException {

        Master master = new Master();
        JSONObject json = new JSONObject();
        Room room = new Room();
        Scanner scan = new Scanner(System.in);

        System.out.print("Select User:\n1)Manager\n2)Costumer\n");
        String answ = scan.nextLine();
        while (!(answ.equals("1") || answ.equals("2"))) {
            System.out.println("Wrong answer try again !");
            System.out.print("Select User:\n1)Manager\n2)Costumer\n");
            answ = scan.nextLine();
        }

        switch (answ){
            case "1" : // Manager

                System.out.println("You are a Manager what would you like to do?"+
                                    "\n1)Add Room - Villa and available dates" +
                                    "\n2)View reservations" +
                                    "\n3)View all reservations by Area");
                answ = scan.nextLine();
                while (!(answ.equals("1") || answ.equals("2")|| answ.equals("3"))) {
                    System.out.println("Wrong answer try again !");
                    System.out.println("\n1)Add Room - Villa and available dates" +
                                        "\n2)View reservations"+
                                        "\n3)View all reservations by Area");
                    answ = scan.nextLine();
                }

            switch (answ){
                case "1":
                    System.out.println("Please give me the Name of your property :");
                    answ = scan.nextLine();
                    String propName=answ;

                    System.out.println("Please give me the Number of person your property can accommodate :");
                    answ = scan.nextLine();
                    int numOfPerson = Integer.valueOf(answ);

                    System.out.println("Please give me the Area that your property is located in :");
                    answ = scan.nextLine();
                    String area = answ;

                    System.out.println("Please give me the Rating (1-5) of your property :");
                    answ = scan.nextLine();
                    float rating = Float.valueOf(answ);

                    System.out.println("Please give me the Number of Reviews your property has:");
                    answ = scan.nextLine();
                    int  numOfReviews= Integer.valueOf(answ);

                    System.out.println("Please give me the URL or the path to the image of your property:");
                    answ = scan.nextLine();
                    String URL = answ;

                    //JSON File Handling

                    json.put("roomName:",propName);
                    json.put("noOfPersons:",numOfPerson);
                    json.put("area:",area);
                    json.put("stars:",rating);
                    json.put("noOfReviews:",numOfReviews);
                    json.put("roomImage:",URL);
                    master.printJSON(json);

                    //Room Handling

                    room.setPropertyName(propName);
                    room.setNoOfPeople(numOfPerson);
                    room.setArea(area);
                    room.setRating(rating);
                    room.setNoOfReviews(numOfReviews);
                    room.setURL(URL);

                    
                case "2":
            }

            case "2": // Costumer

                System.out.println("You are a Costumer Search for available Rooms - Villas");


        }
    }

}

