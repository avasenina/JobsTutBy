package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class FoundingResultsPage {
    private WebDriver driver ;

    public void foundingResultsPage(){
        $(By.xpath("//*[contains(@class, 'bloko-link bloko-link_secondary') and contains(text(),' a1qa')]/../..//*[@data-qa='vacancy-serp__vacancy-title']")).click();
    }
}
