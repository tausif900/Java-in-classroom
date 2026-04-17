package basics_1;

public class Example3 {
	public static void main(String[] args) {
//		Relational Operator or Comparison Operator
//		>,>=,<,<=
		int a = 10;
		int b = 4;

		System.out.println(a > b); // 10>4 = true
		System.out.println(b > a); // 4>10 = false
		System.out.println(a > a); // 10>10 = false
		System.out.println(a >= a); // 10>=10 = true
		System.out.println(a >= 8); // 10>=8 = true
		System.out.println(a < b); // 10<4 = false
		System.out.println(a < 10); // 10<10=false
		System.out.println(a <= a); // 10<=10 = true

//		== 
		System.out.println(a == b); // 10==4=false
		System.out.println(a == a); // 10==10=true
//		!=
		System.out.println(a != b); // 10!=4=true
		System.out.println(a != a); // 10!=10=false
	}
}
