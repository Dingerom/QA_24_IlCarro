package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperUser extends HelperBase{

    public HelperUser (WebDriver wd) {
        super(wd);
    }
    public void openLoginRegistrationForm(){
        click(By.cssSelector("a[href='/login?url=%2Fsearch']"));
    }
    //
    public void fillLoginForm(String email, String password){
//
//
        type(By.id("email"), email);
//
        type(By.id("password"), password);


    }

    public void submitLogin(){
        click(By.xpath ("//button[@type='submit']"));
    }

    public boolean isLogged() {
        return isElementPresent(By.xpath("//button[text()='Sign Out']"));
    }

    public void openLoginForm() {
        click(By.xpath("//a[text()=' Log in ']"));
    }

    public void clickOkButton() {
        click (By.xpath("//button[text()='Ok']"));

    }

    public String getMessage() {
        // pause (2000);
        return wd.findElement(By.cssSelector(".dialog-container>h2")).getText();
    }
}
