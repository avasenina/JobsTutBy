package pages;

import com.codeborne.selenide.CollectionCondition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ContactInformationPage {

    public void ContactInformationPage(){

        $(By.className("vacancy-contacts__title-closed")).click();
        $(By.xpath("//*[contains(@class, 'vacancy-contacts__body')]//*[@class='vacancy-contacts__phone-desktop']")).shouldHave(text("3429063"));
        $$(By.xpath("//*[contains(@class, 'vacancy-contacts__body')]//*[@class='vacancy-contacts__phone-desktop']")).shouldHave(CollectionCondition.size(2)).shouldHave(CollectionCondition.texts("7333100"));
        $(By.xpath("//*[contains(@class, 'vacancy-contacts__body')]//*[@data-qa='vacancy-contacts__email']")).shouldHave(text("job@a1qa.com"));
    }
}
