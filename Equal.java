package java_tutorials;

public class Equal {

	public static void main(String[] args) {
		
		// == ���� �񱳿�����
		System.out.println(1 == 2); // false 
		System.out.println(1 == 1); // true
		System.out.println("one" == "two"); // false
		System.out.println("one" == "one"); // true
		
		// != !�� ���� '���� �ʴ�'
		System.out.println(1!=2); // true
		System.out.println(1!=1); // false
		System.out.println("one"!="two"); // true
		System.out.println("one"!="one"); // false
		
		// > ������ ���׺��� ũ�ٸ� ��, �ƴϸ� ����
		System.out.println(10>20); // false
		System.out.println(10>2); // true
		System.out.println(10>10); // false
		
		// >= ������ ���׺��� ũ�ų� ����
		System.out.println(10 >= 20); // false
		System.out.println(10 >= 2); // true
		System.out.println(10 >= 10); // true
		
		// .equals ���ڿ��� ���� �� ����ϴ� �޼ҵ�
		String a = "Hello world";
		String b = new String("Hello world");
		System.out.println(a == b); // false
		System.out.println(a.equals(b)); // true
		

	}

}
