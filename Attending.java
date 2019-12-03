package CoreJava.Models;

public class Attending {
	
	private int courseID;
	private String studentEmail;
	
	//getters and setters
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	
	//constructors
	public Attending() {
		this.courseID = 0;
		this.studentEmail = "";
	}
	
	public Attending(int courseID, String studentEmail) {
		this.courseID = courseID;
		this.studentEmail = studentEmail;
	}

	
	

}
