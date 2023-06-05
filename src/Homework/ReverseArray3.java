package Homework;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class ReverseArray3 {
    public static void main(String[] args) {
        ReverseArray3 reverseArray3 = new ReverseArray3();
        reverseArray3.reverse();
    }

    private void reverse() {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println("Before reverse");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //array[0] -- 10
        //array[1] -- 20
        //array[2]  -- 30
        //array[3]  -- 40
        //array[5]  -- 50


        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        //50 20 30 40 10
        //50 40 30 20 10

        System.out.println("After reverse");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}