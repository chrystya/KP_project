package training;

public class Employee extends Abstract_Employee {

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

    @Override
        public void PrintEmployee() {
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
emp1.PrintEmployee();
emp1.PrintAddress("Lviv");

emp2.empAge(30);
emp2.empDesignation("Senior QC");
emp2.empSalary(1500);
emp2.PrintEmployee();




}}
