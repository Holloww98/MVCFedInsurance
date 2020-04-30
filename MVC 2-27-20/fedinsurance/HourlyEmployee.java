package fedinsurance;

public class HourlyEmployee extends Employee {
    public int hourlywage;
    //Constructor
    public HourlyEmployee(String anemployeeID, String aposition, String anemployeeName, String anemployeeDepartment, Supervisor asupervisor, 
             String areviewPeriod, String ausername, String apassword, int aWage) {

        this.employeeID = anemployeeID;
        this.position = aposition;
        this.employeeName = anemployeeName;
        this.employeeDepartment = anemployeeDepartment;
        this.supervisor = asupervisor;
        this.reviewPeriod = areviewPeriod;
        this.username = ausername;
        this.password = apassword;
        this.hourlywage = aWage;
    }

    public int getHourlywage() {
        return this.hourlywage;
    }

    public void setHourlyWage(int aWage) {
        this.hourlywage = aWage;
    }

}

