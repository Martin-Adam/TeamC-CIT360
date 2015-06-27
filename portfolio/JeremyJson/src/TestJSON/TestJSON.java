package TestJSON;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;

import java.util.HashMap;

public class TestJSON {
	public static void main(String[] args) {
		TestStore answer = new TestStore();
		TestFile file = new TestFile();
		try {
			String json = "{\"string\":\"42\"}";
			HashMap testMap = (HashMap)JSONUtilities.parse(json);
			String teststring = (String) testMap.get("string");
			answer.setTestName(teststring);
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
