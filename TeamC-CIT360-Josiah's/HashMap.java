package WeekTwo;

import java.util.HashMap;

public class CollectionsHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<Integer, String> hashMap = new Hashmap<Integer, String>();
		HashMap<String, Integer> player = new HashMap<String, Integer>();
		
		player.put("Riley", 2);
		
		System.out.println(player.get(0));
		
		//Finding array size
		Integer size = 0;
		if(!player.isEmpty()){
			size = player.size();
		}
		System.out.println(size);
		
		//Clone The ArrayList
		HashMap<String, Integer> user = (HashMap<String, Integer>) player.clone();
		System.out.println(user);
		
		if(player.containsKey("Riley")){
			System.out.println("it is in the HashMap");
		}
		else {
			System.out.println("not in there");
		}
		//Finds at what index point the element is at
		System.out.println("element 2 is found in index" + user.get("Riely"));
		
		
		//Removes everything in the ArrayList
		player.clear();
		//Display what is in the user list
		System.out.println(user);
	

	}

}
