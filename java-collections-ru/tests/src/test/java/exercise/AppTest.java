package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake1() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> test1 = App.take(numbers1, 2);
        List<Integer> result = new ArrayList<>(Arrays.asList(1, 2));
        assertThat(test1).isEqualTo(result);
        // END
    }
}
