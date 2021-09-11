package testcases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends BaseClass{
	@Test(dataProvider = "sendData")
	public  void editLead(String companyName ,String phone) throws InterruptedException {
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.name("submitButton")).click();
		
}
@DataProvider
public String[][] sendData() throws IOException
		  
{
	return ReadExcel.readcreateleadData("createLead");
	 // return ReadExcel.readcreateleadData("editLead");
	  //return readData;
	/* String[][] data = new String[2][4];
	 data[0][0] ="Hari";
	 data[0][1] ="R";
	 data[0][2] ="TestLeaf";
	 data[0][3] ="99";
	 
	 data[1][0] ="Ram";
	 data[1][1] ="G";
	 data[1][2] ="TestLeaf";
	 data[1][3] ="90";
	 return data;*/
	 
}
}



