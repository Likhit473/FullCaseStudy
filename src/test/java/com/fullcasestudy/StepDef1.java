package com.fullcasestudy;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef1 {
	WebDriver driver;
	List<WebElement> links;
	int linkscount;
	@Given("^user should open signup page$")
	public void user_should_open_signup_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver.exe");
		 driver =new ChromeDriver();
		    driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		    driver.manage().window().maximize();
		    Thread.sleep(10000);  
		    driver.findElement(By.linkText("SignUp")).click();
	}

	@When("^user enters all details$")
	public void user_enters_all_details() throws Throwable {
		driver.findElement(By.id("userName")).sendKeys("Likhit");
		   driver.findElement(By.id("firstName")).sendKeys("kumar");
		   driver.findElement(By.id("lastName")).sendKeys("padarthi");
	       driver.findElement(By.id("password")).sendKeys("123456789");
	   	   driver.findElement(By.id("pass_confirmation")).sendKeys("123456789");
		   driver.findElement(By.xpath("//input[@value='Male']")).click();
		   driver.findElement(By.id("emailAddress")).sendKeys("vikramsingh@gmail.com");
		   driver.findElement(By.id("mobileNumber")).sendKeys("1234567890");
		   driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		   WebElement month=driver.findElement(By.className("ui-datepicker-month"));
		   Select s1=new Select(month);
		   s1.selectByVisibleText("Jan");
		   WebElement year=driver.findElement(By.className("ui-datepicker-year"));
		   Select s2=new Select(year);
		   s2.selectByVisibleText("1998");
		   driver.findElement(By.linkText("7")).click();
		   driver.findElement(By.id("address")).sendKeys("Vijayarai,Gandhinagar,Andhra");
		   Select sc = new Select(driver.findElement(By.id("securityQuestion")));
		   sc.selectByVisibleText("What is your Pet Name?");
		   driver.findElement(By.id("answer")).sendKeys("Snake");
			}

	@Then("^click on registaration able to see homepage$")
	public void click_on_registaration_able_to_see_homepage() throws Throwable {
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title,"Login");
		driver.close();
	}
	@Given("^open online testmeapp$")
	public void open_online_testmeapp() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
	    Thread.sleep(10000);
	    driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^lalitha gives valid username and valid password \"([^\"]*)\" \"([^\"]*)\"$")
	public void lalitha_gives_valid_username_and_valid_password(String arg1, String arg2) throws Throwable {
		
	    driver.findElement(By.id("userName")).sendKeys(arg1);
	    driver.findElement(By.id("password")).sendKeys(arg2);
	    driver.findElement(By.name("Login")).click(); 
	}

	@Then("^he is able to see his name and title is home page$")
	public void he_is_able_to_see_his_name_and_title_is_home_page() throws Throwable {
		String act=driver.findElement(By.cssSelector("ul.nav")).getText();
        String exp="Hi, Lalitha SignOut";
        Assert.assertEquals(exp,act);
        Assert.assertEquals(driver.getTitle(),"Home");
        System.out.println("Test is passed");
        driver.findElement(By.linkText("SignOut")).click();
        driver.close();
	}
	@Given("^open online testmeapp and login$")
	public void open_online_testmeapp_and_login() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver.exe");
		driver =new ChromeDriver();
	    driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	    driver.manage().window().maximize();
	    Thread.sleep(10000);
	    driver.findElement(By.linkText("SignIn")).click();
	    driver.findElement(By.id("userName")).sendKeys("Lalitha");
	    driver.findElement(By.id("password")).sendKeys("Password123");
	    driver.findElement(By.name("Login")).click(); 
	}

	
	@When("^enter the item \"([^\"]*)\" and click on findDetails$")
	public void enter_the_item_and_click_on_findDetails(String arg1) throws Throwable {
		driver.findElement(By.id("myInput")).sendKeys(arg1);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(10000);
	}

	@When("^he is able to see his product$")
	public void he_is_able_to_see_his_product() throws Throwable {
     String title = driver.getTitle();
     Assert.assertTrue(title.contains("Search"));
	} 

	@Then("^click on cart$")
	public void click_on_cart() throws Throwable {
		driver.findElement(By.linkText("Add to cart")).click();
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
			  
	}

	@Then("^Select bank and enter bank details$")
	public void select_bank_and_enter_bank_details() throws Throwable {
		 driver.findElement(By.xpath("//a[@href=\"checkout.htm\"]")).click();
		 driver.findElement(By.xpath("//textarea[@id=\"add1\"]")).clear();
		 driver.findElement(By.xpath("//textarea[@id=\"add1\"]")).sendKeys("hyderabd");
		 driver.findElement(By.xpath("//input[@value=\"Proceed to Pay\"]")).click();
		 System.out.println("Payment is done");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

	@Then("^click on payment$")
	public void click_on_payment() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/label")).click();
		driver.findElement(By.xpath("//a[@onclick=\"radioValue()\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("123457");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Pass@457");
		driver.findElement(By.xpath("//input[@value=\"LOGIN\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@457");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		WebElement expected = driver.findElement(By.xpath("html/body/b/section/div/div/div/div[2]/p"));
		Assert.assertEquals("Your order has been confirmed", expected.getText());
		Assert.assertEquals(true,true);
		driver.close();

	}
	
	@Given("^Logininto TestMeapp$")
	public void logininto_TestMeapp() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver.exe");
		driver =new ChromeDriver();
	    driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	    driver.manage().window().maximize();
	    Thread.sleep(10000);
	    driver.findElement(By.linkText("SignIn")).click();
	    driver.findElement(By.id("userName")).sendKeys("Lalitha");
	    driver.findElement(By.id("password")).sendKeys("Password123");
	    driver.findElement(By.name("Login")).click(); 
	    
	}

	@Then("^he is search for a product like headphones$")
	public void he_is_search_for_a_product_like_headphones() throws Throwable {
		
		driver.findElement(By.id("myInput")).sendKeys("Headphone");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
	    
	}

	@Then("^Try to proceed to payment without adding any item in the cart$")
	public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() throws Throwable {
	links = driver.findElements(By.tagName("a"));
	linkscount=links.size();
	System.out.println(linkscount);
	for (int i = 0; i < linkscount; i++) {
		System.out.println(links.get(i).getText());
	}
	}

	@When("^TestMe does not display the icon$")
	public void testme_does_not_display_the_icon() throws Throwable {
		Assert.assertFalse(links.contains("Add to Cart"));
	    System.out.println("Test is pass");
	    
	}
}
