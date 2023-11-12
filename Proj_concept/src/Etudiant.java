import java.util.ArrayList;

public class Etudiant {
	String nom;
	private ArrayList<Devoir> devoir_a_rendre = new ArrayList<Devoir>();
	ArrayList<Enseignement> liste_enseignement = new ArrayList<Enseignement>();
	
	public Etudiant(String un_nom) {
		nom = un_nom;
	}
	public void receivDevoir(Devoir dev) {
		System.out.println("un nouveau devoir à été ajouté dans l'enseignement de "+ dev.gentEns().getNom() );
		devoir_a_rendre.add(dev);
	}
	

}
