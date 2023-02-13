package ch04;

// DTO : Data transfer Object ---> 단순히 데이터를 담아두고 메모리에 올려두는 역할을 함
public class UserInfo {
	public static int SERIAL_NUMBER = 0;
	private int id;
	private String userName;
	private String pw;

	public UserInfo(String userName, String pw) {
		SERIAL_NUMBER++;
		this.id = SERIAL_NUMBER;
		this.userName = userName;
		this.pw = pw;
	}

	public int getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getPW() {
		return pw;
	}

	public void showInfo() {
		System.out.println("사용자 정보 확인");
		System.out.println("userName : " + userName);
		System.out.println("pw : " + pw);
	}

}
