package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {
    public static Map<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        Map<String, String> result = new LinkedHashMap<>();

        for (String key : data1.keySet()) {
            if (data2.containsKey(key)) {
                Object value1 = data1.get(key);
                Object value2 = data2.get(key);

                if (value1.equals(value2)) {
                    result.put(key, "unchanged");
                } else {
                    result.put(key, "changed");
                }
            } else {
                result.put(key, "deleted");
            }
        }
        for (String key : data2.keySet()) {
            if (!data1.containsKey(key)) {
                result.put(key, "added");
            }
        }
        return result;
    }
}
//END
