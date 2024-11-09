import java.util.Scanner;
public class Program {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Задание 2. Введите число");
		int f = 1;
		for (int x = sc.nextInt(); x >= 1; x--){
			f = f * x;
		}
		System.out.println(f);
		
    }
}
