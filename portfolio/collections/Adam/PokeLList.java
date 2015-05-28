package pokeCollect;

import java.util.LinkedList;

public class PokeLList {
	public static void main(String[] args) {
		LinkedList<String> pokemon = new LinkedList<String>();
		
		//adds things to the LinkedList
		pokemon.add("Pikachu");
		pokemon.add("Charmander");
		pokemon.add("Bulbasaur");
		pokemon.add("Squirtle");
		
		//gets first element
		String element = pokemon.getFirst();
		System.out.println(element);
		
		//gets last element
		element = pokemon.getLast();
		System.out.println(element);
		
		//removes first element
		element = pokemon.removeFirst();
		System.out.println(element);
		
		//removes last element
		element = pokemon.removeLast();
		System.out.println(element);
		
		//adds to the front/first place
		pokemon.addFirst("Charizard");
		
		//adds to the last place
		pokemon.addLast("Venusaur");
		
		//finds out if its in the linked list
		if(pokemon.contains("Charmander")){
			System.out.println("It exists!");
		}
		else {
			System.out.println("Non-existant");
		}
		
		//find the size of the list
		Integer size = pokemon.size();
		System.out.println(size);
		
		//removes element from the linked list
		Boolean remove = pokemon.remove("Bulbasaur");
		if (remove == true){
			System.out.println("It was removed");
		}
		else {
			System.out.println("It doesn't exist");
		}
		
		//gets element from linked list
		element = pokemon.get(2);
		System.out.println(element);
		
		//changes element at location
		element = pokemon.set(2, "Charmeleon");
		System.out.println(element);
		
		//finds out the index for the element
		Integer index = pokemon.indexOf("Charmander");
		System.out.println(index);
		
		
	}
}
