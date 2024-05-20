package Assignment.O2_OOP.A1.Q50;

class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            monthlySalary += monthlySalary * (percentage / 100);
        }
    }
}

public class Q50 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Mahinda", "Rajapaksha", 300000);
        Employee employee2 = new Employee("Ranil", "Wickramasinghe", 250000);

        System.out.println("Employee 1: " + employee1.getFirstName() + " " + employee1.getLastName() + " || Yearly Salary: " +
                employee1.getYearlySalary());
        System.out.println("Employee 1: " + employee2.getFirstName() + " " + employee2.getLastName() + " || Yearly Salary: " +
                employee2.getYearlySalary());


        System.out.println("======================================================================");

        // Give each Employee a 10% raise
        employee1.giveRaise(10);
        employee2.giveRaise(10);

        System.out.printf("Employee 1 after 10%% raise: %s %s, Yearly Salary: %.2f%n",
                employee1.getFirstName(),
                employee1.getLastName(),
                employee1.getYearlySalary());

        System.out.printf("Employee 2 after 10%% raise: %s %s, Yearly Salary: %.2f%n",
                employee2.getFirstName(),
                employee2.getLastName(),
                employee2.getYearlySalary());
    }
}
