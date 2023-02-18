/*
    @author DanujaV
    @created 2/7/23 - 11:13 AM   
*/

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add("Kamal");

        System.out.println(arrayList.get(0));

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
//        numberList.add("Kamal");    //Illegal

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Dewmith");
        studentList.add("Lahiru");
//        studentList.add(10);    //Illegal
    }
}
