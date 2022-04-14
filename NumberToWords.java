public class NumberToWords {
    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reversed = reverse(number);
        int originalNumberDigits = getDigitCount(number);

        int lastDigit;
        for (int i = 0; i < originalNumberDigits; i ++) {
            lastDigit = reversed % 10;
            reversed /= 10;
            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
        }
    }

    public static int reverse (int number) {
        int lastDigit;
        int reversedNumber = 0;

        while (number != 0) {
            lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount (int number) {
        int sumOfDigits = 0;
        int lastDigit;

        if (number < 0) {
            return -1;
        }
        else if (number == 0) {
            return 1;
        }
        while (number != 0) {
            lastDigit = number % 10;
            sumOfDigits ++;
            number /=10;
        }
        return sumOfDigits;
    }
}