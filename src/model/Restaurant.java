package model;

public class Restaurant {

	
	private static class Table extends EntiteReservable<Formulaire>{
		private CalendrierAnnuel calendrierDeuxiemeService;
		private int nbChaises;
		
		private Table(CalendrierAnnuel calendrierDeuxiemeService, int nbChaises) {
			this.calendrierDeuxiemeService = calendrierDeuxiemeService;
			this.nbChaises = nbChaises;
		}
		
		public boolean compatible(FormulaireRestaurant formulaire) {
			if (formulaire.getNombrePersonnes() == nbChaises || (formulaire.getNombrePersonnes() == nbChaises - 1)){
				
			}
		}
	}
	
	
}
