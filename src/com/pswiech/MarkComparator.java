package com.pswiech;

import java.util.Comparator;

public class MarkComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return ((ReiseAngebot) o1).getMark()-((ReiseAngebot) o2).getMark();
    }
}
