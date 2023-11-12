
public class CM extends Cours{
	String type ="CM";
	public CM(Semaine sem) {
		super();
		sem.addCours(this);
	}
	public String getType() {
		return type;
	}

}
