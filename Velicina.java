package revija;

public class Velicina {
	
	private Oznaka ozn;
	
	public static enum Oznaka{
		S,
		M,
		L
	};
	
	public Velicina(Velicina.Oznaka oz) {
		this.ozn=oz;
	}
	
	public Oznaka dohvOznaku() {
		return this.ozn;
	}
	
	public boolean manja(Velicina v) {
		Oznaka pom1=this.dohvOznaku();
		Oznaka zadata=v.dohvOznaku();
		if((pom1==Oznaka.S && zadata!=Oznaka.S)||(pom1==Oznaka.M && zadata==Oznaka.L)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append(this.ozn);
		return sb.toString();
	}
}
