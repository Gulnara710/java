//7.	Ввести целые числа a и b и действительное число z. Преобразовать число z по формуле z * x, если a делиться на b без остатка и z/x в противном случае.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Введите целые числа a и b: ");
        int a = sc.nextInt(), b = sc.nextInt();
		System.out.println("Введите действительное число z: ");
		double z = sc.nextDouble();
		if (a % b == 0){
			z = z * (a % b);
			System.out.println(z);
		} else {
			z = z / (a % b);
			System.out.println(z);
		}
        sc.close();
    }
}
