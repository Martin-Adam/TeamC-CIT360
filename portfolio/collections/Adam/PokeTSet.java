package pokeCollect;

import java.util.TreeSet;

public class PokeTSet {
	public static void main(String[] args) {
		TreeSet<String> pokemon = new TreeSet<String>();
		
		//adds strings to the TreeSet
		pokemon.add("Pikachu");
		pokemon.add("Charmander");
		pokemon.add("Bulbasaur");
		pokemon.add("Squirtle");
		
		//display TreeSet
		System.out.println(pokemon);
		
		//display TreeSet in descending order
		System.out.println(pokemon.descendingSet());
		
		//displays size of TreeSet
		System.out.println(pokemon.size());
		
		//finds out if it is empty
		if(pokemon.isEmpty()){
			System.out.println("It is empty!");
		}
		else{
			System.out.println("Not Empty!");
		}
		
		//finds out if it contains llama
		if(pokemon.contains("Llama")){
			System.out.println("It exists!");
		}
		else{
			System.out.println("It doesn't exist!");
		}
		
		//finds element and removes it if its there 
		if(pokemon.remove("Bulbasaur")){
			System.out.println("It was removed");
		}
		else {
			System.out.println("It doesn't exist");
		}
		
		//returns the lowest element
		System.out.println(pokemon.first());
		
		//returns the highest element
		System.out.println(pokemon.last());
		
		//returns element before the five number
		System.out.println(pokemon.lower("Pikachu"));
		
		TreeSet<String> cloned = (TreeSet<String>) pokemon.clone();
		
		//clears the TreeSet
		System.out.println(pokemon);
		pokemon.clear();
		System.out.println(pokemon);
		
		System.out.println(cloned);
	}
	
}
