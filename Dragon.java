package pikachu;

public class Dragon {

	public static void main(String[] args) {

		Dragon Human = new Dragon("Human", "Earth", "Mixed", 6, 50);
		Dragon Dragons = new Dragon("Dragon", "Mars", "Black", 30, 100);
		Dragon Car = new Dragon("Cars", "All", "Multiple", 4, 70);

		Human.powerPlay();
		Dragons.powerPlay();
		Car.powerPlay();

		Human.information();
		Dragons.information();
		Car.information();
	}

	String Species;
	String Planet;
	String Color;
	int Height;
	int power;

	public Dragon(String Species, String Planet, String Color, int Height, int power) {
		this.Species = Species;
		this.Planet = Planet;
		this.Color = Color;
		this.Height = Height;
		this.power = power;
	}

	public void powerPlay() {
		if (this.power > 70) {
			System.out.println(this.Species + " are powerful with a score of " + this.power);
		}
	}

	public void information() {
		System.out.println("Details are " + "Species:" + this.Species + " Planet:" + this.Planet + " Color:"
				+ this.Color + " Height:" + this.Height + " Power:" + this.power);
	}

}
