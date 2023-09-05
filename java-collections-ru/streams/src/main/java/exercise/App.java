package exercise;

import java.util.List;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;



// BEGIN
class App {

    public static long getCountOfFreeEmails(List<String> emails) {
        long countGmail = emails.stream()
                .filter(email -> StringUtils.isNotBlank(email))
                .filter(email -> email.contains("@gmail.com"))
                .count();
        long countYandex = emails.stream()
                .filter(email -> StringUtils.isNotBlank(email))
                .filter(email -> email.contains("@yandex.ru"))
                .count();
        long countHotmail = emails.stream()
                .filter(email -> StringUtils.isNotBlank(email))
                .filter(email -> email.contains("@hotmail.com"))
                .count();
        return countGmail + countYandex + countHotmail;
    }
}
// END
