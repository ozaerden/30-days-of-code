package hackerrank;
import java.util.*;

public class Day25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();

            String result = isPrime(number);
            System.out.println(result);
        }
    }

    public static String isPrime(int number) {
        if(number==1)
            return "Not prime";

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return "Not prime";
            }
        }
        return "Prime";
    }
}


