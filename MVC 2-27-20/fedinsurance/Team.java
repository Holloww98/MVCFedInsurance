package fedinsurance;

public class Team {
	String teamID = "N/A";
	String teamName = "n/a";
	Supervisor teamSupervisor;
	Deparment teamDepartment;
	
	public String getTeamID() {
		return this.teamID;
	}
	public void setTeamID(String anID ) {
		this.teamID = anID ;
	}
	
	public String getTeamName() {
		return this.teamName;
	}
	public void setTeamName(String aName ) {
		this.teamName = aName ;
	}
	
	public Supervisor getSupervisor() {
		return this.supervisor;
	}
	public void setSupervisor(Employee aSupervisor ) {
		this.supervisor = aSupervisor ;
	}
	
	public Department getDepartment() {
		return this.teamDepartment
	}
	public void setDepartment(Department aDepartment) {
		this.teamDepartment = aDepartment;
	}

}
