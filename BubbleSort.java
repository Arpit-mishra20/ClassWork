import java.util.*;

public class BubbleSort{

    public static void bubbleSort(int[] marks){
        int n=marks.length;

        for(int i=0;i<n-1;i++){
        boolean isSwapped=false;
            for(int j=0;j<n-1-i;j++){
                if(marks[j]>marks[j+1]){
                    int temp=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }

   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] studentMarks=new int[n];
    System.out.println("Enter the marks: ");

    for(int i=0;i<n;i++){
        studentMarks[i]=sc.nextInt();
    }
    bubbleSort(studentMarks);
    System.out.println("Sorted Marks:");
    for(int marks:studentMarks){
        System.out.println(marks+" ");
    }
   }

}