package Abstraction1;

public class executor {
    public static void main(String[] args) {
        Manager firstEmployee = new Manager(12,78893.890,21890.239);
        System.out.println("Manager's id is "+firstEmployee.getEmployeeId()+" and "+" Manager's salary is "+firstEmployee.calculateSalary());
        Developer secondEmployee = new Developer(10,1200.430,12.3f);
        System.out.println("Developer's id is "+secondEmployee.getEmployeeId()+" and "+" Salary of developer is "+secondEmployee.calculateSalary());
    }
}
