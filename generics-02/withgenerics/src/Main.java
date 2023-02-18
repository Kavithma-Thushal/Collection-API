/*
    @author DanujaV
    @created 2/7/23 - 9:36 AM   
*/

public class Main {
    public static void main(String[] args) {
        /*CommonClass<Integer> cc1 = new CommonClass<Integer>(10);
        cc1.setData(100);
        System.out.println("Integer: " + cc1.getData());

        CommonClass<Double> cc2 = new CommonClass<Double>(20.5);
        cc2.setData(200.5);
        System.out.println("Double: " + cc2.getData());

        CommonClass<Boolean> cc3 = new CommonClass<Boolean>(false);
        cc3.setData(true);
        System.out.println("Boolean: " + cc3.getData());*/

        /*Numeric<Integer, String> n = new Numeric<Integer, String>();
        n.print(10, "Kamal");*/

        Numeric<Integer, Integer, Short> n2 = new Numeric<>();  //since JDK 1.7
        n2.calculate(10, 20);
    }
}
