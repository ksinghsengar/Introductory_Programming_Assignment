import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        int n;

        System.out.println("Enter n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        if(n >= 0){
            printIsoscelesTriangle(n);
        }
        if(n < 0){
            System.out.println("!!Enter positive n only.");
        }
    }

    private static void printIsoscelesTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=(n-i)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }

            for(int k=1;k<=i-1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
