package java_tutorials;

public class Login2 {

	public static void main(String[] args) {
		
		// && 좌우가 모두 참일때 참 And 
		String id = args[0];
        String password = args[1];
        if (id.equals("Croco") && password.equals("111111")) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
               
	}

}
