package PokeJSON;

import java.io.Serializable;
//this is the bean
public class PokeStore implements Serializable {
	private String pokemon;
	
	public PokeStore() {
		pokemon = "";
	}
	
	public String getPokeName() {
		return pokemon;
	}
	
	public void setPokeName(String name) {
		pokemon = name;
	}
	
}
