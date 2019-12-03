package CoreJava.Models;

public class Course {
	
	private int courseID; 
	private String courseName, instructor;
	
	
	//getters and setters
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	
	// constructors
	public Course() {
		this.courseID = 0;
		this.courseName = "";
		this.instructor = "";
	}
	
	public Course(int courseID, String courseName, String instructor) {
		this.courseID = courseID;
		this.courseName = courseName;
		this.instructor = instructor;
	}

}
