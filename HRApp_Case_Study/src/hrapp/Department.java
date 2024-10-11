package hrapp;

public class Department {

    private String name;
    private Employee[] employees = new Employee[10];
    private int lastAddEmployeeIndex = -1;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmployee(Employee anEmployee) {
        if (lastAddEmployeeIndex < employees.length) {
            lastAddEmployeeIndex++;
            employees[lastAddEmployeeIndex] = anEmployee;
        }
    }

    public Employee[] getEmployees() {
        Employee[] actualEmployees = new Employee[lastAddEmployeeIndex + 1];
        for (int i = 0; i < actualEmployees.length; i++) {
            actualEmployees[i] = employees[i];
        }
        return actualEmployees;
    }

    public int returnEmployee() {
        return lastAddEmployeeIndex + 1;
    }

    public Employee getEmployeeByID(int employeeID) {
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getID() == employeeID) {
                    return emp;
                }
            }
        }
        return null;
    }

    public double getTotalSalary() {
        double totalSalary = 0;
        for (int i = 0; i <= lastAddEmployeeIndex; i++) {
            totalSalary = employees[i].getSalary();
        }
        return totalSalary;
    }

    public double getAverageSalary() {
        if (lastAddEmployeeIndex > -1) {
            return getTotalSalary() / (lastAddEmployeeIndex + 1);
        }
        return 0.0;
    }
}
