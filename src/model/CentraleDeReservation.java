package model;

import java.util.Iterator;

public class CentraleDeReservation <E extends EntiteReservable<F>, F extends Formulaire>{
	private E[] entites;
	private int nbEntites = 0;
	
	private CentraleDeReservation(E[] entites) {
		this.entites = entites;
	}
	
	public int ajouterEntite(E entite) {
		entites[nbEntites] = entite;
		nbEntites++;
		entite.setNumero(nbEntites);
		return nbEntites;
	}
	
	public int[] donnerPossibilites(F formulaire) {
		int[] possibilites = new int[nbEntites];
		int nbPossibilites = 0;
		for (int i = 0; i < nbEntites; i++) {
			if (entites[i].estLibre(formulaire) && entites[i].compatible(formulaire)) {
				possibilites[nbPossibilites] = entites[i].getNumero();
				nbPossibilites++;
			}
		}
		return possibilites;
	}
	
	public Reservation reserver(int numero, F formulaire) {
		E entite = entites[numero];
		formulaire.setIdentificationEntite(numero);
		return entite.reserver(formulaire);
	}
}
