package hackerrank;
import java.util.*;

public class Day17 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

class Calculator{
    public int power(int x, int y) throws Exception{
        if(x < 0 || y < 0){
            throw new Exception("n and p should be non-negative");
        }
        else{
            return (int)Math.pow(x,y);
        }
    }
}