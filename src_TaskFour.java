import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskFour {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите слово");
            String word = bufferedReader.readLine();
            System.out.println("Введите текст");
            String text = bufferedReader.readLine();
            CoutWordInText(word, text);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void CoutWordInText (String word, String text){
        int count = 0;
        String [] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(word)){
                count++;
            }
        }
        System.out.println(String.format("Слово повторяется в тексте %d раз.",count));
    }

}

