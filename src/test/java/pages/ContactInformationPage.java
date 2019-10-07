package pages;

import com.sun.tools.javac.util.List;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ContactInformationPage {

    public void ContactInformationPage(){

        $(By.className("vacancy-contacts__title-closed")).click();
        $(By.className("vacancy-contacts__phone-desktop")).innerText(),

                //"+375 (33) 3429063");
    }
}
