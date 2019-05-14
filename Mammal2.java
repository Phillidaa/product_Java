package pikachu;

public class Mammal2 {

	public static void main(String[] args) {
	}

	private final static boolean LIVE_BIRTH = true;
	private final static boolean MILK_PRODUCING = true;
	private final static boolean RUNS = true;
	private final static boolean EATS_INSECT = false;
	private final static boolean HAS_FOURLEGS = false;

	public static boolean isLiveBirth() {
		return LIVE_BIRTH;
	}

	public static boolean isMilkProducing() {
		return MILK_PRODUCING;
	}

	public static boolean isRuns() {
		return RUNS;
	}

	public static boolean isEatsInsect() {
		return EATS_INSECT;
	}

	public static boolean isHasFourLegs() {
		return HAS_FOURLEGS;
	}

	public void eatsFOOD(String x) {
		System.out.println("This mammal is " + x);
		System.out.println("All mammals eats food. This is an essential function. Without this, your mammal would DIE");
	}

	public void breatheOXY(String x) {
		System.out.println("This mammal is " + x);
		System.out.println("All mammals need to breathe. Without this, your mammal would DIE");
	}

}
