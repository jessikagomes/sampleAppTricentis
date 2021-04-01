package io.cucumber.avaliacao.Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.avaliacao.Pages.InsurantPage;
import io.cucumber.avaliacao.Servicos.Configuracao;
import io.cucumber.java.pt.*;

public class InsurantSteps extends Configuracao {

    @Quando("seleciono as opcoes da aba Enter Insurant Data")
    public void seleciono_as_opcoes_da_aba_enter_insurant_data() {
        WebElement element = InsurantPage.campoGender(browser);
		Actions actions = new Actions(browser);
		actions.moveToElement(element).click().perform();
        InsurantPage.opcoesCountry(browser).click();
        InsurantPage.opcoesOccupation(browser).click();
        WebElement hobbies = InsurantPage.campoHobbies(browser);
        actions.moveToElement(hobbies).click().perform();
    }

    @Quando("preencho os campos da aba Enter Insurant Data: {},{},{},{},{},{} e {}")
    public void preencho_os_campos_da_aba_enter_insurant_data(String fir, String las, String bir, String add, String zip, String cit, String web) {
        InsurantPage.campoFirstName(browser).sendKeys(fir);       
        InsurantPage.campoLastName(browser).sendKeys(las);
        InsurantPage.dataBirth(browser).sendKeys(bir);
        InsurantPage.campoAddress(browser).sendKeys(add);
        InsurantPage.campoZipecode(browser).sendKeys(zip);
        InsurantPage.campoCity(browser).sendKeys(cit);
        InsurantPage.campoWebsite(browser).sendKeys(web);
    }

    @Entao("clico next para a aba Product")
	public void clico_next_para_a_aba_product() {
		InsurantPage.botaoNext(browser).click();
	}
    
}
