package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageoisMaximum;
	private static int nbVillageois = 0;
	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois +=1;
		
	}
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public Gaulois trouverHabitant(int numero) {
		return  villageois[numero];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef" + chef.getNom() + " vivent les légendaires gaulois :");
		for (int i=0;i<nbVillageois;i++) {
			System.out.println(" - "+ villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		Chef Abracourcix = new Chef("Abracourcix", 6 ,nbVillageois, village);
		village.setChef(Abracourcix);
		Gaulois asterix = new Gaulois( "Astérix",8);
		village.ajouterHabitant(asterix);
		Gaulois obelix = new Gaulois( "Obélix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
	
}