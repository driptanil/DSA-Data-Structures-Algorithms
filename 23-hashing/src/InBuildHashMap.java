import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InBuildHashMap {
    public static void main (String[] args) {
        // hashmaps are stored in unordered manner
        HashMap<String, Integer> map = new HashMap<>();

        // insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
        System.out.println(map);


        // update
        map.put("China", 130);
        System.out.println(map);

        // check for existence of key
        if (map.containsKey("Germany")) {
            System.out.println("Present !");
        } else {
            System.out.println("Absent !");
        }

        System.out.println(map.get("India"));
        System.out.println(map.get("Germany")); // if absent then null

        // iteration using for each loop
        for (Map.Entry<String, Integer> elem: map.entrySet()) {
            System.out.println(elem.getKey() + ": " + elem.getValue());
        }

        map.remove("China");
        System.out.println();

        Set<String> keys = map.keySet();

        for(String key: keys){
            System.out.println(key + ": " + map.get(key));
        }
    }
}
