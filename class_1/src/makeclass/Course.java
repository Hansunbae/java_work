package makeclass;

public class Course {
	int courseId;
	String name;
	String description;

	public Course(int courseid, String name, String description) {
		this.courseId = courseid;
		this.name = name;
		this.description = description;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
