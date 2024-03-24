package com.example.stayhub;


import java.util.Scanner;
import java.time.LocalDate;
import org.json.*;

public class dummy {

    public static void main(String[] args) {

        Master master = new Master();
        Room room = new Room();
        Scanner scan = new Scanner(System.in);
        String answ;
        //JSONObject json = new JSONObject();

        System.out.print("Select User:\n1)Manager\n2)Costumer\n");
        String answ2 = scan.nextLine();
        while (!(answ2.equals("1") || answ2.equals("2"))) {
            System.out.println("Wrong answer try again !");
            System.out.print("Select User:\n1)Manager\n2)Costumer\n");
            answ2 = scan.nextLine();
        }

        switch (answ2) {

            case "1": // Manager
                while(true) {
                    System.out.println("Give me your manager name: ");
                    String managerName = scan.nextLine();
                    System.out.println("You are a Manager what would you like to do?" +
                            "\n1)Add Room - Villa and available dates" +
                            "\n2)View reservations");
                    answ = scan.nextLine();
                    while (!(answ.equals("1") || answ.equals("2"))) {
                        System.out.println("Wrong answer try again !");
                        System.out.println("\n1)Add Room - Villa and available dates" +
                                "\n2)View reservations");
                        answ = scan.nextLine();
                    }

                    switch (answ) {
                        //TODO Na kano to Read meso JSON input
                        case "1":
                            System.out.println("Please give me the Name of your property : ");
                            answ = scan.nextLine();
                            String propName = answ;

                            System.out.println("Please give me the Number of person your property can accommodate : ");
                            answ = scan.nextLine();
                            int numOfPerson = Integer.valueOf(answ);

                            System.out.println("Please give me the Area that your property is located in : ");
                            answ = scan.nextLine();
                            String area = answ;

                            System.out.println("Please give me the Rating (1-5) of your property : ");
                            answ = scan.nextLine();
                            float rating = Float.valueOf(answ);

                            System.out.println("Please give me the Number of Reviews your property has: ");
                            answ = scan.nextLine();
                            int numOfReviews = Integer.valueOf(answ);

                            System.out.println("Please give me the URL or the path to the image of your property: ");
                            answ = scan.nextLine();
                            String URL = answ;

                            // Room Handling
                            room.setOwner(managerName);
                            room.setPropertyName(propName);
                            room.setNoOfPeople(numOfPerson);
                            room.setArea(area);
                            room.setRating(rating);
                            room.setNoOfReviews(numOfReviews);
                            room.setURL(URL);

                            master.AddHash(room);

                            // JSON File Handling
//
//                         json.put("roomName:", propName);
//                         json.put("noOfPersons:", numOfPerson);
//                         json.put("area:", area);
//                         json.put("stars:", rating);
//                         json.put("noOfReviews:", numOfReviews);
//                         json.put("roomImage:", URL);
                            //master.printJSON(json);


                            break;
                        case "2":
                            System.out.println("These are the reservations: ");
                            master.ShowReservations(managerName);
                            break;
                    }

                }
            case "2": // Costumer
            System.out.println("You are Costumer");
                System.out.println("Give me your name: ");
                String client = scan.nextLine();
                System.out.println("You are a Manager what would you like to do?" +
                        "\n1)Add Room - Villa and available dates" +
                        "\n2)View reservations" +
                        "\n3)View all reservations by Area");

                System.out.println("Please give me the Number of persons: ");
                answ = scan.nextLine();
                int numOfPerson = Integer.valueOf(answ);

                System.out.println("Please give me the Area in which you are searching for room : ");
                answ = scan.nextLine();
                String area = answ;

                System.out.println("Please give me the Rating (1-5) of your property : ");
                answ = scan.nextLine();
                float rating = Float.valueOf(answ);

                // save to json
                System.out.println("Search for available Rooms - Villas");
                // call master

                System.out.println("Are you interested to book a room from above?");
                answ = scan.nextLine();

                if (answ.equals("Yes")) {
                    System.out.println("Give me the name of the property you want to rent: ");
                    String nameofHotel = scan.nextLine();
                    //TODO ...

                    System.out.println("Give me the start date of your reservation:\nYear: ");
                    int year =Integer.valueOf(scan.nextLine());
                    System.out.println("Month:");
                    int month =Integer.valueOf(scan.nextLine());
                    System.out.println("Day:");
                    int day =Integer.valueOf(scan.nextLine());
                    LocalDate startDay = LocalDate.of(year,month,day) ;
                    System.out.println("Give me the end date of your reservation:\nYear: ");
                    int endyear =Integer.valueOf(scan.nextLine());
                    System.out.println("Month:");
                    int endmonth =Integer.valueOf(scan.nextLine());
                    System.out.println("Day:");
                    int endday =Integer.valueOf(scan.nextLine());
                    LocalDate endDate = LocalDate.of(endday,endmonth,endday) ;


                }
                break;
        }
    }

}
