public class LastDigitChecker {
    public static boolean hasSameLastDigit (int a, int b, int c) {
        if ( a < 10 || a > 1000 || b < 10 || b > 1000 || c < 10 || c > 1000) {
            return false;
        }
        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        int lastDigitC = c % 10;

        return lastDigitA == lastDigitB || lastDigitA == lastDigitC || lastDigitB == lastDigitC;
    }

    public static boolean isValid (int number) {
        return number >= 10 && number <= 1000;
    }
}
