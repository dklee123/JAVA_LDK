package Day08.Ex01_Shape;

public abstract class Shape {
	
	Point point;
	
	// 넓이와 둘레를 구하는 메소드 원형을 정의하시오.
	// 추상 메소드
	// : {} 블록 없이 메소드 원형만을 정의하고,
	//	 자식 클래스에서 반드시 오버라이딩 해야만 사용할 수 있는 메소드
	// 형식 : abstract 반환타입 메소드명( 매개변수 );
	
	abstract double area();			// 넓이
	abstract double round();		// 둘레

	// getter, setter
	// 
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	
	

}
