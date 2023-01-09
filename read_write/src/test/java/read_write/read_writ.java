package read_write;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class read_writ {

	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		FileInputStream input =new FileInputStream("C:\\Users\\Laptop\\eclipse-workspace\\read_write\\src\\test\\resources\\properties\\test_data.properties");
		prop.load(input);
		
		String st1= prop.getProperty("browser");
		String st2= prop.getProperty("url");
		String st3= prop.getProperty("ID");
		String st4= prop.getProperty("pass");
		
		
		
	}

}
