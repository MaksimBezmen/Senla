import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskFive {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int x = bufferedReader.read();
            if (x < 100) {
                for (int i = 0; i < x; i++) {
                    boolean rez = isPalindrome(i);
                    if (rez == true) System.out.println(String.format("Число %d является полидромным", i));
                    else System.out.println(String.format("Число %d не является полидромным", i));
                }
            } else {
                System.out.println("Введенное число больше 100!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static boolean isPalindrome(int integer) {
        String intStr = String.valueOf(integer);
        return intStr.equals(new StringBuilder(intStr).reverse().toString());
    }
}
