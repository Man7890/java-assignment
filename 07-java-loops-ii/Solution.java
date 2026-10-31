import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();
        StringBuilder output = new StringBuilder();
        for (int q = 0; q < queries; q++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int sum = a;
            for (int i = 0; i < n; i++) {
                sum += (1 << i) * b;
                if (i > 0) output.append(' ');
                output.append(sum);
            }
            output.append('\n');
        }
        scanner.close();
        System.out.print(output);
    }
}
