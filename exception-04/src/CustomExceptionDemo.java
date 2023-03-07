/*
    @author DanujaV
    @created 3/7/23 - 9:21 AM   
*/

import java.util.ArrayList;
import java.util.List;

public class CustomExceptionDemo {
    static List<Integer> list = new ArrayList<>();

    private static void insertInteger(Integer integer) throws CustomException {
        if (list.contains(integer)) {
            throw new CustomException("integer already added!");
        } else {
            list.add(integer);
        }
    }

    public static void main(String[] args) {
        try {
            insertInteger(10);
            insertInteger(10);
        } catch (CustomException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
