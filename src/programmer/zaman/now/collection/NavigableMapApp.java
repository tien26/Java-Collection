package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String,String> map = new TreeMap<>();

        map.put("Eko","Eko");
        map.put("Budi","Budi");
        map.put("Joko","Joko");

        for (var value:map.keySet()){
            System.out.println(value);
        }

        System.out.println(map.lowerKey("Eko"));
        System.out.println(map.higherKey("Eko"));

        NavigableMap<String,String> mapDesc = map.descendingMap();
        for (var value:mapDesc.keySet()){
            System.out.println(value);
        }

        NavigableMap<String,String> empty = Collections.emptyNavigableMap();
        NavigableMap<String,String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

//        immutable.put("nama","aku"); error

    }
}
