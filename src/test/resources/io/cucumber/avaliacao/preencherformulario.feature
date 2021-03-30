# language: pt
Funcionalidade: Preencher o formulario no site SampleApp Tricentis
  Como cliente quero constrar um seguro para meu veiculo no site

  Contexto: Entrar no site SampleApp Tricentis
    Quando estou no site SampleApp Tricentis
  # @ignore
  Esquema do Cenario: Preencher Enter Vehicle Data
    E seleciono uma opcao Make
    E seleciono o Model
    E digito o <Cylinder> Capacity
    E digito no campo <Engine> Performance
    E seleciono Date of Manufacture
    E seleciono Number of Seats
    E seleciono Right Hand Drive
    E seleciono Number of Seats motorcycle
    E seleciono Fuel Type
    E digito List <Price>
    E digito <License> Plate Number
    E digito Annual <Mileage>
    Entao clico next

    Exemplos:
      |Cylinder|Engine|Price|License |Mileage|
      |100     |100   |500  |HWH3623 |500    |
  
  Esquema do Cenario: Preencher Enter Insurant Data
    E digito First <First> Name
    E digito Last <Last> Name
    E escolho Date of Birth
    E escolho Gender
    E digito Street <Address>
    E escolho Country
    E digito <Zip> Code
    E digito cidade <City>
    E escolho Occupation
    E escolho Hobbies
    E digito website <Website>
    E upload Picture
    Entao clico next
      
    Exemplos:
      |First  |Last   |Address                  |Zip     |City|Website             |
      |Leandro|Cardoso|Rua Alcina da Silva Braga|09360680|Maua|https://cucumber.io/|
