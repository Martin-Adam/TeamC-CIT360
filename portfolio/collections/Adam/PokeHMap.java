package pokeCollect;

import java.util.HashMap;

public class PokeHMap {
	public static void main(String[] args) {
		HashMap<Integer, String> llama = new HashMap<Integer, String>();

		//puts a key and a string into the map
		llama.put(1, "Tina");
		
		Integer size = 0;
		//find out if not empty
		if (!llama.isEmpty()){
			//find out size
			size = llama.size();
		}
		System.out.println(size);
		
		//get name out of map
		String theLlama = llama.get(1);
		System.out.println(theLlama);
		
		String hasKey;
		//finds a key
		if(llama.containsKey(1)){
			hasKey = "Yes it contains that key";
		}
		else {
			hasKey = "No it doesn't contains that key";
		}
		System.out.println(hasKey);
		
		HashMap<Integer, String> pokemon = new HashMap<Integer, String>();
		
		//puts a map into a different map
		pokemon.putAll(llama);
		
		//removes the found object
		String removedValue = llama.remove(1);
		System.out.println(removedValue);
		
		//deletes full data
		pokemon.clear();
		
		//puts a key and a string into the map if it is not already there
		//returns null if nothing was there before
		String inserting = llama.putIfAbsent(1, "Tina");
		System.out.println(inserting);
		
		//test to see if inserted
		theLlama = llama.get(1);
		System.out.println(theLlama);
		
		
		//finds what keys the value are related to
		boolean testing = llama.containsValue("Tina");
		System.out.println(testing);
		
		//gets the value or sets it to default that I set if no value is found
		String whatwasinserted = llama.getOrDefault(2, "Pikachu");
		System.out.println(whatwasinserted);
		
		//replaces all keys that are 1 with every place that Tina is called
		//and changes it to Charmander
		boolean wasvaluereplaced =llama.replace(1, "Tina", "Charmander");
		System.out.println(wasvaluereplaced);
		
		//clones an empty shell of llama
		HashMap<Integer, String> newLlama = (HashMap<Integer, String>) llama.clone();
		
		//boolean isitempty = llama.isEmpty();
		System.out.println(newLlama);
		
	}	
}
