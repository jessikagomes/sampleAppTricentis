package io.cucumber.avaliacao.Steps;

import org.openqa.selenium.By;
import io.cucumber.avaliacao.Servicos.Configuracao;
import io.cucumber.java.pt.*;

public class EnterInsurantDataSteps extends Configuracao {

    @Quando("digito First {string} Name")
    public void digito_First_Name(String string) {
        browser.findElement(By.cssSelector("#firstname")).sendKeys(string);
    }

    @Quando("digito Last {string} Name")
    public void digito_Last_Name(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("escolho Date of Birth")
    public void escolho_Date_of_Birth() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("escolho Gender")
    public void escolho_Gender() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("digito Street {string}")
    public void digito_Street(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("escolho Country")
    public void escolho_Country() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("digito {string} Code")
    public void digito_Code(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("digito City")
    public void digito_City() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("escolho Occupation")
    public void escolho_Occupation() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("escolho Hobbies")
    public void escolho_Hobbies() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("digito Website")
    public void digito_Website() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("upload Picture")
    public void upload_Picture() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
