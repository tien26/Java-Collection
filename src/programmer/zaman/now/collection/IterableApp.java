package programmer.zaman.now.collection;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        System.out.println("Iterable");
        Iterable<String> names = List.of("Irfan","martin","aku");

        for (var name : names) {
            System.out.println(name);
        }

        System.out.println("Iterator");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
