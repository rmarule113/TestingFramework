package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    /**Constructor*/
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**Variables*/
    String baseURL = "HTTP://192.168.99.100:9191/LOGIN?FROM=%2F";

    /**Web Elements*/
    By signInButtonClass = By.className("btnSignIn");

    /**Page Methods*/
    public HomePage goToN11() {
        driver.get(baseURL);
        return this;
    }

    public LoginPage goToLoginPage() {
        click(signInButtonClass);
        return new LoginPage(driver);
    }
}