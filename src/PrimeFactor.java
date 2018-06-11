import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        int n;

        System.out.println("Enter n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        if(n >= 0){
            generate(n);
        }
        if(n < 0){
            System.out.println("!!Enter positive n only.");
        }
    }

    private static void generate(int n) {
        List primeFactors = new ArrayList();
        for(int i=2;i<=n;i++){
            if(n%i == 0 ){
                int flag = 0;
                for(int j=2;j<=i/2;j++){
                     if(i%j == 0){
                         flag = 1;
                         break;
                     }
                }
                if(flag == 0){
                    primeFactors.add(new Integer(i));
                }
            }
        }
        System.out.println(primeFactors);
    }
}
