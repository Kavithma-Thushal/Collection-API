/*
    @author DanujaV
    @created 2/18/23 - 4:02 PM   
*/

public class StackOverFlowErrorDemo {
    public static void methodB() {
        System.out.println("methodB()");
        methodA();
    }
    public static void methodA() {
        System.out.println("methodA()");
        methodB();
    }
    public static void main(String[] args) {
        methodA();
    }
}
