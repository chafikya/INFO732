
public class TD extends Cours{
	String type= "TD";
	public TD(Semaine sem) {
		super();
		sem.addCours(this);
	}
	public String getType() {
		return type;
	}

}
