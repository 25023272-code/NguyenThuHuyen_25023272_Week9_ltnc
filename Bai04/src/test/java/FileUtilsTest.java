package test.java;

import main.java.FileUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;

public class FileUtilsTest {
    private FileUtils fileUtils = new FileUtils();

    @Test
    public void testBuildPath() {
        String path = fileUtils.buildPath("home", "user", "documents");
        assertTrue(path.contains("home"));
        assertTrue(path.contains("user"));
        assertTrue(path.contains("documents"));
    }

    @Test
    public void testGetFileName() {
        String name = fileUtils.getFileName("home" + File.separator + "user" + File.separator + "file.txt");
        assertEquals("file.txt", name);
    }

    @Test
    public void testGetParentDir() {
        String parent = fileUtils.getParentDir("home" + File.separator + "user" + File.separator + "file.txt");
        assertTrue(parent.contains("user"));
    }
}