package AssignmentCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountRecord {
   public static void main(String[] args) {
       String filePath = "employee.csv";
       int recordCount = countRecords(filePath);
       System.out.println("Number of records (excluding header): " + recordCount);
   }

   public static int countRecords(String filePath) {
       int count = 0;
       try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
           String line;
           boolean isHeader = true;
           while ((line = br.readLine()) != null) {
               if (isHeader) {
                   isHeader = false;
                   continue;
               }
               count++;
           }
       } catch (IOException e) {
           System.err.println("Error reading file: " + e.getMessage());
       }
       return count;
   }
}