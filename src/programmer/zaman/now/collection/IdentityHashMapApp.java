package programmer.zaman.now.collection;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    public static void main(String[] args) {
        Map<String,String> map = new IdentityHashMap<>();

        String key1 = "name.first";

        String name = "name";
        String first = "first";

        String key2 = name + "." + first;

        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2);

        map.put(key1,"Eko");
        map.put(key2,"Eko");

        System.out.println(map.size());

    }
}
