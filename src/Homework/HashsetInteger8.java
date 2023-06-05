package Homework;

/**Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 else)
 *
 */

import java.util.HashSet;
import java.util.Set;

public class HashsetInteger8 {
    public static void main(String[] args) {
        HashsetInteger8 hashSetInteger8 = new HashsetInteger8();
        hashSetInteger8.set();
    }

    private void set() {
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(8);

        for (int i = 0; i < 10; ++i) {
            if(set.contains(i)){
                System.out.println("Number available :" + i);
            }
        }
    }
}