import java.util.ArrayList;

public class Semaine {
	public ArrayList<Cours> edt = new ArrayList<Cours>();
	int number;
	public Semaine(int num, Mois mois) {
		number = num;
		mois.addSem(this);
		
	}
	
	public void addCours(Cours cours) {
		edt.add(cours);
	}
	
	public int getChargeTravail() {
		return edt.size();
	}
	

}
