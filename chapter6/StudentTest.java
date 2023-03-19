package student;

public class StudentTest {

	public static void main(String[] args) {
		Student A = new Student(2001);
		A.setStudentName("A");
		A.setGrade(5);
		
		Student B = new Student();
		B.setStudentName("B");
		B.setGrade(2);
		
		System.out.println(A.getStudentName() + "/" + A.getGrade() + "/" + A.ID);
		System.out.println(B.getStudentName() + "/" + B.getGrade() + "/" + B.ID);

	}

}
