package fedinsurance;


public class Supervisor {
    String supervisorID;
    String position;
    Department department;

    public Supervisor(String aSupervisorID, String aPosition, Department aDepartment) {
        this.supervisorID = aSupervisorID;
        this.position = aPosition;
        this.department = aDepartment;
    }

    public String getSupervisorID() {
        return this.supervisorID;
    }
    public void setSupervisorID(String anID) {
        this.supervisorID = anID ;
    }

    public String getPosition() {
        return this.position;
    }
    public void setPosition(String aPosition) {
        this.position = aPosition ;
    }

    public Department getDepartment() {
        return this.department;
    }
    public void setDepartment(Department aDept) {
        this.department = aDept;
    }

}
