package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Irfan","Martien","Programmer","Zaman","Now"));

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> programmer = names.tailSet("Programmer",true);

        for (var value:programmer){
            System.out.println(value);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
//        immutable.add("kaka"); error
    }
}
