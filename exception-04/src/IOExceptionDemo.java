/*
    @author DanujaV
    @created 2/18/23 - 4:36 PM   
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionDemo {
    public static void main(String[] args) {
        try{
            new FileReader("Sample.txt");
        }catch (IOException er) {

        }
    }
}
