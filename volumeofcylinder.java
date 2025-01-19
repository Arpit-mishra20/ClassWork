//problem 5
import java.util.*;
public class volumeofcylinder{
	public static void main(String[] args){
		System.out.println("Enter the radius:");
		Scanner sc=new Scanner(System.in);
		double radius=sc.nextDouble();
		System.out.println("Enter the height:");
		double height=sc.nextDouble();
		System.out.println("The volume of given radius "+radius+" and height "+height+" is "+(3.14*radius*radius*height));
}
}
		