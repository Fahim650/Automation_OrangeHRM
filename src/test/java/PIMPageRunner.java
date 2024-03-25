
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PIMPageRunner extends Setup{
    @BeforeTest
    public void login(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin("Admin","admin123");
    }
    @Test
    public void employeeRegister() throws InterruptedException {
        PIMPage pimPage = new PIMPage(driver);
        pimPage.registerUser("Shazzadul","Islam","Fahim","Fahin650","@Fahim1@");
    }
}
