package programmer.zaman.now.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String,String> map = new Hashtable<>();

        map.put("Eko","Eko");
        map.put("Joko","Joko");
        map.put("Budi","Budi");

        for (var key : map.keySet()){
            System.out.println(key);
        }
    }
}
