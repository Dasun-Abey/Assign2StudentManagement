/**
 * Class of Student Object
 * @author dabey
 */
public class Student implements Comparable<Student> {
	
	//Initializing Variables
	private String name;
	private int id;
	private String email;
	private double grade;
	
	/**
	 * Constructor
	 * @param name
	 * @param id
	 * @param email
	 * @param grade
	 */
	public Student (String name, int id, String email, double grade) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.grade = grade;
	}
	
	/**
	 * Getter for name
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**Setter for name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * getter gor grade
	 * @return
	 */
	public double getGrade() {
		return grade;
	}
	
	/**
	 * setter for grade
	 * @param grade
	 */
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	/**
	 * getter for email
	 * @return
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * setter for email
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * getter for id
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * setter for id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Comparing students with grade
	 */
	@Override
	public int compareTo(Student other) {
		
		return Double.compare(this.grade,other.grade);
	}

	/**
	 * toString method to print
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student{name='" + name + "', id=" + id + ", email='" + email + "', grade=" + grade + "}";
	}
	

}
