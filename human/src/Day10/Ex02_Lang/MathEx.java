package Day10.Ex02_Lang;

public class MathEx {
	
	public static void main(String[] args) {
		System.out.println(Math.PI);			// 3.141592653589793(원주율)
		System.out.println(Math.ceil(3.125)); 	// 올림 : 해당 수보다 큰 정수 중 가장 작은 수 
		System.out.println(Math.floor(3.75)); 	// 내림 : 해당 수보다 작은 정수 중 가장 큰 수
		System.out.println(Math.sqrt(9)); 		// 제곱근(루트)
		System.out.println(Math.pow(3, 2)); 	// 3의 2제곱
		System.out.println(Math.exp(2)); 		// e의 2승
		System.out.println(Math.round(3.14)); 	// 반올림
		
		System.out.println("----------------");
		
		// 로또 번호 6/45
		//[1,45] 사이의 정수형 나수 6개 만들기
		// Math.randon()		: 0.0 보다 크거나 같고 1.0 보다 작은 임의의 실수 반환
		// Math.randon()		: 0.xxx ~ 0.9xx
		
		// [공식]
		// (int) (Math.random() * [개수] + [시작숫자];
		for (int i = 0; i < 6; i++) {
			int random = (int) (Math.random() * 45 + 1);
			System.out.print( random + " " );
		}
		System.out.println();	
		// 중복제거
		// 오름차순
		
		
		// -50 ~ 50 사이의 랜덤 수를 1개 출력하시오.
		int random = (int)(Math.random() * 101 - 50);
		System.out.println(random);
		
	}
}
