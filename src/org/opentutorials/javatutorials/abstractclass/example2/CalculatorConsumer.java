package org.opentutorials.javatutorials.abstractclass.example2;

class CalculatorDummy implements Calculatable{ // ��¥ Ŭ������ ������. ��¥Ŭ������ setOprands ��� ��¥ �޼��� ������.
	// implemnets Calculatable �� �ϸ�, Calculatable �������̽� �ȿ� �ִ� �޼ҵ带 ���� �ۼ�������Ѵ�. (���)
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
