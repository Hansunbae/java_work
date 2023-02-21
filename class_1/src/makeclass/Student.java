package makeclass;

import java.util.List;

public class Student {
	private int studentId;
	private String name;
	private String email;
	private List<Enrollment> list;

	public Student(int studentid, String name, String email) {
		this.studentId = studentid;
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Enrollment> getList() {
		return list;
	}

	public void setList(List<Enrollment> list) {
		this.list = list;
	}

	public void showInfo() {
		System.out.println(list);
	}

}
