import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Задание 3.	Вводятся 2 вещественных числа. Проверить, равны ли они между собой.");
		double a = sc.nextDouble(), b = sc.nextDouble();
		System.out.println((a <= b) ? ("a = 0, b =  " + b)  : ("a = " + a + (", b = ") + b));
	}
}	