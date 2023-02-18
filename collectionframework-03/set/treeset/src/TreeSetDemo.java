/*
    @author DanujaV
    @created 2/7/23 - 2:38 PM   
*/

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(10);
        treeSet.add(2);
        treeSet.add(54);
        treeSet.add(14);
        treeSet.add(656);
        treeSet.add(10);
        treeSet.add(1);

        System.out.println("TreeSet: " + treeSet);

        TreeSet<String> userNameList = new TreeSet<>();
        userNameList.add("kamal1000");
        userNameList.add("saman99");
        userNameList.add("isuru@343");
        userNameList.add("tharushi11");

        System.out.println("userNameList: " + userNameList);
    }
}
