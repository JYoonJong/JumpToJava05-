package org.opentutorials.javatutorials.polymorphism;
interface I2{
	public String A();
}
interface I3{
	public String B();
}
class D implements I2, I3{ // Ŭ����D �� I2, I3 �����ϰ� �ִ�.
	public String A() { // I2 �� �����ϰ� �־ �������̽� I2 ����� �����ϰ� �ۼ�
		return "A";
	}
	public String B() { // I3 �� �����ϰ� �־ �������̽� I3 ����� �����ϰ� �ۼ� 
		return "B";
	}
}
public class PolymorphismDemo3 {
	public static void main(String[] args) {
		D obj = new D();
		I2 objI2 = new D();
		I3 objI3 = new D();
		
		obj.A(); //A���
		obj.B(); //B���
		
		objI2.A(); //A���
		//objI2.B(); // ����
		 
		//objI3.A(); // ����
		objI3.B(); //B���
		
		
		
	}

}
