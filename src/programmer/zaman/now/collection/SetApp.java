package programmer.zaman.now.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
//        Set<String> names = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();
        names.add("aku");
        names.add("dia");
        names.add("saya");
        names.add("aku");
        names.add("aku");
        names.add("aku");

        for (var value: names){
            System.out.println(value);
        }
    }
}
