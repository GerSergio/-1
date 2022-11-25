import java.util.Scanner;

public class DZ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число x");
        double x = sc.nextInt();
        System.out.println("Введите число n");
        double n = sc.nextInt();
        double result = 1;
        if(n < 0) {
            for (double i = 1; i <= -n; i++) {
                result = result * x;
            }
            System.out.println(1/result);
        }
        if(n > 0) {
            for (double i = 1; i <= n; i++) {
                result = result * x;
            }
            System.out.print("x^n: ");
            System.out.println(result);
        }
    }
}