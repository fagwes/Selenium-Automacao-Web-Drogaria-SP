#Author: Wesley de França AMorim Gomes

@Testando
Feature: dado que eu não esteja logado
  eu quero selecionar um produto dentro do site

  @testes
  Scenario: seleciona produto dentro do site
    Given que eu esteja no site
    And clique em algum produto ou escreva
    When digito o cep e aperto enter
    And e clico em comprar
    Then é adicionado o produto no carrinho
    

 