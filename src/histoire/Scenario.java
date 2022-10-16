package histoire;

import personnages.*;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix", 8);
		Gaulois Obélix = new Gaulois("Obélix", 10);
		Romain minus = new Romain("minus",6);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion(5,10);
		panoramix.booster(Obélix);
		Obélix.parler("Par Bélénos, ce n'est pas juste");
		panoramix.booster(asterix);
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAUGAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		

	}

}
