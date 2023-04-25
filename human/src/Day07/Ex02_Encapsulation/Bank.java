package Day07.Ex02_Encapsulation;

public class Bank {
	
	public static void main(String[] args) {
		Encapsulation ec 
			= new Encapsulation(0, "국민은행", "282401-04-10995", "한성호");
		
		// ec.deposit = 1000000;
		ec.setDeposit(1000000);
		
		int money = ec.getDeposit();
		System.out.println(ec);
		System.out.println("계좌 잔액 : " + money);
	}

}
