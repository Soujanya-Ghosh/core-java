package Abstraction1;
 abstract class Employee {
     private int employeeId;
     public Employee(){}

     public Employee(int employeeId) {
         this.employeeId = employeeId;
     }

     public int getEmployeeId() {
         return employeeId;
     }

     public void setEmployeeId(int employeeId) {
         this.employeeId = employeeId;
     }
     public abstract double calculateSalary();

     @Override
     public String toString() {
         return "Employee{" +
                 "employeeId=" + employeeId +
                 '}';
     }
 }
