package day2.assign2;

public class Car {
	public static void main(String[] args) {
		Car obj2 = new Car();
		obj2.applyBreak();
		obj2.applyGear();
		obj2.switchOnAc();
		obj2.applyAcclerate();
	}

public void applyBreak() {
	System.out.println("Apply Break");
}
public void applyGear() {
	System.out.println("Apply Gear");
}
public void switchOnAc() {
	System.out.println("Turn ON AC");
}
public void applyAcclerate() {
	System.out.println("Accelerate");
}
}