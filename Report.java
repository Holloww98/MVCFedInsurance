
public class Report {
	public String reportID;
	public String reportTitle;
	public String reportGrade;
	
	//Constructor
	public Report(String anID, String aTitle, String aGrade) {
		this.reportID = anID;
		this.reportTitle = aTitle;
		this.reportGrade = aGrade;
	}
	
	//gets and sets

	public String getReportID() {
		return this.reportID;
	}
	public void setReportID(String aReportID) {
		this.reportID = aReportID;
	}
	
	public String getReportTitle() {
		return this.reportTitle;
	}
	public void setReportTitle(String aReportTitle) {
		this.reportID = aReportTitle;
	}
	
	public String getReportGrade() {
		return this.reportGrade;
	}
	public void setReportGrade(String aGrade) {
		this.reportGrade = aGrade;
	}
}
