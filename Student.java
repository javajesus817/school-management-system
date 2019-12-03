package CoreJava.Models;

public class Student {
	
	private String email, name, pass;

	//getters and setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	// constructors
	public Student() {
		this.email = "";
		this.name = "";
		this.pass = "";
	}

	public Student(String email, String name, String pass) {
		this.email = email;
		this.name = name;
		this.pass = pass;
	}
	
	
    
    
}
