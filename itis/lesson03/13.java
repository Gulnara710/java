import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Задание 11");
        System.out.print("Введите коэффициент a (a != 0): ");
        double a = sc.nextDouble();
        if (a == 0) {
            System.out.println("Коэффициент a не должен быть равен нулю.");
            return;
        }
        System.out.print("Введите коэффициент b: ");
        double b = sc.nextDouble();
        System.out.print("Введите коэффициент c: ");
        double c = sc.nextDouble();
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Действительные корни: x1 = " + root1 + ", x2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Действительный корень: x = " + root);
        } else {
            System.out.println("Действительных корней нет.");
        }
    }
}

