
public class Devoir {
	private String sujet;
	private String titre;
	private Enseignement ens;
	
	public Devoir(Enseignement enseignement, String un_titre, String un_intitule ) {
		ens= enseignement;
		titre= un_titre;
		sujet = un_intitule;
	}
	
	public String getSujet() {return sujet;}
	public String getTitre() {return titre;}
	public Enseignement gentEns() {return ens;}

}
