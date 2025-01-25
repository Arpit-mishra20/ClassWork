import java.util.*;
public class StoreResult{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double[] num=new double[10];
		double total=0.0;
		int index=0;
		while(true){
		System.out.println("Enter a number: ");
		double digit=sc.nextDouble();
		if(digit<0 || digit>=10){
			break;
		}
		num[index]=digit;
		index++;
		}
		
		for(int i=0;i<index;i++){
			total+=num[i];
		}
		System.out.println("Numbers inputted: ");
		for(int i=0;i<index;i++){
		System.out.println(num[i]);
		}
		System.out.println("total: " +total);
		sc.close();
		
}
}