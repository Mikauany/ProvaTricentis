package provaTricentis.testes;

import Pages.Browsers;
import Pages.CotacaoAutomovel;
import Pages.HomePages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class Steps {

Browsers browser = new Browsers();
HomePages home = new HomePages();
CotacaoAutomovel cotacao = new CotacaoAutomovel();


	
	@Given("acessar o site {string}")
	public void acessar_o_site(String site) {
		browser.abrirNavegador(site);	
	   
	}

	@Given("clicar em na opcao desejada")
	public void clicar_em_na_opcao_desejada() {
			home.menu("automobile");  	    
	}

	@Given("preencher dados do veiculo")
	public void preencher_dados_do_veiculo() {
		//VehicleData
		cotacao.EnterVehicleData("audi", "Scooter", "100", "50", "11/04/2021", "5", "yes", "2", "petrol", "500", "5000", "70000", "1a4a2a4a2", "12000", null );
	    
	}

	@Given("preencher dados do seguro")
	public void preencher_dados_do_seguro() {
		//InsurantData 
		cotacao.InsurantData("Mikauany", "Moura", "08/02/2000", "Male", "R. José Leal da Silva", "brazil", "0000000", "Sao Paulo", "farmer", "Speeding", "www.mikauany.com.br", null , null );
	   
	}

	@Given("preencher dados do produto")
	public void preencher_dados_do_produto() {
		//ProductData
	    cotacao.ProductData("05/02/2022", "3.000.000,00", "bonus 1", "no coverage", "euro protection", "no", null);
	}

	@Given("preencher dados da opcao do preço")
	public void preencher_dados_da_opcao_do_preço() {
		//PriceOption
		cotacao.PriceOption(null, null);
	    
	}

	@Then("enviar cotacao")
	public void enviar_cotacao() {
		cotacao.SendQuote("teste@teste.com.br", "111111111111", "mika", "Mika1234*", "Mika1234*", "aaaaaaaa", null );
	    
	}
}