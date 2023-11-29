package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage keyValueStorage) {
        Map<String, String> currentData = keyValueStorage.toMap();
        Map<String, String> swappedData = new HashMap<>();

        for (Map.Entry<String, String> entry : currentData.entrySet()) {
            swappedData.put(entry.getValue(), entry.getKey());
        }

        for (String key : currentData.keySet()) {
            keyValueStorage.unset(key);
        }
        for (Map.Entry<String, String> entry : swappedData.entrySet()) {
            keyValueStorage.set(entry.getKey(), entry.getValue());
        }
    }
}
// END
