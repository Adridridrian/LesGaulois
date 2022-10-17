package personnages;

public class Gaulois {
	private String nom;
	private static int effetPotion = 1;
	private int force;
	private int nbTrophees;
	private Equipement trophees[] = new Equipement[100];

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

//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}


//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mï¿½choire de " + romain.getNom());
//		romain.recevoirCoup((force/3)* effetPotion);
//	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophees2 = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees2 != null && i < trophees2.length; i++, nb_trophees++) {
			this.trophees[nb_trophees] = trophees2[i];
		}
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

