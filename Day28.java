package hackerrank;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Day28 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        ArrayList<String> list = new ArrayList<String>();

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
                String firstName = firstMultipleInput[0];
                String emailID = firstMultipleInput[1];

                if(emailID.length()<=50 && firstName.length()<=20){
                    if( emailID.matches("[a-z|.]+@gmail.com") ){
                        if(firstName.matches("[a-z]+") ){
                            list.add(firstName);
                        }
                    }
                }

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        Collections.sort(list);
        for(int i=0; i<list.size(); ++i){
            System.out.println(list.get(i));
        }
    }
}
