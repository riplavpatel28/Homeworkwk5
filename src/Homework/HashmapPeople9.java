package Homework;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

public class HashmapPeople9 {
    public static void main(String[] args) {
        HashmapPeople9 hashMapPeople9 = new HashmapPeople9();
        hashMapPeople9.map();

    }

    private void map() {

        Map<String, Integer> people = new HashMap<>();
        people.put("Rupal", 40);
        people.put("Riplav", 40);
        people.put("Shivam", 7);


        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }
}

