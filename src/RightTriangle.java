import java.util.Scanner;

class RightTriangle {
    public static void main(String[] args) {
        int n;

        System.out.println("Enter n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        if (n >= 0) {
            printRightTriangle(n);
        }
        if (n < 0) {
            System.out.println("!!Enter positive n only.");
        }

    }

    private static void printRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }


}
