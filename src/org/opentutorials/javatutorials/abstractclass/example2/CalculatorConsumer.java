package org.opentutorials.javatutorials.abstractclass.example2;

class CalculatorDummy implements Calculatable{ // 가짜 클래스를 만들자. 가짜클래스의 setOprands 라는 가짜 메서드 만들자.
	// implemnets Calculatable 을 하면, Calculatable 인터페이스 안에 있는 메소드를 전부 작성해줘야한다. (약속)
	public void setOprands(int first, int second, int third) {}
	public int sum() {
		return 0; 
	}
	public int avg() {
		return 0;
	}
}

public class CalculatorConsumer{
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOprands(10, 20, 30);
		System.out.println(c.sum()+c.avg());

	}

}
