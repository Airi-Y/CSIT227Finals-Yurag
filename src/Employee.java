public class Employee extends Person {
    private int months_worked;
    private double salary;
    private double thirteenthMonth;
    private String role;

    public void setMonths_worked(int months_worked) {
        this.months_worked = months_worked;
    }
    public int getMonths_worked() {
        return months_worked;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    public void setThirteenthMonth(double thirteenthMonth) {
        this.thirteenthMonth = thirteenthMonth;
    }
    public double getThirteenthMonth() {
        return thirteenthMonth;
    }

    public void setRole(String role) {
        if (role == "1"){
            this.role = "Clerk";
        } else if (role == "2"){
            this.role = "Manager";
        }
    }
    public String getRole() {
        return role;
    }

}
