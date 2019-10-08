package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.ContactInformationPage;
import pages.FoundingResultsPage;
import pages.SearchPage;

public class ComparingValidContactos {

    @Test
    public void comparingValidContactos(){
        SearchPage first = new SearchPage();
        FoundingResultsPage second = new FoundingResultsPage();
        ContactInformationPage third = new ContactInformationPage();
    }
}
