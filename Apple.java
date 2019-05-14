package pikachu;

public class Apple {

	public static void main(String[] args) {
		Apple human1 = new Apple("Holly", "English", "Blue", 30, 8);
		Apple human2 = new Apple("Garrian", "English", "Brown", 23, 12);
		Apple human3 = new Apple("CL", "Spanish", "Gold", 28, 100);
		human1.goToSchool();
		human2.tellMeAboutYourself();
	}

	String name;
	String language;
	String eyeColor;
	int age;
	int wisdom;
	static int eyeballs;

	public Apple(String name, String language, String eyeColor, int age, int wisdom) {
		this.name = name;
		this.language = language;
		this.eyeColor = eyeColor;
		this.age = age;
		this.wisdom = wisdom;
	}

	public void goToSchool() {
		this.wisdom += 5;
		System.out.println("Your wisdom went up by " + this.wisdom);
	}

	public void tellMeAboutYourself() {
		System.out.println("Your name is " + this.name);
	}

}
