//������

public class Bouncer  {
	public void barkAnimal(Barkable animal) { // Barkable �������̽� ���� -> public void bark(); 
		animal.bark();
	}
		
	
	
	public static void main(String[] args) {
		Bouncer bouncer = new Bouncer ();
		Tiger tiger = new Tiger ();
		Lion lion = new Lion ();
		
		bouncer.barkAnimal(tiger); //Tiger Ŭ������ public void bark(){ System.out.println("����") �߰�
		bouncer.barkAnimal(lion); //Lion Ŭ������ public void bark() { System.out.println("������") �߰�
		

	}

}
