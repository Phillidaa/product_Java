package pikachu;

public class Human {

	public static void main(String[] args) {

		Human data1 = new Human("Coke", "Fries", "Omega", 2345, 45678);
		Human data2 = new Human("Milk shake", "Burger", "Tissot", 4567, 67890);
		Human data3 = new Human("Juice", "Noodles", "Rado", 7897, 34567);

		data1.detailsAboutThePerson();
		data2.detailsAboutThePerson();
		data3.detailsAboutThePerson();
		data1.alternateDrink();
		data2.alternateDrink();
		data3.alternateDrink();
	}

	String drink;
	String food;
	String watch;
	int carplate;
	int zipcode;
	String Water;

	public Human(String drink, String food, String watch, int carplate, int zipcode) {
		this.drink = drink;
		this.food = food;
		this.watch = watch;
		this.carplate = carplate;
		this.zipcode = zipcode;
	}

	public void alternateDrink() {
		this.drink = "Water";
		System.out.println("If drink is not available, pls give " + this.drink);
	}

	public void detailsAboutThePerson() {
		System.out.println("This person likes to drink " + this.drink + "eat " + this.food);
	}

}
