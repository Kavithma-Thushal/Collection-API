/*
    @author DanujaV
    @created 2/18/23 - 4:51 PM   
*/

public class ArithmeticsExceptionDemo {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        try {
            int k = i/j;
            System.out.println(k);
        }catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
