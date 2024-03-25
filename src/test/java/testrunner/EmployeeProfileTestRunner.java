package testrunner;

import config.Setup;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import page.LoginPage;
import utils.Utils;

import java.io.IOException;

public class EmployeeProfileTestRunner extends Setup {
    @Test
    public void doLogin() throws IOException, ParseException {
        LoginPage loginPage = new LoginPage(driver);
        String userName = Utils.getUser().get("userName").toString();
        String password = Utils.getUser().get("password").toString();
        loginPage.doLogin(userName,password);
    }
}
