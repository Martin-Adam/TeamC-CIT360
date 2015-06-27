package TestJSON;

import java.io.Serializable;
//this is the bean
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
