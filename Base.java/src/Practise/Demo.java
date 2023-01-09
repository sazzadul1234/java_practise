package Practise;

import org.openqa.selenium.WebDriver;

public class Demo {

	public static void main(String[] args) {
		WebDriver driver= Base.getDriver();
        
        driver.get("https://www.facebook.com/");
	}

}
