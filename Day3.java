package hackerrank;
import java.io.*;

public class Day3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        result(N);

        bufferedReader.close();
    }

    public static int result(int num){

        if(num%2 == 1 || (num > 5 && num < 21)){
            System.out.println("Weird");
        } else{
            System.out.println("Not Weird");
        }

        return 0;
    }
}
