import java.util.Scanner;
public class heightcalculator{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the height in Feet: ");
		double distanceInFeet=sc.nextDouble();
		double yardFactor=1.0/3.0;
		double milesFactor=1.0/1760.0;
		double distanceinYards=distanceInFeet*yardFactor;
		double distanceinMiles=distanceinYards*milesFactor;
		
	    System.out.println("The distancein Yards : "+(distanceinYards)+" The distance in Miles is "+(distanceinMiles));
	}
}