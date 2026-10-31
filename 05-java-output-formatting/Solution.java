import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String word = scanner.next();
            int number = scanner.nextInt();
            System.out.printf("%-15s%03d%n", word, number);
        }
        System.out.println("================================");
        scanner.close();
    }
}
