import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {
        int n;

        System.out.println("Enter number: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        if (n >= 0) {
            fizzBuzz(n);
        }
        if (n < 0) {
            System.out.println("!!Enter positive n only.");
        }

    }

    private static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
