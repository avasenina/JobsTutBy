package pages;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class SearchPage {

    public void searchPage(){
        Configuration.timeout = 1000;
        open("https://jobs.tut.by/");
        Configuration.startMaximized = true;
        $(By.name("text")).sendKeys("junior Automation");
        $(By.name("text")).pressEnter();
    }
}
