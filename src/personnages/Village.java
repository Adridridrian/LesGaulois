package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int[] villagois;
	private int nbVillagois = 0;
	
	
	public Village(String nom, Chef chef, int nbVillagoisMaximum) {
		this.nom = nom;
		this.chef = chef;
		villagois = new int[nbVillagoisMaximum];
	}
	
	public void ajouterHabitant(int gaulois) {
		nbVillagois +=1;
		villagois = new int[1];
		
	}
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	
}
