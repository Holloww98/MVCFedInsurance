package fedinsurance;


public class Supervisor extends Employee {
    String supervisorID;
    String position;
    Subordinates supervisor_subordinates;
    
    //Constructor
    public Supervisor(String anID, String aPosition, String aName, Supervisor aSupervisor, String aReviewPeriod, String aUser, String aPass, PerformanceReview aPerformance,String aSupervisorID, String aPosition, Subordinates someEmployees) {
    	this.employeeID = anID;
		this.position = aPosition;
		this.employeeName = aName;
		this.supervisor = aSupervisor;
		this.reviewPeriod = aReviewPeriod;
		this.username = aUser;
		this.password = aPass;
		this.employeePerformance = aPerformance;
    	this.supervisorID = aSupervisorID;
        this.position = aPosition;
        this.supervisor_subordinates = someEmployees;
      
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
    public Subordinates getSubordinates() {
        return this.supervisor_subordinates;
    }
    public void setSubordinates(Subordinates someEmployees) {
        this.supervisor_subordinates = someEmployees ;
    }



}
