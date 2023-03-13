package testes;

import java.io.IOException;

import executa.Executa;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import massadedados.MassadeDados;
import metodos.Metodos;

public class Testes extends MassadeDados {

	@Given("que eu esteja no site")
	public void que_eu_esteja_no_site() {

		Executa.abrirNavegador();
		Metodos.abrirtela();
		Metodos.clicar(cookies);

	}

	@Given("clique em algum produto ou escreva")
	public void clique_em_algum_produto() {
		Metodos.escrever(pesquisa, nome);
		Metodos.submit(pesquisa);
		Metodos.clicarlink(url);

	}

	@When("digito o cep e aperto enter")
	public void digito_o_cep_e_aperto_enter() {

		Metodos.escrever(digitocep, Cep);

	}

	@When("e clico em comprar")
	public void e_clico_em_comprar() {
		Metodos.clicar(clicoemcomprar);

	}

	@Then("é adicionado o produto no carrinho")
	public void é_adicionado_o_produto_no_carrinho() throws IOException {

		Metodos.evidencia(Cep);
		Executa.fecharNavegador();
	}

}
