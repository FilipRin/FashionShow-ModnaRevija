package revija;

public class Model {
	
	private static int br=0;
	private int id;
	private Velicina vel;
	
	public Model(Velicina v) {
		id=br;
		br++;
		this.vel=v;
	}
	
	public int dohvId() {
		return id;
	}
	
	public Velicina dohvVelicinu() {
		return vel;
	}
	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("Model ");
		sb.append(this.id);
		sb.append(" (");
		sb.append(this.vel);
		sb.append(")");
		return sb.toString();
	}
	
}
