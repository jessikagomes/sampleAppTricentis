package io.cucumber.danilo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ValidadorCpfSteps{
	
	public ValidadorCpfSteps() {
	    System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	    browser = new ChromeDriver();
	}
	
	public WebDriver browser;

	@Quando("que que estou no site do tornese um programador")
	public void que_que_estou_no_site_do_tornese_um_programador() {
		browser.get("https://www.torneseumprogramador.com.br/aulas/front-end");
	}

	@Quando("digito no campo de busca a palavra {string}")
	public void digito_no_campo_de_busca_a_palavra(String string) {
		WebElement input = browser.findElement(By.id("aula"));
		input.sendKeys(string);
	}

	@Quando("clico na lupa de busca")
	public void clico_na_lupa_de_busca() {
		WebElement input = browser.findElement(By.id("icon-pesquisa"));
		input.click();
	}

	@Entao("devo ver o resultado {string} na busca")
	public void devo_ver_o_resultado_na_busca(String string) {
		WebElement input = browser.findElement(By.id("busca"));
		assertNotNull(input);
		browser.quit();
	}

}