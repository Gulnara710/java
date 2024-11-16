//13

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("действительное число a: ");
        double a = scanner.nextDouble();
        System.out.print("натуральное число n: ");
        int n = scanner.nextInt();
		
        // a) a в степени n
        double power = Math.pow(a, n);
        System.out.println("a в степени n: " + power);

        // б) a(a+1)(a+2)...(a+n-1)
        double p = 1.0;
        for (int i = 0; i < n; i++) {
            p *= (a + i);
        }
        System.out.println("a(a+1)(a+2)...(a+n-1)= " + p);

        // в) (1/a) + (1/(a(a+1))) + ... + (1/(a(a+1)...(a+n)))
        double sum = 0.0;
        double f = 1.0;

        for (int i = 0; i <= n; i++) {
            if (i > 0) {
                f *= (a + i - 1);
            }
            sum += (1.0 / f);
        }
        System.out.println("(1/a) + (1/(a(a+1))) + ... + (1/(a(a+1)...(a+n))) = " + sum);
    }
}

