import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.Character.toUpperCase;

public class TaskTree {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String str = bufferedReader.readLine();
            SortWords(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void SortWords(String s) {
        int x = 0;
        if (s != null) {
            String[] words = s.split(" ");
            Set<String> stringSet = new TreeSet<>();
            for (int i = 0; i < words.length; i++) {

                stringSet.add(String.valueOf(toUpperCase(words[i].charAt(0)) + words[i].substring(1)));
            }
            for (String string : stringSet) {
                System.out.print(string + " ");
            }
        } else {
            System.out.println("Введите предложение!");
        }
    }
}
