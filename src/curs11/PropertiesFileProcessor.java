package curs11;

import java.io.*;
import java.util.Properties;
public class PropertiesFileProcessor {

	public void writePropertiesFile() {
	    
		    try (FileOutputStream outPutStream= new FileOutputStream("test.properties")){
			
		    	Properties propFile = new Properties();
		    	propFile.setProperty("user", "admin123");
		    	propFile.setProperty("pass", "admin123");
		    	propFile.setProperty("email", "admin@admin.com");
		    	
		    	propFile.store(outPutStream, "am salvat fisierul");
		        //outPutStream.close();
		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    public void readPropertiesFile(String key) {
		    try (FileIntupStream inputStream= new FileInputStream("test.properties")){
		    	Properties propFile = new Properties();
		    	propFile.load(inputStream);
		    	System.out.println(propFile.getProperty(key));
		    }catch(IOException e) {
		    	e.printStackTrace();
		    }
		    }
	
    
	}
}
