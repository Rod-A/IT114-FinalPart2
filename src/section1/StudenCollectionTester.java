package section1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudenCollectionTester {


	protected static List<Student> students;
	public static List<Student> createStudents()
	{
		List<Student> students = new ArrayList<Student>();
		
		students.add("Alison", 19, 1, 4.0);
		students.add("Barbara", 18, 2, 3.5);
		students.add("Charlie", 17, 1, 3.8);
		students.add("Donald", 20, 3, 3.6);
		students.add("Edward", 21, 4, 2.8);
		
		return students;
}
	public static void sortStudent(List students)
	{
		System.out.println("BEFORE sorting:" + students);
		
		Collections.sort(students);
		
		System.out.println("AFTER sorting:" + students);
		
	}
	
	public static void sortStudentInReverseOfNaturalOrder(List students)
	{
		System.out.println("BEFORE sorting:" + students);
		
		Comparator reverseOfNaturalOrderComparator = Collections.reverseOrder();
		
		Collections.sort(students, reverseOfNaturalOrderComparator);
		
		System.out.println("AFTER sorting:" + students);
	}

	public static void sortStudentBasedOnGrade(List students)
	{
		System.out.println("BEFORE sorting:" + students);
		
		StudentGradeComparator studentGradeComparator = new StudentGradeComparator();
		Collections.sort(students, studentGradeComparator);
		System.out.println("AFTER sorting:" + students);
	}
	
	public static void sortStudentBasedOnReverseAverage(List students)
	{
		System.out.println("BEFORE sorting:" + students);
		
		StudentAverageComparator StudentAverageComparator = new StudentAverageComparator();
		Comparator reverseAverageComparator = Collections.reverseOrder(StudentAverageComparator);
		Collections.sort(students, reverseAverageComparator);
		System.out.println("AFTER sorting:" + students);
		
	}
	
	public static List<Student> shuffleStudents()
	{
		System.out.println("BEFORE sorting:" + students);
		
		Collections.shuffle(students);
		
		System.out.println("AFTER sorting:" + students);
		
		return students;	
	}
	
	public static List<Student> reverseStudents()
	{
		System.out.println("BEFORE sorting:" + students);
		
		Collections.reverse(students);
		
		System.out.println("AFTER sorting:" + students);
		
		return students;	
	}
	
	public static List<Student> swap1stAnd2ndStudents()
	{
		System.out.println("BEFORE sorting:" + students);
		
		Collections.swap(students, 1, 2);
		
		System.out.println("AFTER sorting:" + students);
		
		return students;
	}
	
	public static Student maxStudentInStudents(List students)
	{
		System.out.println("BEFORE sorting:" + students);
		
		Collections.sort(students);
		
		Student maxStudent = (Student) Collections.max(students);
		System.out.println("AFTER sorting:" + students);
		return maxStudent;
	}
	
	public static Integer binarySearchOrderedStudents(List students)
	{
System.out.println("BEFORE sorting:" + students);
return null;
}}
