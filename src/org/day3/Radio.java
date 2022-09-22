package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium Day3\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://bazaar.shopclues.com");
	    WebElement select = driver.findElement(By.id("autocomplete"));
	    select.sendKeys("watch for girls");
	    WebElement first = driver.findElement(By.xpath("(//span[text()='watch for girls'])[1]"));
	    first.click();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   /* driver.get("https://www.snapdeal.com/");
	    WebElement first = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    first.sendKeys("iphone");
	    Thread.sleep(2000);
	    WebElement list = driver.findElement(By.xpath("//div[@data-index='1']"));
	    list.click();*/
	  /*  driver.get("http://adactinhotelapp.com/");
	    WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
	    user.sendKeys("Priyankapnr@gmail.com");
	    WebElement user1 = driver.findElement(By.xpath("//input[@type='text']"));
	    String attribute = user1.getAttribute("value");
	    System.out.println(attribute);
	    
	    WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	    pass.sendKeys("12345678");
	    WebElement pass1 = driver.findElement(By.xpath("//input[@type='password']"));
	    String attribute2 = pass1.getAttribute("value");
	    System.out.println(attribute2);
	    WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
	    login.click();*/
	    
	/*    driver.get("https://www.google.com/");
	    WebElement first = driver.findElement(By.xpath("//input[@type='text']"));
	    first.sendKeys("velmurugan greens technology");
	    WebElement search = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
	    search.click();
	    WebElement link = driver.findElement(By.xpath("//h3[text()='Velmurugan K - Technical Manager - GTL Limited - LinkedIn']"));
	    link.click();*/
	   
	   /* driver.get("https://www.facebook.com/");
	    WebElement find = driver.findElement(By.xpath("//input[@type='text']"));
	    find.sendKeys("Priyankapnr789@gmail.com");
	    WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
	    String attribute = email.getAttribute("value");
	    System.out.println(attribute);
	    WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	    pass.sendKeys("12345678");
	    WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	    String attribute2 = password.getAttribute("value");
	    System.out.println(attribute2);*/
	    
	    /*driver.get("http://www.greenstechnologys.com/");
	    //WebElement para = driver.findElement(By.xpath("//strong[text()='Greens Technology']"));
	    WebElement para = driver.findElement(By.xpath("//p[contains(text(),'Training and Placements')]"));
	    String text = para.getText();
	    System.out.println(text);*/
	    
	    /*driver.get("https://www.cleartrip.com/trains");
	    WebElement first = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	    first.sendKeys("chennai");
	    WebElement last = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    last.sendKeys("yelagiri");
	    WebElement date = driver.findElement(By.xpath("//input[@maxdate='5/11/2022']"));
	    date.sendKeys("9/7/2022");
	    WebElement selectdate = driver.findElement(By.xpath("//a[text()='9']"));
	    selectdate.click();
	    WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
	    search.click();*/

	    
	  /*  driver.get("https://www.redbus.in");
	    WebElement signin = driver.findElement(By.id("sign-in-icon-down"));
	    signin.click();
	    WebElement login = driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']"));
	    login.click();
	    Thread.sleep(5000);
	    WebElement phone = driver.findElement(By.xpath("/(//input[@class='IP'])[1]"));
	    phone.sendKeys("9962753714");*/
	    
 
	 /*   driver.get("http://greenstech.in/selenium-course-content.html");
	    WebElement inter = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
	    inter.click();
	    WebElement cts = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
	    cts.click();*/
	    
	   /*driver.get("http://demo.automationtesting.in/Register.html");
	    WebElement first = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	    first.sendKeys("priyanka");
	    WebElement last = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    last.sendKeys("kamaraj");
	    WebElement radio = driver.findElement(By.xpath("(//input[@name='radiooptions'])[2]"));
	    radio.click();
	    WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	    checkbox.click();
	    WebElement submit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
	    submit.click();*/
	    
	  /*  driver.get("https://www.amazon.in/");
	    WebElement option = driver.findElement(By.xpath("//input[@type='text']"));
	    option.sendKeys("iphone pro11");
	    WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
	    search.click();*/

	}

}
