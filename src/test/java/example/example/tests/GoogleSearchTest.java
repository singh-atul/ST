package example.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import example.example.factory.PageinstancesFactory;
import example.example.pages.GooglePage;

/**
 * The Class GoogleSearchTest.
 *
 * @author Bharathish
 */
@Test(testName = "Google search test", description = "Test description")
public class GoogleSearchTest extends BaseTest {

	/**
	 * Google search test.
	 */
	@Test
	public void googleSearchTest() {
		try {

		driver.get("https://www.google.co.in/");
		GooglePage googlePage = PageinstancesFactory.getInstance(GooglePage.class);
			Thread.sleep(1000);
			
			googlePage.searchText("abc");
			Thread.sleep(1000);

			Assert.assertTrue(driver.getTitle().contains("abc"), "Title doesn't contain abc : Test Failed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void googleNewsSearchTest() {
		try {

		driver.get("https://www.google.co.in/");
		GooglePage googlePage = PageinstancesFactory.getInstance(GooglePage.class);
			Thread.sleep(1000);
			
			googlePage.searchText("abc");
			Thread.sleep(1000);	
			googlePage.checkNews();
			Thread.sleep(1000);		
			Assert.assertTrue(driver.getTitle().contains("abc"), "Title doesn't contain abc : Test Failed");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@Test
	public void googleImageSearchTest() {
		try {

		driver.get("https://www.google.co.in/");
		GooglePage googlePage = PageinstancesFactory.getInstance(GooglePage.class);
			Thread.sleep(1000);
			
			googlePage.searchText("abc");
			Thread.sleep(1000);	
			googlePage.checkImages();
			Thread.sleep(1000);			
			Assert.assertTrue(driver.getTitle().contains("abc"), "Title doesn't contain abc : Test Failed");
			Thread.sleep(1000);	
			googlePage.checkVideos();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Test
	public void googleVideoSearchTest() {
		try {

		driver.get("https://www.google.co.in/");
		GooglePage googlePage = PageinstancesFactory.getInstance(GooglePage.class);
			Thread.sleep(1000);
			
			googlePage.searchText("abc");
			Thread.sleep(1000);	
			googlePage.checkVideos();
			Thread.sleep(1000);
			Assert.assertTrue(driver.getTitle().contains("abc"), "Title doesn't contain abc : Test Failed");
			Thread.sleep(1000);	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


	@Test
	public void googleMapSearchTest() {
		try {

		driver.get("https://www.google.co.in/");
		GooglePage googlePage = PageinstancesFactory.getInstance(GooglePage.class);
			Thread.sleep(1000);
			
			googlePage.searchText("abc");
			Thread.sleep(1000);	
			googlePage.checkMaps();
			Thread.sleep(1000);
			Assert.assertTrue(driver.getTitle().contains("abc"), "Title doesn't contain abc : Test Failed");
			Thread.sleep(1000);	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
