package kadai_015;

public class Car_Chapter15 {
	private int gear = 1; // 1速から5速のギアを表す
	private int speed = 10; // ギアチェンジ語の速度を表す
	
	
	public void gearChange (int afterGear) {
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		
		this.gear = afterGear;
		
		switch(afterGear) {
		case 1 -> this.speed = 10;
		case 2 -> this.speed = 20;
		case 3 -> this.speed = 30;
		case 4 -> this.speed = 40;
		case 5 -> this.speed = 50;
		default -> this.speed = 10;
		}
	}
	
	public void run() {
		 System.out.println("時速は" + this.speed + "kmです");
	}
}
