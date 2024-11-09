import java.util.Scanner;
public class Program {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Задание 2. Введите число");
		long f = 1;
		for (long x = sc.nextLong(); x >= 1; x--){
			f = f * x;
		}
		System.out.println(f);
		
    }
}
