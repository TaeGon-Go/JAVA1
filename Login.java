package java_tutorials;

public class Login {

	public static void main(String[] args) {
		
		// equals 비교연산자 "Croco" 라고 입력할 시 right 
		// 다른걸 입력시 else절 실행 wrong
		// password도 동일
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


