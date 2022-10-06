package revija;


public class Odeca extends Nosivo {

	//loader.loadClass(Nosivo);
	
	public Odeca(String s,Velicina v) {
		super(s,v);
		
	}

	public String dohvNaziv() {return this.naziv;}
	public Velicina dohvVelicinu() {return this.vel;}
	
	@Override
	public String toString() {
		return super.toString();
	}
	

}
