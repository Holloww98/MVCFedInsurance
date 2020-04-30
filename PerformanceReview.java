package fedinsurance;

public class PerformanceReview {
	public String currentReview_Grade;
	public String previousReview_Grade;
	public String performanceReviewID;
	public String currentReview_Date;
	public String previousReview_Date;
	public String performance_Feedback;
	public Employee reviewedEmployee;
	
	//Constructor
	
	public PerformanceReview(String currentGrade, String reviewID, String currentDate, String previousDate, String feedback, Employee anEmployee, String aPreviousGrade ) {
		this.currentReview_Grade = currentGrade;
		this.performanceReviewID = reviewID;
		this.currentReview_Date = currentDate;
		this.previousReview_Date = previousDate;
		this.performance_Feedback = feedback;
		this.reviewedEmployee = anEmployee;
		this.previousReview_Grade = aPreviousGrade
	}
	
	//Gets and Sets
	public String getCurrentPerformanceGrade() {
		return this.currentReview_Grade;
	}
	public void setCurrentPerformanceGrade(String aGrade) {
		this.currentPerformanceGrade = aGrade;
	}
	
	public String getPreviousPerformanceGrade() {
		return this.previousReview_Grade;
	}
	public void setPreviousPerformanceGrade(String aGrade) {
		this.previousReview_Grade = aPreviousGrade;
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
		return this.performance_Feedback;
	}
	public void setPerformanceFeedback(String aFeedback) {
		this.performance_Feedback = aFeedback;
	}
	
	
}
