package ch02;

public class UserInfoMainTest {

	public static void main(String[] args) {
		// 기본 생성자는 사용자 정의 생성자가 있으면
		// 만들어 주지 않는다.
		UserInfo user1 = new UserInfo("캡틴", "잭","010 - 2348 - 46443");
		UserInfo user2 = new UserInfo("선배님", "호크아이");
		UserInfo user3 = new UserInfo("지드래곤");
		UserInfo user4 = new UserInfo();
		
		System.out.println("--------------------");
		System.out.println(user1.userId);
		System.out.println(user1.userName);
		System.out.println(user1.phone);
		
		System.out.println("--------------------");
		System.out.println(user2.userId);
		System.out.println(user2.userName);
		System.out.println(user2.phone);
		
		System.out.println("--------------------");
		System.out.println(user3.userId);
		System.out.println(user3.userName);
		System.out.println(user3.phone);
		
		System.out.println("--------------------");
		System.out.println(user3.userId);
		System.out.println(user3.userName);
		System.out.println(user3.phone);

	}

}
