package personnages;

public class Village {
	private String nom;
	private static Chef chef;
	private static int[] villagois;
	private static int nbVillagois = 0;
	
	
	public Village(String nom, Chef chef, int nbVillagoisMaximum) {
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
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public int trouverHabitant(int numero) {
		return  villagois[numero];
	}
	
	public static void main(String[] args) {
		Village village = new Village( " Village des Irréductibles", chef, 30);
		Gaulois abracourcix = new Gaulois( "Abracourcix",6);
		Chef abracourcix;
		ajouterHabitant(abracourcix);
	}
	
}