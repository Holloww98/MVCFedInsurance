package fedinsurance;

public class ViewController {
	
	public void printString(String aString) {
		System.out.println(aString);
	}

    public void printInt(int anInt) {
    	System.out.println(anInt);
    }

    public void printDouble(double aDouble) {
	    System.out.println(aDouble);
    }

    public void printBoolean(boolean aBoolean) {
    	System.out.println(aBoolean);
    }
    
    public void printEmployee(Employee aEmployee) {
    	System.out.println(aEmployee.getEmployeeName());
    	System.out.println(aEmployee.getEmployeeID());
    	System.out.println(aEmployee.getEmployeePosition());
    	System.out.println(aEmployee.getEmployeeDepartment());
    	//System.out.println((aEmployee.getEmployeeSupervisor()).getSupervisorName());
    	//System.out.println((aEmployee.getEmployeePerformance()).getPerformanceRank());
    	
    }
}
