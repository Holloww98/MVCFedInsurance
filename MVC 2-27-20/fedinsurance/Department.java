package fedinsurance;


public class Department {
    String deptID = "N/A";
    String deptName = "n/a";


    public Department(String adeptID, String adeptName) {
        this.deptID = adeptID;
        this.deptName = adeptName;
    }

    public String getDeptID() {
        return this.deptID;
    }
    public void setDeptID(String anID ) {
        this.deptID = anID ;
    }

    public String getDeptName() {
        return this.deptName;
    }
    public void setDeptName(String aName ) {
        this.deptName = aName ;
    }


}