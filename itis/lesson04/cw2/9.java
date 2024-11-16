//9.	Даны натуральные числа n, целые числа  . Найти количество и сумму элементов последовательности, которые делятся на 5 и не делятся на 7.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("количество элементов последовательности: ");
        int n = sc.nextInt();
        int k = 0; // колво подходящих элементов
        int sum = 0;// сумма подходящих элементов
        System.out.println("Введите элементы последовательности:");
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt(); 
            if (s % 5 == 0 && s % 7 != 0) {
                k++;
                sum += s;
            }
        }
        System.out.println("Количество элементов, которые делятся на 5 и не делятся на 7: " + k);
        System.out.println("Сумма таких элементов: " + sum);
        sc.close();
    }
}