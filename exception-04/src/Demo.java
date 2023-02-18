/*
    @author DanujaV
    @created 2/18/23 - 1:55 PM   
*/

public class Demo {
    public static void main(String[] args) {
        System.out.println("start main");

        int i = 10;
        int j = 0;

        try {
            int k = i/j;
            System.out.println(k);
        }catch (ArithmeticException e) {
            System.out.println(e);
        }

        System.out.println("end main");
    }
}
