import java.util.ArrayList;
public class Test {

	public static void main (String[] args) {
		//creation année
		AnneeFactory fact = new AnneeFactory();
		Annee annee = fact.createAnne();
		Semaine sem1 = annee.mois.get(0).sem.get(0);
		//creation des étudiants
		Etudiant a= new Etudiant("Gianmarco"); 
		Etudiant b= new Etudiant ("Gianluca");
		Etudiant c = new Etudiant("Gianfranco");
		Etudiant d = new Etudiant("Gianni");
		//création des Enseignements
		Enseignement maths= new Enseignement("Maths", 5, 5, 5);
		//System.out.println(maths.getNbHeuresTD());
		Cours cour1 = new CM(sem1);
		Cours cour2 = new TD(sem1);
		Cours cour3 = new TP(sem1);
		Cours cour4 = new CM(sem1);
		Cours cour5 = new CM(sem1);
		Cours cour6 = new CM(sem1);
		Cours cour7 = new CM(sem1);
		Cours cour8 = new CM(sem1);
		System.out.println("il y a "+ sem1.getChargeTravail() +" cours dans la semaine");
		
		// 
	}
}
