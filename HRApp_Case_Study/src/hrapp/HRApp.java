package hrapp;
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e1 = new Employee(230, "ana", 333333333);
        Department department = new Department("Finance");
        department.addEmployee(e1);
        Employee[] emps = department.getEmployees();
        for(Employee em: emps){
            System.out.println("Employee: " + em.details());
        }
        System.out.println("Total: " + department.getTotalSalary());
    }
}
