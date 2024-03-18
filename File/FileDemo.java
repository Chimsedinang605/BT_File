package src.File;

import java.io.*;
import java.io.IOException;
import java.nio.file.*;
public class FileDemo {
   // private String fileName;
   // private String data;
   // private String sourceFileName , targetFileName;

   public void CreateFile(String fileName) throws IOException {
      Path path = Paths.get(fileName);
      Files.createFile(path);
      System.out.println("Đã tạo file mới:" + fileName);
   }

   public void SaveFile(String sourceFileName, String targetFileName) throws IOException {
      Path sourcePath = Paths.get(sourceFileName);
      Path targetPath = Paths.get(targetFileName);
      Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
      System.out.println("Đã lưu file từ" + sourceFileName + "sang" + targetFileName);
      ;
   }

   public void WriteFile(String fileName, String data) throws IOException {
      Path path = Paths.get(fileName);
      BufferedWriter writer = Files.newBufferedWriter(path);
      writer.write(data);
      writer.close();
      System.out.println("Đã ghi dữ liệu vào file:" + fileName);

   }

   public String ReadFile(String fileName) throws IOException {
      Path path = Paths.get(fileName);
      BufferedReader reader = Files.newBufferedReader(path);
      StringBuilder contents = new StringBuilder();
      String line;
      while ((line = reader.readLine()) != null) {
         contents.append(line).append("\n");
      }
      reader.close();
      System.out.println("Đã đọc dữ liệu từ file:" + fileName);
      return contents.toString();

   }

   public String getFilePath(String fileName) {
      Path path = Paths.get(fileName);
      return path.toAbsolutePath().toString();
   }

   public void DeleteFile(String fileName) throws IOException {
      Path path = Paths.get(fileName);
      Files.deleteIfExists(path);
      System.out.println("Đã xóa file: " + fileName);
   }

   public void CreateDirectory(String directoryName) throws IOException {
      Path path = Paths.get(directoryName);
      Files.createDirectories(path);
      System.out.println("Đã tạo thư mục mới: " + directoryName);
   }
}
