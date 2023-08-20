package Abstraction1;

public class Developer extends Employee{
    private double hourlyRate;
    private float hoursWorked;
    public Developer(){}

    public Developer(double hourlyRate, float hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public Developer(int employeeId, double hourlyRate, float hoursWorked) {
        super(employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary(){
        return hourlyRate*hoursWorked;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "hourlyRate=" + hourlyRate +
                ", hourlyWorked=" + hoursWorked +
                super.getEmployeeId()+
                '}';
    }
}
