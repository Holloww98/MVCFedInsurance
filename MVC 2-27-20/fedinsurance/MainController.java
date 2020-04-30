package fedinsurance;

public class MainController {

    public static void main(String[] args) {
        Department testDepartment = new Department("CC22", "SoftwareDevelopment");
        Supervisor testSupervisor = new Supervisor("EI75", "CIO", testDepartment);
        Salary testSalary = new Salary(50000, 60000);
        SalariedEmployee testEmployee = new SalariedEmployee("24", "Level 2 Software Developer", "Cal Capra", "Blue Department", testSupervisor, "2/13/20 - 2/15/20", "capra98", "winter2020", testSalary);
        ViewController controller = new ViewController();
        controller.printEmployee(testEmployee);
    }

}
