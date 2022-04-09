public class MethodOverloading {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {

            double feetToInches = feet * 12;
            double inchesToCentimeters = inches * 2.54;
            double feetToInchesToCentimeters = feetToInches * 2.54;
            double totalCentimeters = inchesToCentimeters + feetToInchesToCentimeters;

//            System.out.println("Feet to Inches = " + feetToInches);
//            System.out.println("Inches To Centimeters = " + inchesToCentimeters);
//            System.out.println("Feet To Inches to Centimeters = " + feetToInchesToCentimeters);
            System.out.println(feet + " feet, " + inches + " inches = " + totalCentimeters + " centimeters");
            return totalCentimeters;
        }
        System.out.println("Invalid Feet or Inches Parameters");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid Feet or Inches Parameters");
            return -1;
        }
        int feet = (int) inches / 12;
        int remainingInches = (int) inches % 12;
        System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
