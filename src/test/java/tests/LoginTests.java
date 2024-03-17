package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @Test
    public void loginSuccess (){
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("dingerom@gmail.com", "Dj12345$");
        app.getHelperUser().submitLogin();

        Assert.assertEquals(app.getHelperUser().getMessage(), "Logged in success");
        app.getHelperUser().clickOkButton();

       // Assert.assertTrue(app.getHelperUser().isLogged());
    }

}
