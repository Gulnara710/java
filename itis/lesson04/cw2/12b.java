//12b
import java.util.Scanner;
public class Prog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите действ число a: ");
        double a = scanner.nextDouble();
        double result;
        if (a <= 2) {
            result = a * a + 4 * a + 5;
        } else {
            result = 1 / (a * a + 4 * a + 5);
        }
        System.out.println("f(" + a + ") = " + result);
    }
}