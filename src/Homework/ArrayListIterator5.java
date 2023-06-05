package Homework;
/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterator5 {
    public static void main(String[] args) {
        ArrayListIterator5 arrayListIterator5 = new ArrayListIterator5();
        arrayListIterator5.arrayIterator();
    }

    private void arrayIterator() {
        List<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Pink");
        list.add("Blue");
        list.add("Red");
        list.add("Black");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


