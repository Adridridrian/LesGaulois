package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		equipements = new Equipement[2];
		assert force >0;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + " \" "+ texte + " \" ");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}

	
	public void recevoirCoup(int forceCoup) {
		assert force >0;
		int f = force;
		force -= forceCoup;
		if (force > 0) {
				parler("Aie");
		} else {
				parler("J'abandonne...");
		}
		assert f > force;
	}
	
	public void sEquiper( Equipement equipement) {
		switch (nbEquipement) {
		case 0:
			equipements[nbEquipement]= equipement;
			nbEquipement +=1;
			System.out.println("Le soldat"+ nom + " s'équipe avec un " + equipement);
			break;
		case 1 :
			if (equipements[nbEquipement - 1]== equipement) {
				System.out.println("Le soldat"+ nom + " possède déja un " + equipement);
			}
			else {
				equipements[nbEquipement]= equipement;
				nbEquipement +=1;
				System.out.println("Le soldat"+ nom + " s'équipe avec un " + equipement);
			}
			break;
		default :
			System.out.println("Le soldat"+ nom + " est déjà bien protégé !" );
		
		}
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("minus", 6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
}
