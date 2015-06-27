package socketPoke;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import org.quickconnectfamily.json.JSONInputStream;

public class PokeInfo {

	private HashMap readUrl(String urlString) throws Exception {

        JSONInputStream inFromURL = null;
        Object in;

        try {

            URL url = new URL(urlString);
            inFromURL = new JSONInputStream(url.openStream());
            in = inFromURL.readObject();
            HashMap pokeInfo = (HashMap) in;

            return pokeInfo;

        } finally {

            if (inFromURL != null) {

                inFromURL.close();

            }

        }

    }

    public String getPokeInfo(Integer pokeNumber) {

        HashMap pokeType;
        ArrayList pokeList;
        Integer numTypes;

        try {
            HashMap pokeURL = readUrl("http://pokeapi.co/api/v1/pokemon/" + pokeNumber + "/");
            pokeList = (ArrayList) pokeURL.get("evolutions");
            numTypes = pokeList.size();

            String message = "Pokemon Number:" + " " + pokeURL.get("national_id")
            		+ "\nName: " + " " + pokeURL.get("name");

            for (int i = 0; i < numTypes; i++) {

                pokeType = (HashMap) pokeList.get(i);
                
                if (pokeType.get("level") != null){
                	message += "\nEvolution: " + pokeType.get("to") + " at level " + pokeType.get("level");
                }
                return message;
            }

        } catch (Exception e) {
        	String error = "";
            if (pokeNumber > 718 || pokeNumber < 0) {
            	if (pokeNumber > 9000){
            		error += "It's over 9000!!!";
            	}
            	error += "Please select a number between 1 and 718.\n";
            }
            else {
            	error += "That pokemon doesn't evolve";
            }
            return error;
        }
        return "nothing";

    }
}
