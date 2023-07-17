package com.bridgelabzhotelreservationsystem;
import java.util.HashMap;
import java.util.Map;
public class HotelReservation {
    private Map<String, Integer>
            regularWeekdayRates;
    private Map<String, Integer>
            regularWeekendRates;

    public HotelReservation() {
        regularWeekdayRates = new HashMap<>();
        regularWeekendRates = new HashMap<>();
    }
    public void addHotel(String hotelName,int weekdayRate,int weekendRate) {
        regularWeekdayRates.put(hotelName, weekdayRate);
        regularWeekendRates.put(hotelName, weekendRate);
    }
    public static void main(String[] args) {
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood",110,90);
        hotelReservation.addHotel("Bridgewood",160,60);
        hotelReservation.addHotel("Ridgewood",220,150);
        System.out.println("Hotels and theirs rates for regular customers:");
        for (String hotelName : hotelReservation.regularWeekdayRates.keySet())
        {
            int weekdayRate = hotelReservation.regularWeekdayRates.get(hotelName);
            int weekendRate = hotelReservation.regularWeekendRates.get(hotelName);
            System.out.println(hotelName + " Weekday Rate: $" + weekdayRate + " weekend Rate: $" + weekendRate);
        }
    }
}
