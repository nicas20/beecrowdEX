import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while ((n = sc.nextInt()) != 0) {
            int m = new Random().nextInt(n - 1) + 1;
            int result = findM(n, m);
            System.out.println(result);
        }
        sc.close();
    }

    public static int findM(int n, int m) {
        int[] regions = new int[n];
        for (int i = 0; i < n; i++) {
            regions[i] = i + 1;
        }
        int index = 0;
        while (n > 1) {
            index = (index + m - 1) % n;
            if (regions[index] == 13) {
                return findM(n + 1, m);
            }
            for (int i = index; i < n - 1; i++) {
                regions[i] = regions[i + 1];
            }
            n--;
        }
        return m;
    }
}
