package java_tutorials;

public class Login3 {

	public static void main(String[] args) {
		
		// || 둘중 하나라도 참이면 참 or
		String id = args[0];
        String password = args[1];
        if (id.equals("Croco") || id.equals("k8805") || password.equals("111111")) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }

	}

}
