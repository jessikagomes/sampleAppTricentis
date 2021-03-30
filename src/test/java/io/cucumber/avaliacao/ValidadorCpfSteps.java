package io.cucumber.avaliacao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ValidadorCpfSteps{
	
	public ValidadorCpfSteps() {
	    System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	    browser = new ChromeDriver();
	}
	
	public WebDriver browser;

	@Quando("que estou no site SampleApp Tricentis")
	public void que_estou_no_site_SampleApp_Tricentis() {
		browser.get("http://sampleapp.tricentis.com/101/app.php");
		browser.manage().window().maximize();
	}
	
	@Quando("seleciono uma opcao Make")
	public void seleciono_uma_opcao_Make() {
		browser.findElement(By.cssSelector("#make")).click();
		browser.findElement(By.cssSelector("#make>option:nth-child(3)")).click();
	}

	@Quando("seleciono o Model")
	public void seleciono_o_Model() {
		browser.findElement(By.cssSelector("#model")).click();
		browser.findElement(By.cssSelector("#model>option:nth-child(2)")).click();
	}

	@Quando("digito o Cylinder Capacity")
	public void digito_o_Cylinder_Capacity() {
		browser.findElement(By.cssSelector("#cylindercapacity")).sendKeys("100");
	}	

	@Quando("digito no campo Engine Performance")
	public void digito_no_campo_Engine_Performance() {
		browser.findElement(By.cssSelector("#engineperformance")).sendKeys("100");
	}	

	@Quando("seleciono Date of Manufacture")
	public void seleciono_Date_of_Manufacture() throws InterruptedException {
		browser.findElement(By.cssSelector("button#opendateofmanufacturecalender")).click();
		Thread.sleep(3000);
		browser.findElement(By.cssSelector(".ui-state-default.ui-state-hover")).click();
	}
	
	@Quando("seleciono Number of Seats")
	public void seleciono_Number_of_Seats() {
		browser.findElement(By.cssSelector("#numberofseats")).click();
		browser.findElement(By.cssSelector("select#numberofseats > option[value='4']")).click();
		browser.findElement(By.cssSelector("#numberofseats")).click();
	}

	@Quando("seleciono Right Hand Drive")
	public void seleciono_Right_Hand_Drive() throws InterruptedException {
		WebElement element = browser.findElement(By.cssSelector("input[id*='yes']"));
		Actions actions = new Actions(browser);
		actions.moveToElement(element).click().perform();
	}	

	@Quando("seleciono Number of Seats motorcycle")
	public void seleciono_Number_of_Seats_motorcycle() {
		browser.findElement(By.cssSelector("#numberofseatsmotorcycle")).click();
		browser.findElement(By.cssSelector("#numberofseatsmotorcycle > option[value='3']")).click();
		browser.findElement(By.cssSelector("#numberofseatsmotorcycle")).click();
	}

	@Quando("seleciono Fuel Type")
	public void seleciono_Fuel_Type() {
		browser.findElement(By.cssSelector("#fuel")).click();
		browser.findElement(By.cssSelector("#fuel option:nth-child(4)")).click(); 
	
	}
		
	@Quando("digito List Price [$]")
	public void digito_List_Price_$() {
		browser.findElement(By.cssSelector("#listprice")).sendKeys("500");
	}
	@Quando("digito License Plate Number")
	public void digito_License_Plate_Number() {
		browser.findElement(By.cssSelector("#licenseplatenumber")).sendKeys("abc123");
		
	}
	@Quando("digito Annual Mileage [mi]")
	public void digito_Annual_Mileage_mi() {
		browser.findElement(By.cssSelector("#annualmileage")).sendKeys("500");
	}

	@Entao("clico next")
	public void clico_next() {
		browser.findElement(By.cssSelector("#nextenterinsurantdata")).click();
	}

}