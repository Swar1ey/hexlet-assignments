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

        keyValueStorage.toMap().clear();
        keyValueStorage.toMap().putAll(swappedData);
    }
}
// END
