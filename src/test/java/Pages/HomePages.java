package Pages;

import org.openqa.selenium.By;

public class HomePages {

	public void menu(String menu) {

		Metodos metodos = new Metodos();

		By menuautomobile = By.id("nav_automobile");
		By menutruck = By.id("nav_truck");
		By menumotorcycle = By.id("nav_motorcycle");
		By menucamper = By.id("nav_camper");

		if (menu.equalsIgnoreCase("nav_automobile")) {
			metodos.clicar(menuautomobile);

		} else if (menu.equalsIgnoreCase("nav_truck")) {
			metodos.clicar(menutruck);
			
		} else if (menu.equalsIgnoreCase("nav_motorcycle")) {
			metodos.clicar(menumotorcycle);
			
		} else if (menu.equalsIgnoreCase("nav_camper")) {
			metodos.clicar(menucamper);
		} else {
			System.out.println("Opção invalida");
		}
	}
}