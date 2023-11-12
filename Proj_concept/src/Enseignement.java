import java.util.ArrayList;

public class Enseignement {
	ArrayList<Etudiant> liste_etudiants = new ArrayList<Etudiant>();
	ArrayList<Controle> liste_controle = new ArrayList<Controle>();
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
	
	public ArrayList<Controle> getListeControle(){return liste_controle;}
	
	public String getNom() {
		return nom;
	}
	
	public float getMoyenne(Etudiant et) {
		float sommeNote = 0;
		float sommeCoef = 0;
		// on parcours tout les controle
		for(Controle cont:liste_controle) {
			//on ajoute le coef du controle à chaque fois cela suppose que l'étudiant est inscrit dans l'enseignement et que il possède une note pour ce controle
			sommeCoef = sommeCoef + cont.getCoef();
			for(Note note : cont.getNotes()) {
				// on parcours les étudiants et on cherche sa note
				if (note.getEt() ==et) {
					sommeNote = sommeNote + cont.getCoef() * note.getNote();
				}
			}
		}
		float moyenne = sommeNote / sommeCoef;
		return moyenne;
	}
	
	public void addDevoir(String titre, String sujet) {
		//on crée un nouveau devoir et on ajoute à la liste des devoirs de l'enseignement
		Devoir devoir = new Devoir(this, sujet, titre);
		liste_devoir.add(devoir);
		
		for (Etudiant et: liste_etudiants) { //on transmet à tous les étudiants suivant l'enseignement le devoir
			et.receivDevoir(devoir);
		}
	}
	
	public void addControle(float coef, String date) {
		// on crée un controle que l'on va ajouter à la liste des conrole
		Controle cont= new Controle(coef, date);
		liste_controle.add(cont);
	}
	
	public void addNote(Etudiant et,Controle cont, float noteOb) {
		// on crée une note que l'on va ajouter au note d'uncontrole
		Note note = new Note(et, noteOb);
		cont.addNote(note);
		
	}
	

}
