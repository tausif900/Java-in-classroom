package abstraction;

public class Main3 {
	public static void main(String[] args) {
// 		Here we can change the class as per our choice...
//		we can write like this.. 'interface classname objectname= new Classname';
		Payment p1 = new Cash();
		p1.pay();

//		Anonymous inner type
		Payment internetBanking = new Payment() {
			public void pay() {
				System.out.println("Payment using Internet Banking");
			}
		};
		internetBanking.pay();
	}
}
