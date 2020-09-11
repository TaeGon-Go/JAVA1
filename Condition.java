package java_tutorials;

public class Condition {

	public static void main(String[] args) {
		
		if(true) { // if 조건문 
			System.out.println("resul:true"); 
		}
		
		if(false) { // false 로 실행 되지 않는다
			System.out.println("resul:true");
		}
		
		if(true) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		}
		System.out.println(5);
		
		if(false) { // false 이기에 5만 출력
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		}
		System.out.println(5); 
		
		if(true) { // true 일때 then절이 실행
			System.out.println(1);
		} else {
			System.out.println(2);
		}
		
		if(false) { // false 일때 else절이 실행
			System.out.println(1);
		} else {
			System.out.println(2);
		}
		
		if(true) { // true면 then절 실행 , false면 else if절로 제어가 넘어감
			System.out.println(1);
		} else if(true) { // true면 else if then절 실행 , false면 else절 실행
			System.out.println(2);
		} else {
			System.out.println(3);		
		}

		if(false) { // true면 then절 실행 , false면 else if절로 제어가 넘어감
			System.out.println(1);
		} else if(true) { // true면 else if then절 실행 , false면 else절 실행
			System.out.println(2);
		} else {
			System.out.println(3);		
		}
		
		if(false) { // true면 then절 실행 , false면 else if절로 제어가 넘어감
			System.out.println(1);
		} else if(false) { // true면 else if then절 실행 , false면 else절 실행
			System.out.println(2);
		} else {
			System.out.println(3);		
		}
		
	}

}
