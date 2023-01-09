package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Test {
    public static void main(String[] args) throws InterruptedException  {
          WebDriver driver= Base.getDriver();
        
          driver.get("http://staging.egp.gov.bt/");
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         Thread.sleep(1000);
         
         //  *** REQUEST FROM BIDDER FOR REGISTRATION *** 
         
    /*     driver.findElement(By.xpath("//*[@id=\"button2\"]")).click();
         driver.findElement(By.name("emailId")).sendKeys("bidder.demo@dtec.com"); // *** from XL
         driver.findElement(By.name("password")).sendKeys("egp12345");           // *** from XL
         driver.findElement(By.name("confirmPassWord")).sendKeys("egp12345");   // *** from XL
      // selecting Hint Question
         Select HQ = new Select( driver.findElement(By.id("cmbHintQue")));
         HQ.selectByValue("What is your  favourite color ?");
          
         driver.findElement(By.name("hintAnswer")).sendKeys("Red");
         
         // Selecting Nationality
         Select NT = new Select( driver.findElement(By.id("cmbNational")));
         NT.selectByValue("Angolan");   // *** from XL
          
         // Selecting REG TYPE
          
         Select RT = new Select( driver.findElement(By.name("registrationType")));
         RT.selectByValue("contractor");   // *** from XL
         Thread.sleep(1000);
        // driver.switchTo().alert().accept();
         driver.findElement(By.id("popup_ok")).click();
         
         //selecting Business country
         
         Select Bis_country = new Select( driver.findElement(By.name("businessCountryName1")));
         Bis_country.selectByValue("Antarctica");
         
         driver.findElement(By.id("chkAgree")).click();
         driver.findElement(By.id("btnSubmit")).click();
         */
         
         
         
         
       /*  
         // get ID from TXT
         File text = new File("C:\\Users\\Laptop\\eclipse-workspace\\Id.txt");
         Scanner e_id = new Scanner(text);
         System.out.println(e_id.nextLine());
         String stid=e_id.nextLine();
         */
 //Login By Bidder
          
            driver.findElement(By.id("txtEmailId")).sendKeys("bidder.demo@dtec.com");
           // email_box.sendKeys(stid);
            driver.findElement(By.id("txtPassword")).sendKeys("egp12345");
         
            driver.findElement(By.id("btnLogin")).click();
            /*
// select country 
            
            Select value1 =new Select(driver.findElement(By.xpath("//*[@id=\"cmbOrgCountry\"]")));
            value1.selectByValue("185");
//license no
            driver.findElement(By.id("licenseNo")).sendKeys("124574584512");
//company name
             // ** problem ** // 
            WebElement ComName =  driver.findElement(By.id("txtCompName"));
            ComName.click();
            Thread.sleep(2000);
            //  ComName.click();
            ComName.sendKeys("TestAuto Company");
            Thread.sleep(1000);
          
 // company status
           
          Select com_status =new Select(driver.findElement(By.id("cmbLegal")));
          com_status.selectByValue("public"); 
  //  stablish year
          
          driver.findElement(By.id("txtComYear")).sendKeys("2000");
          
   //select categories    *** Need to modify
          
          driver.findElement(By.id("goodschk")).click();
          driver.findElement(By.id("serviceschk")).click();
          driver.findElement(By.id("consultingchk")).click();
   //reg office address 
          driver.findElement(By.id("txtaRegAddr")).sendKeys("Automation office");
          
   //select country Reg office
          
          
         Select select_country =new Select(driver.findElement(By.xpath("//*[@id=\"cmbRegCountry\"]")));
         select_country.selectByValue("176");
          
    // Mobile Number Reg office
         
         driver.findElement(By.id("txtregOffMobileNo")).sendKeys("12457845");
         
         
  // Corporate office information
         
         driver.findElement(By.id("txtaCorpAddr")).sendKeys("Automation office");
         
 // select corporate office country
         
         Select select_corCountry =new Select(driver.findElement(By.id("cmbCorpCountry")));
         select_corCountry.selectByValue("176");
         
    // mobile cor office
         
         driver.findElement(By.id("txtcorpOffMobileNo")).sendKeys("12457845");
         
         driver.findElement(By.id("btnSave")).click();
         
     */  
            
            
    /*        
         
      //  *** company contract person ***
            
          // Country
         
           Select select_ConPerCountry =new Select(driver.findElement(By.id("cmbCountry")));
           select_ConPerCountry.selectByValue("176");
          
           // CID
           
          driver.findElement(By.id("cidNo")).sendKeys("1245784512"); 
      
          //user type 
          
          Select userType= new Select(driver.findElement(By.id("cmbUserType")));
          userType.selectByValue("1");
          
          // Title 
          
          Select title= new Select(driver.findElement(By.id("cmbTitle")));
          title.selectByValue("Mr.");
          
          // Name
          
          driver.findElement(By.id("txtFirstName")).sendKeys("Md. Sazzadul");
          driver.findElement(By.id("txtMiddleName")).sendKeys("Islam");
          
          // designation
  
          driver.findElement(By.id("txtDesig")).sendKeys("Owner");

          // address
          driver.findElement(By.id("txtaAddr1")).sendKeys("Test address");
          
          //dzongkha
         // Select dgongkha= new Select(driver.findElement(By.xpath("//*[@id=\"cmbState\"]")));
          //dgongkha.selectByValue("Gasa");
          
          //email
          driver.findElement(By.id("txtEmail")).sendKeys("szd@dtec.bd");
          
          //mobile
          driver.findElement(By.id("txtMob")).sendKeys("12457845");
          //save
          driver.findElement(By.id("btnSave")).click();
          
          */
            
            // upload doc and submit
            
          
          
          
    }
}



























