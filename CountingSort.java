import java.util.*;
public class CountingSort{
    public static int[] CountingSortStudentAges(int[] ages){
        int minAge=10;
        int maxAge=18;

        int[] count=new int[maxAge-minAge+1];

        for(int age:ages){
            count[age-minAge]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        int[] output=new int[ages.length];

        for(int i=ages.length;i>=0;i--){
            int age=ages[i];
            output[count[age-minAge]-1]=age;
            count[age-minAge]--;
        }
        return output;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of Students");
        int n=sc.nextInt();

        int[] studentAges=new int[n];
        System.out.print("Enter the ages of Students:");
        for(int i=0;i<n;i++){
            studentAges[i]=sc.nextInt();
            while(studentAges[i]<10 || studentAges[i]>18){
        System.out.print("Age must be between the limit");
        studentAges[i]=sc.nextInt();
            }
        }
        int[] sortedAges=CountingSortStudentAges(studentAges);
        System.out.println("Sorted Ages:");
        for(int age:sortedAges){
            System.out.print(age+" ");
        }
    }
}