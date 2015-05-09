package WeekTwo;

import java.util.ArrayList;

public class CollectionsArrayList {
	public static void main(String[] arges) {
		//Declare a new ArrayList
		ArrayList<Integer> player = new ArrayList<Integer>();
	
		player.add(2);
		
		System.out.println(player.get(0));
		
		//Finding array size
		Integer size = 0;
		if(!player.isEmpty()){
			size = player.size();
		}
		System.out.println(size);
		
		//Clone The ArrayList
		ArrayList<Integer> user = (ArrayList<Integer>) player.clone();
		System.out.println(user);
		
		if(player.contains(5)){
			System.out.println("it is in the array");
		}
		else {
			System.out.println("not in there");
		}
		//Finds at what index point the element is at
		System.out.println("element 2 is foudn in index" + user.indexOf(2));
		
		
		//Removes everything in the ArrayList
		player.clear();
		//Display what is in the user list
		System.out.println(user);
	}
}
