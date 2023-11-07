package solid.singleResponsability;

/**
 In this example, the Employee class contains three methods, but it violates the Single Responsibility Principle.
 The class has multiple reasons to change: bonus calculation, printing employee details, and updating the salary.
 To apply the Single Responsibility Principle, we could split the class into three separate classes, each with a single responsibility:
 Employee: This class would only contain the properties (name and salary) of the employee.
 BonusCalculator: This class would be responsible for bonus calculation, taking the Employee object as input.
 EmployeeDetailsPrinter: This class would be responsible for printing employee details, taking the Employee object as input.
 SalaryUpdater: This class would be responsible for updating an employee's salary, taking the Employee object as input.
 Following this approach, each class would have a single responsibility, making the code clearer, more modular, and easier to maintain.
 */

public class Employee {
    private String name;
    private double salary;

    // Method to calculate an employee's bonus
    public double calculateBonus() {
        // Logic for bonus calculation based on salary
        return salary * 0.1;
    }

    // Method to print employee details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    // Method to update an employee's salary
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }
}