/*
    @author DanujaV
    @created 2/7/23 - 3:22 PM   
*/

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();

        map.put("a", "Srilanka");
        map.put("zcde", "UK");
        map.put("redr", "Aus");
        map.put("uth", "USA");

        System.out.println(map);
    }
}
