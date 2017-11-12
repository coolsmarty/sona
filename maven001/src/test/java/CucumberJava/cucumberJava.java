package CucumberJava; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import cucumber.annotation.en.Given; 
//import cucumber.annotation.en.Then; 
//import cucumber.annotation.en.When; 

public class cucumberJava { 
   WebDriver driver = null; 
	
   @Given("^I have open the browser$") 
   public void openBrowser() { 
      driver = new FirefoxDriver(); 
   } 
	
   @When("^I open Facebook website$") 
   public void goToFacebook() { 
      driver.navigate().to("https://www.facebook.com/"); 
     // WebDriver driver=new FirefoxDriver();
      File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
      try {
      FileUtils.copyFile(src, new File("C:/selenium/erroryy.png"));
      }
      catch (IOException e)
      {
    	  System.out.println("yyyerroyyy");
      }
   } 
	
   @Then("^Login button should exits$") 
   public void loginButton() { 
      if(driver.findElement(By.id("u_0_v")).isEnabled()) { 
         System.out.println("Test 1 Pass"); 
      } else { 
         System.out.println("Test 1 Fail"); 
      } 
      driver.close(); 
   } 
}
