package villagegaulois;

import personnages.Equipement;
import personnages.Gaulois;

public class Musee {
	private Trophee[] trophee = new Trophee[200];
	private int nbTrophee = 0;
	
	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		trophee[nbTrophee] = new Trophee(gaulois,equipement);
		nbTrophee +=1;
	}
	
	public String extraireInstructionOcaml() {
		String texte = "";
		for (int i=0;i<nbTrophee;i++) {
			texte +=trophee[i].donnerNom() + trophee[i].getEquipement();
		}
		return texte;
	}

}
