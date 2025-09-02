package ExtractData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		//GET JAVA REPRESENTATION OBJECT OF PHYSICAL FILE
		FileInputStream fis = new FileInputStream("D:\\JAVA\\CRM-FRAMEWORK\\src\\main\\resources\\Data\\commondata.properties");
		
		//Load all keys by using load()
		Properties pObj=new Properties();
		pObj.load(fis);
		
		//get the value by passing the keys
		
		String BROWSER=pObj.getProperty("bro");
		String URL=pObj.getProperty("url");
		String USERNAME=pObj.getProperty("un");
		String PASSWORD=pObj.getProperty("pwd");
		
	System.out.println(BROWSER);
	System.out.println(URL);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
		

	}
	



	}


