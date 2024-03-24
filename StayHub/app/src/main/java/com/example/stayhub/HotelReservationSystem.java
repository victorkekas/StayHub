package com.example.stayhub;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class HotelReservationSystem {
    private Map<LocalDate, Reservation> reservations= new HashMap<>();

    public HotelReservationSystem() {

    }

    public boolean makeReservation(LocalDate startDate, LocalDate endDate, String guestName, Room room) {
        // Check availability for each date in the range
        for (LocalDate date = startDate; date.isBefore(endDate.plusDays(1)); date = date.plusDays(1)) {
            if (reservations.containsKey(date) && reservations.get(date).getRoom().equals(room)) {
                System.out.println("Already booked for: " + date);
                return false; // Some date in the range is already booked
            }
        }

        // Make reservation
        for (LocalDate date = startDate; date.isBefore(endDate.plusDays(1)); date = date.plusDays(1)) {
            reservations.put(date, new Reservation(guestName, room));
        }
        System.out.println("Done reservation.");

        return true; // Reservation successful
    }

    public boolean cancelReservation(LocalDate startDate, LocalDate endDate) {
        // Cancel reservation for each date in the range
        for (LocalDate date = startDate; date.isBefore(endDate.plusDays(1)); date = date.plusDays(1)) {
            if (!reservations.containsKey(date)) {
                return false; // Some date in the range was not booked
            }
        }

        // Cancel reservation
        for (LocalDate date = startDate; date.isBefore(endDate.plusDays(1)); date = date.plusDays(1)) {
            reservations.remove(date);
        }

        return true; // Cancellation successful
    }

    public Map<LocalDate, Reservation> getReservations() {
        return this.reservations;
    }

    public Reservation getReservations(LocalDate date) {
        return this.reservations.get(date);
    }

}