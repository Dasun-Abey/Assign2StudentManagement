import java.util.Arrays;

/**
 * Main Class to instantiate the objects and get the output
 */
public class Main {

	public static void main(String[] args) {
		
		//Initializing variables and objects
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.addStudent("Dasun", 1, "dasun@gmail.com", 3.7);
		studentManager.addStudent("Siripala", 2, "siripala@gmail.com", 1.7);
		studentManager.addStudent("Kanchana", 3, "kanchana@gmail.com", 2.7);
		studentManager.addStudent("Jothipala", 4, "jothi@gmail.com", 3.2);
		
        Student[] students = {
                new Student("Dasun", 1, "dasun@gmail.com", 3.7),
                new Student("Siripala", 2, "siripala@gmail.com", 1.7),
                new Student("Kanchana", 3, "kanchana@gmail.com", 2.7),
                new Student("Jothipala", 4, "jothi@gmail.com", 3.2)
            };
        
        
        //Output Area
        System.out.println("Array Before Sorting");
        for (Student student : students) {
        	System.out.println(student);
        }
        
        Arrays.sort(students);
        
        System.out.println("\nArray After Sorting");
        for (Student student : students) {
        	System.out.println(student);
        }
        
        System.out.println("\nArrayList Before Sorting");
        studentManager.printStudents();
        
        studentManager.sortStudentsByGrade();
        
        System.out.println("\nArrayList After Sorting");
        studentManager.printStudents();
	}
	

}
