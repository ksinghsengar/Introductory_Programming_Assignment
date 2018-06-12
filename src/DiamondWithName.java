import java.util.Scanner;

class DiamondWithName {
    public static void main(String[] args) {
        int n;

        System.out.println("Enter n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        if (n >= 0) {
            printDiamondWithName(n);
        }
        if (n < 0) {
            System.out.println("!!Enter positive n only.");
        }
    }

    private static void printDiamondWithName(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.println("Kamini");
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j <= (n - i)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }

                for (int k = 1; k <= i - 1; k++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }

        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for (int k = 1; k <= n - 1 - i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
