package java_tutorials;

public class Login2 {

	public static void main(String[] args) {
		
		// && �¿찡 ��� ���϶� �� And 
		String id = args[0];
        String password = args[1];
        if (id.equals("Croco") && password.equals("111111")) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
               
	}

}
