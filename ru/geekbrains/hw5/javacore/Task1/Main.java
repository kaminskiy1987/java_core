package  ru.geekbrains.hw5.javacore.Task1;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String sourceDirectory = "C:\\Users\\Михаил\\Desktop\\java_core\\ru\\geekbrains\\hw5\\javacore";
        String destinationDirectory = "C:\\Users\\Михаил\\Desktop\\java_core\\ru\\geekbrains\\hw5\\Backup";

        try {
            copyDirectory(sourceDirectory, destinationDirectory);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void copyDirectory(String sourceDirectory, String destinationDirectory)
            throws IOException {
        Files.walk(Paths.get(sourceDirectory))
                .forEach(source -> {
                    Path destination = Paths.get(destinationDirectory, source.toString()
                            .substring(sourceDirectory.length()));
                    try {
                        Files.copy(source, destination);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }
}
