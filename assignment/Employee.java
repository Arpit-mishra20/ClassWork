class Employee {
    private static String companyName = "Capegemini Ltd.";
    private static int totalEmployees = 0;

    private final int id; 
    private String name;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }


    public static void main(String[] args) {
        Employee emp1 = new Employee("Arpit", 101, "Software Engineer");
        Employee emp2 = new Employee("Bavesh", 102, "Project Manager");

        emp1.displayEmployeeDetails();
        System.out.println("-------------------");
        emp2.displayEmployeeDetails();

        Employee.displayTotalEmployees();
    }
}