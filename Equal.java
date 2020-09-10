package java_tutorials;

public class Equal {

	public static void main(String[] args) {
		
		// == 동등 비교연산자
		System.out.println(1 == 2); // false 
		System.out.println(1 == 1); // true
		System.out.println("one" == "two"); // false
		System.out.println("one" == "one"); // true
		
		// != !는 부정 '같지 않다'
		System.out.println(1!=2); // true
		System.out.println(1!=1); // false
		System.out.println("one"!="two"); // true
		System.out.println("one"!="one"); // false
		
		// > 좌항이 우항보다 크다면 참, 아니면 거짓
		System.out.println(10>20); // false
		System.out.println(10>2); // true
		System.out.println(10>10); // false
		
		// >= 좌항이 우항보다 크거나 같다
		System.out.println(10 >= 20); // false
		System.out.println(10 >= 2); // true
		System.out.println(10 >= 10); // true
		
		// .equals 문자열을 비교할 때 사용하는 메소드
		String a = "Hello world";
		String b = new String("Hello world");
		System.out.println(a == b); // false
		System.out.println(a.equals(b)); // true
		

	}

}
