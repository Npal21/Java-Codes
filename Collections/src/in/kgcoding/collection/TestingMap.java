package in.kgcoding.collection;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple",30);
        map.put("Mango", 45);
        map.put("Kiwi", 4);
        map.put("Blueberry", 1);
        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println("Size of map: "+ map.size());
        System.out.println("Apple = "+map.get("Apple"));
        System.out.println(map.containsKey("Ram"));
        System.out.println("Is 30 present as value of any key? = "+map.containsValue(30));

        for (String key : map.keySet()) {
            System.out.print(key+" : " + map.get(key) + "\n");
        }
    }
}
