import java.util.Scanner;
public class NumberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int previousNumber, currentNumber;
        System.out.print("Введите целое число: ");
        previousNumber = sc.nextInt();
        while (true) {
            System.out.print("Введите следующее целое число: ");
            currentNumber = sc.nextInt();
            if (currentNumber < previousNumber) {
                System.out.println("Ввод завершен, так как " + currentNumber + " меньше " + previousNumber);
                break; 
            }
            previousNumber = currentNumber;
        }
        sc.close();
    }
}