import java.util.Scanner;

public class AsterisksVertically {
    public static void main(String[] args) {
        int numberOfAsterisk;

        System.out.println("Enter number of asterisk: ");
        Scanner in = new Scanner(System.in);
        numberOfAsterisk = in.nextInt();

        if(numberOfAsterisk >= 0){
            printAsterisksVertically(numberOfAsterisk);
        }
        if(numberOfAsterisk < 0){
            System.out.println("!!Enter positive number of asterisks only.");
        }
    }

    private static void printAsterisksVertically(int numberOfAsterisk) {
        for(int i=0; i< numberOfAsterisk; i++){
            System.out.println("*");
        }
    }
}
