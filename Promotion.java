package fedinsurance;

public class Promotion {
	public String promotionID;
	public String promotionTitle;
	public String lastPromotionDate;
	public String promotionDate;
	public Employee promotedEmployee;
	
	//Constructor
	public Promotion(String anID, String aTitle, String lastDate, String thisDate, Employee aEmployee) {
		this.promotionID = anID;
		this.promotionTitle = aTitle;
		this.lastPromotionDate = lastDate;
		this.promotionDate = thisDate;
		this.promotedEmployee = aEmployee;
	}
	
	//gets and sets
	public String getPromotionID() {
		return this.promotionID;
	}
	public void setPromotionID(String anID) {
		this.promotionID = anID;
	}
	
	public String getPromotionTitle() {
		return this.promotionID;
	}
	public void setPromotionTitle(String aTitle) {
		this.promotionTitle = aTitle;
	}
	
	public String getlastPromotionDate() {
		return this.lastPromotionDate;
	}
	public void setlastPromotionDate(String aDate) {
		this.lastPromotionDate = aDate;
	}
	
	public String getlastPromotionDate() {
		return this.lastPromotionDate;
	}
	public void setlastPromotionDate(String aDate) {
		this.lastPromotionDate = aDate;
	}
	
	public Employee getPromotedEmployee() {
		return this.promotedEmployee;
	}
	
	public void setPromotedEmployee(Employee anEmployee) {
		this.promotedEmployee = anEmployee;
	}
	
	
	

}
