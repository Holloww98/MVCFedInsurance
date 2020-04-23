package fedinsurance;

public class Budget{
	public String budgetID;
	public String budgetStartDate;
	public String budgetEndDate;
	public int budgetTotal;
	
	public String getBudgetID() {
		return this.budgetID;
	}
	
	public void setBudgetID(String aBudget) {
		this.budgetID = aBudget;
	}
	
	public String getBudgetStartDate() {
		return this.budgetStartDate;
	}
	
	public void setBudgetStartDate(String aBudgetDate) {
		this.budgetStartDate = aBudgetDate;
	}
	
	public String getBudgetEndDate() {
		return this.budgetStartDate;
	}
	
	public void setBudgetEndDate(String aBudgetDate) {
		this.budgetEndDate = aBudgetDate;
	}
	
	public int getBudgetTotal() {
		return this.budgetTotal;
	}
	
	public void setBudgetTotal(int aBudgetTotal) {
		this.budgetTotal = aBudgetTotal;
	}

	
	
}

