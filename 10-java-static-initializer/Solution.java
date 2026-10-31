import java.util.Scanner;

public class Solution {
    static int breadth;
    static int height;
    static boolean valid = true;

    static {
        Scanner scanner = new Scanner(System.in);
        breadth = scanner.nextInt();
        height = scanner.nextInt();
        if (breadth <= 0 || height <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            valid = false;
        }
    }

    public static void main(String[] args) {
        if (valid) {
            System.out.println(breadth * height);
        }
    }
}
