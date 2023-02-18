/*
    @author DanujaV
    @created 2/7/23 - 10:33 AM   
*/

public class Numeric<T extends Integer,
        T1 extends Integer,
        T3 extends Number> { //Bound type generics
    public void print(T t, T1 t1) {
        System.out.println(t + " " + t1);
    }

    public void calculate(T t, T1 t1) {
        System.out.println(t.intValue() + t1.intValue());
    }
}
