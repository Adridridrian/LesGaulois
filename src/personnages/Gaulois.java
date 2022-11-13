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
	
	public static void boirePotion ( int forcePotion) {
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
		if (nbTrophees>0){
			parler( " Je donne au musee tous mes trophees " + nbTrophees);
			while(nbTrophees>0) {
				musee.donnerTrophees(this, trophees[nbTrophees]);
				System.out.println("-"+ trophees[nbTrophees]);
				trophees[nbTrophees-1]=null;
				nbTrophees -=1;
			}
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
		Gaulois.boirePotion (forcePotion);
		System.out.println("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée.");
		
	}

}