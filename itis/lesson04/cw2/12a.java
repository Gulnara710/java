import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите действительное число a: ");
        double a = scanner.nextDouble();        
        double f;
        if (a >= -2 && a < 2) {
            f = a * a ;
		} else {
            f = 4;
        }
        System.out.println("f(" + a + ") = " + f);
    }
}