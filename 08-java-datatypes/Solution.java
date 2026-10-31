import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    private static final BigInteger BYTE_MIN = BigInteger.valueOf(Byte.MIN_VALUE);
    private static final BigInteger BYTE_MAX = BigInteger.valueOf(Byte.MAX_VALUE);
    private static final BigInteger SHORT_MIN = BigInteger.valueOf(Short.MIN_VALUE);
    private static final BigInteger SHORT_MAX = BigInteger.valueOf(Short.MAX_VALUE);
    private static final BigInteger INT_MIN = BigInteger.valueOf(Integer.MIN_VALUE);
    private static final BigInteger INT_MAX = BigInteger.valueOf(Integer.MAX_VALUE);
    private static final BigInteger LONG_MIN = BigInteger.valueOf(Long.MIN_VALUE);
    private static final BigInteger LONG_MAX = BigInteger.valueOf(Long.MAX_VALUE);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < testCases; i++) {
            String input = scanner.next();
            BigInteger value;
            try {
                value = new BigInteger(input);
            } catch (NumberFormatException e) {
                output.append(input).append(" can't be fitted anywhere.\n");
                continue;
            }

            StringBuilder types = new StringBuilder();
            if (value.compareTo(BYTE_MIN) >= 0 && value.compareTo(BYTE_MAX) <= 0) types.append("* byte\n");
            if (value.compareTo(SHORT_MIN) >= 0 && value.compareTo(SHORT_MAX) <= 0) types.append("* short\n");
            if (value.compareTo(INT_MIN) >= 0 && value.compareTo(INT_MAX) <= 0) types.append("* int\n");
            if (value.compareTo(LONG_MIN) >= 0 && value.compareTo(LONG_MAX) <= 0) types.append("* long\n");

            if (types.length() == 0) {
                output.append(input).append(" can't be fitted anywhere.\n");
            } else {
                output.append(input).append(" can be fitted in:\n").append(types);
            }
        }
        scanner.close();
        System.out.print(output);
    }
}
