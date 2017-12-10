package com.pswiech;

import java.util.ArrayList;
import java.util.Collections;


// Ctrl+Shift+L format
// Ctrl-D duplicate
// Ctrl-Alt-O organize imports
// Alt+Enter podpowiedz
// Ctrl+Shift+Up/Down move
// Ctrl+Y delete line
// Shift+F6 rename


public class Main {

    public static void main(String[] args) {

        ArrayList<ReiseAngebot> angebote = new ArrayList<>();
        angebote.add(new ReiseAngebot("Aurora", 1000, 91));
        angebote.add(new ReiseAngebot("Sunshine", 1300, 86));
        angebote.add(new ReiseAngebot("Barbarella", 840, 75));
        angebote.add(new ReiseAngebot("California", 450, 46));

        //Collections.sort(angebote, new PreisVergleich());
        //Collections.sort(angebote, new MarkComparator());
        Collections.sort(angebote, new NameComparator());

        for (ReiseAngebot a: angebote) {
            System.out.println(a);
        }
    }
}
