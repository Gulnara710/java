//5.	Дан порядковый номер месяца, вывести на экран количество месяцев, оставшихся до конца года.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Какой сейчас месяц?");
        int m = sc.nextInt();
        if (m >= 1 && m <= 12) {
            System.out.println((12 -  m ) + "месяца осталось до конца года");
        } else {
            System.out.println("Ошибка: введён недопустимый символ.");
        }
        sc.close();
    }
}