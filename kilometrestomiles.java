//problem 3
import java.util.*;
public class kilometrestomiles{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the distance in kilometres");
float kilometres;
double miles;
kilometres=sc.nextFloat();
miles=(kilometres*0.621371);
System.out.println("Distance in miles is:"+miles);
}
}