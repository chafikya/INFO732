
public class TP extends Cours{
	String type = "TP";
	public TP(Semaine sem) {
		super();
		sem.addCours(this);
	}
	public String getType() {
		return type;
	}

}
