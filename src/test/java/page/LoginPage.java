package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
    @FindBy(name = "username")
    WebElement txtUsername;
    @FindBy(name = "password")
    WebElement txtPassword;
    @FindBy(css = "[type=\"submit\"]")
    WebElement btnLogin;

    @FindBy(className = "oxd-userdropdown-name")
    WebElement loggedIn;

    @FindBy(css = "[role=\"menuitem\"]")
    List<WebElement> dropMenu;

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void doLogin(String username, String password) {
        txtUsername.sendKeys(username);
        txtPassword.sendKeys(password);
        btnLogin.click();

    }

    public void doLogout() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loggedIn.click();
        loginPage.dropMenu.get(3).click();  // logout btn
    }
}
