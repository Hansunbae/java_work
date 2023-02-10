package ch03;

public class MainTest1 {
	public static void main(String[] args) {

		// 1, 3, 홍길동 메모리 상에 생성
		// 2, 3, 이순신 메모리 상에 생성
		Student studentHong = new Student(1, 3, "홍길동");
		Student studentLee = new Student(2, 3, "이순신");
		
		// 변수로 접근해서 데이터를 추가
		// 컴파일 시점에 오류를 확인할 수 없는 상태였다.( 실행시점에 오류가 확인)
		// 메모리에 올라 가지 않은 상태 -- 
		// 해결 방법 : 
		// 1. 클래스 내부에서 초기화 하기 - new
		// 2. 외부에서 초기화 하기
		studentHong.korea.subjectName = "국어"; 
		studentHong.korea.Score = 90;
		studentHong.showInfo();
		// System.out.println(studentHong.korea);
		
		// 이순신에 과목 국어, 수학 이름 데이터를 입력
		// 이순신의 과목 점수 국어 100, 수학 5점 입력
		// 출력하는 코드를 작성해주세요
		System.out.println("==================");
		studentLee.korea.subjectName = "국어";
		studentLee.korea.Score = 100;
		studentLee.math.subjectName = "수학";
		studentLee.math.Score= 5;
		studentLee.showInfo();
		
		
		
		
		
		
		
	}
}
