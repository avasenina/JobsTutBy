package pages;

import com.codeborne.selenide.CollectionCondition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ContactInformationPage {

    public void contactInformationPage(){

        $(By.className("vacancy-contacts__title-closed")).click();
        $(By.className("vacancy-contacts__body")).shouldHave(text("3429063"),text("7333100"),text("job@a1qa.com"));
        }
}
