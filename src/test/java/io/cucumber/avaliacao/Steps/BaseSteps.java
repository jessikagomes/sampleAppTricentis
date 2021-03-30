package io.cucumber.avaliacao.Steps;

import org.openqa.selenium.By;

import io.cucumber.avaliacao.Servicos.Configuracao;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class BaseSteps extends Configuracao{
    
    @Quando("estou no site SampleApp Tricentis")
	public void estou_no_site_SampleApp_Tricentis() {
		Configuracao.open("http://sampleapp.tricentis.com/101/app.php");
	}

    @Entao("clico next")
	public void clico_next() {
		browser.findElement(By.cssSelector(".next")).click();
	}
    
}
