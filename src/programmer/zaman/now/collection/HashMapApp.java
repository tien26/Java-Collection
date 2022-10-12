package programmer.zaman.now.collection;

import java.util.HashMap;

public class HashMapApp {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("name.first","Irfan");
        map.put("name.middle","tidak");
        map.put("name.last","martien");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.last"));

    }
}
