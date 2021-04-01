# language: pt
Funcionalidade: Preencher o formulario no site SampleApp Tricentis
  Como cliente promissor
  Quero preencher o formulario
  Para receber um orcamento
  
  Esquema do Cenario: Preencher Enter Vehicle Data
    Dado estou no site SampleApp Tricentis
    Quando seleciono as opcoes da aba Enter Vehicle Data
    E preencho os campos da aba Enter Vehicle Data: <Cylinder>,<Engine>,<Payload>,<Weight>,<Price>,<License> e <Mileage>
    Entao clico next para ir para a aba Insurant
    Exemplos:
      |Cylinder|Engine|Payload|Weight|Price|License |Mileage|
      |100     |100   |1000   |200   |500  |HWH3623 |500    |
  
  Esquema do Cenario: Preencher Enter Insurant Data
    Quando seleciono as opcoes da aba Enter Insurant Data
    E preencho os campos da aba Enter Insurant Data: <First>,<Last>,<Nascimento>,<Address>,<Zip>,<City> e <Website>
    Entao clico next para a aba Product  
    Exemplos:
      |First  |Last   |Nascimento|Address                  |Zip     |City|Website             |
      |Leandro|Cardoso|03/08/1964|Rua Alcina da Silva Braga|09360680|Maua|https://cucumber.io/|

  Cenario: Preencher Enter Product Data
    Quando seleciono as opcoes na aba Enter Product Data
    Entao clico em next para ver a tabela de precos
  
  Cenario: Escolher plano de Select Price Option
    Quando escolho uma opcao 
    Entao clico em Next para receber orcamento

  Esquema do Cenario: Preencher os campos Send Quote
    Quando que preencho os campos da aba Send Quote: <E-Mail>,<Phone>,<Username>,<Password> e <ConfirmPassword>
    Entao Verifico a mensagem "Sending e-mail success!" 
    Exemplos:
      |E-Mail                       |Phone    |Username    |Password|ConfirmPassword|
      |Leandro@stilomovelaria.com.br|123456789|leandrocstil|ZWLap90n|ZWLap90n       |