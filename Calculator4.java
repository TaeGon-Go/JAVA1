package org.opentutorials.javatutorials.classninstance;

class Calculator {
    static double PI = 3.14; // static 멤버(변수,메소드) 앞에 붙이면 클래스의 멤버가 된다
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
public class Calculator4 {
 
    public static void main(String[] args) {
 
        Calculator c1 = new Calculator();
        // 인스턴스를 통해서 PI에 접근
        System.out.println(c1.PI);
 
        Calculator c2 = new Calculator();
        System.out.println(c2.PI);
        // 클래스를 통해서 PI에 접근
        System.out.println(Calculator.PI);
	}

}
