package Day07.Ex06_UpDownCasting;

public class Student extends Person {
	
	int grade;
	String major;

	// alt shift s -> c
	public Student() {
		this("이름없음", 0, 0, "없음");
	}
	public Student(String name, int age, int grade, String major) {
		super(name, age);
		this.grade = grade;
		this.major = major;
	}
	
	public String work() {		// 메소드오버라이딩
		return "공부를 합니다.";
	}
	
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", major=" + major + "]";
	}
	

}
