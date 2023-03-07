package com.example.demoMedSimon;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import javax.print.attribute.standard.JobHoldUntil;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;

import ch.qos.logback.core.util.Duration;

@SpringBootTest
class DemoMedSimonApplicationTests {

	
	public String[] names = {"Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops","Mens Casual Premium Slim Fit T-Shirts", "Mens Cotton Jacket", "Mens Casual Slim Fit", "John Hardy Women's Legends Naga Gold & Silver Dragon Station Chain Bracelet", "SolGold Petite Micropave", "White Gold Plated Princess", "Pierced Owl Rose Gold Plated Stainless Steel Double", "WD 2TB Elements Portable External Hard Drive - USB 3.0", "SanDisk SSD PLUS 1TB Internal SSD - SATA III 6 Gb/s", "Silicon Power 256GB SSD 3D NAND A55 SLC Cache Performance Boost SATA III 2.5", "WD 4TB Gaming Drive Works with Playstation 4 Portable External Hard Drive", "Acer SB220Q bi 21.5 inches Full HD (1920 x 1080) IPS Ultra-Thin", "Samsung 49-Inch CHG90 144Hz Curved Gaming Monitor (LC49HG90DMNXZA) – Super Ultraw Screen QLED", "BIYLACLESEN Women's 3-in-1 Snowboard Jacket Winter Coats", "Lock and Love Women's Removable Hooded Faux Leather Moto Biker Jacket", "Rain Jacket Women Windbreaker Striped Climbing Raincoats", "MBJ Women's SolShort Sleeve Boat Neck V", "Opna Women's Short Sleeve Moisture", "DANVOUY Womens T Shirt Casual Cotton Short"};
	
	@Test
	public void checknamesArray() {
		assertEquals(names.length, 20);
	}
	
	@Test
	public void checkWomenNames() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
			.until(ExpectedConditions.visibilityOfElementLocated(By.className("card-title")));
		
		List<WebElement> cardTitleNames = driver.findElements(By.className("card-title"));
		
		for(int i = 15; i <= 19; i++ ) { //Räknar från 0, därför kollar jag upp till 19.
			String womensNames = cardTitleNames.get(i).getText();
			assertEquals(names[i], womensNames);
		}
	}
	
	@Test
	public void checkElectronicNames() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
			.until(ExpectedConditions.visibilityOfElementLocated(By.className("card-title")));
		
		List<WebElement> cardTitleNames = driver.findElements(By.className("card-title"));
		
		for(int i = 9; i <= 14; i++ ) {
			String electronicNames = cardTitleNames.get(i).getText();
			assertEquals(names[i], electronicNames);
		}
	}
	
	@Test
	public void checkJeweleryNames() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
			.until(ExpectedConditions.visibilityOfElementLocated(By.className("card-title")));
		
		List<WebElement> cardTitleNames = driver.findElements(By.className("card-title"));
		
		for(int i = 5; i <= 8; i++ ) {
			String jeweleryCardNames = cardTitleNames.get(i).getText();
			assertEquals(names[i], jeweleryCardNames);
		}
	}

	@Test
	public void checkMensNames() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
			.until(ExpectedConditions.visibilityOfElementLocated(By.className("card-title")));
		
		List<WebElement> cardTitleNames = driver.findElements(By.className("card-title"));
		
		
		for(int i = 0; i <= 4; i++ ) {
			String cardTitle = cardTitleNames.get(i).getText();
			assertEquals(names[i], cardTitle);
		}
		
		driver.quit();
	}
	@Test
	public void checkAllNames() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
			.until(ExpectedConditions.visibilityOfElementLocated(By.className("card-title")));
		
		List<WebElement> cardTitleNames = driver.findElements(By.className("card-title"));
		
		
		for(int i = 0; i < cardTitleNames.size(); i++ ) {
			String cardTitle = cardTitleNames.get(i).getText();
			assertEquals(names[i], cardTitle);
		}
		
		driver.quit();
	}

	@Test
	public void checkCategorywomensClothing() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://java22.netlify.app/");

		WebElement waiter = new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[5]/a")));
	
		assertEquals("women's clothing", waiter.getText());
		
		driver.quit();
	}

	@Test
	public void checkCategorymensclothing() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://java22.netlify.app/");

		WebElement waiter = new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[4]/a")));
	
		assertEquals("men's clothing", waiter.getText());
		
		driver.quit();
	}
	
	@Test
	public void checkCategoryJewelery() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://java22.netlify.app/");

		WebElement waiter = new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[3]/a")));
	
		assertEquals("jewelery", waiter.getText());
		
		driver.quit();
	}

	@Test
	public void checkCategoryElectronics() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		WebElement waiter = new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[2]/a")));
		
		assertEquals("electronics", waiter.getText());
		
		driver.quit();
	}
	@Test
	public void MensCasulaImageShouldSrcIsCorrect() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		WebElement waiter = new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[6]/div/div/div/div[2]/div/img")));
		
		assertEquals("https://fakestoreapi.com/img/71-3HjGNDUL._AC_SY879._SX._UX._SY._UY_.jpg", waiter.getAttribute("src"));
		
		driver.quit();
	}
	@Test
	public void BackPackImageShouldSrcIsCorrect() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		WebElement waiter = new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[6]/div/div/div/div[1]/div/img")));
		
		assertEquals("https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg", waiter.getAttribute("src"));
		
		driver.quit();
	}
	@Test
	public void MensCottonImageShouldSrcIsCorrect() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		WebElement waiter = new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[6]/div/div/div/div[3]/div/img")));
		
		assertEquals("https://fakestoreapi.com/img/71li-ujtlUL._AC_UX679_.jpg", waiter.getAttribute("src"));
		
		driver.quit();
	}
	
	@Test
	public void MensCottonImageShouldBeVisible() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		WebElement waiter = new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[6]/div/div/div/div[3]/div/img")));
		
		assertTrue(waiter.isDisplayed(), "bilden verkar inte läsas in");
		
		driver.quit();
	}
	
	@Test
	public void MensCasualImageShouldBeVisible() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		WebElement waiter = new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[6]/div/div/div/div[2]/div/img")));
		
		assertTrue(waiter.isDisplayed(), "bilden verkar inte läsas in");
		
		driver.quit();
	}

	@Test
	public void BackPackImageShouldBeVisible() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		WebElement waiter = new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[6]/div/div/div/div[1]/div/img")));
		
		assertTrue(waiter.isDisplayed(), "bilden verkar inte läsas in");
		
		driver.quit();
	}
	@Test
	public void checkIfTheSSDSanDiskIsRight() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		
		WebElement waiter = new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[6]/div/div/div/div[10]/div/div/p")));
		String text = waiter.getText();
		String digits = text.replaceAll("[^0-9]", "");
		
		assertEquals("109", digits);
		
		driver.quit();
	}
	@Test
	public void checkIfTheRingSolGoldIsRight() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		
		WebElement waiter = new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[6]/div/div/div/div[6]/div/div/p")));
		String text = waiter.getText();
		String digits = text.replaceAll("[^0-9]", "");
		
		assertEquals("168", digits);
		
		driver.quit();
	}
	@Test
	public void checkIfTheRingJohnPriceIsRight() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		
		WebElement waiter = new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[6]/div/div/div/div[5]/div/div/p")));
		String text = waiter.getText();
		String digits = text.replaceAll("[^0-9]", "");
		
		assertEquals("695", digits);
		
		driver.quit();
	}
	
	@Test
	public void checkIfTheBackPackPriceIsRight() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		
		WebElement waiter = new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[6]/div/div/div/div[1]/div/div/p")));
		String text = waiter.getText();
		String digits = text.replaceAll("[^0-9.]", "");
		
		assertEquals("109.95", digits);
		
		driver.quit();
	}
	
	@Test
	public void checkIfSlimFitTshirtPriceIsRight() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		
		WebElement waiter = new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[6]/div/div/div/div[2]/div/div/p")));
		String text = waiter.getText();
		String digits = text.replaceAll("[^0-9.]", "");
		
		assertEquals("22.3", digits);
		
		driver.quit();		
	}
	
	@Test
	public void CheckIfMensCottonJacketPriceIsRight() {
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://java22.netlify.app/");
			
			
			WebElement waiter = new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[6]/div/div/div/div[3]/div/div/p")));
			String text = waiter.getText();
			String digits = text.replaceAll("[^0-9.]", "");
			
			assertEquals("55.99", digits);
			
			driver.quit();		
		}
	@Test
	public void productCategoryClickShowCategoryAmountNumber_Electronics() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
			.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("electronics"))).click();
		
		
		List<WebElement> ElectronicProducts = driver.findElements(By.className("productItem"));
		
		assertEquals(6, ElectronicProducts.size());
		
		driver.quit();
	}
	@Test
	public void productCategoryClickShowCategoryAmountNumber_Jewelery() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
			.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("jewelery"))).click();
		
		
		List<WebElement> JewelereyProducts = driver.findElements(By.className("productItem"));
		
		assertEquals(4, JewelereyProducts.size());
		
		driver.quit();
	}
	@Test
	public void productCategoryClickShowCategoryAmountNumber_mensclothing() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
			.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("men's clothing"))).click();
		
		
		List<WebElement> MensProducts = driver.findElements(By.className("productItem"));
		
		assertEquals(4, MensProducts.size());
		
		driver.quit();
	}
	@Test
	public void productCategoryClickShowCategoryAmountNumber_womensclothing() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
			.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("women's clothing"))).click();
		
		
		List<WebElement> WomensProducts = driver.findElements(By.className("productItem"));
		
		assertEquals(6, WomensProducts.size());
		
		driver.quit();
	}
	
	
	@Test
	public void numberOfProductsShouldBeTwenty() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOfElementLocated(By.className("productItem")));
		
		List<WebElement> products = driver.findElements(By.className("productItem"));
		
		assertEquals(20,products.size());
		
		driver.quit();
	}
	
	
	@Test
	public void checkH1Text() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		String h1Text = driver.findElement(By.xpath("html/body/div/div/div[1]/div/h1")).getText();
		
		assertEquals("Testdriven utveckling - projekt", h1Text);
		
		driver.quit();
	}
	
	@Test
	public void testNelify() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://java22.netlify.app/");
		
		assertEquals("Webbutik", driver.getTitle());
		
		driver.quit();
	}
	
	
	/*
	@Test
	public void checkSvtTitle() {
		// Hämta in den webdriver som ska användas
		
		WebDriver driver = new FirefoxDriver();
		
		// Navigera till den webbsida som ska testas
		driver.get("https://svtplay.se");
		
		assertEquals("SVT Play", driver.getTitle());
		
		driver.quit();
		
		
	}
	*/
	/*
	@Test
	public void checkSvtText() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://svtplay.se");
		
		WebElement textDemo = driver.findElement(By.xpath("//*[text()='Hårt sex']"));
		
		assertEquals("Hårt sex", textDemo.getText());
		
		driver.quit();
	}
	*/
	/*
	@Test
	public void checkStiTitle() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://sti.se");
		
		assertEquals("STI - YH-program och vidareutbildningar inom teknik & IT"
				, driver.getTitle());
		
		driver.quit();
	}
	*/

}
