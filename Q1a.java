package Q1.a;

public class Q1a {
    public static void main(String[] args) {
        String employeeName = "Loo Zhi Han";
        double currentSalary = 3000;

        Employee employee = new Employee(employeeName, currentSalary);
        employee.raiseSalary(8); //Salary raised
        
        System.out.println("Name: " + employee.name + 
                           "\nBefore Salary raise: " + currentSalary + 
                           "\nAfter Salary raise: " + employee.salary);

    }
}
