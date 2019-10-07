package pages;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class SearchPage {

    public void SearchPage(){
        Configuration.startMaximized = true;
        open("https://jobs.tut.by/");
        $(By.name("text")).sendKeys("junior Automation");
        $(By.name("text")).pressEnter();
    }
}
