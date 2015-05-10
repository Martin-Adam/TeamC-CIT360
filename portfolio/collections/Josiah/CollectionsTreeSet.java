package WeekTwo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;



public class CollectionsTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> player = new TreeSet<Integer>();
		
		player.add(2);
		
		System.out.println(((TreeSet) player).get(0));
		
		//Finding array size
		Integer size = 0;
		if(!player.isEmpty()){
			size = player.size();
		}
		System.out.println(size);
		
		//Clone The ArrayList
		TreeSet<Integer> user = (TreeSet<Integer>) player.clone();
		System.out.println(user);
		
		if(player.lastIndexOf(2)){
			System.out.println("it is in the TreeMap");
		}
		else {
			System.out.println("not in there");
		}
		//Finds at what index point the element is at
		System.out.println("element 2 is found in index" + user.get(2));
		
		
		//Removes everything in the ArrayList
		player.clear();
		//Display what is in the user list
		System.out.println(user);
	}

}
