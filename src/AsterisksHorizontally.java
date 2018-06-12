import java.util.Scanner;

class AsterisksHorizontally {

    public static void main(String[] args) {

        int numberOfAsterisk;

        System.out.println("Enter number of asterisk: ");
        Scanner in = new Scanner(System.in);
        numberOfAsterisk = in.nextInt();

        if (numberOfAsterisk >= 0) {
            printAsterisksHorizontally(numberOfAsterisk);
        }
        if (numberOfAsterisk < 0) {
            System.out.println("!!Enter positive number of asterisks only.");
        }

    }

    private static void printAsterisksHorizontally(int numberOfAsterisk) {
        for (int i = 0; i < numberOfAsterisk; i++) {
            System.out.print("*");
        }
    }


}
