package ch06;

import java.util.Scanner;

public class UserInfoClient {
	
	static String dbName = "Oracle";

	// main ---> 실행하는 코드 작성( 사용 쪽 코드)
	public static void main(String[] args) {

		// UserINfoOracleDao 만들어 주세요
		// 스캐너를 통해서 사용자 이름, 사용자 비번을 입력 받기
		Scanner scanner = new Scanner(System.in);

		System.out.println("사용자 이름 입력");
		String inputUserName = scanner.nextLine();
		System.out.println("사용자 비밀번호 입력");
		String inputUserpw = scanner.nextLine();

		UserInfo userInfo = new UserInfo(inputUserName, inputUserpw);
		// 흐름 만들기
		// 1. 저장기능 2. 수정기능
		// dbName 변경해 가면서 코드 동작 확인해 주세요!

		IUserInfoDao dao;
		if (UserInfoClient.dbName.equals("Oracle")) {
			dao = new UserInfoOracle();
		} else if (UserInfoClient.dbName.equals("MYSQL")) {
			dao = new UserInfoMysqlDao();
		} else {
			dao = new UserInfoMsSqlDao();
		}

		dao.insertUserInfo(userInfo);
		System.out.println(UserInfo.SERIAL_NUMBER); 

	}

}
