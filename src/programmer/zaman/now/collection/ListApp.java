package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
//        List<String> strings = new LinkedList<>();

        strings.add("irfan");
        strings.add("ajj");

        strings.set(0,"mama");
        strings.remove(1);
        System.out.println(strings.get(0));

        System.out.println("foreach");

        for (var value :
                strings) {
            System.out.println(value);
        }
    }
}
