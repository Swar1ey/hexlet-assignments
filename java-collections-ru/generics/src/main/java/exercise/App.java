package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {

    public static <K, V>List<Map<K, V>> findWhere(List<Map<K, V>> books, Map<K, V> criteria) {
        List<Map<K, V>> result = new ArrayList<>();

        for (Map<K, V> book : books) {
            boolean matchesCriteria = true;

            for (Map.Entry<K, V> entry : criteria.entrySet()) {
                K key = entry.getKey();
                V value = entry.getValue();

                if (!book.containsKey(key) || !book.get(key).equals(value)) {
                    matchesCriteria = false;
                    break;
                }

            }
            if (matchesCriteria) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
