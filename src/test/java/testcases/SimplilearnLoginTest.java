package testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;

public class SimplilearnLoginTest extends BaseClass{

	@Test
	public void Test1() {
	
		LoginPage lp=new LoginPage(driver);
		lp.Login("abc@xyz.com","Test@1234" );
		
		
		//Step6: Error messege vallidation
		
		WebElement Error =driver.findElement(By.id("msg_box"));
		
		String ActError=Error.getText();
		String ExpError="The email or password you have entered is invalid.";
		
		Assert.assertTrue(Error.isDisplayed());
		Assert.assertEquals(ActError,ExpError);
		/*if(ActError.equals(ExpError)) {
			System.out.println("TC Passed");
		}else{
			System.out.println("TC Failed");
		}*/
	}
		
		@Test
		@Parameters({"uname","pwd"})
		public void Test2(String UserName, String Password) {
		
			LoginPage lp=new LoginPage(driver);
			lp.Login(UserName,Password );
		
	}
		@Test
		public void Test3() {
			
			String UserName = sheet.getRow(1).getCell(0).getStringCellValue();
	        String Password = sheet.getRow(1).getCell(1).getStringCellValue();
			
			LoginPage lp=new LoginPage(driver);
			lp.Login(UserName,Password );
		
	}
}
