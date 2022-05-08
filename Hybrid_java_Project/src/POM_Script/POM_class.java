package POM_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_class 
{
	@FindBy(id="firstName")
	public WebElement fname;
	
	@FindBy(xpath="//input[@id='lastName']")
	public WebElement lname;
	
	@FindBy(xpath="//input[@id='lastName']")
	public WebElement email;
	
	@FindBy(xpath="//label[@for='gender-radio-1']")
	private WebElement male;
	
	@FindBy(xpath="//label[@for='gender-radio-2']")
	private WebElement female;
	
	@FindBy(xpath="//label[@for='gender-radio-3']")
	private WebElement other;
	
	@FindBy(xpath="//input[@id='userNumber']")
	public WebElement Mnumb;
	
	@FindBy(xpath="//input[@id='dateOfBirthInput']")
	private WebElement dob;
	
	@FindBy(xpath="//div[@aria-label='Choose Sunday, May 15th, 2022']")
	private WebElement date;
	
	@FindBy(xpath="//div[@class='subjects-auto-complete_value-container subjects-auto-complete_value-container--is-multi css-1hwfws3']")
	private WebElement subject;
	
	@FindBy(xpath="//label[@for='hobbies-checkbox-1']")
	private WebElement hobbies;
	
	@FindBy(xpath="//input[@id='uploadPicture']")
	private WebElement picture;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	private WebElement address;
	
	@FindBy(xpath="//div[@id='react-select-3-option-0']")
	private WebElement state;
	
	@FindBy(xpath="//div[contains(text(),'Select City')]")
	private WebElement city;
	
	@FindBy(xpath="//body/div[@id='fixedban']/div/div[1]")
	private WebElement submit;

	public POM_class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void first(String datafname)
	{
		fname.sendKeys(datafname);
	}
	
	public void last(String datalname)
	{
		lname.sendKeys(datalname);
	}
	
	public void mail(String dataemail)
	{
		email.sendKeys(dataemail);
	}
	
	public void numb(String datanumb)
	{
		Mnumb.sendKeys(datanumb);
	}

	public void dataOfBirth() 
	{
	    dob.click();
	}

	public void datesel() 
	{
		
		date.click();
	}
}