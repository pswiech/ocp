package com.pswiech;

public class ReiseAngebot {
    private String hotelName;
    private int price;
    private int mark;

    @Override
    public String toString() {
        return hotelName + ' ' + price + ' ' + mark;
    }

    ReiseAngebot(String hotelName, int price, int mark) {
        this.hotelName = hotelName;
        this.price = price;
        this.mark = mark;
    }

    String getHotelName() {
        return hotelName;
    }

    int getPrice() {
        return price;
    }

    int getMark() {
        return mark;
    }
}
