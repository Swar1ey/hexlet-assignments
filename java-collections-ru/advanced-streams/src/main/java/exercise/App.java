package exercise;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String text) {
        Map<String, String> variables = Arrays.stream(text.split("\n"))
                .filter(line -> line.startsWith("environment=\""))
                .map(line -> line.substring("environment=\"".length()))
                .flatMap(line -> Arrays.stream(line.split(",")))
                .filter(x -> x.startsWith("X_FORWARDED_"))
                .map(x -> {
                    String[] parts = x.split("=");
                    String name = parts[0].substring("X_FORWARDED_".length());
                    String value = parts[1].replace("\"","");
                    return new AbstractMap.SimpleEntry<>(name, value);
                })
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new));

        return variables.entrySet().stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.joining(","));
    }
}
//END
