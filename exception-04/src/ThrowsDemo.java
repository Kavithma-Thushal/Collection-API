/*
    @author DanujaV
    @created 3/7/23 - 8:49 AM   
*/

import java.io.File;
import java.io.IOException;

public class ThrowsDemo {
    private static void writeFile() throws IOException {
        var file = new File("abc.txt");

        if (!file.exists()) {
            file.createNewFile();
        }
    }

    public static void hasindu() {
        try {
            writeFile();
        } catch (IOException e) {
            System.out.println("something happend");
        }
    }
    public static void bethmi() {
        try {
            writeFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void lahiru() {
        try {
            writeFile();
        } catch (IOException e) {

        }
    }
    public static void main(String[] args) {

    }
}
