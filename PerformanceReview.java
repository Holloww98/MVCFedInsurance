package fedinsurance;

public class PerformanceReview {
	public String currentPerformanceGrade;
	public String performanceReviewID;
	public String currentReviewDate;
	public String previousReviewDate;
	public String performanceFeedback;
	public Employee reviewedEmployee;
	
	//Constructor
	
	public PerformanceReview(String currentGrade, String reviewID, String currentDate, String previousDate, String feedback, Employee anEmployee ) {
		this.currentPerformanceGrade = currentGrade;
		this.performanceReviewID = reviewID;
		this.currentReviewDate = currentDate;
		this.previousReviewDate = previousDate;
		this.performanceFeedback = feedback;
		this.reviewedEmployee = anEmployee;
	}
	
	//Gets and Sets
	public String getCurrentPerformanceGrade() {
		return this.currentPerformanceGrade;
	}
	public void setCurrentPerformanceGrade(String aGrade) {
		this.currentPerformanceGrade = aGrade;
	}
	
	public String getPerformanceReviewID() {
		return this.performanceReviewID;
	}
	public void setPerformanceReviewID(String aGrade) {
		this.performanceReviewID = aGrade;
	}
	
	public String getCurrentReviewDate() {
		return this.performanceReviewID;
	}
	public void setCurrentReviewDate(String aDate) {
		this.performanceReviewID = aDate;
	}
	
	public String getPreviousReviewDate() {
		return this.performanceReviewID;
	}
	public void setPreviousReviewDate(String aDate) {
		this.previousReviewDate = aDate;
	}
	
	public String getPerformanceFeedback() {
		return this.performanceReviewID;
	}
	public void setPerformanceFeedback(String aFeedback) {
		this.previousReviewDate = aFeedback;
	}
	
	
}
