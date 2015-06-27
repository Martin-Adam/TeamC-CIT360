package Http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

public class TestData {

	public void getTestData() {
        try {
        	// this sends an HTTP request to get my Website and returns the HTML text
        	  URL url = new URL("http://www.jeremypratt.info");
        	  HttpURLConnection con = (HttpURLConnection) url
        	    .openConnection();
        	  readStream(con.getInputStream());
        	  } catch (Exception e) {
        	  e.printStackTrace();

            }
        }
        private void readStream(InputStream in) {
        	  BufferedReader reader = null;
        	  try {
        	    reader = new BufferedReader(new InputStreamReader(in));
        	    String line = "";
        	    while ((line = reader.readLine()) != null) {
        	      System.out.println(line);
        	    }
        	  } catch (IOException e) {
        	    e.printStackTrace();
        	  } finally {
        	    if (reader != null) {
        	      try {
        	        reader.close();
        	      } catch (IOException e) {
        	        e.printStackTrace();
        	        }
        	    }
        	  }
        	} 

    }
