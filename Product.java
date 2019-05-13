package pikachu;

import java.util.Calendar;
import java.util.Date;

public class Product {

	public static void main(String[] args) {

		Product item1 = new Product("Grapes", 40, "F67896", 0.78, 2.88, new Date(2019 - 1900, 4, 18));
		Product item2 = new Product("Milk", 30, "M78389", 1.05, 3.50, new Date(2019 - 1900, 4, 15));
		Product item3 = new Product("Rice", 100, "R98234", 0.25, 1.50, new Date(2020 - 1900, 8, 9));
		Product item4 = new Product("Canned Fish", 20, "F23434", 5.00, 15.00, new Date(2022 - 1900, 11, 27));
		Product item5 = new Product("Potato Chips", 100, "C19285", 0.38, 2.00, new Date(2019 - 1900, 10, 21));

		item1.purchaseCost();
		item2.purchaseCost();
		item3.purchaseCost();
		item4.purchaseCost();
		item5.purchaseCost();
		item1.productRevenue();
		item2.productRevenue();
		item3.productRevenue();
		item4.productRevenue();
		item5.productRevenue();
		item1.productProfit();
		item2.productProfit();
		item3.productProfit();
		item4.productProfit();
		item5.productProfit();
		item1.expiryInWeek();
		item2.expiryInWeek();
		item3.expiryInWeek();
		item4.expiryInWeek();
		item5.expiryInWeek();
		item1.sale();
		item2.sale();
		item3.sale();
		item4.sale();
		item5.sale();
	}

	String name;
	int quantity;
	String code;
	double cost;
	double sp;
	Date date1;

	public Product(String name, int quantity, String code, double cost, double sp, Date date) {
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.sp = sp;
		this.date1 = date;
	}

	public void purchaseCost() {
		System.out.println("The purchase cost of " + name + " is $ " + (cost * quantity));
	}

	public void productRevenue() {
		System.out.println("The revenue from " + name + " is $ " + (sp * quantity));
	}

	public void productProfit() {
		System.out.println("The profit from" + name + " is $ " + ((sp - cost) * quantity));
	}

	public void expiryInWeek() {
		Date today = (Calendar.getInstance().getTime());
		long diffInMillies = Math.abs(date1.getTime() - today.getTime());
		long diff = diffInMillies / (1000 * 60 * 60 * 24);

		if (diff < 7) {
			System.out.println("The product " + name + " needs to be sold within this week");
		} else {
			System.out.println("The product " + name + " will not expire this week");
		}
	}

	public void sale() {
		Date today = (Calendar.getInstance().getTime());
		long diffInMillies = Math.abs(date1.getTime() - today.getTime());
		long diff = diffInMillies / (1000 * 60 * 60 * 24);

		if (diff < 3) {
			System.out.println("The Product " + name + " is on 70% discount. The new price is " + (sp - (sp * 0.7)));
		} else if (diff < 5) {
			System.out.println("The Product " + name + " is on 50% discount. The new price is " + (sp - (sp * 0.5)));
		} else if (diff < 7) {
			System.out.println("The Product " + name + " is on 30% discount. The new price is " + (sp - (sp * 0.3)));
		} else {
			System.out.println("This item " + name + " is not on discount");
		}
	}

}
