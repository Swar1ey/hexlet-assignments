package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homes, int n) {
        homeSort(homes);
        List<Home> selectHome = homes.subList(0, Math.min(n, homes.size()));
        List<String> result = new ArrayList<>();
        for (Home home : selectHome) {
            result.add(home.toString());
        }
        return result;
    }
    private static void homeSort(List<Home> homes) {
        int n = homes.size();
        for (var i = 1; i < n; i++) {
            Home key = homes.get(i);
            var j = i - 1;

            while (j >= 0 && homes.get(j).compareTo(key) > 0) {
                homes.set(j + 1, homes.get(j));
                j = j - 1;
            }
            homes.set(j + 1, key);
        }
    }
}
// END
