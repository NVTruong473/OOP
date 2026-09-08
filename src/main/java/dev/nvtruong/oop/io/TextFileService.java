package dev.nvtruong.oop.io;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Locale;

public final class TextFileService {
    private TextFileService() {}

    public static void uppercase(Path input, Path output, Charset charset) throws IOException {
        String content = Files.readString(input, charset);
        Files.writeString(output, content.toUpperCase(Locale.ROOT), charset);
    }

    public static List<String> readLines(Path path, Charset charset) throws IOException {
        return Files.readAllLines(path, charset);
    }

    public static void appendLine(Path path, String line, Charset charset) throws IOException {
        Files.writeString(path, line + System.lineSeparator(), charset,
                StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}
