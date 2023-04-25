package Day04.Ex03_Car;

public class CarEx {
	
	public static void main(String[] args) {
		// 객체생성
		Car car = new Car();
		car.model = "제네시스";
		// car.speed = 200;
		// private 으로 지정한 변수는 외부 클래스에서 접근 불가능
		car.setSpeed(200);
		System.out.println("model : " + car.getModel());
		System.out.println("speed : " + car.getSpeed());
		
		car.setSpeed(-100); // -100 -> 0
		System.out.println("speed : " + car.getSpeed());
		
		car.setSpeed(500); // 500 -> 300
		System.out.println("speed : " + car.getSpeed());
		
		car.setSpeed(80); // 정상범위 속도 출력
		System.out.println("speed : " + car.getSpeed());
		
	}

}
