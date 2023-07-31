public class Employee {
    String employeeId;
    String employeeName;
    int basicSalary;
    int allowance;
    int deductions;

    int totalSalary(){
        return (basicSalary + allowance) - deductions;
    }

    int annualSalary(){
        return totalSalary() * 12;
    }

    void employeeDisplay(){
        System.out.println(employeeName + " with EmployeeID " + employeeId + " has a total salary of " + totalSalary() + " and an annual salary of " + annualSalary());
    }
}
