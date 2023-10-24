import java.util.UUID;
import java.io.*;

public class NullPointerException {
    public static void main(String args[]) {
        try {
            String a1 = null; // null value
            System.out.println(a1.charAt(0));
        } catch(Exception e) {
            System.out.println("NullPointerException is found in the program.");
        }
    }

}
