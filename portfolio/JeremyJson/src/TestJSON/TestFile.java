package TestJSON;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;

public class TestFile {
	// set a funtion to read the file imported
	public void readFile(TestStore answer){
		try {
            // pulls in the JSON text
            FileInputStream testName = new FileInputStream(answer.getTestName() + ".txt");
            // sets as JSON to be read
            JSONInputStream readFile = new JSONInputStream(testName);
            
            Object stats = readFile.readObject();
            // maps the input to organize it for easy access
            HashMap testMap = (HashMap) stats;
            
            System.out.println("The answer to the question is: " 
            + testMap.get("Answer:"));
        }
        
        catch (Exception e) {
            
            System.err.println(answer.getTestName() + "answer does not exist in our system.");
            
        }
	}
	// write file to local storage
	public void writeFile(TestStore answer) throws Exception{
		HashMap<String, Comparable> testMap = new HashMap();
		testMap.put("Answer:", answer.getTestName());
		try {
            
            if (answer.getTestName() == null) {
                
                throw new NullPointerException();
                
            }
            
            else {
            
                FileOutputStream fileName = new FileOutputStream(answer.getTestName());
            
                JSONOutputStream writeFile = new JSONOutputStream(fileName);
            
                writeFile.writeObject(testMap);
            
                System.out.println(answer.getTestName() + " has been stored.");
            
            }
                
        }
        
        catch (NullPointerException npe) {
                
            System.err.println("There has to be an Answer!");
            
        }
		
	}
}
