package personnages;

import villagegaulois.Musee;
import villagegaulois.Trophee;

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
//		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
//		romain.recevoirCoup((force/3)* effetPotion);
//	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		Equipement[] trophees = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
		}
	}
	
	public void faireUneDonnation( Musee musee ) {
		System.out.println(nom + " Je donne au musee tous mes trophees " + nbTrophee);
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