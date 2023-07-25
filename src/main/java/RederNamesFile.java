import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class RederNamesFile {
    public List<String> namesReader(String NamesFile) {
        try {
            return Files.readAllLines(Paths.get(NamesFile));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
