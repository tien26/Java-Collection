package programmer.zaman.now.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<>();

        map.put("first" ,"Irfan");
        map.put("last" ,"Tien");
        map.put("middel" ,"Ajj");

        //lambat jika posisi key nya paling belakang

        for (var key : map.keySet()){
            System.out.println(key);
        }

    }
}
