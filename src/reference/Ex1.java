package reference;

public class Ex1 {

	public static void main(String[] args) {
		Subject math = new Subject("수학", 85);
		Subject korean = new Subject("국어", 100);
		
		Student student = new Student(1001, "둘리", math, korean);

	}

}

//과목 클래스
class Subject {
	String subjectName;
	int scorePoint;
	
	//모든 멤버변수를 초기화하는 생성자
	public Subject(String subjectName, int scorePoint) {
		super();
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}
}

//학생 클래스
class Student {
	int studentId;
	String studentName;
	Subject math;
	Subject korean;
	
	//모든 멤버변수를 초기화하는 생성자
	public Student(int studentId, String studentName, Subject math, Subject korean) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.math = math;
		this.korean = korean;
	}
}