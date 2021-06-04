import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Value;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SampleTest<relativeOrabsoluteUrl> {
    private static final String BASE_URL = "https://www.olx.ua";
    private static final String EMAIL = "EMAIL";
    private static final String PASSWORD = "PASSWORD";


    @Test
    public void loginOlxTest() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = BASE_URL;
        Configuration.pageLoadTimeout = 150000;
        Selenide.open("https://www.olx.ua/account/?ref%5B0%5D%5Baction%5D=myaccount&ref%5B0%5D%5Bmethod%5D=index#register");
        $("[name='register[email_phone]']").sendKeys("radorth47605@jmpant.com");
        $("[name='register[password]']").sendKeys("Qetuo123");
        $("[class='login-button login-button--submit g-recaptcha']").click();
        Selenide.open("https://www.olx.ua/account/checkemailafterpost/?type=register&email=OjzcBxAYltEnDzz4ENQVrJ2q9lKrS%2FW1#register");
    }
}
