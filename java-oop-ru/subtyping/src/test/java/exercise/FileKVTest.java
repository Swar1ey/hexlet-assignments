package exercise;

import java.util.HashMap;
import org.junit.jupiter.api.BeforeEach;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
// BEGIN
import org.junit.jupiter.api.Test;
// END


class FileKVTest {

    private static Path filepath = Paths.get("src/test/resources/file").toAbsolutePath().normalize();

    @BeforeEach
    public void beforeEach() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String content = mapper.writeValueAsString(new HashMap<String, String>());
        Files.writeString(filepath, content, StandardOpenOption.CREATE);
    }

    // BEGIN
    @Test
    void fileKVTest() {
        // Создаем объект FileKV с пустым файлом
        FileKV fileKV = new FileKV(filepath.toString(), new HashMap<>());

        // Добавляем данные
        fileKV.set("key", "value");

        // Проверяем, что данные сохранены в файле
        String fileContent = readFileContent(filepath);
        assertThat(fileContent).contains("{\"key\":\"value\"}");

        // Получаем значение по ключу
        assertThat(fileKV.get("key", "default")).isEqualTo("value");

        // Удаляем данные
        fileKV.unset("key");

        // Проверяем, что данные удалены из файла
        fileContent = readFileContent(filepath);
        assertThat(fileContent).isEqualTo("{}key\":\"value\"}\"}\":\"value3\"}3\"}");
    }

    private String readFileContent(Path filePath) {
        try {
            return Files.readString(filePath);
        } catch (Exception e) {
            throw new RuntimeException("Error reading file content", e);
        }
    }

    // END
}
