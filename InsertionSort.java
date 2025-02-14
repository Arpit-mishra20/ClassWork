import java.util.*;

public class InsertionSort{

    public static void insertionSort(int[] employeeIDs){
        int n=employeeIDs.length;
        for(int i=1;i<n;i++){
            int key=employeeIDs[i];
            int j=i-1;
            while(j>=0 && employeeIDs[j]>key){
                employeeIDs[j+1]=employeeIDs[j];
                j=j-1;
            }
            employeeIDs[j+1]=key;
        }




    }

   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] employeeIDs=new int[n];
    System.out.println("Enter the employee IDs ");

    for(int i=0;i<n;i++){
        employeeIDs[i]=sc.nextInt();
    }
    insertionSort(employeeIDs);
    System.out.println("Sorted Employee IDs:");
    for(int ids:employeeIDs){
        System.out.println(ids+" ");
    }
   }

}