package makeclass;

public class Enrollment {
	int enrollmentId;
	Student student;
	Course course;
	
	
	public Enrollment(int enrollmentid, Student student, Course course) {
		this.enrollmentId= enrollmentid;
		this.student = student;
		this.course = course;
	}
	
	
}
