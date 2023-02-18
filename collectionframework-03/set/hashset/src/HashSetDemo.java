/*
    @author DanujaV
    @created 2/7/23 - 2:21 PM   
*/

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(65);

        System.out.println("ArrayList: " + arrayList);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(15);
        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(65);

        System.out.println("HashSet: " + hashSet);
    }
}
