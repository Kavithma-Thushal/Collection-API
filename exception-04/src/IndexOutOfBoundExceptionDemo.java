/*
    @author DanujaV
    @created 2/18/23 - 5:00 PM   
*/

public class IndexOutOfBoundExceptionDemo {
    public static void main(String[] args) {

        //ArrayIndexOutOfBoundsException
        int[] data = new int[5];

        data[0] = 10;
        data[3] = 40;

        try {
            data[5] = 60;
        }catch (ArrayIndexOutOfBoundsException er) {
            System.out.println(er);
        }

        //-------------------

        //StringIndexOutOfBoundsException
        String name = "My name is danuja";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(4));

        try{
            System.out.println(name.charAt(18));
        }catch (StringIndexOutOfBoundsException er) {
            System.out.println(er);
        }
    }
}
