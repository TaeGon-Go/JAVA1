package org.opentutorials.javatutorials.classninstance;

class Calculator {
    static double PI = 3.14; // static ���(����,�޼ҵ�) �տ� ���̸� Ŭ������ ����� �ȴ�
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
        // �ν��Ͻ��� ���ؼ� PI�� ����
        System.out.println(c1.PI);
 
        Calculator c2 = new Calculator();
        System.out.println(c2.PI);
        // Ŭ������ ���ؼ� PI�� ����
        System.out.println(Calculator.PI);
	}

}