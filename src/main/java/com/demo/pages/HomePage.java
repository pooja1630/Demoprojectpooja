package com.demo.pages;


import com.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Pooja Patel
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

  @CacheLookup
   @FindBy(xpath = "//a[@id='cookie_action_close_header']")
    WebElement acceptCoookies;

    //button[@id='onetrust-accept-btn-handler']

    @FindBy(xpath = "//a[@id='menu-item-dropdown-215']")
    WebElement career;

    @FindBy(xpath = "//a[contains(text(),'Landside')]")
    WebElement landsided;

    @FindBy(xpath = "//body/main[1]/div[1]/div[1]/a[1]")
    WebElement seeVacancy;

    @FindBy(xpath = "  //a[contains(text(),'Procurement Coordinator')]")
    WebElement ProcurementCoordinator;
    @FindBy(xpath = "  //body/main[1]/div[1]/div[2]/div[1]/div[3]/div[1]/a[1]")
    WebElement apply;
    @FindBy(xpath = "//body/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
    WebElement FirstName;


    @FindBy(name = "ApplicantSurname")
    WebElement lastName;
    @FindBy(name = "ApplicantEmail")
    WebElement emailId;
    @FindBy(xpath = "//body/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[2]/div[1]/div[4]/div[1]/input[1]")
   WebElement Phone;

    @FindBy(xpath = "//body/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[2]/div[2]/div[2]/div[1]/input[1]")
    WebElement city;

  //  WebElement seeVacancy;




    public void clickOnAcceptCoookies(){
    log.info("Clicking on accept cookies : " + acceptCoookies.toString());
        clickOnElement(acceptCoookies);
    }


    public void clickOnCareer (){
        log.info("Clicking on login link : " + career.toString());
        mouseHoverToElement(career);
    }
   public void clickOnLandsidedOption() {
        log.info("Clicking on login link : " + landsided.toString());
      // selectByVisibleTextFromDropDown(landsided,"Landside");
     //  clickOnElement(landsided);
       mouseHoverToElementAndClick(landsided);
   }
    public void clickOnvacancy (){
        log.info("Clicking on login link : " + seeVacancy.toString());
       clickOnElement(seeVacancy);
    }
    public void clickOnProcurementCoordinator (){
        log.info("Clicking on login link : " + ProcurementCoordinator.toString());
        clickOnElement(ProcurementCoordinator);
    }
    public void clickOnApply(){
        log.info("Clicking on login link : " + apply.toString());
        clickOnElement(apply);
    }
    public void sendTextOnFirstNameField(String username){
        sendTextToElement(FirstName,username);
        log.info("Clicking on register link : " + FirstName.toString());

    }
    public void sendTextOnLastNameField(String lastn){
        sendTextToElement(lastName,lastn);
        log.info("Clicking on register link : " + lastName.toString());

    }
    public void sendTextOnEmailIdField(String email){
        sendTextToElement(emailId,email);
        log.info("Clicking on register link : " + emailId.toString());
    }
    public void sendTextOnphoneField(String phone){
        sendTextToElement(Phone,phone);
        log.info("Clicking on register link : " + Phone.toString());
    }
    public void sendTextOnTownField(String town){
        sendTextToElement(city,town);
        log.info("Clicking on register link : " + city.toString());
    }
}

