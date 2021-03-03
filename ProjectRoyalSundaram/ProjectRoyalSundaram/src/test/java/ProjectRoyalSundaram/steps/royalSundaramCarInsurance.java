package ProjectRoyalSundaram.steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class royalSundaramCarInsurance {
	WebDriver driver;
	Actions a;
	Robot robo;
	
	@Given("user navigates to the website")
	public void user_navigates_to_the_website() throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arili\\OneDrive\\Desktop\\ProjectRoyalSundaram\\ProjectRoyalSundaram\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();
		a=new Actions(driver);
		robo=new Robot();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.royalsundaram.in/car-insurance");
	}

	@And("user gives in the relevant car details and clicks on get quote")
	public void user_gives_in_the_relevant_car_details_and_clicks_on_get_quote() {
	  WebElement carNum = driver.findElement(By.xpath("//input[@id='_com_rs_portlet_carinsurance_CarInsurancePortlet_vehicleDetails-registrationNumber']"));
	a.sendKeys(carNum, "tn10ml5403").build().perform();
	WebElement mobNum = driver.findElement(By.xpath("//div[@class='col-md-6 no-padding col-sm-6']//div[@class='controls-outerdesign border-left-none label-font']//div[@class='form-group']//div[@class='form-group input-text-wrapper']//input[@id='_com_rs_portlet_carinsurance_CarInsurancePortlet_proposerDetails-strMobileNo']"));
	a.sendKeys(mobNum, "9875462358").build().perform();
	WebElement name = driver.findElement(By.xpath("(//input[@id='_com_rs_portlet_carinsurance_CarInsurancePortlet_proposerDetails-strFirstName'])[1]"));
	a.sendKeys(name, "Praveen").build().perform();
	WebElement eMail = driver.findElement(By.xpath("//form[@id='_com_rs_portlet_carinsurance_CarInsurancePortlet_carInsuranceFm']//div[@class='row']//div[@class='col-md-12 col-sm-12']//div[@class='col-md-6 no-padding col-sm-6']//div[@class='controls-outerdesign border-left-none label-font']//div[@class='form-group']//div[@class='form-group input-text-wrapper']//input[@id='_com_rs_portlet_carinsurance_CarInsurancePortlet_proposerDetails-strEmail']"));
	a.sendKeys(eMail, "dummy@gmail.com").build().perform();
	WebElement getQuote = driver.findElement(By.xpath("//button[@id='_com_rs_portlet_carinsurance_CarInsurancePortlet_customscroll']"));
	a.click(getQuote).build().perform();
	}

	@And("user edits vehicle details and proceeds for the next page")
	public void user_edits_vehicle_details_and_proceeds_for_the_next_page() throws InterruptedException {
		Select manYear = new Select(driver.findElement(By.xpath("//select[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_vehicleDetails-yearOfManufacture']")));
	manYear.selectByVisibleText("2020");
	WebElement regCity = driver.findElement(By.xpath("//select[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_vehicleDetails-carRegisteredCity']"));
	a.click(regCity).build().perform();
	Thread.sleep(3000);
	WebElement city = driver.findElement(By.xpath("//button[@onclick=\"setCity('CHENNAI');\"]"));
	a.click(city).build().perform();
	Thread.sleep(3000);
	WebElement dateClik = driver.findElement(By.xpath("//input[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_vehicleDetails-vehicleregDate']"));
	a.click(dateClik).build().perform();
	Thread.sleep(3000);
	List<WebElement> dates = driver.findElements(By.xpath("//td"));
	int dateSize = dates.size();
	for (int i = 0; i < dateSize; i++) {
		String finalDates = driver.findElements(By.xpath("//td")).get(i).getText();
	if (finalDates.equalsIgnoreCase("2")) {
		driver.findElements(By.xpath("//td")).get(i).click();
		break;
		
	}
	}
	
//	WebElement todayDate = driver.findElement(By.xpath("//a[contains(@class,'datepick-today')]"));
//	a.click(todayDate).build().perform();
	WebElement pEnd = driver.findElement(By.xpath("//input[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_vehicleDetails-previousPolicyExpiryDate']"));
	a.click(pEnd).build().perform();
	Thread.sleep(3000);
	List<WebElement> dates2 = driver.findElements(By.xpath("//td"));
	int dateSize2 = dates2.size();
	for (int i = 0; i < dateSize2; i++) {
		String finalDates2 = driver.findElements(By.xpath("//td")).get(i).getText();
	if (finalDates2.equalsIgnoreCase("12")) {
		driver.findElements(By.xpath("//td")).get(i).click();
		break;
		
	}
	}
	WebElement carClik = driver.findElement(By.xpath("//select[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_vehicleDetails-vehicleManufacturerName']"));
	a.click(carClik).build().perform();
	Thread.sleep(3000);
	List<WebElement> carModel = driver.findElements(By.xpath("//div[@id='manufacturerId']/div"));
	int cModSize = carModel.size();
	for (int i = 0; i < cModSize; i++) {
		String finalcarModels = carModel.get(i).getText();
		if (finalcarModels.equalsIgnoreCase("Verna")) {
		a.click(carModel.get(i)).build().perform();	
		break;
		}
	}
	Thread.sleep(3000);
	WebElement carm = driver.findElement(By.xpath("//select[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_vehicleDetails-vehicleModelCode']"));
    a.click(carm).build().perform();
    Thread.sleep(3000);
    WebElement carmSel = driver.findElement(By.xpath("//button[contains(text(),'Fluidic Verna 1.4 CRDi EX-5 Seater')]"));
	a.click(carmSel).build().perform();
	Thread.sleep(3000);
	Select sumIns = new Select(driver.findElement(By.xpath("//select[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_vehicleDetails-cpaSumInsured']")));
	sumIns.selectByIndex(2);
	Thread.sleep(3000);
	for (int i = 0; i < 2 ; i++) {
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
	}
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
//	WebElement next = driver.findElement(By.xpath("//button[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_jnyz']"));
//	a.click(next).build().perform();

	}

	@When("user fills in the previous insurance details")
	public void user_fills_in_the_previous_insurance_details() throws Exception {
		Select noClaim = new Select(driver.findElement(By.xpath("//select[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_vehicleDetails-noClaimBonusPercent']")));
		noClaim.selectByIndex(2);
		Thread.sleep(3000);
		for (int i = 0; i < 12 ; i++) {
			robo.keyPress(KeyEvent.VK_TAB);
			robo.keyRelease(KeyEvent.VK_TAB);
		}
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
//		WebElement getQ = driver.findElement(By.xpath("//button[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_ghxy']"));
//		a.click(getQ).build().perform();
	}

	@Then("a page with the option to buy should be displayed")
	public void a_page_with_the_option_to_buy_should_be_displayed() throws Exception {
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
WebElement buY = driver.findElement(By.xpath("//div[@class='col-xs-6 mbno-padding col-sm-6 padding-left-5-xs']"));
js.executeScript("arguments[0].scrollIntoView(true);", buY);
Thread.sleep(500);
a.click(buY).build().perform();
Thread.sleep(3000);
WebElement buyEle = driver.findElement(By.xpath("(//span[@class='lfr-btn-label'])[33]"));
	a.click(buyEle).build().perform();
	WebElement engineNumber = driver.findElement(By.xpath("//input[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_vehicleDetails-engineNumber']"));
	engineNumber.sendKeys("1GNKVGKD1FJ262008");
	WebElement chassis = driver.findElement(By.xpath("//input[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_vehicleDetails-chassisNumber']"));
	chassis.sendKeys("1GNKVGKD1FJ262008");
	Select mostDriven = new Select(driver.findElement(By.xpath("//select[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_vehicleDetails-vehicleMostlyDrivenOn']")));
	mostDriven.selectByIndex(3);
	WebElement engineNum = driver.findElement(By.xpath("//input[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_vehicleDetails-pucnumber']"));
	engineNum.sendKeys("3994839002993499");
	WebElement pollutionExpiry = driver.findElement(By.xpath("//input[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_vehicleDetails-pucvalidUpto']"));
	a.click(pollutionExpiry).build().perform();
	WebElement polExp = driver.findElement(By.xpath("//a[contains(@class,'dp1616394600000')]"));
	js.executeScript("arguments[0].scrollIntoView(true);", polExp);
	Thread.sleep(500);
	a.click(polExp).build().perform();
	Thread.sleep(1000);
	WebElement privacy = driver.findElement(By.xpath("//div[@id='heading3']"));
    a.click(privacy).build().perform();
    Thread.sleep(1000);
    WebElement prevPol = driver.findElement(By.xpath("//input[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_vehicleDetails-previuosPolicyNumber']"));
	prevPol.sendKeys("399938388382");
	Select prevIns = new Select(driver.findElement(By.xpath("//select[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_vehicleDetails-previousInsurerName']")));
	prevIns.selectByIndex(18);
	WebElement prevInsAdd = driver.findElement(By.xpath("//textarea[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_vehicleDetails-previousinsurersCorrectAddress']"));
    prevInsAdd.sendKeys("51 indian seal");
    WebElement b = driver.findElement(By.xpath("(//span[@class='lfr-btn-label'])[19]"));
	a.click(b).build().perform();
	Thread.sleep(3000);
	Select title =new Select(driver.findElement(By.xpath("//select[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_proposerDetails-strTitle']")));
	title.selectByIndex(1);
	WebElement doB = driver.findElement(By.xpath("//input[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_proposerDetails-dateOfBirth']"));
    	a.click(doB).build().perform();
    	Thread.sleep(3000);
    	WebElement dobS = driver.findElement(By.xpath("//a[@class='dp1046586600000   datepick-weekend']"));
	a.click(dobS).build().perform();
	Select occ = new Select(driver.findElement(By.xpath("//select[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_proposerDetails-occupation']")));
	occ.selectByIndex(5);
	WebElement peradd = driver.findElement(By.xpath("//input[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_proposerDetails-addressOne']"));
	peradd.sendKeys("e18,5th west st thiruvanmyur");
	WebElement add2 = driver.findElement(By.xpath("//input[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_proposerDetails-addressTwo']"));
	add2.sendKeys("chennai");
	driver.findElement(By.xpath("//input[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_proposerDetails-regPinCode']")).sendKeys("600041");
	WebElement heading2 = driver.findElement(By.xpath("//div[@id='heading2']"));
	js.executeScript("arguments[0].scrollIntoView(true);", heading2);
	Thread.sleep(500);
	a.click(heading2).build().perform();
	WebElement nomName = driver.findElement(By.xpath("//input[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_proposerDetails-nomineeName']"));
	nomName.sendKeys("Praveen");
	Select rel = new Select(driver.findElement(By.xpath("//select[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_proposerDetails-relationshipWithNominee']")));
	rel.selectByIndex(2);
	WebElement age = driver.findElement(By.xpath("//input[@id='_com_rs_portlet_cartransaction_CarTransactionPortlet_proposerDetails-nomineeAge']"));
	age.sendKeys("21");
	WebElement viewSummary = driver.findElement(By.xpath("(//span[@class='lfr-btn-label'])[22]"));
	a.click(viewSummary).build().perform();
	}}
