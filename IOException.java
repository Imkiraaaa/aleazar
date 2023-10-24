import java.io.BufferedReader;
import java.io.FileReader;

public class IOException {
    private static String filepath = "C:File2.txt";

    public static void main(String[] args) {
        BufferedReader br1 = null;
        String curline;

        try {
            br1 = new BufferedReader(new FileReader(filepath));

            while ((curline = br1.readLine()) != null) {
                System.out.println(curline);
            }
        } catch (Exception e) {
            System.err.println("IOException found :" + e.getMessage());
        } finally {
            try {
                if (br1 != null)
                    br1.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
