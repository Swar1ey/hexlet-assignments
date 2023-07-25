package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String text, String word) {
        List<Character> listText = new ArrayList<>();
        for (char c: text.toLowerCase().toCharArray()) {
            listText.add(c);
        }
        List<Character> listWord = new ArrayList<>();
        for (char c: word.toLowerCase().toCharArray()) {
            listWord.add(c);
        }
        for (char c: listWord) {
            if (!listText.contains(c)) {
                return false;
            } else {
                listText.remove(Character.valueOf(c));
            }
        }
        return true;
    }
}
//END
