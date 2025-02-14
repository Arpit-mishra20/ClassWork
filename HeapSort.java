import java.util.*;
public class HeapSort{

    public static void heapSort(int[] salaries){

        int n=salaries.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(salaries,n,i);
        }
        for(int i=n-1;i>0;i--){
            int temp=salaries[0];
            salaries[0]=salaries[i];
            salaries[i]=temp;

            heapify(salaries,i,0);
        }
    }
    public static void heapify(int[] salaries,int n,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n && salaries[left]>salaries[largest]){
            largest=left;
        }
        if(right<n && salaries[right]>salaries[largest]){
            largest=right;
        }
        if(largest!=i){
            int temp=salaries[i];
            salaries[i]=salaries[largest];
            salaries[largest]=temp;

            heapify(salaries,n,largest);
        }

    }

     public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no of employee job ");

    int n=sc.nextInt();
    int[] salaries=new int[n];
    System.out.println("Enter the expected salaries ");

    for(int i=0;i<n;i++){
        salaries[i]=sc.nextInt();
    }
    heapSort(salaries);
    System.out.println("Sorted expected Employee:");
    for(int salary:salaries){
        System.out.println(salary+" ");
    }
   }

}
