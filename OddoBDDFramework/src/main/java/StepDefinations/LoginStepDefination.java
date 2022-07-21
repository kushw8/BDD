//package StepDefinations;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//
//public class LoginStepDefination {
//	
//	public WebDriver webDriver;
//	
//	@Given("^user is already on Login Page$")
//	public void user_is_already_on_Login_Page() {
//		 System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
//	     webDriver = new FirefoxDriver();
//	     webDriver.get("https://www.odoo.com/web/login");
//	}
//
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM()  {
//	    String titlElement = webDriver.getTitle();
//	    System.out.println(titlElement);
//	     Assert.assertEquals("Login | Odoo", titlElement);
//	}
//
//	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and(String arg1, String arg2)  {
//	   webDriver.findElement(By.xpath("//input[@id='login']")).sendKeys(arg1);
//	   webDriver.findElement(By.xpath("//input[@id='password']")).sendKeys(arg2);
//    }
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button()  {
//	   webDriver.findElement(By.xpath("//button[@type='submit']")).click();
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page()  {
//		String title = webDriver.getTitle();
//    	System.out.println("Home Page title ::"+ title);
//	    Assert.assertEquals("Databases | Odoo", title);
//	}
//
//	@Then("^Close the browser$")
//	public void close_the_browser() {
//	   webDriver.close();
//	}
//
//
//
//}
