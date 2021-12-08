package hackerrank;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Day20 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int sizeList = a.size();
        int swap = 0;

        for (int i = 0; i < sizeList-1; i++){
            for (int j = 0; j < sizeList-i-1; j++){
                if (a.get(j) > a.get(j+1)){
                    //swap a.get(j+1) and a.get(j)
                    int temp = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, temp);
                    swap++;
                }
            }
        }

        System.out.println("Array is sorted in " + swap + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(sizeList - 1));

        bufferedReader.close();
    }
}
