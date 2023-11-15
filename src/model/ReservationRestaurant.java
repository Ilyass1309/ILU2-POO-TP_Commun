package model;

public class ReservationRestaurant extends Reservation{
	private int numService;
	private int numTable;
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour, mois);
		this.numService = numService;
		this.numTable = numTable;
	}
	
	public String toString() {
		String stringService;
		if (numService == 1) {
			stringService = "premier";
		} else {
			stringService = "deuxième";
		}
		StringBuilder chaine = new StringBuilder();
		chaine.append("Le " + super.getJour() + "/" + super.getMois() + " : Table n°" 
		+ numTable + " pour le " + stringService + " service.");
		return chaine.toString();
	}
	
}
