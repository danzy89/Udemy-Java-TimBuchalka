public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double value1, double value2) {
        int valueOne = (int) (value1 * 1000);
        int valueTwo = (int) (value2 * 1000);

        if (valueOne == valueTwo) {
            return true;
        }
        return false;
    }
}
