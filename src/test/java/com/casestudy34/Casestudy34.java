package com.casestudy34;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Casestudy34 {
	WebDriver driver;
	@Given("^open online testmeapp$")
	public void open_online_testmeapp() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
				driver.manage().window().maximize();
				driver.findElement(By.cssSelector("a[href^='Register']")).click();

	}
	@When("^user dooesnot enter details and login$")
	public void user_dooesnot_enter_details_and_login() throws Throwable {
		driver.findElement(By.id("myInput")).sendKeys("head");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(10000);
	    
	}

	@Then("^try to add product$")
	public void try_to_add_product() throws Throwable {
		driver.findElement(By.linkText("Add to cart")).click();
	    String title = driver.getTitle();
	    Assert.assertTrue(title.contains("Login"));
	    
	}

	@When("^user enter valid details and click on login$")
	public void user_enter_valid_details_and_click_on_login() throws Throwable {
		driver.findElement(By.id("userName")).sendKeys("Lalitha");
	    driver.findElement(By.id("password")).sendKeys("password123");
	    driver.findElement(By.name("Login")).click(); 
	    
	}

	@When("^search a product with full name$")
	public void search_a_product_with_full_name() throws Throwable {
		driver.findElement(By.xpath("//input[@id=\"myInput\"]")).sendKeys("headphone");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	    
	}
	@Then("^click on payment$")
	public void click_on_payment1() throws Throwable {
		 driver.findElement(By.xpath("//a[@href=\"checkout.htm\"]")).click();
		 driver.findElement(By.xpath("//textarea[@id=\"add1\"]")).clear();
		 driver.findElement(By.xpath("//textarea[@id=\"add1\"]")).sendKeys("hyderabd");
		 driver.findElement(By.xpath("//input[@value=\"Proceed to Pay\"]")).click();
		 System.out.println("Payment page is loading");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/label")).click();
		driver.findElement(By.xpath("//a[@onclick=\"radioValue()\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("123457");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Pass@457");
		driver.findElement(By.xpath("//input[@value=\"LOGIN\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@457");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		WebElement expected = driver.findElement(By.xpath("html/body/b/section/div/div/div/div[2]/p"));
		Assert.assertEquals("Your order has been confirmed", expected.getText());
		driver.close();
		Assert.assertEquals(true,true);
	}
	@When("^user enter valid details$")
	public void user_enter_valid_details() throws Throwable {
		driver.findElement(By.id("userName")).sendKeys("Lalitha");
	    driver.findElement(By.id("password")).sendKeys("password123");
	    driver.findElement(By.name("Login")).click(); 
	    
	}

	@When("^search a product with single letter$")
	public void search_a_product_with_single_letter() throws Throwable {
		driver.findElement(By.xpath("//input[@id=\"myInput\"]")).sendKeys("h");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div/div[2]/center/a")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click(); 
	}
	@Then("^click on payments$")
	public void click_on_payment2() throws Throwable {
		 driver.findElement(By.xpath("//a[@href=\"checkout.htm\"]")).click();
		 driver.findElement(By.xpath("//textarea[@id=\"add1\"]")).clear();
		 driver.findElement(By.xpath("//textarea[@id=\"add1\"]")).sendKeys("hyderabd");
		 driver.findElement(By.xpath("//input[@value=\"Proceed to Pay\"]")).click();
		 System.out.println("Payment page is loading");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/label")).click();
		driver.findElement(By.xpath("//a[@onclick=\"radioValue()\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("123457");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Pass@457");
		driver.findElement(By.xpath("//input[@value=\"LOGIN\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@457");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		WebElement expected = driver.findElement(By.xpath("html/body/b/section/div/div/div/div[2]/p"));
		Assert.assertEquals("Your order has been confirmed", expected.getText());
	}
	@When("^enter the item \"([^\"]*)\" and click on findDetails$")
	public void login_and_enter_the_item_and_click_on_findDetails(String arg1) throws Throwable {
		driver.findElement(By.id("userName")).sendKeys("Lalitha");
	    driver.findElement(By.id("password")).sendKeys("password123");
	    driver.findElement(By.name("Login")).click(); 
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
		 System.out.println("Payment page is loading");
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
		
		

	}



}
