package Lambda;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import java.util.*;

public class StudentProcess {
//	private static final Comparator<Student> GRADE_ORDER = new Comparator<Student>() {
//		public int compare(Student s1, Student s2) {
//			double markCmp = s1.getGrade() - s2.getGrade();
//			if (markCmp != 0)
//				return (int)markCmp;
//			else
//			return s1.getGrade() < s2.getGrade() ? -1 : (s1.getGrade() == s2.getGrade() ? 0 : 1);
//		}
//	};
//	
	
	//Tried this but couldn't get this one dones
//	private static final Comparator<Student> FIRSTNAME_ORDER = new Comparator<Student>() {
//		public int compare(Student s1, Student s2) {
//			return s1.getLastName().compareTo(s2.getLastName()) + s2.getFirstName().compareTo(s2.getFirstName())  ;
//
//		}
//	};
//	
//	private static final Comparator<Student> LASTNAME_ORDER = new Comparator<Student>() {
//		public int compare(Student s1, Student s2) {
//			return s2.getLastName().compareTo(s1.getLastName()) + s2.getFirstName().compareTo(s1.getFirstName())    ;
//
//		}
//	};


	public static void main(String[] args) {
		
		//Task 1
		Student[]  students = {new Student("Jack", "Smith", 50.0, "IT"),
				(new Student("Aaron", "Johnson", 76.0, "IT")),
				(new Student("Maaria", "White", 35.8, "Business")),
				(new Student("John", "White", 47.0, "Media")),
				(new Student("Laney", "White", 62.0, "IT")),
				(new Student("Jack", "Jones", 32.9, "Business")),
				(new Student("Wesley", "Jones", 42.89, "Media"))};
				
		
		List<Student> list = Arrays.asList(students);
		System.out.println("Task 1:"+"\n");
		System.out.println("Complete Student list:");
		for(Student l : students) {
			System.out.println(l);
		}
		
		System.out.println("\n");
		 		
		
		//Task 2
		System.out.println("Task 2:"+"\n");
		System.out.println("Students who got 50.0-100.0 sorted by grade:"+"\n");
		
//		Collections.sort(list, GRADE_ORDER);
//		
		
		
		list.stream().sorted(Comparator.comparing(Student::getGrade))
		.filter(student -> student.getGrade() >= 50.0 && student.getGrade() <= 100.0)
		.forEach(System.out::println);


		System.out.println("\n");
		
		//Task 3
		System.out.println("Task 3:"+"\n");
		System.out.println("First Student who got 50.0-100.0");
//		Stream<Student> listStream2 = list.stream();
		
		System.out.println(list.stream().findFirst().get());

		
		System.out.println("\n");
		
		//Task 4
		System.out.println("Task 4:"+"\n");
		System.out.println("Students in ascending order by last name then first: ");
		
		Stream<Student>listStream4 = list.stream();
		listStream4.sorted(
				Comparator.comparing(Student::getLastName)
				.thenComparing(Comparator.comparing(Student::getFirstName))
		)
		.forEach(System.out::println);;

		

		System.out.println("\n");
		
		//Task 4 part 2
		System.out.println("Students in descending order by last name then first: ");
		
		Stream<Student>listStream4_2 = list.stream();
		listStream4_2.sorted(
				Comparator.comparing(Student::getLastName)
				.thenComparing(Comparator.comparing(Student::getFirstName))
				.reversed()
		)
		.forEach(System.out::println);;

		System.out.println("\n");
//		Collections.sort(list, LASTNAME_ORDER);
		
		// Task 5
		System.out.println("Task 4:"+"\n");		
		System.out.println("Unique Student last names: ");
		Stream<Student> listStream3 = list.stream();
				listStream3.map(Student::getLastName)
				.distinct()
				.sorted()
				.forEach(System.out::println);

	}


	

}
