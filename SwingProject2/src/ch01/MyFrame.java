package ch01;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	

	// String 문서 확인
	// String에 존재하는 메서드 5개 정도
	// 선택해서 사용방법 의미, 샘플 코드
	public static void main(String[] args) {
		String strex= "완전";
		String strex2 = "좋아요";
		// 1
		// String.charAt() - 문자 뽑기
		System.out.println("chatAt() 메소드입니다.");
		String str = "everlasting";
		char c1 = str.charAt(0);
		char c2 = str.charAt(3);

		System.out.println("first char = " + c1);
		
		// 아래 length는 메서드를 호출한 것 
		// 배열에서는 변수를 호출한 것
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i) + "-");
		}

		System.out.println("---------------");

		// 2
		// String.substring() - 문자열 뽑기
		System.out.println("substring() 메소드입니다.");
		String str2 = "it'sAllGood";

		String s1 = str2.substring(2); // 3번째 문자부터 문자열 끝까지 뽑기 (설정한 자신 제외)
		String s2 = str2.substring(3, 6);// 4번째 문자부터 6번째 문자 전까지 뽑기 (설정한 자신 제외)

		System.out.println(" 3 ~ end = " + s1);
		System.out.println(" 2 ~ 4 =" + s2);

		System.out.println("---------------");
		// 3
		// 문자열 교체 기능
		// TEST <-- ST --> AB
		System.out.println("replace() 메소드입니다.");
		String str3 = "Test";
		String result1 = str3.replace("ST", "AB");
		System.out.println("result : " + result1);
		
		System.out.println("---------------");
		//4 
		// concat() 문자열 합치기
		System.out.println(strex.concat(strex2));
		
		System.out.println("---------------");
		// 5
		//  indexOf() 문자가 위치한 인덱스값 반환하기
		System.out.println("indexof(아) = "  + strex2.indexOf("아"));

	} // end of main

}
