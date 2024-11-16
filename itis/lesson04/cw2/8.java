//8.	Локальным максимумом в последовательности назовем элемент, который больше предыдущего и следующего (если они есть). 
//Проверить, что во входной последовательности существует четный по значению локальный максимум.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов последовательности: ");
        int n = sc.nextInt();   
        if (n < 3) {
            System.out.println("Должно быть как минимум 3 элемента для поиска локального максимума");
            return;
        }      
        int[] arr = new int[n]; // создаем массив    
        System.out.println("Введите элементы последовательности:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean max = false; //для проверки наличия чет лок максимума
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) { // локальный максимум
                if (arr[i] % 2 == 0) { // четность
					max = true;
                    break;
                }
            }
        }      
        if (max) {
            System.out.println("Существует четный локальный максимум");
        } else {
            System.out.println("Четного локального максимума не существует");
        }
        sc.close(); 
    }
}
