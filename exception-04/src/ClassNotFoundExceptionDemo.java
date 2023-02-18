/*
    @author DanujaV
    @created 2/18/23 - 4:41 PM   
*/

import java.util.Random;

public class ClassNotFoundExceptionDemo {
    public static void main(String[] args) {
        try{
            Class.forName("Customer");
        }catch (ClassNotFoundException er) {

        }
    }
}
