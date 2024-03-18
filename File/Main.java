package src.File;

import java.io.File;
import java.io.IOException;

public class Main {
   public static void main(String[] args) {
      FileDemo fileDemo = new FileDemo();

      // Tạo file
      String filename = "Hong.txt";

      try {
         fileDemo.CreateFile(filename);

      } catch (IOException e) {
         e.printStackTrace();
         System.out.println("Error!!!" + e.getMessage());
      }

      // // Viết vào File
      String data = "Bộp Bộp";
      try {
         fileDemo.WriteFile(filename, data);
      } catch (IOException e) {
         // TODO: handle exception
         e.printStackTrace();
         System.out.println("Error!!!" + e.getMessage());
      }
      // // Đọc File
      try {
         fileDemo.ReadFile(filename);

      } catch (IOException e) {
         // TODO: handle exception
         e.printStackTrace();
         System.out.println("error" + e.getMessage());
      }
      // Lưu file
      String sourceFileName = filename;
      String targetFileName = "test_copy.txt";
      try {
         fileDemo.SaveFile(sourceFileName, targetFileName);
      } catch (IOException e) {

         e.printStackTrace();
      }

      // Xóa file
      try {
         fileDemo.DeleteFile(filename);
         fileDemo.DeleteFile(targetFileName);
      } catch (IOException e) {
         e.printStackTrace();
      }


      // tạo thư mục mới
      String directoryName = "new_directory";
      try {
         fileDemo.CreateDirectory(directoryName);
      } catch (IOException e) {
         e.printStackTrace();
      }
        


   }
}
