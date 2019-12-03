package CoreJava.DAO;

import CoreJava.Models.Course;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseDAO {

	public List<Course> getAllCourses() throws FileNotFoundException {
		//input
		// file courses.csv
		String filePath = "C:\\Users\\James\\Desktop\\Java Workspace\\finalproject\\src\\";
		String fileName = "courses.csv";
		String fileAbstractPath = filePath + fileName;
		File file = new File(fileAbstractPath);
		
		//process
		// open the file
		Scanner fileReader = new Scanner(file);

		String [] CourseRecord;
		List<Course> courseList = new ArrayList<Course>();
		//read the data from the file
		while (fileReader.hasNextLine()) {
			Course course = new Course();
			String line = fileReader.nextLine();
			CourseRecord = line.split(",");
			
			course.setCourseID(Integer.parseInt(CourseRecord[0]));
			course.setCourseName(CourseRecord[1]);
			course.setInstructor(CourseRecord[2]);
			courseList.add(course);
		
			}
			fileReader.close();
			
			
			//output: array list of the students
			return courseList;
		}
    
}
