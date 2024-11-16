import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Задание 7.");
		int k = sc.nextInt();
		for(int i = 2; i != 11; i++){
			
			System.out.println(i + " * " + k +  " = " + (i * k));
		}
	}
}	