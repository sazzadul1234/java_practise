package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Corrigendum {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriver driver= Base.getDriver();
	        
         driver.get("http://staging.egp.gov.bt/");
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         Thread.sleep(1000);
        
         //Login By PA
         driver.findElement(By.id("txtEmailId")).sendKeys("Pa.szd2020@gmail.com");
         driver.findElement(By.id("txtPassword")).sendKeys("egp12345");
         driver.findElement(By.id("btnLogin")).click();
         
         // search a Live tender which to be changed
           
         WebElement tender = driver.findElement(By.id("headTabTender"));
         Actions actions = new Actions(driver);
         actions.moveToElement(tender).perform();
         driver.findElement (By.xpath("//*[@id=\"ddsubmenu2\"]/li[2]/a")).click();
         driver.findElement(By.xpath("//*[@id=\"collExp\"]")).click(); // advance search
         driver.findElement(By.id("tenderId")).sendKeys("553"); //insert TID
         driver.findElement(By.id("liveTab")).click();
         driver.findElement(By.id("btnSearch")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[7]/a/img")).click(); //click on dashboard
         
         // Got o corrigendum Tab
         
         driver.findElement(By.xpath("//*[@id=\"offTabPanel\"]/li[7]/a")).click();
         
         driver.findElement(By.xpath("/html/body/div[3]/div[5]/div/table/tbody/tr[1]/td[3]/a")).click();
         
         //driver.findElement(By.xpath("/html/body/p/br")).sendKeys("text"); // need to discuss
         
         
         driver.switchTo().frame(driver.findElement(By.cssSelector(".cke_wysiwyg_frame")));
         driver.findElement(By.cssSelector(".cke_editable")).sendKeys(" Corregendum Text which to be Amended");
         driver.switchTo().defaultContent();
          
          driver.findElement(By.id("btnPerpareAmendment")).click();
         
          driver.findElement(By.id("btnsubmit")).click();
         

	}

}
