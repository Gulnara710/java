import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите время (только часы): ");
        int часы = scanner.nextInt();
        String a;
        if (часы >= 0 && часы < 24) {
            switch (часы) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    a = "Доброе утро";
                    break;
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    a = "Добрый день";
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    a = "Добрый вечер";
                    break;
                default:
                    a = "Доброй ночи"; // Этот случай не нужен, так как все возможные часы перечислены выше
            }
        } else {
            приветствие = "Ошибка: введите корректное время от 0 до 23.";
        }
        System.out.println(a);
    }
}