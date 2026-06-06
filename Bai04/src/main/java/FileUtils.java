package main.java;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {
    public String buildPath(String... parts) {
        Path path = Paths.get(parts[0], java.util.Arrays.copyOfRange(parts, 1, parts.length));
        return path.toString();
    }

    public String getFileName(String filePath) {
        return Paths.get(filePath).getFileName().toString();
    }

    public String getParentDir(String filePath) {
        Path parent = Paths.get(filePath).getParent();
        return parent != null ? parent.toString() : "";
    }
}