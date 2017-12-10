package com.pswiech;

import java.util.Comparator;

public class PreisVergleich implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((ReiseAngebot) o1).getPrice()-((ReiseAngebot) o2).getPrice();
    }
}
