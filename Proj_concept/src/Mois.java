import java.util.ArrayList;

public class Mois {
	ArrayList<Semaine> sem = new ArrayList<Semaine>();
	
	public Mois(Annee an) {
		an.addMois(this);
	}
	
	public void addSem(Semaine semaine) {
		sem.add(semaine);
	}

}
