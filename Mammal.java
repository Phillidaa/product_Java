package pikachu;

public class Mammal {

	public static void main(String[] args) {
	}

	private final static boolean LIVE_BIRTH = true;
	private final static boolean MILK_PRODUCING = true;

	public static boolean isLiveBirth() {
		return LIVE_BIRTH;
	}

	public static boolean isMilkProducing() {
		return MILK_PRODUCING;
	}

	public void breatheOXY(String x) {
		System.out.println("This mammal is " + x);
		System.out.println("All mammals breathe air. This is an " + "essential function. Without this, your "
				+ "mammal would DIE");
	}

}
