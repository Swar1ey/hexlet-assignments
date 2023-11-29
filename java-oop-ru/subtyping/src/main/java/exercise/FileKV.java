package exercise;

import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage{
    private String filePath;
    private Map<String, String> dataBase;

    public FileKV(String filePath, Map<String, String> dataBase) {
        this.filePath = filePath;
        this.dataBase = dataBase;
        saveToFile();
    }

    @Override
    public void set(String key, String value) {
        dataBase.put(key, value);
        saveToFile();
    }

    @Override
    public void unset(String key) {
        dataBase.remove(key);
        saveToFile();
    }

    @Override
    public String get(String key, String defaultValue) {
        return dataBase.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return dataBase;
    }
    private void saveToFile() {
        String serialized = Utils.serialize(dataBase);
        Utils.writeFile(filePath, serialized);
    }
    private void loadToFile() {
        String serialized = Utils.readFile(filePath);
    }
}
// END
