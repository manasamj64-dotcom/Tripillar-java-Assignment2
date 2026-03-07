package assignments.module5;

import java.io.*;

public class ThrowsExample {

    static void readFile() throws IOException {
        FileReader f = new FileReader("test.txt");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}

