package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private static int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	static void boirePotion ( int forcePotion) {
		effetPotion = forcePotion;
		
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "  " + texte + " ");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		romain.recevoirCoup((force*effetPotion) / 3);
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix", 8);
		System.out.println(asterix);
		int forcePotion = 3;
		asterix.boirePotion (forcePotion);
		
	}

}

