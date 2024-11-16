import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Задание 10");
        System.out.print("Введите число x: ");
        double x = sc.nextDouble();
        System.out.print("Введите число y: ");
        double y = sc.nextDouble();
        System.out.print("Введите число z: ");
        double z = sc.nextDouble();
        if (x == y || x == z || y == z) {
            System.out.println("Числа должны быть попарно различными.");
            return;
        }
        double sum = x + y + z;
        if (sum < 1) {
            double min = Math.min(x, Math.min(y, z));
            if (min == x) {
                x = (y + z) / 2.0;
            } else if (min == y) {
                y = (x + z) / 2.0;
            } else {
                z = (x + y) / 2.0;
            }
        } else {
            if (x < y) {
                x = (y + z) / 2.0;
            } else {
                y = (x + z) / 2.0;
            }
        }
        System.out.println("Результаты: x = " + x + ", y = " + y + ", z = " + z);
    }
}

