/*
    @author DanujaV
    @created 2/7/23 - 11:46 AM   
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionWithArrayList {
    public static void main(String[] args) {
        Collection<Integer> numberList = new ArrayList<>();
//        ArrayList<Integer> numberList = new ArrayList<>();

        System.out.println("Size: " + numberList.size());
        System.out.println("isEmpty: " + numberList.isEmpty());

        numberList.add(10);
        numberList.add(20);

        System.out.println("Size: " + numberList.size());
        System.out.println("isEmpty: " + numberList.isEmpty());

        System.out.println(numberList);

        /*for (int i = 0; i < numberList.size(); i++) {
            System.out.println(numberList[i]);
        }*/

        System.out.println("contains: " + numberList.contains(10));

        Iterator<Integer> iterator = numberList.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Object[] cloneNumberListArray = numberList.toArray();
        for (Object obj : cloneNumberListArray) {
            System.out.print(obj + " ");
        }
        System.out.println();

        System.out.println("size: " + numberList.size());

        numberList.remove(10);

        System.out.println("size: " + numberList.size());
        System.out.println(numberList);

        System.out.println("hashCode: " + numberList.hashCode());

        numberList.clear();

        System.out.println("size: " +  numberList.size());
    }
}
