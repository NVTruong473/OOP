import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        File folder = new File("TestFolder");
        String extension = ".txt";

        // 1. Lấy các file theo extension
        File[] files = folder.listFiles((dir, name) -> name.endsWith(extension));
        if (files != null) {
            System.out.println("Files with " + extension + ":");
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("No files found or directory does not exist.");
        }

        // 2. Kiểm tra file/directory tồn tại
        File file = new File("TestFolder/file1.txt");
        if (file.exists()) {
            System.out.println("Path exists: " + file.getPath());
            // 3. Kiểm tra file hay directory
            System.out.println(file.isDirectory() ? "It is a directory." : "It is a file.");
        } else {
            System.out.println("Path does not exist.");
        }

        // 4. Thêm nội dung vào file
        try (Scanner sc = new Scanner(System.in);
             BufferedWriter bw = new BufferedWriter(new FileWriter("TestFolder/existing_file.txt", true))) {
            System.out.println("Enter text to append:");
            String textToAppend = sc.nextLine();
            bw.write(textToAppend);
            bw.newLine();
            System.out.println("Content appended to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 5. Tìm từ dài nhất
        try (Scanner scanner = new Scanner(new File("TestFolder/input.txt"))) {
            String longest = "";
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }
            System.out.println("Longest word: " + longest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
