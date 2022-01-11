package org.opentutorials.javatutorials.polymorphism;
interface I2{
	public String A();
}
interface I3{
	public String B();
}
class D implements I2, I3{ // 클래스D 가 I2, I3 구현하고 있다.
	public String A() { // I2 를 구현하고 있어서 인터페이스 I2 내용과 동일하게 작성
		return "A";
	}
	public String B() { // I3 를 구현하고 있어서 인터페이스 I3 내용과 동일하게 작성 
		return "B";
	}
}
public class PolymorphismDemo3 {
	public static void main(String[] args) {
		D obj = new D();
		I2 objI2 = new D();
		I3 objI3 = new D();
		
		obj.A(); //A출력
		obj.B(); //B출력
		
		objI2.A(); //A출력
		//objI2.B(); // 오류
		 
		//objI3.A(); // 오류
		objI3.B(); //B출력
		
		
		
	}

}
