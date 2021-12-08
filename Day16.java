package hackerrank;
import java.io.*;

public class Day16 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        bufferedReader.close();

        try {
            System.out.println(Integer.parseInt(S));
        }
        catch (NumberFormatException ex) {
            System.out.println("Bad String");
        }
    }
}
