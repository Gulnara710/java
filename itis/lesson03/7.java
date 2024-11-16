import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Задание 5.");
		int a = sc.nextInt(), sum = 0;
		while (a != 0){
			sum += (a %10);
			a /= 10;
		}
		System.out.println("Сумма цифр" + sum);
	}
}	