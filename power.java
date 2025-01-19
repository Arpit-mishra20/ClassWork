//problem 4
import java.util.*;
public class power{
	public static void main(String[] args){
		System.out.println("Enter the base");
		Scanner sc=new Scanner(System.in);
		double base=sc.nextInt();
		System.out.println("Enter the exponent");
		double exponent=sc.nextInt();
		System.out.println("The result of two number is: "+(Math.pow(base,exponent)));
	}
}
		