package io.cucumber.avaliacao.Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.avaliacao.Pages.ProductPage;
import io.cucumber.avaliacao.Servicos.Configuracao;
import io.cucumber.java.pt.*;

public class ProductSteps extends Configuracao{

    @Quando("seleciono as opcoes na aba Enter Product Data")
    public void seleciono_as_opcoes_na_aba_enter_product_data() {
        ProductPage.campoCalendar(browser).sendKeys("05/05/2021");
        ProductPage.campoInsurance(browser).click();
        ProductPage.campoMerit(browser).click();
        ProductPage.campoDamage(browser).click();
        WebElement element = ProductPage.campoOptional(browser);
		Actions actions = new Actions(browser);
		actions.moveToElement(element).click().perform();
        ProductPage.campoCourtesy(browser).click();
    }

    @Entao("clico em next para ver a tabela de precos")
    public void clico_em_next_para_ver_a_tabela_de_precos() {
        ProductPage.botaoNext(browser).click();
    }
    
}
