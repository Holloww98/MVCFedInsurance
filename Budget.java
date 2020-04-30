package fedinsurance;

public class Budget{
	public String budget_id;
	public String budget_startDate;
	public String budget_endDate;
	public int budget_amt;
	
	public String getBudgetID() {
		return this.budget_id;
	}
	
	public void setBudgetID(String aBudget) {
		this.budget_id = aBudget;
	}
	
	public String getBudgetStartDate() {
		return this.budget_startDate;
	}
	
	public void setBudgetStartDate(String aBudgetDate) {
		this.budget_startDate = aBudgetDate;
	}
	
	public String getBudgetEndDate() {
		return this.budget_startDate;
	}
	
	public void setBudgetEndDate(String aBudgetDate) {
		this.budget_endDate = aBudgetDate;
	}
	
	public int getBudgetTotal() {
		return this.budget_amt;
	}
	
	public void setBudgetTotal(int aBudgetTotal) {
		this.budget_amt = aBudgetTotal;
	}

	
	
}

