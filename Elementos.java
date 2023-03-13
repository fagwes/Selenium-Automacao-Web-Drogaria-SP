package elementos;

import org.openqa.selenium.By;

import metodos.Metodos;

public class Elementos extends Metodos {

	
	
	public By selecionoproduto = By.xpath("//*[@id=\"inicio-conteudo\"]/div[2]/div/div/div/div[2]/div[1]/ul/li[1]/div[3]/a[1]");

	public By digitocep = By.xpath("//*[@id=\"cep\"]");

	public By clicoemcomprar = By.xpath("//*[@id=\"inicio-conteudo\"]/div[1]/div/div/div[4]/div/div[1]/div[4]/a");

	public By cookies = By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");

	public By pesquisa = By.xpath("//*[@id=\"root-search-bar-component\"]/div/div/form/fieldset/input");
	
	
}
