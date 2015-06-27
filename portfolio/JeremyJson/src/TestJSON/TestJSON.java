package TestJSON;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;

import java.util.HashMap;

public class TestJSON {
	public static void main(String[] args) {
		TestStore answer = new TestStore();
		TestFile file = new TestFile();
		try {
			// hard set the JSON string to test functionality
			String json = "{\"string\":\"42\"}";
			HashMap testMap = (HashMap)JSONUtilities.parse(json);
			String teststring = (String) testMap.get("string");
			answer.setTestName(teststring);
			// print result as pulled from hash map
			System.out.println("The answer is: " + answer.getTestName());
			file.writeFile(answer);
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
