import java.util.Scanner;

public class DZ2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        String seasonString;
        System.out.print("Введите целое число от 1 до 12:\n");
        if (sc.hasNextInt()) {
            month = sc.nextInt();
            switch (month) {
                case 12:
                case 1:
                case 2:
                    seasonString = "Месяц: Зима";
                    break;
                case 3:
                case 4:
                case 5:
                    seasonString = "Месяц: Весна";
                    break;
                case 6:
                case 7:
                case 8:
                    seasonString = "Месяц: Лето";
                    break;
                case 9:
                case 10:
                case 11:
                    seasonString = "Месяц: Осень";
                    break;
                default:
                    seasonString = "error, введите цедлое число от 1 до 12";
                    break;
            }
            System.out.print(seasonString);
        } else System.out.println("Вы ввели не целое число");
    }
}