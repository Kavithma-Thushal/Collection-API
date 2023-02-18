/*
    @author DanujaV
    @created 2/7/23 - 12:56 PM   
*/

import java.util.ArrayList;

public class ExerciseDemo {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();

//        customerList.add(10); //Illegal

        Customer nimal = new Customer(1, "Nimal");
        Customer kamal = new Customer(1, "Kamal");

        customerList.add(nimal);
        customerList.add(kamal);

        customerList.add(new Customer(3, "Saman"));

        System.out.println(customerList);

        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }
}
