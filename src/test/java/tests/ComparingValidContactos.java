package tests;

import org.testng.annotations.Test;
import pages.ContactInformationPage;
import pages.FoundingResultsPage;
import pages.SearchPage;

public class ComparingValidContactos {

//    @Rule
//    public ScreenShooter photographer = ScreenShooter.failedTests().succeededTests();

    @Test
    public void comparingValidContactos(){
        SearchPage first = new SearchPage();
        first.searchPage();
        FoundingResultsPage second = new FoundingResultsPage();
        second.foundingResultsPage();
        ContactInformationPage third = new ContactInformationPage();
        third.contactInformationPage();
    }
}
