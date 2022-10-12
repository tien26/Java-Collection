package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String,String> empty = Collections.emptyMap();
        Map<String,String> singleton = Collections.singletonMap("name","saya");

        Map<String,String> mutabel = new HashMap<>();
        mutabel.put("name","saya");
        Map<String,String>immutable = Collections.unmodifiableMap(mutabel);

        Map<String,String> map = Map.of(
                "first","aku",
                "middle","kamu",
                "last","dia"
        );

//        map.put("a","A"); error
    }
}
