// �޼ҵ� �������̵� : ������ ��� �޾Ҵ� ������ ������ ��
// �޼ҵ� �����ε� : HouseDog �޼ҵ忡 �߰��Ѵ�.


public class HouseDog extends Dog {	

	public HouseDog(String name) {
		this.setName(name); //������ new HouseDog( ) ���ڿ� �ʼ��� ������.
	}	
	public HouseDog(int type) { // ������ �����ε�
		if (type == 1 ) {
			this.setName("yorkshire");
			}
		else if ( type ==2 ){
			this.setName("bulldog");
			}
	}
	
	public void sleep() { // �������̵�
		System.out.println(this.name + " zzz in house");
	}
	public void sleep(int hour) { //�����ε�
		System.out.println(this.name + " zzz in house for " + hour + "hours");
	}

	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog("happy");
		houseDog.setName("poppy");
		
		houseDog.sleep();
		houseDog.sleep(3);
		System.out.println(houseDog.name);
		
		HouseDog dog1 = new HouseDog(1);
		HouseDog dog2 = new HouseDog(2);
		HouseDog dog3 = new HouseDog("Happy");
		
		System.out.println(dog1.name);
		System.out.println(dog2.name);
		System.out.println(dog3.name);
		
	}

}
