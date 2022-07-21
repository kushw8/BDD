package StepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PriceCheckDefination {

	private WebDriver webDriver;

	@Given("user is on the home page after login process after entering \"([^\"]*)\" and \"([^\"]*)\"")
	public void user_is_on_the_home_page_after_login_process_after_entering_and(String string, String string2) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		webDriver = new FirefoxDriver();
		webDriver.get("https://www.odoo.com/web/login");

		webDriver.findElement(By.xpath("//input[@id='login']")).sendKeys(string);
		webDriver.findElement(By.xpath("//input[@id='password']")).sendKeys(string2);

		webDriver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@When("Oddo is the ppage title")
	public void oddo_is_the_ppage_title() {
		String title = webDriver.getTitle();
		System.out.println("Home Page title ::" + title);
		Assert.assertEquals("Databases | Odoo", title);
	}

	@Then("user clicks on price text")
	public void user_clicks_on_price_text() {

		webDriver.findElement(By.xpath("//a[contains(text(),'Pricing')]")).click();

	}

	@Then("user gets the price and check the discount")
	public void user_gets_the_price_and_check_the_discount() {

		String discount = webDriver
				.findElement(
						By.xpath("//b[@class='openerp_enterprise_pricing_users_price_discount_yearly text-success']"))
				.getText();

		System.out.println(discount);

	}

}
