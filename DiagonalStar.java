public class DiagonalStar {
    public static void printSquareStar(int n) {
        if (n < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || i == n || j == 1 || j == n || i == j || i+j == n+1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}