package Day10.Ex01_Wrapper;

public class ValueCompare {
	
	public static void main(String[] args) {
		
		Integer intObj1 = 10;	// 정수 타입 : -128 ~ 127
		Integer intObj2 = 10;
		
		System.out.println("intObj1 == intObj2");
		System.out.println("결과 : " + (intObj1 == intObj2));
		System.out.println("언박싱하여 비교");
		System.out.println("결과 : " + (intObj1.intValue() == intObj2.intValue() ));
		
		// equals()		: 래퍼객체가 가진 내부의 값을 비교하는 메소드
		System.out.println("equals() 메소드로 비교");
		System.out.println("결과 : " + intObj1.equals(intObj2));
		
		System.out.println("-----------------------------------");
		
		Integer intObj3 = 128;		// 정수 타입 : -128 ~ 127
		Integer intObj4 = 128;
		
		
		// ==, != 기호 래퍼객체 비교하면,
		// 아래의 범위에서는 내부의 값을 ==, != 기호로 바고 비교가 가능
		// Boolean 		: true, false
		// 정수 타입		: -128 ~ 127
		// char			: \u0000 ~ \007f
		System.out.println("intObj3 == intObj4");
		System.out.println("결과 : " + (intObj3 == intObj4));
		System.out.println("언박싱하여 비교");
		System.out.println("결과 : " + (intObj3.intValue() == intObj4.intValue() ));
		System.out.println("equals() 메소드로 비교");
		System.out.println("결과 : " + intObj3.equals(intObj4));
		
	}

}
