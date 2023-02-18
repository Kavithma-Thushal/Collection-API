/*
    @author DanujaV
    @created 2/7/23 - 2:59 PM   
*/

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        hashMap.put("srilanka", "Jayawardhanapura");
        hashMap.put("uk", "London");
        hashMap.put("aus", "Melbourne");
        hashMap.put(10, "kamal");
        hashMap.put("kamal", 10);

        HashMap<String, String> hashMap2 = new HashMap();

        hashMap2.put("srilanka", "Jayawardhanapura");
        hashMap2.put("uk", "London");
        hashMap2.put("aus", "Melbourne");
        //Illegal
        /*hashMap2.put(10, "kamal");
        hashMap2.put("kamal", 10);*/

        System.out.println("HashMap: " + hashMap);

        Set set = hashMap.keySet();
        System.out.println(set);

        HashMap<String, Integer> studentMark = new HashMap<>();
        studentMark.put("kamal", 65);
        studentMark.put("saman", 45);
        studentMark.put("deshan", 85);
        studentMark.put("nimal", 50);

        Set<String> keys = studentMark.keySet();
        for (String key: keys) {
            System.out.println("Values: " + studentMark.get(key));
        }
    }
}
