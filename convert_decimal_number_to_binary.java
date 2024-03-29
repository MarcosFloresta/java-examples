public class DecimalBinary {
    public static void main(String[] args) {
        int num = 19;
        long binary = convertDecimalToBinary(num);
        System.out.printf("%d in decimal = %d in binary", num, binary);
    }

    public static long convertDecimalToBinary(int n) {
        long binaryNumber = 0;
        int remainder, i = 1, step = 1;
        while (n != 0) {
            remainder = n % 2;
            System.out.printf("Step %d: %d/2, Remainder = %d, Quotient = %d\n", step++, n, remainder, n / 2);
            n /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        return binaryNumber;
    }
}