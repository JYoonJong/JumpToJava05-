// 클래스와 다형성
package org.opentutorials.javatutorials.polymorphism;
class A{
	public String x() {return "A.x";}
}
class B extends A{
	public String x() {return "B.x";} // 오버라이딩을 해서 해당 메서드가 호출된다
	public String y() {return "y";}
} 
class B2 extends A{
	public String x() {return "B2.x";}	
}	
public class PolymorphismDemo1 {
	public static void main(String[] args) {
		A obj = new B(); // 클래스 B로 obj 객체를 만듬.  & obj는 클래스A 데이터 행세를 하고 있다.
		A obj2 = new B2();
		System.out.println(obj.x()); //B.x 출력
		// obj.y(); // obj 변수는 데이터 타입이 클래스 A 이기 때문에 y는 호출되지 않는다.
		System.out.println(obj2.x()); // B2.x 출력
	}
}