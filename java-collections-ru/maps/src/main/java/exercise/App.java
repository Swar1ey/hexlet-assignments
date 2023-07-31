package exercise;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> resultMap = new HashMap<>();
        if (!sentence.isEmpty()){
            String[] words = sentence.split(" ");
            for (String word: words) {
                resultMap.put(word, resultMap.getOrDefault(word, 0) + 1);

            }
        }
        return resultMap;
    }

    public static String toString(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return "{}";
        }
        StringBuilder str = new StringBuilder();
        str.append("{\n");
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            str.append("  " + (entry.getKey() + ": " + entry.getValue()) + "\n");
        }
        str.append("}");
        return str.toString();
    }
}
//END
