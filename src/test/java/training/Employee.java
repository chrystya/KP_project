package training;

public class Employee {

    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name){
        this.name=name;
    }
    public void empAge(int empAge){
        age=empAge;
    }
    public void empDesignation(String empDesignation){
        designation=empDesignation;
    }
    public void empSalary(double empSalary){
        salary = empSalary;
    }
    /* Print the Employee details */
    public void printEmployee() {
        System.out.println("Name:"+ name );
        System.out.println("Age:" + age );
        System.out.println("Designation:" + designation );
        System.out.println("Salary:" + salary);
    }
    public static void main(String []args) {
Employee emp1 = new Employee("Jane Smith");
Employee emp2 = new Employee("Jim Bim");
emp1.empAge(25);
emp1.empDesignation("Middle QC");
emp1.empSalary(545);
emp1.printEmployee();

}}
