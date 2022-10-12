package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Irfan");
        collection.add("martioen");
        collection.addAll(List.of("aku","juga"));

        for (var name :
                collection) {
            System.out.println(name);
        }

        System.out.println("remove");
        collection.remove("Irfan");
        collection.removeAll(List.of("aku","juga"));

        for (var name :
                collection) {
            System.out.println(name);
        }

//        cek keberadaan data
        System.out.println(collection.contains("martioen"));
        System.out.println(collection.size());
    }
}
