// �������̽� ����

// Predator ��� �������̽� ���� -> public String getFood();
// Tiger �� Lion �̶�� Ŭ���� ���� -> public String getFood()  return "����";

public class Zookeeper {
	public void feed (Predator predator) { //Predator ��� �������̽� ���� 
		System.out.println("feed " + predator.getFood());
	}
	
	public static void main(String[] args) {
		Zookeeper zookeeper = new Zookeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zookeeper.feed(tiger);
		zookeeper.feed(lion);

	}

}
