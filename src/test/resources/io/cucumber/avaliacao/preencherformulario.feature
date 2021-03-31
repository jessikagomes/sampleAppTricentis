# language: pt
Funcionalidade: Preencher o formulario no site SampleApp Tricentis
  Como cliente promissor
  Quero preencher o formulario
  Para receber um orcamento
  
  Esquema do Cenario: Preencher Enter Vehicle Data
    Quando estou no site SampleApp Tricentis
    E seleciono uma opcao Make
    E seleciono o Model
    E digito o <Cylinder> Capacity
    E digito no campo <Engine> Performance
    E seleciono Date of Manufacture
    E seleciono Number of Seats
    E seleciono Right Hand Drive
    E seleciono Number of Seats motorcycle
    E seleciono Fuel Type
    E digito campo <Payload> [kg]
    E digito Total <Weight> [kg]
    E digito List <Price>
    E digito <License> Plate Number
    E digito Annual <Mileage>
    Entao clico next para Insurant

    Exemplos:
      |Cylinder|Engine|Payload|Weight|Price|License |Mileage|
      |100     |100   |1000   |200   |500  |HWH3623 |500    |
  
  Esquema do Cenario: Preencher Enter Insurant Data
    E digito First "<First>" Name
    E digito Last "<Last>" Name
    E escolho Date of Birth "<Nascimento>"
    E escolho Gender
    E digito Street "<Address>"
    E escolho Country
    E digito "<Zip>" Code
    E digito cidade "<City>"
    E escolho Occupation
    E escolho Hobbies
    E digito website "<Website>"
    Entao clico next para Product
      
    Exemplos:
      |First  |Last   |Nascimento|Address                  |Zip     |City|Website             |
      |Leandro|Cardoso|03/08/1964|Rua Alcina da Silva Braga|09360680|Maua|https://cucumber.io/|

  Cenario: Preencher Enter Product Data
    Quando seleciono uma data Start Date
    E seleciono um valor de seguro Insurance Sum
    E escolho uma nota Merit Rating
    E escolho uma cobertura Damage Insurance
    E seleciono opcionais Optional Products 
    E seleciono uma cortesia Courtesy Car
    Entao clico em next para ver a tabela de precos
  
  Cenario: Escolher tipo de Select Price Option
    Quando escolhe uma opcao 
    Entao clico em Next para receber orcamento

  Esquema do Cenario: Preencher os campos Send Quote
    E preencho o email "<E-Mail>"
    E digito um telefone "<Phone>"
    E escolho um nome de usuario "<Username>"
    E escolho uma senha "<Password>"
    E confirmo a senha Confirm "<ConfirmPassword>"
    Quando clico em Send
    Entao Verifico a mensagem "Sending e-mail success!"
    E clico no botao Ok
 
    Exemplos:
      |E-Mail                       |Phone    |Username    |Password|ConfirmPassword|
      |Leandro@stilomovelaria.com.br|123456789|leandrocstil|ZWLap90n|ZWLap90n       |