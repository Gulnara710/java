import java.util.Scanner;
public class Program{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Задание 9");
		int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt(), a = 0;
		if ((x + y > z) && (x + z > y) && (y + z > x)){
			System.out.println("Треугольник существует");
			if (x > a){a = x;}
			if (y > a){a = y;}
			if (z > a){a = z;}
			if (a * a > (x * x + y * y + z * z - a * a)){
				System.out.println("Треугольник остроугольный");
			} else{
				System.out.println("Треугольник не является остроугольным");
			}
		}else{
			System.out.println("Треугольник не существует");	
		}
	}	
}