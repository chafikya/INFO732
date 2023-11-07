
public class Enseignement {
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

}
