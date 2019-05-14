package pikachu;

public class Dolphin extends Mammal {

	public static void main(String[] args) {

		Dolphin dolphin1 = new Dolphin("Jerry the Dolphin", 3, 100, 25);
		dolphin1.breatheOXY(dolphin1.name);
		dolphin1.breatheOXY("String");
	}

	private String name;
	private int fins;
	private int stamina;
	private int speed;

	Dolphin(String name, int fins, int stamina, int speed) {
		this.name = name;
		this.fins = fins;
		this.stamina = stamina;
		this.speed = speed;
	}

	public void swim() {
		this.stamina -= 5;
		this.speed += 3;
		System.out.println(
				"Your Dolphin just swam, stamina has been affected. The current stamina level is " + this.stamina);
	}

	public void echo_location() {
		this.stamina -= 10;
		System.out.println("The Dolphin is calling other Dolphins! Stamina affected. The current stamina level is "
				+ this.stamina);
	}

//	@Override
//
//	public void breatheOXY(String x) {
//		System.out.println(this.name + " jumps out of the ocean to breathe!");
//		System.out.println(this.name + "'s stamina is now " + this.stamina);
//		System.out.println("Hi " + x);
//	}

}
