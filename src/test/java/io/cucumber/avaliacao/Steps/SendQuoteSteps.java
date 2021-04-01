package io.cucumber.avaliacao.Steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.avaliacao.Pages.SendQuotePage;
import io.cucumber.avaliacao.Servicos.Configuracao;
import io.cucumber.java.pt.*;

public class SendQuoteSteps extends Configuracao {

    @Dado("que preencho os campos da aba Send Quote:{},{},{},{} e {}")
    public void que_preencho_os_campos_da_aba_send_quote(String ema, String pho, String use, String pas, String con) {
        SendQuotePage.campoEmail(browser).sendKeys(ema);
        SendQuotePage.campoPhone(browser).sendKeys(pho);
        SendQuotePage.campoUsername(browser).sendKeys(use);
        SendQuotePage.campoPassword(browser).sendKeys(pas);
        SendQuotePage.campoConfirmPassword(browser).sendKeys(con);
        SendQuotePage.botaoSend(browser).click();
    }

    @Entao("Verifico a mensagem {string}")
    public void verifico_a_mensagem(String string) throws InterruptedException {
        Thread.sleep(12000);
		assertEquals(string, SendQuotePage.menssagemSucesso(browser).getText());
        browser.quit();
    } 
    
}
