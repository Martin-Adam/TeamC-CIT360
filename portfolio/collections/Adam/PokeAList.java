package pokeCollect;

import java.util.ArrayList;

public class PokeAList {
	public static void main(String[] args) {
		ArrayList<String> pokemon = new ArrayList<String>();
		
		//add a element to the list
		pokemon.add("Pikachu");
		
		Integer size = 0; 
		//isEmpty find if ArrayList is not empty
		if(!pokemon.isEmpty()){
			//size of the ArrayList
			size = pokemon.size();
		}
		System.out.println(size);
		
		//contains finds out if it does contain an item
		if(pokemon.contains("Pikachu")){
			System.out.println("It exists!");
		}
		else {
			System.out.println("It doesn't exist!");
		}
		
		//finds the first occurrence of the asked item
		Integer test = pokemon.indexOf("Pikachu");
		System.out.println(test);
		
		//finds the last occurrence of the asked item
		test = pokemon.lastIndexOf("Pikachu");
		System.out.println(test);
		
		//clones pokemon ArrayList into another Array List
		ArrayList<String> clonePoke = (ArrayList<String>) pokemon.clone();
		System.out.println(clonePoke);
		
		//puts the elements from the array list into an array
		Object[] pokeList = pokemon.toArray();
		System.out.println(pokeList[0]);
		
		//gets the requested element based on index
		String element = pokemon.get(0);
		System.out.println(element);
		
		//changes the index to a new name and returns the old element
		element = pokemon.set(0, "Charmander");
		System.out.println(element);
		
		element = pokemon.get(0);
		System.out.println(element);
		
		//trimToSize cuts the max size to the current list size
		pokemon.trimToSize();
		
		//ensureCapacity increases the minimum capacity of the list
		pokemon.ensureCapacity(3);
		
		//removes the element from the list
		if(pokemon.remove(0) != null){
			System.out.println("Element removed");
		}
		else{
			System.out.println("nothing to remove");
		}
		
	}
}
