package pikachu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tournament {
	public static String seed1;
	public static String seed2;
	public static String seed3;
	public static String seed4;
	public static String seed5;

	public static void main(String[] args) {
		ArrayList<String> Teams = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Seed1 Team: ");
		seed1 = input.nextLine();
		System.out.println("Enter Seed2 Team: ");
		seed2 = input.nextLine();
		System.out.println("Enter Seed3 Team: ");
		seed3 = input.nextLine();
		System.out.println("Enter Seed4 Team: ");
		seed4 = input.nextLine();
		System.out.println("Are there any more teams? If Yes give the team Name, else type No");
		seed5 = input.nextLine();
		if (seed5.equals("No")) {
			Teams.add(seed1);
			Teams.add(seed2);
			Teams.add(seed3);
			Teams.add(seed4);
			System.out.println("Total of " + Teams.size()
					+ "entries received. The Teams participating in the Tournament are " + Teams);

		} else {
			Teams.add(seed1);
			Teams.add(seed2);
			Teams.add(seed3);
			Teams.add(seed4);
			Teams.add(seed5);
			System.out.println("Total of " + Teams.size()
					+ "entries received. The Teams participating in the Tournament are " + Teams);
		}
		if (Teams.size() % 2 == 0) {
			System.out.println("A: Team " + seed1 + " and Team " + seed4 + " will play against eachother ");
			System.out.println("B: Team " + seed2 + " and Team " + seed3 + " will play against eachother ");
		} else {
			System.out.println("Since there are odd number of teams " + seed1 + " gets a bye." + seed2 + " and " + seed5
					+ " will play against each other");
			System.out.println(seed3 + " and " + seed4 + "will play against each other");
		}
		Tournament.R1();
		Tournament.R2();
	}

	public static void R1() {

		System.out.println("Match 1 winners:");
		Random rand = new Random();
		int r1 = rand.nextInt(2);
		System.out.println(r1);

		if (r1 == 1) {
			System.out.println(seed1 + " are the winners....Congratulations " + seed1 + "!!!!");
		} else {
			System.out.println(seed4 + " are the winners....Congratulations " + seed4 + "!!!!");
		}
	}

	public static void R2() {
		System.out.println("Match 2 winners:");
		Random rand = new Random();
		int r1 = rand.nextInt(2);
		System.out.println(r1);

		if (r1 == 1) {
			System.out.println(seed2 + " are the winners....Congratulations " + seed2 + "!");
		} else {
			System.out.println(seed3 + " are the winners....Congratulations " + seed3 + "!");
		}
		System.out.println("See you at the next season!!!!!!!");
}
}
