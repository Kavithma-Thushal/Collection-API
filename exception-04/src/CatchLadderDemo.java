/*
    @author DanujaV
    @created 3/7/23 - 9:32 AM   
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchLadderDemo {
    public static void main(String[] args) {
        File file = new File("abc.txt");

        try {
            if(!file.exists()) file.createNewFile();    //IOException

            Class.forName("Customer");  //ClassNotFoundException
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
