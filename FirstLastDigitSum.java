public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }
        int firstDigit = 0;
        int lastDigit = number % 10;
        int singleDigit = 0;
        int temp = number;

        while (temp >= 10) {
            firstDigit = temp /= 10;
        }
        if (number <= 9) {
            singleDigit = number;
        }
        return firstDigit + lastDigit + singleDigit;
    }
}
