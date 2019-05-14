package pikachu;

import java.util.Scanner;

public class Productget {

	private int quantity;
	private String code;
	private double cost;
	private double sp;
	private String name;
	private final static double MAX_PRICE = 1.00;

	public static double getMAX_PRICE() { // this was manually inserted to get the max price
		return MAX_PRICE;
	}

	public static Productget createNewProduct() {
		System.out.println("Welcome to the product database. Pls enter the new product list");
		Scanner input = new Scanner(System.in);
		System.out.println("What is the product's name?");
		String name = input.nextLine();
		System.out.println("What is the product's quantity?");
		int quantity = input.nextInt();
		System.out.println("What is the product's code?");
		String code = input.nextLine();
		System.out.println("What is the product's sp?");
		double sp = input.nextDouble();
		System.out.println("What is the product's cost?");
		double cost = input.nextDouble();

		Productget productnew = new Productget(name, quantity, code, sp, cost);
		System.out.println("New product created and name is  " + productnew.name);
		return productnew;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() { // ---Changing for Getters & Setters format
		return this.quantity;
	}

	public Productget setQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getSp() {
		return sp;
	}

	public void setSp(double sp) {
		this.sp = sp;
	}

	public static void main(String[] args) {

	}

	Productget(String name, int quantity, String code, double cost, double sp) {
		this.name = name;
		this.quantity = quantity;
		this.code = code;
		this.cost = cost;
		this.sp = sp;
	}

	public void getProductInfo() {
		System.out.println("Product name is " + this.name);
		System.out.println("Quantity available for item " + this.name + " is " + this.quantity);
		System.out.println("Code of " + this.name + " is " + this.code);
		System.out.println("Cost of " + this.cost);
		System.out.println("Selling price is " + this.sp);
	}

	public String getname() {
		return name;
	}

}
