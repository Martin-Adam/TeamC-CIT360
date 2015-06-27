package TestJSON;

import java.io.Serializable;
// set the main object to be manipulated which will store the JSON
public class TestStore implements Serializable {
	private String answer;
	
	public TestStore() {
		answer = "";
	}
	
	public String getTestName() {
		return answer;
	}
	
	public void setTestName(String name) {
		answer = name;
	}
	
}
