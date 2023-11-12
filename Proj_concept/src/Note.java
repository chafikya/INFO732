
public class Note {
	private Etudiant et;
	private float note;
	public Note(Etudiant ets, float une_note) {
		et = ets;
		note = une_note;
	}
	public Etudiant getEt() {return et;}
	public float getNote() {return note;}

}
