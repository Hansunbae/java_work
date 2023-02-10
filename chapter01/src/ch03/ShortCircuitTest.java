package ch03;

public class ShortCircuitTest {
	public static void main(String[] args) {
		
//		// 관계 논리곱 --> F ---->F, 논리합 ----T ----T
//		int num1 = 5;
//		int i = 0;
//		//									15     <  10(F) 		   &&          T
//		//boolean value = ((num1 +=  10) < 10) && ((i += 2 ) < 10);
//		boolean value = ((num1 +=  10) > 10) && ((i += 2 ) < 10);
//		System.out.println(value);
//		System.out.println("=====================");
//		
//		System.out.println(num1);
//		System.out.println(i); //shortCircuit evolution 앞이 F면 뒤에거를 실행 시키지 않음
//		
//		System.out.println("=====================");
//		//                   25                < 10(F)          4<10(T)
//		//value = ( (num1 += 10) < 10 )  ||  ( (i += 2) < 10);
//		value = ( (num1 += 10) > 10 )  ||  ( (i += 2) < 10);
//		System.out.println(value);
//		System.out.println(i);
		
		
		// 문제

		// 문제 shortCircuit 평가 문제를 직접 2문제 만들어보아라
		// 그리고 카페 도전과제 -> 실습 및 리뷰에 문제& 답을 올려 주세요

		// 문제 1
		int num2 = 6;
		int a = 0;
		//                                          F                    &&        T                = F
		boolean value2 = ((num2 += 12) < 10) && ((a += 4) < 10);
		// &&은 두 조건 모두 참이어야 성립하므로 앞에 F가 나오면 뒤에 조건(항)을 고려(실행)하지 않음

		// 풀이
		System.out.println(value2); // false
		System.out.println(num2); // 앞 항은 실행 num2에 12가 더해져 18 출력
		System.out.println(a); // 뒤에 항은 실행 되지 않아 그대로 a는 그대로 0

		// 문제 2
		int num3 = 10;
		int b = 7;
		//                                          F                    &&         T                = F
		boolean value3 = ((num3 += 12) < 10) && ((b += 4) < 10);
		// &&은 두 조건 모두 참이어야 성립하므로 앞에 F가 나오면 뒤에 조건(항)을 고려(실행)하지 않음

		// 풀이
		System.out.println(value3); // false
		System.out.println(num3); // 앞 항은 실행 num3에 12가 더해져 22 출력
		System.out.println(b); // 뒤에 항을 실행되지 않고 b는 그대로 7
		
		
	
			
	}
}
