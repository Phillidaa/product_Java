package pikachu;

public class Cars {

	public static void main(String[] args) {

		Cars model1 = new Cars("Toyota", "White", 90, "Japan");
		Cars model2 = new Cars("Buick", "Black", 60, "USA");
		Cars model3 = new Cars("Spaceship", "Dynamic", 100, "Mars");

		model1.features();
		model2.features();
		model3.features();
	}

	String name;
	String color;
	int score;
	String country;

	public Cars(String name, String color, int score, String country) {
		this.name = name;
		this.color = color;
		this.score = score;
		this.country = country;
	}

	public void features() {
		for (var i = 0; i < 4; i++) {
			System.out.println(
					"The features are: " + " " + this.color + " " + this.name + " " + this.score + " " + this.country);
		}

	}

}