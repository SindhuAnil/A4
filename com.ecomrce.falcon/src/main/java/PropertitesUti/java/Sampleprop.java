package PropertitesUti.java;

import java.io.FileInputStream;
import java.util.Properties;

public class Sampleprop {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\Sindhu\\Desktop\\Selenium\\commondata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String URL=pobj.getProperty("url");
		String UNAME=pobj.getProperty("username");
		String PASS=pobj.getProperty("password");
System.out.print(URL);
System.out.print(UNAME);
System.out.print(PASS);

	}

}
