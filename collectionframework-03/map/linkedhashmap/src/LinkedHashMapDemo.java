/*
    @author DanujaV
    @created 2/7/23 - 3:25 PM   
*/

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        map.put("user_name", "U-001");
        map.put("name", "Saman");
        map.put("tel", "+94 765564654");

        System.out.println(map);
    }
}
