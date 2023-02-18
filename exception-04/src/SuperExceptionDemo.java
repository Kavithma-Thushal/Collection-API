/*
    @author DanujaV
    @created 2/18/23 - 5:14 PM   
*/

public class SuperExceptionDemo {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        try {
            int k = i/j;
            System.out.println(k);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
