import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PIMPage {
    @FindBy(className = "oxd-main-menu-item")
    List<WebElement> menuItems;

    @FindBy(className = "oxd-button")
    List<WebElement> addBtn;

    @FindBy(className = "oxd-switch-input")
    WebElement toggleBtn;

    @FindBy(className = "oxd-input")
    List<WebElement> inputBtn;

WebDriver driver;
    public PIMPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void registerUser(String firstName,String middleName,String lastName,String Username,String password) throws InterruptedException {
        menuItems.get(1).click(); //Click PIM Button
        addBtn.get(2).click(); //Click Add Button
        toggleBtn.click();
        inputBtn.get(1).sendKeys(firstName);//Enter first name
        inputBtn.get(2).sendKeys(middleName);//Enter middle name
        inputBtn.get(3).sendKeys(lastName);//Enter last name
        inputBtn.get(5).sendKeys(Username);//Enter Username
        inputBtn.get(6).sendKeys(password);//Enter Password
        inputBtn.get(7).sendKeys(password);//Enter Password
        Utils.doScroll(driver,0,300);
        addBtn.get(1).click();//Click save button
        Thread.sleep(5000);
    }
}


