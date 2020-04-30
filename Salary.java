package fedinsurance;

public class Salary {
    String sal_id;
	int sal_max;
    int sal_min;
    String sal_Range;
    String sal_Type;
    int sal_actualAmt;
    int sal_projectedAmt;


    //Constructor
    
    public Salary(int aSalarymax, int aSalarymin, String aRange, String aType, int aProjection, int aCurrentSalary) {
        this.sal_max = aSalarymax;
        this.sal_min = aSalarymin;
        this.sal_Range = aRange;
        this.sal_Type = aType;
        this.sal_projectedAmt = aProjection;
        this.sal_actualAmt = aCurrentSalary;
    }
    //gets and sets
    public int getSalaryMin() {
        return this.sal_min;
    }
    public void setSalaryMin(int aSalary) {
        this.sal_min = aSalary;
    }

    public int getSalaryMax() {
        return this.sal_max;
    }
    public void setSalaryMax(int aSalary) {
        this.sal_max = aSalary;
    }
    
    public String getSalaryRange() {
        return this.sal_Range;
    }
    public void setSalaryRange(String aSalary) {
        this.sal_Range = aSalary;
    }
    
    public String getSalaryType() {
        return this.sal_Type;
    }
    public void setSalaryType(String aSalary) {
        this.sal_Type = aSalary;
    }
    
    public int getProjectedSalary() {
        return this.sal_projectedAmt;
    }
    public void setProjectedSalary(int aSalary) {
        this.sal_projectedAmt = aSalary;
    }
    
    public int getCurrentSalary() {
        return this.sal_actualAmt;
    }
    public void setCurrentSalary(int aSalary) {
        this.sal_actualAmt = aSalary;
    }
    
    
}