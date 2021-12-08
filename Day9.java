package hackerrank;
import java.io.*;
import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int result = CalculateFactorial.factorial(n);

        System.out.println(result);
    }
}

class CalculateFactorial {
    public static int factorial(int n) {
        int result;

        if(n==1){
            return 1;
        }
        else{
            result = n*factorial(n-1);
            return result;
        }
    }
}