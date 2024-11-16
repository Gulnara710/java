import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Задание 8.");
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		if (a <= b && b <= c && c <= d){
			a = d;
			b = d;
			c = d;
			System.out.println(a + " " + b + " " +  c + " " + d);
		} else if (a > b && b > c && c > d){
			b = a;
			c = a;
			d = a;
			System.out.println(a + " " + b + " " +  c + " " + d);
		} else {
			a *= a;
			b *= b;
			c *= c;
			d *= d;
			System.out.println(a + " " + b + " " +  c + " " + d);
		}		
	}
}