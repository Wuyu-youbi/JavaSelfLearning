import java.util.Scanner;

public class HarmonicNumber {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

         int n = scanner.nextInt();
         double result = 0.0;
         for (int i = 1; i <= n; i++) {
             result += 1.0 / i;
         }
         System.out.println(result);
         scanner.close();
    }

}
