package Pages;

import org.openqa.selenium.By;

public class CotacaoAutomovel {

	Metodos metodos = new Metodos();

	// VehicleData
	By menuMake = By.id("make");
	By menuModel = By.id("model");
	By menuCylinderCapacity = By.id("cylindercapacity");
	By menuEnginePerformance = By.id("engineperformance");
	By menuDateOfManufacture = By.id("dateofmanufacture");
	By menuNumberofSeats = By.id("numberofseats");
	By menuRightHandDrive = By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span");
	By menuNumberofSeats1 = By.id("numberofseatsmotorcycle");
	By menuFuelType = By.id("fuel");
	By menuPayload = By.id("payload");
	By menuTotalWeight = By.id("totalweight");
	By menuListPrice = By.id("listprice");
	By menuLicensePlateNumber = By.id("licenseplatenumber");
	By menuAnnualMileage = By.id("annualmileage");
	By menunextenterinsurantdata = By.id("nextenterinsurantdata");

	// InsurantData
	By menuFirstName = By.id("firstname");
	By menuLastName = By.id("lastname");
	By menuDateOfBirth = By.id("birthdate");
	By menuGender = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]");
	By menuStreetAddress = By.id("streetaddress");
	By menuCountry = By.id("country");
	By menuZipCode = By.id("zipcode");
	By menuCity = By.id("city");
	By menuOccupation = By.id("occupation");
	By menuHobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span");
	By menuWebsite = By.name("Website");
	By menuPicture = By.id("picture");
	By menunextenterproductdata = By.id("nextenterproductdata");

	// ProductData
	By menuStartDate = By.id("startdate");
	By menuInsuranceSum = By.id("insurancesum");
	By menuMeritRating = By.id("meritrating");
	By menuDamageInsurance = By.id("damageinsurance");
	By menuOptionalProducts = By.id("EuroProtection");
	By menuCourtesyCar = By.id("courtesycar");
	By menunextselectpriceoption = By.id("nextselectpriceoption");

	// PriceOption
	By menuselectgold_price = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span");
	By menunextsendquote = By.id("nextsendquote");

	// SendQuote
	By menuEmail = By.id("email");
	By menuPhone = By.id("phone");
	By menuUsername = By.id("username");
	By menuPassword = By.id("password");
	By menuConfirmPassword = By.id("confirmpassword");
	By menuComments = By.id("Comments");
	By menusendemail = By.id("sendemail");

	public void EnterVehicleData(String make, String model, String cylindercapacity, String engineperformance,
			String dateofmanufacture, String numberofseats, String righthanddriveyes, String numberofseatsmotorcycle,
			String fuel, String payload, String totalweight, String listprice, String licenseplatenumber,
			String annualmileage, String nextenterinsurantdata) {
		metodos.escrever(menuMake, make);
		metodos.escrever(menuModel, model);
		metodos.escrever(menuCylinderCapacity, cylindercapacity);
		metodos.escrever(menuEnginePerformance, engineperformance);
		metodos.escrever(menuDateOfManufacture, dateofmanufacture);
		metodos.escrever(menuNumberofSeats, numberofseats);
		metodos.escrever(menuRightHandDrive, righthanddriveyes);
		metodos.clicar(menuRightHandDrive);
		metodos.escrever(menuNumberofSeats1, numberofseatsmotorcycle);
		metodos.escrever(menuFuelType, fuel);
		metodos.escrever(menuPayload, payload);
		metodos.escrever(menuTotalWeight, totalweight);
		metodos.escrever(menuListPrice, listprice);
		metodos.escrever(menuLicensePlateNumber, licenseplatenumber);
		metodos.escrever(menuAnnualMileage, annualmileage);
		metodos.clicar(menunextenterinsurantdata);

	}

	public void InsurantData(String FirstName, String LastName, String DateOfBirth, String Gender, String StreetAddress,
			String Country, String ZipCode, String City, String Occupation, String Hobbies, String Website,
			String Picture, String nextenterproductdata) {
		metodos.escrever(menuFirstName, FirstName);
		metodos.escrever(menuLastName, LastName);
		metodos.escrever(menuDateOfBirth, DateOfBirth);
		metodos.escrever(menuGender, Gender);
		metodos.clicar(menuGender);
		metodos.escrever(menuStreetAddress, StreetAddress);
		metodos.escrever(menuCountry, Country);
		metodos.escrever(menuZipCode, ZipCode);
		metodos.escrever(menuCity, City);
		metodos.escrever(menuOccupation, Occupation);
		metodos.escrever(menuHobbies, Hobbies);
		metodos.clicar(menuHobbies);
		metodos.escrever(menuWebsite, Website);
		metodos.escrever(menuPicture, Picture);
		metodos.clicar(menunextenterproductdata);

	}

	public void ProductData(String StartDate, String InsuranceSum, String MeritRating, String DamageInsurance,
			String OptionalProducts, String CourtesyCar, String nextselectpriceoption) {
		metodos.escrever(menuStartDate, StartDate);
		metodos.escrever(menuInsuranceSum, InsuranceSum);
		metodos.escrever(menuMeritRating, MeritRating);
		metodos.escrever(menuDamageInsurance, DamageInsurance);
		metodos.escrever(menuOptionalProducts, OptionalProducts);
		metodos.clicar(menuOptionalProducts);
		metodos.escrever(menuCourtesyCar, CourtesyCar);
		metodos.clicar(menunextselectpriceoption);

	}

	public void PriceOption(String selectgold_price, String nextsendquote) {
		metodos.escrever(menuselectgold_price, selectgold_price);
		metodos.clicar(menuselectgold_price);
		metodos.clicar(menunextsendquote);
	}

	public void SendQuote(String Email, String Phone, String Username, String Password, String ConfirmPassword,
			String Comments, String sendemail) {
		metodos.escrever(menuEmail, Email);
		metodos.escrever(menuPhone, Phone);
		metodos.escrever(menuUsername, Username);
		metodos.escrever(menuPassword, Password);
		metodos.escrever(menuConfirmPassword, ConfirmPassword);
		metodos.escrever(menuComments, Comments);
		metodos.clicar(menusendemail);

	}
}