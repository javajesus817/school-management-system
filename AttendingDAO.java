package CoreJava.DAO;

import CoreJava.Models.Attending;
import CoreJava.Models.Course;
import CoreJava.Models.Student;
import daoInterfaces.AttendingDAOInterface;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendingDAO {

	public List<Attending> getAttending() {
		//input
		String filePath = "C:\\Users\\James\\Desktop\\Java Workspace\\finalproject\\src\\";
		String fileName = "attending.csv";
		String fileAbstractPath = filePath + fileName;
		List<Attending> attendingList = new ArrayList<Attending>();
		try {
			File file = new File(fileAbstractPath);
			Scanner fileReader = new Scanner(file);
			String[] AttendingRecord;
			
			//read the data from the file
			while(fileReader.hasNextLine()) {
				Attending attending = new Attending();
				String line = fileReader.nextLine();
				AttendingRecord = line.split(",");
				
				attending.setCourseID(Integer.parseInt(AttendingRecord[0]));
				attending.setStudentEmail(AttendingRecord[1]);
				attendingList.add(attending);
				
			}
			fileReader.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//process
		
		
		return attendingList;
	}

	public void registerStudentToCourse(List<Attending> attending, String studentEmail, int course_id) throws IOException {
		
		for(Attending attendCourse : attending) {
			if(!((studentEmail.equals(attendCourse.getStudentEmail()) && course_id == attendCourse.getCourseID()))) {
				Attending newAttendingStudent = new Attending();
				newAttendingStudent.setCourseID(course_id);
				newAttendingStudent.setStudentEmail(studentEmail);
				attending.add(newAttendingStudent);
				saveAttending(attending);
				return;
//				attendCourse.setStudentEmail(studentEmail);
//				attendCourse.setCourseID(course_id);
//				attending.add(attendCourse);
			}
				
		}
		
	}

	public List<Course> getStudentCourse(List<Course> courseList, List<Attending> attendingList, String studentEmail) {
		
		List<Course> studentCourseList = new ArrayList<Course>();
		for(Attending attendance : attendingList) {
			if(studentEmail.equals(attendance.getStudentEmail())) {
				for (Course studentCourses : courseList) {
					if(attendance.getCourseID() == studentCourses.getCourseID() ) {
						
						studentCourseList.add(studentCourses);
					}
				}
			
			}
			
		}
		
		return studentCourseList;

	}

	public void saveAttending(List<Attending> attending) throws IOException{
		
		String filePath = "C:\\Users\\James\\Desktop\\Java Workspace\\finalproject\\src\\";
		String fileName = "attending.csv";
		String fileAbstractPath = filePath + fileName;
		//try {
			File file = new File(fileAbstractPath);
		
		//process
			//new File("C:\\Users\\James\\Desktop\\Java Workspace\\finalproject\\src\\attending.csv")
			FileWriter writer = new FileWriter(file);
		
			for(Attending values : attending) {
				writer.write(String.format("%s,%s\n",
						values.getCourseID(), values.getStudentEmail()));
			}
			writer.close();
				
	//	} catch (Exception e) {
	///		System.out.println("Error!");
	//		e.printStackTrace();
	//	}
	
	}//end saveAttending

}//end AttendingDAO