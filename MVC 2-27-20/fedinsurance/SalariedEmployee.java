package fedinsurance;

public class SalariedEmployee extends Employee {
    public Salary salary;
    //Constructor
    public SalariedEmployee(String anemployeeID, String aposition, String anemployeeName, String anemployeeDepartment, Supervisor asupervisor, 
             String areviewPeriod, String ausername, String apassword, Salary aWage) {

        this.employeeID = anemployeeID;
        this.position = aposition;
        this.employeeName = anemployeeName;
        this.employeeDepartment = anemployeeDepartment;
        this.supervisor = asupervisor;
        this.reviewPeriod = areviewPeriod;
        this.username = ausername;
        this.password = apassword;
        this.salary = aWage;
    }

    public Salary getSalary() {
        return this.salary;
    }

    public void setSalary(Salary aWage) {
        this.salary = aWage;
    }

}

