import java.security.KeyStore;
import java.util.Scanner;
public class DZ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean bo = true;
        while(bo=true) {

            System.out.println("Введите день рождения (Целое число от 1 до 31)");
            int d = scanner.nextInt();
            if (d >= 1 & d <= 31) {
                System.out.println("Введите месяц рождения (Целое число от 1 до 12)");
            } else {
                System.out.println("Error, запустите программу заново и введите (Целое число от 1 до 31)");
                bo = false;
                break;
            }
            int m = scanner.nextInt();
            if (m >= 1 & m <= 12) {
                System.out.println("Введите год рождения (Целое число от 0 до 2022)");
            } else {
                System.out.println("Error, запустите программу заново и введите (Целое число от 1 до 31)");
                bo = false;
                break;
            }
            int yr2 = scanner.nextInt();
            if (yr2 < 0) {
                System.out.println("Error, запустите программу заново и введите (Целое число от 0 до 2022)");
                bo = false;
                break;
            }

            int yr1 = 2022;
            int d1 = 24;
            int m1 = 11;

            int x2 = d1-d;
            int x3 = m1-m;
            int x1 = yr1-yr2;


            System.out.println(x1 + " лет " + x3+" месяцев "+ x2+" дней ");




        }

    }
}