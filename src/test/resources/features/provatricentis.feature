#Author: mikauany94@gmail.com

Feature: Cotacao tricentis
Eu como usuario quero fazer uma cotacao para tricentis
  
  Scenario: cotacao de automovel tricentis
  Given acessar o site "http://sampleapp.tricentis.com/101/app.php"
  And clicar em na opcao desejada
  And preencher dados do veiculo
  And preencher dados do seguro
  And preencher dados do produto
  And preencher dados da opcao do preço
  Then enviar cotacao
  