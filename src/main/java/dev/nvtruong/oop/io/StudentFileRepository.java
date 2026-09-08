package dev.nvtruong.oop.io;

import dev.nvtruong.oop.model.Student;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public final class StudentFileRepository {
    private final Path path;
    private final Charset charset;

    public StudentFileRepository(Path path, Charset charset) {
        this.path = path;
        this.charset = charset;
    }

    public void save(List<Student> students) throws IOException {
        List<String> lines = students.stream()
                .map(s -> s.id() + "," + s.firstName() + "," + s.lastName())
                .toList();
        Files.write(path, lines, charset);
    }

    public List<Student> load() throws IOException {
        if (!Files.exists(path)) return List.of();
        List<Student> result = new ArrayList<>();
        for (String line : Files.readAllLines(path, charset)) {
            if (line.isBlank()) continue;
            String[] parts = line.split(",", -1);
            if (parts.length != 3) throw new IOException("invalid student row: " + line);
            result.add(new Student(Integer.parseInt(parts[0].trim()), parts[1].trim(), parts[2].trim()));
        }
        return List.copyOf(result);
    }
}
