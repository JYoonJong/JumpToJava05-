// Ŭ������ ������
package org.opentutorials.javatutorials.polymorphism;
class A{
	public String x() {return "A.x";}
}
class B extends A{
	public String x() {return "B.x";} // �������̵��� �ؼ� �ش� �޼��尡 ȣ��ȴ�
	public String y() {return "y";}
} 
class B2 extends A{
	public String x() {return "B2.x";}	
}	
public class PolymorphismDemo1 {
	public static void main(String[] args) {
		A obj = new B(); // Ŭ���� B�� obj ��ü�� ����.  & obj�� Ŭ����A ������ �༼�� �ϰ� �ִ�.
		A obj2 = new B2();
		System.out.println(obj.x()); //B.x ���
		// obj.y(); // obj ������ ������ Ÿ���� Ŭ���� A �̱� ������ y�� ȣ����� �ʴ´�.
		System.out.println(obj2.x()); // B2.x ���
	}
}