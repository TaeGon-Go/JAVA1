package java_tutorials;

public class PrePostDemo {

	public static void main(String[] args) {

		int i = 3;
        i++; // ++:증가 연산자 1씩 더한다
        System.out.println(i); // 4 출력
        ++i;
        System.out.println(i); // 5 출력
        System.out.println(++i); // 6 출력
        System.out.println(i++); // 6 출력
        System.out.println(i); // 7 출력
    
	}

}
