import java.util.ArrayList;

public class Controle {
	private ArrayList<Note> notes = new ArrayList<Note>();
	private float coef;
	String date;
	
	public Controle(float un_coef, String une_date) {
		coef = un_coef;
		date = une_date;
	}
	
	public void addNote(Note note) {
		notes.add(note);
	}
	
	public float getCoef() {return coef;}
	
	public ArrayList<Note> getNotes() {return notes;}
	
	

}
