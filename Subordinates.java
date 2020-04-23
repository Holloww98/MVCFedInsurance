package fedinsurance;
import java.util.ArrayList;*;

public class Subordinates {
	String teamID;
	String teamName;
	Supervisor teamSupervisor;
	Arraylist[Employee] subordinateEmployees;
	
	
	//Constructor
	public Subordinates(String anID, String aName, Supervisor aSupervisor, Arraylist[Employee] aList) {
		this.teamID = anID;
		this.teamName = aName;
		this.teamSupervisor = aSupervisor;
		this.subordinateEmployees = aList;
	}
	
	//gets and sets
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
	
	public ArrayList[Employee] getSubordinateEmployees() {
		return this.supervisor;
	}
	public void setSubordinateEmployees(Arraylist[Employee] aGroupOfEmployees ) {
		this.subordinateEmployees = aGroupOfEmployees ;
	}
	


}
