
public class AnneeFactory {
	Annee an = new Annee();
	
	public AnneeFactory() {}
	public Annee createAnne() {
		for (int j=0; j<12; j++ ) {
			Mois mois = new Mois(an);
			for(int i=0; i<4; i++) {
				Semaine sem = new Semaine(j*4 + i+1, mois);
			}
		}
		return an;
	}

}
