package personnages;

public class Village {
	private String nom;
	private String chef;
	private static int[] villagois;
	private static int nbVillagois = 0;
	
	
	public Village(String nom, String chef, int nbVillagoisMaximum) {
		this.nom = nom;
		this.chef = chef;
		villagois = new int[nbVillagoisMaximum];
	}
	
	public static void ajouterHabitant(Gaulois gaulois) {
		nbVillagois +=1;
		villagois = new int[1];
		
	}
	public String getNom() {
		return nom;
	}
	
	public void setChef(String chef) {
		this.chef = chef;
	}
	public int trouverHabitant(int numero) {
		return  villagois[numero];
	}
	
	public void afficherVillagois() {
		System.out.println("Dans le village du chef" + chef + " vivent les légendaires gaulois :");
		int i = 0;
		while (i<3) {
			System.out.println(" - "+ villagois[i]);
			++i;
		}
	}
	
	public static void main(String[] args) {
		Gaulois abracourcix = new Gaulois( "Abracourcix",6);
		Village village = new Village( " Village des Irréductibles", "Abracourcix", 30);
		ajouterHabitant(abracourcix);
		Gaulois asterix = new Gaulois( "Astérix",8);
		ajouterHabitant(asterix);
		Gaulois obelix = new Gaulois( "Obélix",25);
		ajouterHabitant(obelix);
	}
	
}