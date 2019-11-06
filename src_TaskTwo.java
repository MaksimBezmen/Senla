import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt() && scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println("НОD числел " + x + " и "+ y + " равен: "+ NOD(x,y));
            System.out.println("НОК числел " + x + " и "+ y + " равен: "+ NOK(x,y));

        } else {
            System.out.println("Ошибка. Вы ввели не целое число!");
        }
    }
    public static int NOD(int a,int b){
        return b == 0 ? a : NOD(b,a % b);
    }
    public static int NOK(int a,int b){
        return a / NOD(a,b) * b;
    }
}
