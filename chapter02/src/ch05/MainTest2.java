package ch05;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {

		Student st1 = new Student("한범진", 20000);
		Bus bus126 = new Bus(126);
		Bus bus338 = new Bus(338);
		Bus bus169 = new Bus(169);
		Subway subwayLine1 = new Subway(1);
		Subway subwayLine2 = new Subway(2);
		Subway subwayLine3 = new Subway(3);

//		st1.takeBus(bus1);
//		st1.showInfo();
//
//		st1.takeSubway(subwayLine1);
//		subwayLine1.showInfo();
//		st1.showInfo();

		Scanner sc = new Scanner(System.in);
		System.out.println("어떤 교통수단을 타시겠습니까?");
		String what = sc.nextLine();
		
		if (what.equals("버스")) {
			System.out.println("타시려는 버스 번호를 입력해주세요");
			int nbus = sc.nextInt();
			if (nbus == 126) {
				st1.takeBus(bus126);
				System.out.println("bus1번의 승차권을 발행했습니다.");
			} else if (nbus == 338) {
				st1.takeBus(bus338);
				System.out.println("bus2번의 승차권을 발행했습니다");
			} else if (nbus == 169) {
				st1.takeBus(bus169);
				System.out.println("bus3번의 승차권을 발행했습니다");
			} else {
				System.out.println("잘못 된 버스 번호를 입력하셨습니다.");
			}

		} // end of if 
			
		if (what.equals("지하철")) {
			System.out.println("타시려는 지하철 번호를 입력해주세요");
			int nSubway = sc.nextInt();
			
			if( nSubway == 1 ) {
				st1.takeSubway(subwayLine1);
				System.out.println(" 1호선 지하철의 승차권을 발행하였습니다.");
			}else if( nSubway == 2) {
				st1.takeSubway(subwayLine2);
				System.out.println(" 2호선 지하철의 승차권을 발행하였습니다.");
			}else if( nSubway == 3 ) {
				st1.takeSubway(subwayLine3);
				System.out.println(" 3호선 지하철의 승차권을 발행하였습니다.");
			}
		} // end of if 
		
		if(!what.equals("버스") && !what.equals("지하철") ) {
			System.out.println(" 잘못 된 지하철 번호를 입력하셨습니다.");
		}

//		st1.takeBus();

		// 객체 생성

		// 1단계 - 사용해보기
		// 2단계 - 실행에 흐름 만들어 보기

	}

}
