package fedinsurance;
import java.util.ArrayList;*;

public class Subordinates {
	String team_id;
	String team_name;
	Supervisor team_supervisor;
	Arraylist[Employee] subordinateEmployees;
	
	
	//Constructor
	public Subordinates(String anID, String aName, Supervisor aSupervisor, Arraylist[Employee] aList) {
		this.team_id = anID;
		this.team_name = aName;
		this.team_supervisor = aSupervisor;
		this.subordinateEmployees = aList;
	}
	
	//gets and sets
	public String getTeamID() {
		return this.team_id;
	}
	public void setTeamID(String anID ) {
		this.team_id = anID ;
	}
	
	public String getTeamName() {
		return this.team_name;
	}
	public void setTeamName(String aName ) {
		this.team_name = aName ;
	}
	
	public Supervisor getSupervisor() {
		return this.team_supervisor;
	}
	public void setSupervisor(Employee aSupervisor ) {
		this.team_supervisor = aSupervisor ;
	}
	
	public ArrayList[Employee] getSubordinateEmployees() {
		return this.subordinateEmployees;
	}
	public void setSubordinateEmployees(Arraylist[Employee] aGroupOfEmployees ) {
		this.subordinateEmployees = aGroupOfEmployees ;
	}
	


}
