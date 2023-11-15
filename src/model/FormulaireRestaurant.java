package model;

public class FormulaireRestaurant extends Formulaire{
	private int nombrePersonnes;
	private int numService;
	
	public FormulaireRestaurant(int jour, int mois, int nbPers, int numService) {
		super(jour, mois);
		this.nombrePersonnes = nbPers;
		this.numService = numService;
	}

	public int getNombrePersonnes() {
		return nombrePersonnes;
	}

	public int getNumService() {
		return numService;
	}
	
	
	
}
