/*
    @author DanujaV
    @created 2/7/23 - 9:20 AM   
*/

public class Main {
    public static void main(String[] args) {
        IntegerClass ic = new IntegerClass(10);
        ic.setData(100);
        System.out.println(ic.getData());

        DoubleClass dc = new DoubleClass(20.5);
        dc.setData(200.5);
        System.out.println(dc.getData());

        BooleanClass bc = new BooleanClass(false);
        bc.setData(true);
        System.out.println(bc.getData());
    }
}
