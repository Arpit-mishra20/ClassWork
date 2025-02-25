package AssignmentCSV;
import java.io.* ;

public class WriteCSV {
   public static void main(String[] args) throws IOException {
       String CsvFileName = "employee.csv";

       FileWriter writer = new FileWriter(CsvFileName);
           writer.append("ID,Name,Department,Salary \n");
           writer.append("104,Arpit,Engineering,92000 \n");
           writer.append("105,Arun,Management,88000 \n");
           writer.append("106,Avesh,Medical,100000 \n");
           writer.append("107,Anu,Sales,88000 \n");
           writer.append("108,Gaurav,Sales,88000 \n");
           writer.append("109,Arav,Sales,88000 \n");

           writer.close();

           System.out.println("CSV file written successfully!" +CsvFileName );


   }
}