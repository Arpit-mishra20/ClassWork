import java.util.*;
public class CheckNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int num:arr){
			if(num>0){
			if(num%2==0){
			System.out.println("Number is positive and even");
			}
			else{
			System.out.println("Number is positive and odd");	
			}
			}				
			else if(num<0){
			System.out.println("Number is negative");
				
			}
			else{
			System.out.println("Number is zero");
				
			}
		
		}
		if(arr[0]==arr[arr.length-1]){
			System.out.println("The first and last elements are equal");
			
		}
		else if(arr[0]>arr[arr.length-1]){
			System.out.println("The first elements is greater than last");
			
		}
		else{
			System.out.println("The first element is smaller than the last elements");
		}
		
}
}