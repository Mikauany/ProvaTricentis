package Pages;

import org.openqa.selenium.By;

public class Metodos extends Browsers {

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("-------Erro ao clicar-------" + e.getMessage());
			System.err.println("-------Causa do erro-------" + e.getCause());
		}

	}

	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("-------Erro ao escrever-------" + e.getMessage());
			System.err.println("-------Causa do erro-------" + e.getCause());
		}
	}

	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			System.err.println("-------Erro ao pausar-------" + e.getMessage());
			System.err.println("-------Causa do erro-------" + e.getCause());
		}
	}

	public void fechar() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.err.println("-------Erro ao fechar navegador-------" + e.getMessage());
			System.err.println("-------Causa do erro-------" + e.getCause());
		}
	}

	public void fecharPagina() {
		try {
			driver.close();
		} catch (Exception e) {
			System.err.println("-------Erro ao fechar pagina-------" + e.getMessage());
			System.err.println("-------Causa do erro-------" + e.getCause());
		}
	}

}
