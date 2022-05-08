package Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Generic.Generic_ReadExcel;
import Generic.Utility_Methods;
import POM_Script.POM_class;


public class Test_Script extends BaseClass
{
	    private static final String text = null;

		@Test
		public void test() throws EncryptedDocumentException, IOException
	{
		String firstname=Generic_ReadExcel.getData("Sheet1", 0, 0);
		String lastname=Generic_ReadExcel.getData("Sheet1", 1, 0);
		String email=Generic_ReadExcel.getData("Sheet1", 2, 0);
		String mnumb=Generic_ReadExcel.getData("Sheet1", 3, 0);

		POM_class pm=new POM_class(driver);
		pm.first(firstname);
		//wait.until(ExpectedConditions.visibilityOf(pms.fname));
		pm.last(lastname);
		//wait.until(ExpectedConditions.visibilityOf(pms.lname));
		pm.mail(email);
		//wait.until(ExpectedConditions.visibilityOf(pms.email));
		pm.numb(mnumb);
		//wait.until(ExpectedConditions.visibilityOf(pms.Mnumb));
        Utility_Methods.javascriptexe(driver)
                 .executeScript("window.scrollBy(0,600)");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("dataOfBirthInput"))));
        pm.dataOfBirth();
        Utility_Methods.select_class(driver.findElement(By.xpath("//select[@class='react-datepicker_month-select']")))
                 .selectByValue("4");
        Utility_Methods.select_class(driver.findElement(By.xpath("//select[@class='react-datepicker_year-select']")))
                 .selectByValue("1995");
        pm.datesel();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='submit']"))))
                .click();
        String text = driver.findElement(By.xpath("(//div[.='Thanks for submitting the form'])[2]"))
                .getText();
        Assert.assertEquals(text, "Thanks for submitting");
        System.out.print("Framework ends");
	}

}