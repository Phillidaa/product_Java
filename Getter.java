package pikachu;

public class Getter {

	public static void main(String[] args) {
		Productget item1 = new Productget("Grapes", 40, "F67896", 0.78, 2.88);
		Productget item2 = new Productget("Milk", 30, "M78389", 1.05, 3.50);

		Productget.createNewProduct();

		// ------Getter---------
		System.out.println(item1.getName());

		System.out.println(Productget.getMAX_PRICE());

		// -------Setter-------
		item1.setName("Candy grapes");
		System.out.println(item1.getName());

		// -----Getters & Setters-----
		System.out.println(item1.setQuantity(45).getQuantity());

	}

}
