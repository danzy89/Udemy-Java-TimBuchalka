public class SharedDigit {
    public static boolean hasSharedDigit (int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }
        int lastDigitA = a % 10;
        int firstDigitA = a / 10;
        int lastDigitB = b % 10;
        int firstDigitB = b / 10;

        return lastDigitA == lastDigitB || lastDigitA == firstDigitB || firstDigitA == lastDigitB || firstDigitA == firstDigitB;
    }
}
