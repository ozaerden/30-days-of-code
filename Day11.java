package hackerrank;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Day11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int max=-64;

        for(int i=0;i<4; i++) {
            for(int j=0;j<4;j++) {
                int sumTop=arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2);
                int sumMiddle=arr.get(i+1).get(j+1);
                int sumBottom=arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
                int Sum=sumTop+sumMiddle+sumBottom;
                if (Sum > max) {
                    max = Sum;
                }
            }
        }

        System.out.println(max);
    }
}
