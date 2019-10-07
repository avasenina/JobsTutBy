package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FoundingResultsPage {

    public void FoundingResultsPage(){
        $(By.xpath("//*[contains(@class, 'bloko-link bloko-link_secondary') and contains(text(),' a1qa')]/../..//*[@data-qa='vacancy-serp__vacancy-title']")).click();
    }

}
