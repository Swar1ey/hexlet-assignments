package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {

    public static List<String> takeOldestMans(List<Map<String, String>> user) {
        List<String> mens = user.stream()
                .filter(men -> men.get("gender").equals("male"))
                .sorted((user1, user2) -> {
                    String date1 = user1.get("birthday");
                    String date2 = user2.get("birthday");
                    return date1.compareTo(date2);
                })
                .map(men -> men.get("name"))
                .collect(Collectors.toList());
        return mens;
    }
}
// END
