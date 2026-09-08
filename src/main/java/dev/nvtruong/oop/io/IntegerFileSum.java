package dev.nvtruong.oop.io;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public final class IntegerFileSum {
    private IntegerFileSum() {}

    public static long sum(Path path, Charset charset) throws IOException {
        long total = 0;
        for (String token : Files.readString(path, charset).split("\\s+")) {
            if (token.isBlank()) continue;
            try {
                total = Math.addExact(total, Long.parseLong(token));
            } catch (NumberFormatException e) {
                throw new IOException("invalid integer token: " + token, e);
            }
        }
        return total;
    }
}
