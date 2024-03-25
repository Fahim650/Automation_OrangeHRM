package testrunner;

import com.github.javafaker.Faker;
import config.Setup;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.LoginPage;
import page.PIMPage;

import java.io.IOException;

public class PIMPageRunner extends Setup {
    @BeforeTest
    public void login(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin("Admin","admin123");
    }
    @Test(priority = 1,description = "Create Employee")
    public void employeeRegister() throws InterruptedException, IOException, ParseException {
        PIMPage pimPage = new PIMPage(driver);
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String userName = faker.name().username();
        pimPage.registerUser(firstName,lastName,userName,"Fahim650");

    }
}
