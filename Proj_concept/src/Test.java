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
		Enseignement maths= new Enseignement("Maths", 5, 5, 5); //nom enseignement, nombre seanceTD, nombre seanceTP, nombre de CM
		//ajout etudiant à un Enseignement
		maths.addEtudiant(a);
		maths.addEtudiant(b);
		maths.addEtudiant(c);
		// on créee des controles
		maths.addControle(2, "5 juillet 2005");// coef, date
		maths.addControle(2, "5 janvier 230");
		maths.addControle(2, "5 mai 1968");
		maths.addControle(2, "5 fevrier 2001");
		
		//on ajoute des notes aux étudiants pour les controle
		maths.addNote(a, maths.getListeControle().get(0), 10);
		maths.addNote(b, maths.getListeControle().get(0), 11);
		maths.addNote(c, maths.getListeControle().get(0), 12);
		
		maths.addNote(a, maths.getListeControle().get(1), 10);
		maths.addNote(b, maths.getListeControle().get(1), 11);
		maths.addNote(c, maths.getListeControle().get(1), 12);
		
		maths.addNote(a, maths.getListeControle().get(2), 10);
		maths.addNote(b, maths.getListeControle().get(2), 11);
		maths.addNote(c, maths.getListeControle().get(2), 12);
		
		maths.addNote(a, maths.getListeControle().get(3), 10);
		maths.addNote(b, maths.getListeControle().get(3), 11);
		maths.addNote(c, maths.getListeControle().get(3), 12);
		
		System.out.println(a.nom + "a eu " + maths.getMoyenne(a) + " de moyenne en " + maths.getNom());
		
		
		//ajoout d'un devoir à l'enseignement
		
		maths.addDevoir("titre", "sujet");
		
		// on ajoute
		
		//System.out.println(maths.getNbHeuresTD());
		Cours cour1 = new CM(sem1);
		Cours cour2 = new TD(sem1);
		Cours cour3 = new TP(sem1);
		Cours cour4 = new CM(sem1);
		Cours cour5 = new CM(sem1);
		Cours cour6 = new CM(sem1);
		Cours cour7 = new CM(sem1);
		Cours cour8 = new CM(sem1);
		System.out.println("il y a "+ sem1.getChargeTravail()[0] +" cours dans la semaine dont " + sem1.getChargeTravail()[1]+ " CM "+ sem1.getChargeTravail()[2] +" TD " + sem1.getChargeTravail()[3] +" TP");
		
		// 
	}
}
