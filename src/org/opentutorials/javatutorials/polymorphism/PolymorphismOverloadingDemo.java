// �޼ҵ���� ������
package org.opentutorials.javatutorials.polymorphism; 
class O{
	public void a(int param) {
		System.out.println("�������");
		System.out.println(param);
	}
	public void a(String param) { // a ��� �޼ҵ尡 �߰��Ǿ����� int �� String ���� ������ �޼ҵ� ����
		System.out.println("�������");
		System.out.println(param);
	}
}
public class PolymorphismOverloadingDemo {

	public static void main(String[] args) {
		O o = new O();
		o.a(1); // 1 �̶�� int ���� ȣ��
		o.a("one"); // one �̶�� String ���� ȣ��
	}
}
