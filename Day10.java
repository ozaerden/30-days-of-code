package hackerrank;
import java.io.*;

public class Day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int rem=0,s=0,t=0;

        while(n>0) {
            rem=n%2;
            n=n/2;
            if(rem==1){
                s++;
                if(s>=t)
                    t=s;
            } else{
                s=0;
            }
        }
        System.out.println(t);
        bufferedReader.close();
    }
}
