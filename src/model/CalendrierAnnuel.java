package model;

public class CalendrierAnnuel {
	private Mois[] calendrier;

	public CalendrierAnnuel() {
		calendrier = new Mois[12];
		calendrier[0] = new Mois("Janvier", 31);
		calendrier[1] = new Mois("Février", 28);
		calendrier[2] = new Mois("Mars", 31);
		calendrier[3] = new Mois("Avril", 30);
		calendrier[4] = new Mois("Mai", 31);
		calendrier[5] = new Mois("Juin", 30);
		calendrier[6] = new Mois("Juillet", 31);
		calendrier[7] = new Mois("Aout", 31);
		calendrier[8] = new Mois("Septembre", 30);
		calendrier[9] = new Mois("Octobre", 31);
		calendrier[10] = new Mois("Novembre", 30);
		calendrier[11] = new Mois("Decembre", 31);
	}
	
	private static class Mois{
		private String nom;
		private boolean[] jours;
		
		private Mois(String nom, int nbJours) {
			jours = new boolean[nbJours];
			for (int i = 0; i < nbJours ; i++) {
				jours[i] = false;
			}
			this.nom = nom;
		}
		
		private boolean estLibre(int jour) {
			return !jours[jour-1];
		}
		
		private void reserver(int jour) throws IllegalStateException{
			if (!estLibre(jour)) {
				throw new IllegalStateException ("Le jour n'est pas libre");
			}
			jours[jour-1] = true;
		}
	}
	
	public boolean estLibre(int jour, int mois) {
		Mois moisLibre = calendrier[mois-1];
		return moisLibre.estLibre(jour);
	}

	public boolean reserver(int jour, int mois) {
		if (!estLibre(jour,mois)) {
			return false;
		}
		Mois moisReserver = calendrier[mois-1];
		moisReserver.reserver(jour);
		return true;
	}
}
