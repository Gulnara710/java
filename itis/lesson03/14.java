import java.util.Scanner;
public class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 12");
        System.out.print("Введите целое положительное число: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Число должно быть положительным.");
        } else {
            String binary = Integer.toBinaryString(number);
            System.out.println("Двоичное представление числа " + number + ": " + binary);
        }
        sc.close();
    }
}

