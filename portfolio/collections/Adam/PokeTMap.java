package pokeCollect;
import java.util.TreeMap;
public class PokeTMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> pokemon = new TreeMap<Integer, String>();
		
		//adds elements to the TreeMap
		pokemon.put(1, "Pikachu");
		pokemon.put(2, "Charmander");
		pokemon.put(3, "Bulbasaur");
		pokemon.put(4, "Squirtle");
		
		//size of TreeMap
		Integer size = pokemon.size();
		System.out.println(size);
		
		//find outs if the key is inside the map
		if(pokemon.containsKey(1)){
			System.out.println("It exists!");
		}
		else {
			System.out.println("Does not exist!");
		}
		
		//find outs if the value is inside the map
		if(pokemon.containsValue("Charmander")){
			System.out.println("It exists!");
		}
		else {
			System.out.println("Does not exist!");
		}
		
		//finds out what value is with the key index
		String getting = pokemon.get(1);
		System.out.println(getting);
		
		//returns lowest key in the map
		size = pokemon.firstKey();
		System.out.println(size);
		
		//returns highest key in the map
		size = pokemon.lastKey();
		System.out.println(size);
		
		//removes pokemon at the list
		String removed = pokemon.remove(4);
		System.out.println(removed);
		
		System.out.println(pokemon);
		
		//clones the map
		TreeMap<Integer, String> cloned = (TreeMap<Integer, String>) pokemon.clone();
		System.out.println(cloned);
		
		//erases the whole map
		cloned.clear();
		System.out.println(cloned);
		
		//shows in descending order
		System.out.println(pokemon.descendingMap());
		
		//shows equal to or below entered key
		System.out.println(pokemon.floorEntry(4));
		
		//shows equal to or below entered key
		System.out.println(pokemon.ceilingEntry(0));
		
		//displays lowest key value
		System.out.println(pokemon.firstEntry());
		
		//displays highest key value
		System.out.println(pokemon.lastEntry());
		
		//deletes lowest key entry
		System.out.println(pokemon.pollFirstEntry());		
		
		//deletes highest key entry
		System.out.println(pokemon.pollLastEntry());
		
		System.out.println(pokemon);
		
		System.out.println(pokemon.replace(2, "Charmander", "Charizard"));
	}
}
