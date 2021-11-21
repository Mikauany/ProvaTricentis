package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {
	
	protected static WebDriver driver;
	
	public void abrirNavegador(String site) {
		try {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		} catch (Exception e) {
			System.err.println("-------Erro ao abrir navegador-------" + e.getMessage());
			System.err.println("-------Causa do erro-------" +e.getCause());
		}
		
		
	}

}
