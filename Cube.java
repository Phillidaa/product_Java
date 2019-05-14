package pikachu;

public class Cube {

	public static void main(String[] args) {
		Cube metric = new Cube(4, 4, 4);

		metric.getVolume();
	}

	int length;
	int breadth;
	int height;

	public Cube(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public void getVolume() {

		System.out.println(this.length * this.breadth * this.height);
	}

}
