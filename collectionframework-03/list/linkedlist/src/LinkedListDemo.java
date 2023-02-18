/*
    @author DanujaV
    @created 2/7/23 - 12:22 PM   
*/

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        System.out.println(linkedList);

        linkedList.addFirst(50);

        System.out.println(linkedList);

        linkedList.addLast(100);

        System.out.println(linkedList);

        System.out.println("getFirst: " + linkedList.getFirst());
        System.out.println("getLast: " + linkedList.getLast());

        Integer removeFirst = linkedList.removeFirst();
        System.out.println("removeFirst: " + removeFirst);

        Integer removeLast = linkedList.removeLast();
        System.out.println("removeLast: " + removeLast);

        System.out.println("size: " + linkedList.size());

        System.out.println("get: " + linkedList.get(2));

        System.out.println(linkedList);

        linkedList.set(2, 600);
        System.out.println(linkedList);

        linkedList.add(2, 800);
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);

    }
}
