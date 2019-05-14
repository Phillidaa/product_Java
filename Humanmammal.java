package pikachu;

public class Humanmammal extends Mammal2 {

	public static void main(String[] args) {
		Humanmammal one = new Humanmammal("Sneezy", 35, 10, true, "Greenland");
		one.eatsFood();
		one.speedchange();

		one.eatsFOOD(one.name);
		one.breatheOXY(one.name);
		System.out.println(one.name + " is also a mammal and holds " + one.isRuns() + " for running");
	}

	private String name;
	private int age;
	private int speed;
	private boolean breathe;
	private String country;

	Humanmammal(String name, int age, int speed, boolean breathe, String country) {
		this.name = name;
		this.age = age;
		this.speed = speed;
		this.breathe = breathe;
		this.country = country;
	}

	public void speedchange() {
		this.speed += 2;
		System.out.println("The speed of " + this.name + "has gone up to " + this.speed);
	}

	public void eatsFood() {

		System.out.println(this.name + " needs to eat food to live");

	}

	public void breatheOXY(String x) {
		System.out.println(this.name + " breathes Oxygen to live");
	}
}
