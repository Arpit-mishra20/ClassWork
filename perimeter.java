//problem 4
import java.util.*;
public class perimeter{
	public static void main(String[] args){
		System.out.println("Enter the length of the rectangle:");
		Scanner sc=new Scanner(System.in);
		float length=sc.nextFloat();
		System.out.println("Enter the width of the rectangle:");
		float width=sc.nextFloat();
		System.out.println("The perimeter of rectangle is "+2 * (length+width));
	}
}
		