package Task_1;

/*
 * Teacher - Alexander Ts 
 * Student - Snigarenko Vlad
 * 07.02.2018
 */

public class Main {

	public static void main(String[] args) {

		// Barsik
		Cat catBarsik = new Cat("Barsik", 10, "White");
		catBarsik.run();
		catBarsik.voice();
		catBarsik.stop();
		System.out.println(catBarsik);

		System.out.println();

		// Murzik
		Cat catMurzik = new Cat("Murzik", 5, "Yellow", "Mur-mur");
		catMurzik.run();
		catMurzik.voice();
		catMurzik.stop();
		System.out.println(catMurzik);

		System.out.println();

		// Matroskin
		Cat catMatroskin = new Cat();
		catMatroskin.setName("Matroskin");
		catMatroskin.setAge(2);
		catMatroskin.setColor("Black");
		catMatroskin.setVoice("Mir-mir");
		catMatroskin.voice();
		catMatroskin.run();
		catMatroskin.setDefaultVoice();
		catMatroskin.voice();
		catMatroskin.stop();
		System.out.println(catMatroskin);

		System.out.println();

	}

}
