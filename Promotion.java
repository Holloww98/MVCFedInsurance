package fedinsurance;

public class Promotion {
	public String promotion_id;
	public String promotion_title;
	public String lastPromotion_Date;
	public String promotion_Date;
	public Employee promotedEmployee;
	
	//Constructor
	public Promotion(String anID, String aTitle, String lastDate, String thisDate, Employee aEmployee) {
		this.promotion_id = anID;
		this.promotion_title = aTitle;
		this.lastPromotion_Date = lastDate;
		this.promotion_Date = thisDate;
		this.promotedEmployee = aEmployee;
	}
	
	//gets and sets
	public String getPromotionID() {
		return this.promotion_id;
	}
	public void setPromotionID(String anID) {
		this.promotion_id = anID;
	}
	
	public String getPromotionTitle() {
		return this.promotion_title;
	}
	public void setPromotionTitle(String aTitle) {
		this.promotion_title = aTitle;
	}
	
	public String getlastPromotionDate() {
		return this.lastPromotion_Date;
	}
	public void setlastPromotionDate(String aDate) {
		this.lastPromotion_Date = aDate;
	}
	
	public String getlastPromotionDate() {
		return this.promotion_Date;
	}
	public void setlastPromotionDate(String aDate) {
		this.promotion_Date = aDate;
	}
	
	public Employee getPromotedEmployee() {
		return this.promotedEmployee;
	}
	
	public void setPromotedEmployee(Employee anEmployee) {
		this.promotedEmployee = anEmployee;
	}
	
	
	

}
