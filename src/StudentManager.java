import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Class to manage ArrayList
 * @author dabey
 */
public class StudentManager {
	
	List <Student> students = new ArrayList<Student>();
	
	/**
	 * add student to ArrayList
	 * @param name
	 * @param id
	 * @param email
	 * @param grade
	 */
	public void addStudent(String name, int id, String email, double grade) {
		
		Student student = new Student(name,id,email,grade);
		students.add(student);
	}
	
	/**
	 * remove student from ArrayList
	 * @param id
	 * @return
	 */
    public boolean removeStudent(int id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();
                return true; // Return true if the student was found and removed
            }
        }
        return false; // Return false if no student with the given ID was found
    }
    
    /**
     * Sort students by Grade
     */
    public void sortStudentsByGrade() {
        Collections.sort(students);
            
    }
    
    /**
     * Print the content of ArrayList
     */
    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
	

}
