package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class FoundingResultsPage {

    public String FoundingResultsPage(){
        return $(By.xpath("//*[contains(@class, 'bloko-link bloko-link_secondary') and contains(text(),' a1qa')]/../..//*[@data-qa='vacancy-serp__vacancy-title']")).getAttribute("href");
    }

}
