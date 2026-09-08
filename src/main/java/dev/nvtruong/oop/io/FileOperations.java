package dev.nvtruong.oop.io;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Comparator;
import java.util.List;

public final class FileOperations {
    private FileOperations() {}

    public static boolean createFile(Path path) throws IOException {
        Path parent = path.getParent();
        if (parent != null) Files.createDirectories(parent);
        if (Files.exists(path)) return false;
        Files.createFile(path);
        return true;
    }

    public static void copy(Path source, Path target) throws IOException {
        Path parent = target.getParent();
        if (parent != null) Files.createDirectories(parent);
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }

    public static List<Path> listRegularFiles(Path folder) throws IOException {
        try (var stream = Files.list(folder)) {
            return stream.filter(Files::isRegularFile)
                    .sorted(Comparator.comparing(Path::toString))
                    .toList();
        }
    }

    public static long countWords(Path path, Charset charset) throws IOException {
        String text = Files.readString(path, charset).trim();
        return text.isEmpty() ? 0 : text.split("\\s+").length;
    }
}
