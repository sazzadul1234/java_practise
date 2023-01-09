package Practise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class input_from_text {

	public static void main(String[] args)throws IOException
	{
		
		File file = new File("C:\\Users\\Laptop\\Desktop\\test.txt");
		File file2 = new File("C:\\Users\\Laptop\\Desktop\\pass.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		BufferedReader br2 = new BufferedReader(new FileReader(file2)); 
		
		String st,st2; 
		st=br.readLine();
		st2=br2.readLine();
		//while ((st = br.readLine()) != null) 
		 //System.out.println(st); 
		
		
		
		
		 WebDriver driver=Base.getDriver();
	        
         driver.get("http://staging.egp.gov.bt/");
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         
         
 //Login By Bidder
            WebElement email_box=driver.findElement(By.id("txtEmailId"));
            email_box.sendKeys(st);
            WebElement enter_password=driver.findElement(By.id("txtPassword"));
            enter_password.sendKeys(st2);
            driver.findElement(By.id("btnLogin")).click();
		
	}

}
