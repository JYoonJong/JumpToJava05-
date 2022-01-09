// 메소드 오버라이딩 : 기존에 상속 받았던 값에서 변경을 함
// 메소드 오버로딩 : HouseDog 메소드에 추가한다.


public class HouseDog extends Dog {	

	public HouseDog(String name) {
		this.setName(name); //생성자 new HouseDog( ) 문자열 필수로 들어가야함.
	}	
	public HouseDog(int type) { // 생성자 오버로딩
		if (type == 1 ) {
			this.setName("yorkshire");
			}
		else if ( type ==2 ){
			this.setName("bulldog");
			}
	}
	
	public void sleep() { // 오버라이딩
		System.out.println(this.name + " zzz in house");
	}
	public void sleep(int hour) { //오버로딩
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
