package hackerrank;
import java.util.*;

public class Day26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d2 = Integer.parseInt(sc.next());
        int m2 = Integer.parseInt(sc.next());
        int y2 = Integer.parseInt(sc.next());

        int d1 = Integer.parseInt(sc.next());
        int m1 = Integer.parseInt(sc.next());
        int y1 = Integer.parseInt(sc.next());

        if (y2 != y1) {
            if (y2 > y1) {
                System.out.println(10000);
            } else {
                System.out.println(0);
            }
        } else if (m2 > m1) {
            System.out.println((m2 - m1) * 500);
        } else if (d2 > d1) {
            System.out.println((d2 - d1) * 15);
        } else {
            System.out.println(0);
        }
    }
}
