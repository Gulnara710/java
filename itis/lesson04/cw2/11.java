// задание 11
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // количество элементов
        int q = 1;
        boolean f = false; // переменная для отслеживания, найдены ли числа кратные 7

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            // деление на 7
            if (number % 7 == 0) {
                q *= number;
                f = true;
            }
        }
        // на 7 ничего не делится
        if (!f) {
            q = 0;
        }
        
        System.out.println("Произведение элементов последовательности, кратных 7: " + q);
    }
}