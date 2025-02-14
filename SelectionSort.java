import java.util.*;

public class SelectionSort{

    public static void selectionSort(int[] examScores){
        int n=examScores.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(examScores[j]<examScores[minIndex]){
                    minIndex=j;
                }
            }
            int temp=examScores[minIndex];
            examScores[minIndex]=examScores[i];
            examScores[i]=temp;
        }
    }

   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no of students: ");
    int n=sc.nextInt();
    int[] examScores=new int[n];
    System.out.println("Enter the exam scores: ");

    for(int i=0;i<n;i++){
        examScores[i]=sc.nextInt();
    }
    selectionSort(examScores);
    System.out.println("Sorted exam scores:");
    for(int score:examScores){
        System.out.println(score+" ");
    }
   }

}