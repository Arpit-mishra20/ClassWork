import java.util.*;
public class Table{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int[] multiply=new int[10];
		for(int i=1;i<=10;i++){
			multiply[i-1]=num*i;
		}
		for(int i=1;i<=10;i++){
			System.out.println(num+"*"+i+" = "+multiply[i-1]);
		}
}
}