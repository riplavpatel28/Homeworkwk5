package Homework;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

public class Colours4 {
    public static void main(String[] args) {
        Colours4 colours4 = new Colours4();
        colours4.colourArrayList();
    }

    public void colourArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Black");
        list.add("Pink");
        list.add("white");
        list.add("Red");

        for (String temp : list) {
            System.out.println(temp);
        }
    }
}














