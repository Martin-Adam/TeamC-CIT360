package PokeJSON;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;

import java.util.HashMap;

public class PokeJSON {
	public static void main(String[] args) {
		PokeStore pokemon = new PokeStore();
		PokeFile file = new PokeFile();
		try {
			String json = "{\"string\":\"Charmander\"}";
			HashMap pokeMap = (HashMap)JSONUtilities.parse(json);
			String pokestring = (String) pokeMap.get("string");
			pokemon.setPokeName(pokestring);
			System.out.println("HashMap JSON content: "+ json + "\nWhat is pulled from the Map: " 
			+ pokestring + "\nWhat is now set as Pokemon name: " + pokemon.getPokeName());
			file.writeFile(pokemon);
			file.readFile(pokemon);
			
			System.out.println("Bad Example:");
			pokemon.setPokeName(null);
			file.writeFile(pokemon);
			System.out.println("Won't write the file.");
			file.readFile(pokemon);
			System.out.println("Won't read it though.");
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
