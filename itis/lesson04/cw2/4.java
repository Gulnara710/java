//4.	Ввести символ в нижнем регистре от a до f. Вывести на экран соответствующую букву в заглавном начертании.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите символ от 'a' до 'f': ");
        char a = sc.next().charAt(0);
        if (a >= 'a' && a <= 'f') {
            // Преобразуем символ в заглавный регистр
            char b = Character.toUpperCase(a);
            System.out.println("Заглавная буква: " + b);
        } else {
            System.out.println("Ошибка: введён недопустимый символ. Введите букву от 'a' до 'f'.");
        }
        sc.close();
    }
}