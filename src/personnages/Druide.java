package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private static int forcePotion = 1;
	private int effetPotionMin;
	private int effetPotionMax;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}
	
	public static int preparerPotion ( int effetPotionMin , int effetPotionMax) {
		Random random = new Random();
		forcePotion = effetPotionMin + random.nextInt(effetPotionMax-effetPotionMin) ;
		return forcePotion;
		
	}
	
	public void booster(Gaulois gaulois) {
		String nomGaulois = gaulois.getNom();
		if (nomGaulois.equals("Obélix")) {
			parler( "Non, Obélix !... Tu n’auras pas de potion magique !");
		}
		else {
			gaulois.boirePotion(forcePotion);
		}
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "  " + texte + " ");
	}
	

	private String prendreParole() {
		return "Le druide " + nom + " : ";
}
	
	public String toString() {
		return "Druide [nom=" + nom + ", effetPotionMin=" + effetPotionMin + ", effetPotionMax=" + effetPotionMax + "]";
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("panoramix", 5, 10);
		System.out.println(panoramix);
		forcePotion= preparerPotion(5, 10);
		System.out.println("intervalle [5,10] : "+ preparerPotion(5, 10) + " ");
		if (forcePotion<=7) {
			System.out.println( "Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force" + " " + forcePotion);
		}
		else {
			System.out.println ( "J'ai pr�par� une super potion de force" + " " + forcePotion);
		}
		
	}

	
}