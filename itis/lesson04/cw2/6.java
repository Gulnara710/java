//6. Вывести текстом прямоугольник размером m х n, состоящий, из единиц.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();//m -строки, n-колво в строке
		for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("1"); 
            }
            System.out.println(); 
        }
        sc.close();
    }
}