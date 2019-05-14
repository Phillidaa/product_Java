package pikachu;

public class Sloth extends Mammal2 {

	public static void main(String[] args) {
		Sloth one = new Sloth("Terry", "Brown", 100, "Long", 4);

		one.breatheOXY(one.name);
		one.appetite();

	}

	String name;
	String color;
	int appetite;
	String tail;
	int legs;

	Sloth(String name, String color, int appetite, String tail, int legs) {
		this.name = name;
		this.color = color;
		this.appetite = appetite;
		this.tail = tail;
		this.legs = legs;
	}

	public void appetite() {
		this.appetite = 10;
		System.out.println("The appetite of " + this.name + " goes up by " + this.appetite + " every 30 min");

	}

	public void breatheOXY(String x) {
		System.out.println(x + " breathes Oxygen to live");
	}

}
