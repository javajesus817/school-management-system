package CoreJava.DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import CoreJava.Models.Student;

public class StudentDAO {

	public List<Student> getStudents() throws FileNotFoundException {
		//input
		// file students.csv
		String filePath = "C:\\Users\\James\\Desktop\\Java Workspace\\finalproject\\src\\";
		String fileName = "students.csv";
		String fileAbstractPath = filePath + fileName;
		File file = new File(fileAbstractPath);


		//process
		// open the file
		Scanner fileReader = new Scanner(file);

		String[] StudentRecord;
		List<Student> studentList = new ArrayList<Student>();
		// read the data from the file
		while (fileReader.hasNextLine()) {
			Student student = new Student();
			String line = fileReader.nextLine();
			StudentRecord = line.split(",");

			student.setEmail(StudentRecord[0]);
			student.setName(StudentRecord[1]);
			student.setPass(StudentRecord[2]);

			studentList.add(student);

			//			studentList.add(new Student(student.getName(),
			//					student.getEmail(),
			//					student.getPass()));
		}
		fileReader.close();
		// store the data in the ArrayList
		//		studentList.add(student);


		//output: array list of the students
		return studentList;
	}

	public Student getStudentByEmail(List<Student> studentList, String email) throws FileNotFoundException {
		for(Student students: studentList) {
			if(email.equals(students.getEmail())) {
				return students;
			}
		}

		return null;

	}

	public boolean validateUser(List<Student> studentList, String email, String pass) throws FileNotFoundException {

		for(Student students: studentList) {
			if((email.equals(students.getEmail())))
			{
				if (pass.equals(students.getPass()))
				{
					return true;
				}
			}

		}
		return false;


	}

	//	public class StudentDAO {
	//		
	//		String email, name, pass;
	//		static String filePath = "C:\\Users\\James\\Desktop\\Java Workspace\\finalproject\\src\\";
	//		static String fileName = "students.csv";
	//		static String fileAbstractPath = filePath + fileName;
	//		
	//		public static void main(String[] args) throws FileNotFoundException {
	//			
	//			File file = new File(fileAbstractPath);
	//		    Scanner fileReader = new Scanner(file);
	//	    	ArrayList<String []> studentList = new ArrayList<String []>();
	//	    	while (fileReader.hasNextLine()) {
	//	    		String line = fileReader.nextLine();
	//	    		studentList.add(line.split(","));
	//	    	}
	//	    	for(String[] line : studentList) {
	//	    		System.out.println(line[0] + line[1] + line[2]);
	//	    	}
	//	    	System.out.println(studentList.);
	//			fileReader.close();
	//			}
	//		
	//		
	//		
	//	    public static void getStudents() {
	//			try {
	//				File file = new File(fileAbstractPath);
	//		    	Scanner fileReader = new Scanner(file);
	//		    	ArrayList<String []> studentList = new ArrayList<String []>();
	//		    	while (fileReader.hasNextLine()) {
	//		    		String line = fileReader.nextLine();
	//		    		studentList.add(line.split(","));
	//		    	}
	//		    	for(String [] line : studentList) {
	//		    		System.out.println(line[0] + line[1] + line[2]);
	//		    	}
	//				fileReader.close();
	//			} catch (FileNotFoundException e) {
	//				System.out.println("File not found!");
	//				e.printStackTrace();
	//			}
	//	    }
	//
	//		public static void getStudentByEmail(ArrayList<String []> studentList, String studentEmail){
	//			Scanner sc = new Scanner(System.in);
	//			System.out.println("Enter email: ");
	//			studentEmail = sc.next();
	//				for(Student : )
	//			
	//	    }
	//
	//	    public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass){
	//			return false;
	//	    }

}
