package fedinsurance;

public class Salary {
    int salaryMax;
    int salaryMin;
    String salaryRange;
    String salaryType;
    int projectedSalary;
    int currentSalary;

    //Constructor
    
    public Salary(int aSalarymax, int aSalarymin, String aRange, String aType, int aProjection, int aCurrentSalary) {
        this.salaryMax = aSalarymax;
        this.salaryMin = aSalarymin;
        this.salaryRange = aRange;
        this.salaryType = aType;
        this.projectedSalary = aProjection;
        this.currentSalary = aCurrentSalary;
    }
    //gets and sets
    public int getSalaryMin() {
        return this.salaryMin;
    }
    public void setSalaryMin(int aSalary) {
        this.salaryMin = aSalary;
    }

    public int getSalaryMax() {
        return this.salaryMax;
    }
    public void setSalaryMax(int aSalary) {
        this.salaryMax = aSalary;
    }
    
    public String getSalaryRange() {
        return this.salaryRange;
    }
    public void setSalaryRange(String aSalary) {
        this.salaryRange = aSalary;
    }
    
    public String getSalaryType() {
        return this.salaryType;
    }
    public void setSalaryType(String aSalary) {
        this.salaryType = aSalary;
    }
    
    public int getProjectedSalary() {
        return this.projectedSalary;
    }
    public void setProjectedSalary(int aSalary) {
        this.projectedSalary = aSalary;
    }
    
    public int getCurrentSalary() {
        return this.currentSalary;
    }
    public void setCurrentSalary(int aSalary) {
        this.currentSalary = aSalary;
    }
    
    
}