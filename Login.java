package java_tutorials;

public class Login {

	public static void main(String[] args) {
		
		// equals �񱳿����� "Croco" ��� �Է��� �� right 
		// �ٸ��� �Է½� else�� ���� wrong
		// password�� ����
		String id = args[0];
		String password = args[1];
		if(id.equals("Croco")){ 
			if(password.equals("111111")) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
			
		} else {
			System.out.println("wrong");
		}
			
	}
}


