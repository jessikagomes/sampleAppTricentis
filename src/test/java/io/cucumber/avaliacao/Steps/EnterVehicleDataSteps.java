package io.cucumber.avaliacao.Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import io.cucumber.avaliacao.Servicos.Configuracao;
import io.cucumber.java.pt.*;

public class EnterVehicleDataSteps extends Configuracao{

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

	@Quando("digito o {} Capacity")
	public void digito_o_Capacity(String string) {
		browser.findElement(By.cssSelector("#cylindercapacity")).sendKeys(string);
	}	

	@Quando("digito no campo {} Performance")
	public void digito_no_campo_Engine_Performance(String string) {
		browser.findElement(By.cssSelector("#engineperformance")).sendKeys(string);
	}	

	@Quando("seleciono Date of Manufacture")
	public void seleciono_Date_of_Manufacture() throws InterruptedException {
		browser.findElement(By.cssSelector("button#opendateofmanufacturecalender")).click();
		Thread.sleep(2000);
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
		
	@Quando("digito List {}")
	public void digito_List(String string) {
		browser.findElement(By.cssSelector("#listprice")).sendKeys(string);
	}
	@Quando("digito {} Plate Number")
	public void digito_Plate_Number(String string) {
		browser.findElement(By.cssSelector("#licenseplatenumber")).sendKeys(string);
		
	}
	@Quando("digito Annual {}")
	public void digito_Annual(String string) {
		browser.findElement(By.cssSelector("#annualmileage")).sendKeys(string);
	}

}