import java.util.Scanner;

public class DZ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Колличество точек:");
        double a = sc.nextDouble();
        System.out.println("Радиус окружности:");
        double r = sc.nextInt();
        int k = 0;
        for (int i = 1; i <= a; i++) {
            System.out.println("x координата:");
            double X = sc.nextInt();
            System.out.println("y координата:");
            double Y = sc.nextInt();
            if ((X*X + Y+Y) <= r*r) {
                k=k+1;
            }
        }
        System.out.println("Точек попало в окружность: " + k);
    }
}