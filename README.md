## :eight_spoked_asterisk: ​Automação com Selenium e Cucumber

Projeto desenvolvido para a fase final de avaliação da *Gama Academy*. 

Site utilizado: [Tricentis Vehicle Insurance Application](http://sampleapp.tricentis.com/101/app.php)

Caso de Teste: 1

Cenários: 5

#### Caso de teste: Preencher o formulario no site SampleApp Tricentis

*Como cliente promissor*

*Quero preencher o formulario*

*Para receber um orcamento*

##### Esquema do Cenario: Preencher Enter Vehicle Data

Dado estou no site SampleApp Tricentis

Quando seleciono as opcoes da aba Enter Vehicle Data

E preencho os campos da aba Enter Vehicle Data: <*Cylinder*>,<*Engine*>,<*Payload*>,<*Weight*>,<*Price*>,<*License*> e <*Mileage*>

Entao clico next para ir para a aba Insurant

Exemplos:

   |Cylinder|Engine   |Payload  |Weight   |Price|License |Mileage|

   |100     |100      |1000     |200      |500  |HWH3623 |500    |

##### Esquema do Cenario: Preencher Enter Insurant Data

Quando seleciono as opcoes da aba Enter Insurant Data

E preencho os campos da aba Enter Insurant Data: <*First*>,<*Last*>,<*Nascimento*>,<*Address*>,<*Zip*>,<*City*> e <*Website*>

Entao clico next para a aba Product 

Exemplos:

   |First  |Last   |Nascimento |Address                  |Zip     |City   |Website             |

   |Leandro|Cardoso|03/08/1964 |Rua Alcina da Silva Braga|09360680|Maua   |https://cucumber.io/|

##### Cenario: Preencher Enter Product Data

Quando seleciono as opcoes na aba Enter Product Data

Entao clico em next para ver a tabela de precos

##### Cenario: Escolher plano de Select Price Option

Quando escolho uma opcao 

Entao clico em Next para receber orcamento

##### Esquema do Cenario: Preencher os campos Send Quote

Quando que preencho os campos da aba Send Quote: <*E-Mail*>,<*Phone*>,<*Username*>,<*Password*> e <*ConfirmPassword*>

 Entao Verifico a mensagem "Sending e-mail success!"

 Exemplos:

   |E-Mail                       |Phone        |Username    |Password|ConfirmPassword|

   |Leandro@stilomovelaria.com.br|123456789    |leandrocstil|ZWLap90n|ZWLap90        |

------

#### :bulb: Tecnologias Utilizadas

**Selenium**: interagir com os elementos web da página

**Junit**: testar o software em Java

**Cucumber**: escrever os teste em linguagem mais humana e BDD

**Java**: linguagem de programação

**Maven**: para gerenciamento de dependências

**Visual Studio Code**: IDE para implementação do projeto

##### Extensões na IDE:

Java Extension Pack | Cucumber (Gherkin) | Cuke Step Definition Generator | Language support for Java

------

#### :bulb: Pré requisitos

- Instalar o Java: [Download](https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR)

- Instalar JDK [Download]( https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)

- Instalar Visual Studio Code [Download](https://code.visualstudio.com/download)

- Variáveis de Ambiente Java e Maven [Tutorial](https://www.linkedin.com/pulse/como-configurar-meu-ambiente-para-criar-aplica%C3%A7%C3%B5es-java-monteiro/?articleId=6661590243470266369)

- Clonar o projeto

  ```
  git clone https://github.com/jessikagomes/sampleAppTricentis.git
  ```

- Entrar na página do projeto

  ```
  cd sampleAppTricentis
  ```

- Download Chrome Webdriver [Download](https://chromedriver.chromium.org/downloads) - Como achar a versão do seu [Chrome](https://support.google.com/chrome/answer/95414?co=GENIE.Platform%3DDesktop&hl=pt-BR#zippy=%2Cprocurar-atualiza%C3%A7%C3%B5es-e-ver-a-vers%C3%A3o-atual-do-navegador)

  - Crie uma pasta "driver" dentro da raiz do projeto, e extraia o arquivo nela.

------

#### :bulb: Estrutura Arquivo

<pre>
    -- src

    |-- test
    
    |  |-- java
    
    |  |  |-- io
    
    |  |  |  |-- cucumber
    
    |  |  |  |  |-- avaliacao
    
    |  |-- resources
    
    |  |  |-- io
    
    |  |  |  |-- cucumber
    
    |  |  |  |  |-- avaliacao
    
    |  |  |  |  |  |-- preencherformulario.feature
      
    |  |-- java
    
    |  |  |-- io
    
    |  |  |  |-- cucumber
    
    |  |  |  |  |-- avaliacao
    
    |  |  |  |  |  |-- RunCucumberTest.java
    
    |  |  |  |  |  |-- Pages
    
    |  |  |  |  |  |  |-- InsurantPage.java
    
    |  |  |  |  |  |  |-- PriceOptionPage.java
    
    |  |  |  |  |  |  |-- ProductPage.java
    
    |  |  |  |  |  |  |-- SendQuotePage.java
    
    |  |  |  |  |  |  |-- VehiclePage.java
    
    |  |  |  |  |  |-- Servicos
    
    |  |  |  |  |  |  |-- Configuracao.java
    
    |  |  |  |  |  |-- Steps
    
    |  |  |  |  |  |  |-- InsurantSteps.java
    
    |  |  |  |  |  |  |-- PriceOptionSteps.java
    
    |  |  |  |  |  |  |-- ProductSteps.java
    
    |  |  |  |  |  |  |-- SendQuoteSteps.java
    
    |  |  |  |  |  |  |-- VehicleSteps.java

</pre>

#### :bulb: ​Artigos e guias consultados: 

[Cucumber Melhores Práticas](https://cucumber.io/docs/cucumber/)

[Junit Asserts ](https://junit.org/junit5/docs/current/user-guide/)

[WebElement Metodos](https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebElement.html)

[Gerador de Dados](https://www.4devs.com.br/gerador_de_pessoas)

[Tutorial Maven](https://www.devmedia.com.br/introducao-ao-maven/25128)

------

#### 🔎Minhas redes sociais: [Linkedin](https://www.linkedin.com/in/jessika-gomes/) | [Instagram](https://www.instagram.com/jessika__gomes/)