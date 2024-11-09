import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // загадать число от 1 до 100
        int userGuess = 0;
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Загадано число от 1 до 100.");
        System.out.println("Попробуйте угадать число!");
        while (userGuess != numberToGuess) {
            System.out.print("Введите ваше предположение: ");
            userGuess = scanner.nextInt(); //предположения пользователя
            if (userGuess < numberToGuess) {
                System.out.println("Загаданное число больше");
            } else if (userGuess > numberToGuess) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Поздравляем! Вы угадали число " + numberToGuess + "!");
            }
        }
        scanner.close();
    }
}