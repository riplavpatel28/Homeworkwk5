package Homework;

/**
 * /**
 *  * Declare following two arrylist and compare it.
 *    ArrayList<String> c1= new ArrayList<String>();
 *  * c1.add("Red");
 *  * c1.add("Green");
 *  * c1.add("Black");
 *  * c1.add("White");
 *  * c1.add("Pink");
 *    ArrayList<String> c2= new ArrayList<String>();
 *  * c2.add("Red");
 *  * c2.add("Green");
 *  * c2.add("Black");
 *  * c2.add("Pink");
 *  */

import java.util.ArrayList;
public class ArrayListCompare11 {
    public static void main(String[] args) {

        ArrayListCompare11 arrayListCompare11 = new ArrayListCompare11();
        arrayListCompare11.arrayListCompare();

    }

    private void arrayListCompare() {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        c1.removeAll(c2);

        if (c1.isEmpty()) {
            System.out.println("Both list are equal");
        } else {
            System.out.println("List are not equal");
        }
    }
}

