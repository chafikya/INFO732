import java.util.ArrayList;

public class Enseignement {
	ArrayList<Etudiant> liste_etudiants = new ArrayList<Etudiant>();
	private ArrayList<Devoir> liste_devoir = new ArrayList<Devoir>();
	 private String nom;
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
	
	public String getNom() {
		return nom;
	}
	
	public float getMoyenne(Etudiant et) {
		float p;
		p=1/3;
		return p;
	}
	
	public void addDevoir(String titre, String sujet) {
		Devoir devoir = new Devoir(this, sujet, titre);
		liste_devoir.add(devoir);
		for (Etudiant et: liste_etudiants) {
			et.receivDevoir(devoir);
		}
		
	}
	

}
