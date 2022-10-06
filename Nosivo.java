package revija;

import revija.Velicina.Oznaka;

public abstract class Nosivo {

	protected String naziv="";
	protected Velicina vel;
	
	Nosivo(String s,Velicina v){
		this.naziv=s;
		this.vel=v;
	}
	
	public boolean odgovara(Model m) {
		switch (this.vel.dohvOznaku()) {
		case L:
			return true;
		case M:
			if(m.dohvVelicinu().dohvOznaku().equals(Oznaka.M) || m.dohvVelicinu().dohvOznaku().equals(Oznaka.S)) {
				return true;
			}
			return false;
		case S:
			if(m.dohvVelicinu().dohvOznaku().equals(Oznaka.S)) {
				return true;
			}
			return false;
		default:
			return false;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("odeæa ");
		sb.append(this.naziv);
		sb.append(" ");
		sb.append(this.vel);
		return sb.toString();
	}

	

	
}
