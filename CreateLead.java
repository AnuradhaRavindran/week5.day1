package testcases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	
 @Test(dataProvider = "sendData")
	public  void createLead(String cmpy,String fname , String lname,String ph) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmpy);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(ph);
		driver.findElement(By.name("submitButton")).click();
		
}
 @DataProvider
  public String[][] sendData() throws IOException
		  
  {
	  return ReadExcel.readcreateleadData("createLead");
	  //return readData;
	 /*String[][] data = new String[2][4];
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
