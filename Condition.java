package java_tutorials;

public class Condition {

	public static void main(String[] args) {
		
		if(true) { // if ���ǹ� 
			System.out.println("resul:true"); 
		}
		
		if(false) { // false �� ���� ���� �ʴ´�
			System.out.println("resul:true");
		}
		
		if(true) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		}
		System.out.println(5);
		
		if(false) { // false �̱⿡ 5�� ���
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		}
		System.out.println(5); 
		
		if(true) { // true �϶� then���� ����
			System.out.println(1);
		} else {
			System.out.println(2);
		}
		
		if(false) { // false �϶� else���� ����
			System.out.println(1);
		} else {
			System.out.println(2);
		}
		
		if(true) { // true�� then�� ���� , false�� else if���� ��� �Ѿ
			System.out.println(1);
		} else if(true) { // true�� else if then�� ���� , false�� else�� ����
			System.out.println(2);
		} else {
			System.out.println(3);		
		}

		if(false) { // true�� then�� ���� , false�� else if���� ��� �Ѿ
			System.out.println(1);
		} else if(true) { // true�� else if then�� ���� , false�� else�� ����
			System.out.println(2);
		} else {
			System.out.println(3);		
		}
		
		if(false) { // true�� then�� ���� , false�� else if���� ��� �Ѿ
			System.out.println(1);
		} else if(false) { // true�� else if then�� ���� , false�� else�� ����
			System.out.println(2);
		} else {
			System.out.println(3);		
		}
		
	}

}
