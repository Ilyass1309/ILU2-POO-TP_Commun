package model;

public abstract class Formulaire {
	private int jour;
	private int mois;
	private int numEntite;
	
	public Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public int getNumEntite() {
		return numEntite;
	}

	public void setNumEntite(int numEntite) {
		this.numEntite = numEntite;
	}
	
	
}
