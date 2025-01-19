//problem 
import java.util.*;
public class simpleinterest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal");
		float principal=sc.nextFloat();
		System.out.println("Enter the rate");
		float rate=sc.nextFloat();
		System.out.println("Enter the time");
		float time=sc.nextFloat();
		System.out.println("The simpleinterst of given sum is "+ (principal*rate*time)/100);
}
}
		