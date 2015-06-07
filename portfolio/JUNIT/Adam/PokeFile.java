package PokeJSON;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;

public class PokeFile {
	public void readFile(PokeStore pokemon){
		try {
            
            FileInputStream fileName = new FileInputStream(pokemon.getPokeName() + ".txt");
            
            JSONInputStream readFile = new JSONInputStream(fileName);
            
            Object stats = readFile.readObject();
            
            HashMap pokeMap = (HashMap) stats;
            
            System.out.println("This is the name stored in the file: " 
            + pokeMap.get("Pokemon Name:"));
        }
        
        catch (Exception e) {
            
            System.err.println(pokemon.getPokeName() + ".txt does not exist in our system.");
            
        }
	}
	public void writeFile(PokeStore pokemon) throws Exception{
		HashMap<String, Comparable> pokeMap = new HashMap();
		pokeMap.put("Pokemon Name:", pokemon.getPokeName());
		try {
            
            if (pokemon.getPokeName() == null) {
                
                throw new NullPointerException();
                
            }
            
            else {
            
                FileOutputStream fileName = new FileOutputStream(pokemon.getPokeName()+ ".txt");
            
                JSONOutputStream writeFile = new JSONOutputStream(fileName);
            
                writeFile.writeObject(pokeMap);
            
                System.out.println(pokemon.getPokeName() + " has been stored.");
            
            }
                
        }
        
        catch (NullPointerException npe) {
                
            System.err.println("Pokemon Name Can't be NULL");
            
        }
		
	}
}
