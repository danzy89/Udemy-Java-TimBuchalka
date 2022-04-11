public class NumberPalindrome {
    public static boolean isPalindrome (int number) {
        int reverse = 0;
        int lastDigit;
        int temp = number;

        while (temp != 0) {
            lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }
        return reverse == number;
    }
}
