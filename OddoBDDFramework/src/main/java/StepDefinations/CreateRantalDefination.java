package StepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateRantalDefination {

	public WebDriver webDriver;

	@Given("^user comes on Login Page$")
	public void user_comes_on_login_page() {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		webDriver = new FirefoxDriver();
		webDriver.get("https://www.odoo.com/web/login");
	}

	@When("^title is Free CRM$")
	public void title_is_free_crm() {

		String titlElement = webDriver.getTitle();
		System.out.println(titlElement);
		Assert.assertEquals("Login | Odoo", titlElement);

	}

	@Then("^user enters Credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_credentials_and(String string, String string2) {

		webDriver.findElement(By.xpath("//input[@id='login']")).sendKeys(string);
		webDriver.findElement(By.xpath("//input[@id='password']")).sendKeys(string2);

	}

	@Then("^user hits login button$")
	public void user_hits_login_button() {
		webDriver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@When("^Title of page is Databases$")
	public void title_of_page_is_databases() {
		String title = webDriver.getTitle();
		System.out.println("Home Page title ::" + title);
		Assert.assertEquals("Databases | Odoo", title);
	}

	@Then("^User clicks on create button$")
	public void user_clicks_on_create_button() {
		webDriver.findElement(By.xpath("//a[@class='btn btn-primary ml-5 px-4']")).click();
	}

	@Then("^User clicks on Rental And hits contiune$")
	public void user_clicks_on_rental_and_hits_contiune() {
		webDriver
				.findElement(By.xpath(
						"/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]"))
				.click();
		webDriver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
	}

	@Then("^User fills \"([^\"]*)\" And clicks starts now$")
	public void user_fills_and_clicks_starts_now(String string) {
		webDriver.findElement(By.xpath("//input[@id='company-name']")).sendKeys(string);
		webDriver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("^user is on database page$")
	public void user_is_on_database_page() {

		String successMessage = "Databese is created";
		Boolean flag = webDriver.findElement(By.xpath("//img[@class='ml-lg-5']")).isDisplayed();
		Assert.assertTrue(successMessage, flag);
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		webDriver.close();
	}

}
