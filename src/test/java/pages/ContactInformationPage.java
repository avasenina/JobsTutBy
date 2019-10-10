package pages;

import com.codeborne.selenide.CollectionCondition;
import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import javax.swing.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ContactInformationPage {
    FoundingResultsPage foundingResultsPage = new FoundingResultsPage();

    public void ContactInformationPage() {
        open(foundingResultsPage.FoundingResultsPage());
        $(byText("Контактная информация")).click();
        $(By.className("vacancy-contacts__phone-desktop")).shouldHave(text("+375 (33) 3429063"));
        $(By.xpath("//div[@class='vacancy-contacts__body']/p[3]")).shouldHave(text("+375 (44) 7333100"));
    }
}
