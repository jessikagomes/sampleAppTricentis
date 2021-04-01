package io.cucumber.avaliacao.Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.avaliacao.Pages.VehiclePage;
import io.cucumber.avaliacao.Servicos.Configuracao;
import io.cucumber.java.pt.*;

public class VehicleSteps extends Configuracao{

	@Quando("estou no site SampleApp Tricentis")
	public void estou_no_site_sampleApp_tricentis() {
		Configuracao.open("http://sampleapp.tricentis.com/101/app.php");
	}

	@Quando("seleciono as opcoes da aba Enter Vehicle Data")
	public void seleciono_as_opcoes_da_aba_enter_vehicle_data() throws InterruptedException {
		VehiclePage.dropdownMake(browser).click();
		VehiclePage.dropdownModel(browser).click();
		VehiclePage.botaoCalendario(browser).click();
		Thread.sleep(2000);
		VehiclePage.dataCalendario(browser).click();
		VehiclePage.opcoesSeats(browser).click();
		WebElement element = VehiclePage.rightHandDrive(browser);
		Actions actions = new Actions(browser);
		actions.moveToElement(element).click().perform();
		VehiclePage.opcoesSeatsMotorcycle(browser).click();
		VehiclePage.opcoesFuel(browser).click();
	}

	@Quando("preencho os campos da aba Enter Vehicle Data:{},{},{},{},{},{} e {}")
	public void preencho_os_campos_da_aba_enter_vehicle_data(String cyl, String eng, String pay, String wei, String pri, String lic, String mil) {
		VehiclePage.campoCylender(browser).sendKeys(cyl);
		VehiclePage.campoEngine(browser).sendKeys(eng);
		VehiclePage.campoPayload(browser).sendKeys(pay);
		VehiclePage.campoWeight(browser).sendKeys(wei);
		VehiclePage.campoPrice(browser).sendKeys(pri);
		VehiclePage.campoLicense(browser).sendKeys(lic);
		VehiclePage.campoMileage(browser).sendKeys(mil);
	}

	@Entao("clico next para ir para a aba Insurant")
	public void clico_next_para_ir_para_a_aba_insurant() {
		VehiclePage.botaoNext(browser).click();
	}

}