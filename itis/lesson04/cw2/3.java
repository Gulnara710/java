//3.	Дано действительное число х. Выведете на экран меню (введите номер действия: 1 – возвести число в квадрат; 
//2 – извлечь корень квадратный; 3 – вычислить синус; 4 – косинус). И произведите эти действия. 
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		System.out.println("введите номер действия");
		int a = sc.nextInt();
		switch(a){
			case 1:
				System.out.println(x * x);
				break;
			case 2:
				if (x < 0) {
                    System.out.println("Ошибка: нельзя извлечь корень из отрицательного числа.");
                } else {
					System.out.println(Math.sqrt(x));
				}
				break;
			case 3:
				System.out.println(Math.sin(x));
				break;
			case 4:
				System.out.println(Math.cos(x));
				break;
			default:
                System.out.println("Ошибка: неверный номер действия.");
                break;
		}
	}
}