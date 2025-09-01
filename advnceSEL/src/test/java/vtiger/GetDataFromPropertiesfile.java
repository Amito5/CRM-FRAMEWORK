package vtiger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromPropertiesfile {

	public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("D:\\JAVA\\advnceSEL\\src\\test\\java\\resource\\commondata.properties");
    Properties pobj = new Properties();
    pobj.load(fis);
    String BROWSER = pobj.getProperty("bro");
	String URL = pobj.getProperty("url");
	String USERNAME = pobj.getProperty("un");
	String PASSWORD = pobj.getProperty("pwd");
	
	System.out.println(BROWSER);
	System.out.println(URL);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);

    

	}

}
