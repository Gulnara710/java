package tests;
import java.util.Random;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // генерируем число от 1 до 100

        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;

        System.out.println("Угадайте число от 1 до 100:");

        while (userGuess != numberToGuess) {
            userGuess = scanner.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Загаданное число больше.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Загаданное число меньше.");
            }
        }

        System.out.println("Поздравляем! Вы угадали число " + numberToGuess + "!");
        scanner.close();
    }
}