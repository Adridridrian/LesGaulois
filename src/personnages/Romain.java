package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
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

	
//	public void recevoirCoup(int forceCoup) {
//		assert force >0;
//		int f = force;
//		force -= forceCoup;
//		if (force > 0) {
//				parler("Aie");
//		} else {
//				parler("J'abandonne...");
//		}
//		assert f > force;
//	}
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// pr�condition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		if (force==0) {
			parler("A�e");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
			// post condition la force � diminuer
		assert force < oldForce;
		return equipementEjecte;
	}
	
	private int calculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) { 
			texte += "\nMais heureusement, grace � mon �quipement sa force est diminu� de ";
			for (int i = 0; i < nbEquipement;i++) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
					} else {
						System.out.println("Equipement casque");
						resistanceEquipement += 5;
					}
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}
	
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'�quipement de " + nom.toString() + " s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
	}
		

	
	public void sEquiper( Equipement equipement) {
		switch (nbEquipement) {
		case 0:
			equipements[nbEquipement]= equipement;
			nbEquipement++;
			System.out.println("Le soldat"+ nom + " s'équipe avec un " + equipement);
			break;
		case 1 :
			if (equipements[nbEquipement - 1]== equipement) {
				System.out.println("Le soldat"+ nom + " possède déja un " + equipement);
			}
			else {
				equipements[nbEquipement]= equipement;
				nbEquipement++;
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

	public int getForce() {
		// TODO Auto-generated method stub
		return 0;
	}

}
