/*
    @author DanujaV
    @created 2/18/23 - 5:08 PM   
*/

public class FinallyDemo {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        try {
            int k = i/j;
            System.out.println(k);
        }catch (ArithmeticException er) {
            System.out.println("something went wrong! I can feel it...");
        }finally {
            System.out.println("whatever... i don't care!!!");
        }

    }
}
