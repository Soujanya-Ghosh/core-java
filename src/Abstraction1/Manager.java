package Abstraction1;

 class Manager extends  Employee{
    private double baseSalary;
    private double bonus;
    public Manager(){}


     public Manager(int employeeId, double baseSalary, double bonus) {
         super(employeeId);
         this.baseSalary = baseSalary;
         this.bonus = bonus;
     }

     public double getBaseSalary() {
         return baseSalary;
     }

     public void setBaseSalary(double baseSalary) {
         this.baseSalary = baseSalary;
     }

     public double getBonus() {
         return bonus;
     }

     public void setBonus(double bonus) {
         this.bonus = bonus;
     }
     @Override
     public double calculateSalary(){
        return baseSalary+bonus;
     }

     @Override
     public String toString() {
         return "Manager{" +
                 "baseSalary=" + baseSalary +
                 ", bonus=" + bonus +
                 super.getEmployeeId()+
                 '}';
     }
 }
