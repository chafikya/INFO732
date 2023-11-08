import java.util.ArrayList;

public class Semaine {
	private ArrayList<Cours> edt = new ArrayList<Cours>();
	int number;
	public Semaine(int num, Mois mois) {
		number = num;
		mois.addSem(this);
		
	}
	
	public void addCours(Cours cours) {
		edt.add(cours);
	}
	

}
