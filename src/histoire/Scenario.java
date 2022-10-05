package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix", 8);
		Romain minus = new Romain("minus",6);
		System.out.println(asterix);
		System.out.println(minus);
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAUGAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		

	}

}
