import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("dog", "cat", "elephant", "tiger", "lion", "ant");


        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i).toUpperCase();
            System.out.println(word);
        }
    }
}
