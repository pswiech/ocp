package com.pswiech;

import java.util.Comparator;

public class NameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((ReiseAngebot) o1).getHotelName().compareTo(((ReiseAngebot) o2).getHotelName());
    }
}
