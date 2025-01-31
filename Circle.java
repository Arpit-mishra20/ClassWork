public class Circle{
private static double radius;
private static double pi=3.14;
public Circle(double radius){
this.radius=radius;
}
public void AreaOfCircle(){
System.out.println("The area is :"+(pi*pi* radius));
}
public void CircumferenceOfCircle(){
System.out.println("The circumference is: "+(pi*2*radius) );

}
public static void main(String[] args){
Circle circle1=new Circle(5.0);
System.out.println("The area and circumference of circle is");
circle1.AreaOfCircle();
circle1.CircumferenceOfCircle();

}

}
