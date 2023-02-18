/*
    @author DanujaV
    @created 2/7/23 - 2:35 PM   
*/

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(5);
        linkedHashSet.add(24);
        linkedHashSet.add(10);
        linkedHashSet.add(65);
        linkedHashSet.add(2);

        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
