import java.util.*;
public class Employee{
private static String name;
private static int id;
private static int salary;

public Employee(String name,int id,int salary){
this.name=name;
this.id=id;
this.salary=salary;
}
public void DisplayEmployeeDetails(){
System.out.println("The employee details are: ");
System.out.println("The name of Employee is: "+ name);
System.out.println("The id of employee is: "+id);
System.out.println("The salary is : "+salary);

}
public static void main(String[] args){
Employee employee1=new Employee("Rahul",124,50000);
employee1.DisplayEmployeeDetails();

}


}
