package Homework;

import java.util.ArrayList;
import java.util.List;

public class EmptyArrayList7 {
    public static void main(String[] args) {
        EmptyArrayList7 emptyArrayList7 = new EmptyArrayList7();
        emptyArrayList7.arrayListEmpty();
    }

    private void arrayListEmpty() {
        List<String> list = new ArrayList<>();
        list.add("Anu");
        list.add("Neha");
        list.add("Rupal");
        list.add("Khilan");
        list.add("Navil");
        list.add("Jaydeep");
        list.add("Kamlesh");

        System.out.println(list.isEmpty());
    }
}

