//10.	Даны натуральное число n, действительные числа  . Получить удвоенную сумму всех положительных элементов последовательности  .

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //количество элементов
        double sum = 0; //сумма положительных элементов
        for (int i = 0; i < n; i++) {
            double number = sc.nextDouble(); // считываем эл-ты
                sum += number;
            }
        }
        double doubledSum = sum * 2;
        System.out.println("удвоенная сумма всех положительных элементов: " + doubledSum);
        sc.close();
	}
}

