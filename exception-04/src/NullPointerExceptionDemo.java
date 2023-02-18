/*
    @author DanujaV
    @created 2/18/23 - 4:53 PM   
*/

import java.util.Random;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        Random r = null;

        try{
            r.nextInt();
        }catch (NullPointerException e) {

        }
    }
}
