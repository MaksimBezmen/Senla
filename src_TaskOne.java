import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            if (scanner.nextInt() % 2 == 0) {
                System.out.println("Введенное число составное и четное");
            } else {
                System.out.println("Введенное число простое и нечетное");
            }
        } else {
            System.out.println("Ошибка. Вы ввели не целое число!");
        }
    }
}
