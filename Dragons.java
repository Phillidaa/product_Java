package pikachu;

public class Dragons extends Mammal {

	public static void main(String[] args) {

		Dragons spyro = new Dragons(10000, 250);
		spyro.attackTheNorth();
		spyro.isMilkProducing();
	}

	private int scales;
	private int firepower;
	private static final boolean MILK_PRODUCING = false;
	private static final boolean LIVE_BIRTH = false;

	public static boolean isLiveBirth() {
		return LIVE_BIRTH;
	}

	public static boolean isMilkProducing() {
		return MILK_PRODUCING;
	}

	Dragons(int scales, int firepower) {
		this.scales = scales;
		this.firepower = firepower;
	}

	public void attackTheNorth() {
		this.firepower -= 24;
		System.out.println("The dragon just attacked the North!!");
		System.out.println("Firepower is now " + this.firepower);
	}

}
