package revija;

import java.util.ArrayList;
import java.util.List;

public class Kombinacija {

	private int broj;
	
	List<Nosivo> odeca;
	
	public Kombinacija(int i) {
		this.broj=i;
		odeca=new ArrayList<>();
	}
	
	public void dodaj(Nosivo n) throws GDodavanje {
		if(odeca.size()<broj) {
			odeca.add(n);
		}
		else {
			throw new GDodavanje();
		}
	}
	
	public int dohvBrStvari() {
		return this.odeca.size();
	}
	
	public int dohvMaxBrStvari() {
		return this.broj;
	}
	
	public Nosivo dohvStvar(int i) throws GIndeks {
		if(i<odeca.size() && i>=0) {
			if(odeca.get(i) != null) {
				return odeca.get(i);
			}
			else throw new GIndeks();
		}
		else throw new GIndeks();
	}
	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("[");
		for(int i=0;i<odeca.size();i++) {
			if(i!=0) {
				sb.append(", ");
			}
			sb.append(odeca.get(i));
		}
		sb.append("]");
		return sb.toString();
	}
}
