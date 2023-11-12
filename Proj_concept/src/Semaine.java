import java.util.ArrayList;

public class Semaine {
	public ArrayList<Cours> edt = new ArrayList<Cours>();
	int number;
	int heureCM;
	int heureTD;
	int heureTP;
	
	public Semaine(int num, Mois mois) {
		number = num;
		mois.addSem(this);
		
	}
	
	public void addCours(Cours cours) {
		if (cours.getType().equals("CM")){
			heureCM = heureCM+1;
		}
		else if (cours.getType().equals("TD")){
			heureTD = heureTD+1;
		}
		else if (cours.getType().equals("TP")){
			heureTP = heureTP + 1;
		}
		
		edt.add(cours);
	}
	
	public int[] getChargeTravail() {
		int charge[] = new int[4] ;
		charge[0]= edt.size();
		charge[1]= heureCM;
		charge[2]= heureTD;
		charge[3]= heureTP;
		
		
		return charge;
	}
	

}
