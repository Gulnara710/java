//14
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//кол-во эл-в
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextDouble();
        }
        int i = scanner.nextInt();
        if (i < 0 || i > n) {
            System.out.println("i должно быть меньше либо равно n");
            return;
        }
        double sum = 0;
        for (int j = 0; j < n; j++) {
            if (j != i) {
                sum += a[j];
            }
        }
        double f = sum / (n - 1);
        System.out.println("Среднее арифметическое чисел, кроме a[" + i + "] = " + f);
    }
}