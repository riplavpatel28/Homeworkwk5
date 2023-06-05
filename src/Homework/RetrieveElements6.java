package Homework;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class RetrieveElements6 {
    public static void main(String[] args) {
        RetrieveElements6 retrieveElement6 = new RetrieveElements6();
        retrieveElement6.retrieve();
    }

    private void retrieve() {
        List<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Pink");
        list.add("Blue");
        list.add("Red");
        list.add("Black");

        System.out.println(list.get(2));
    }
}


