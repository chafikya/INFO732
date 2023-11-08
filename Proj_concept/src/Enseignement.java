import java.util.ArrayList;

public class Enseignement {
	ArrayList<Etudiant> liste_etudiants = new ArrayList<Etudiant>();
	String nom;
	int nbrTD;
	int nbrTP;
	int nbrCM;
	int TDRea=0;
	int TPRea=0;
	int CMRea=0;
	public Enseignement(String un_nom, int seanceTD, int seanceTP, int coursCM) {
		nom=un_nom;
		nbrTD = seanceTD;
		nbrTP = seanceTP;
		nbrCM = coursCM;
	}
	public int getNbHeuresTD() {
		return nbrTD;
	}
	
	public void addEtudiant(Etudiant et) {
		liste_etudiants.add(et);
		
	}
	
	public float getMoyenne(Etudiant et) {
		float p;
		p=0.5;
		return p;
	}
	

}
