
public class Test {

	public static void main (String[] args) {
		//creation des étudiants
		Etudiant a= new Etudiant("Gianmarco"); 
		Etudiant b= new Etudiant ("Gianluca");
		Etudiant c = new Etudiant("Gianfranco");
		Etudiant d = new Etudiant("Gianni");
		//création des Enseignements
		Enseignement maths= new Enseignement("Maths", 5, 5, 5);
		System.out.println(maths.getNbHeuresTD());
	}
}
