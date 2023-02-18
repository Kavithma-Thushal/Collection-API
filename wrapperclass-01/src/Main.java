/*
    @author DanujaV
    @created 2/7/23 - 9:09 AM   
*/

public class Main {
    public static void main(String[] args) {
        int x = 10; //primitive

        Integer i = Integer.valueOf(x); //manually (Boxing)
        Integer j = x;  //insert compiler -> Integer.valueOf(x) -> AutoBoxing

        //--------
        Integer z = new Integer(10);
        int y = z.intValue();   // manually (UnBoxing)
        int a = z;  //insert compiler -> z.intValue() -> AutoUnboxing
    }
}
