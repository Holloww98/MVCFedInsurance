package fedinsurance;

public class Employee {
	public String employeeID;
	public String position;
	public String employeeName;
	public Supervisor supervisor;
	public String reviewPeriod;
	public String username;
	public String password;
	public PerformanceReview employeePerformance;
	
	//Constructor
	
	public Employee(String anID, String aPosition, String aName, Supervisor aSupervisor, String aReviewPeriod, String aUser, String aPass, PerformanceReview aPerformance) {
		this.employeeID = anID;
		this.position = aPosition;
		this.employeeName = aName;
		this.supervisor = aSupervisor;
		this.reviewPeriod = aReviewPeriod;
		this.username = aUser;
		this.password = aPass;
		this.employeePerformance = aPerformance;
	}
	
	//Gets and Sets
	public String getEmployeeID() {
		return this.employeeID;
	}
	
	public void setEmployeeID(String aEmployeeID) {
		this.employeeID = aEmployeeID;
	}
	
	public String getEmployeePosition() {
		return this.position;
	}
	
	public void setPosition(String aPosition) {
		 this.position = aPosition ;
	}
	
	public String getEmployeeName() {
		return this.employeeName ;
	}
	
	public void setEmployeeName(String aEmployeeName) {
		this.employeeName = aEmployeeName;
	}
	

	public Supervisor getEmployeeSupervisor() {
		return this.supervisor ;
	}
	
	public void setSupervisor(Supervisor aSupervisor) {
		this.supervisor = aSupervisor ;
	}
	
	public String getReviewPeriod() {
		return this.reviewPeriod ;
	}
	
	public void setReviewPeriod(String aReviewPeriod) {
		this.reviewPeriod = aReviewPeriod;
	}

	private String getUsername() {
		return this.username ;
	}
	
	public void setUsername(String aUsername) {
		this.username = aUsername ;
	}

	private String getPassword() {
		return this.password ;
	}
	
	public void setPassword(String aPassword) {
		this.password = aPassword ;
	}
	
	public PerformanceReview getEmployeePerformance() {
		return this.employeePerformance ;
	}
	
	public void setEmployeePerformance(PerformanceReview aPerformance) {
		this.employeePerformance = aPerformance;
	}
	
	public String getEmployeePerformancePeriod() {
		return this.reviewPeriod ;
	}
	
	public void setEmployeePerformancePeriod(String aDate) {
		this.reviewPeriod = aDate;
	}




}


