
public class Report {
	public String report_id;
	public String report_title;
	public String projected_Grade;
	public String actual_Grade;
	public String projection_Rate;
	public String actual_Rate;
	public int updatedPay_amount;
	
	//Constructor
	public Report(String anID, String aTitle, String aGrade, String aProjectionRate, String aActualRate, int aAmount) {
		this.report_id = anID;
		this.report_title = aTitle;
		this.projected_Grade = aGrade;
		this.actual_Grade = aGrade;
		this.projection_Rate = aProjectionRate;
		this.actual_Rate = aActualRate;
		this.updatedPay_amount = aAmount;
	}
	
	//gets and sets

	public String getReportID() {
		return this.report_id;
	}
	public void setReportID(String aReportID) {
		this.report_id = aReportID;
	}
	
	public String getReportTitle() {
		return this.report_Title;
	}
	public void setReportTitle(String aReportTitle) {
		this.report_title = aReportTitle;
	}
	
	public String getProjectedGrade() {
		return this.projected_Grade;
	}
	
	public void setProjectedGrade(String aGrade) {
		this.projected_Grade = aGrade;
	}
	
	public String getActualGrade() {
		return this.actual_Grade;
	}
	
	public void setActualGrade(String aGrade) {
		this.actual_Grade = aGrade;
	}
	
	public String getProjectionRate() {
		return this.projection_Rate;
	}
	
	public void setProjectionRate(String aRate) {
		this.projection_Rate = aRate;
	}

	public String getUpdatedPayAmount() {
		return this.updatedPay_amount;
	}
	
	public void setUpdatedPayAmount(String aAmount) {
		this.updatedPay_amount = aRate;
	}
}
