import org.junit.jupiter.api.Test;

public class TestQueens_10 extends TestRunner{

    void login (String email, String password) {
        browser.loginSection.clickLoginMenuLink();
        browser.loginSection.insertEmail(email);
        browser.loginSection.insertPassword(password);
        browser.loginSection.clickLoginButton();
    }

//      10 - User Registration & Login process

    @Test
    void user_registration_and_login_process (){
        var prijmeni = browser.generateRandomName(8);
        var email = prijmeni + "@" + "email.cz";
        var password = prijmeni + "A1";

        browser.loginSection.clickLoginMenuLink();
        browser.loginSection.clickRegisterButton();
        browser.registerSection.insertFirstAndLastName("Rodič", prijmeni);
        browser.registerSection.insertEmail(email);
        browser.registerSection.insertPassword(password);
        browser.registerSection.insertPasswordConfirmation(password);
        browser.registerSection.clickRegisterButton();
        asserter.generalSection.checkCurrentUrl("https://team8-2022brno.herokuapp.com/zaci");

        browser.loginSection.logout();
        asserter.loginSection.checkUserIsNotLoggedIn();

        login (email,password);
        asserter.loginSection.checkUserIsLoggedIn(prijmeni);
    }

    @Test
    void kacka () {
        browser.loginSection.clickLoginMenuLink();
        browser.loginSection.clickRegisterButton();
        var jmeno = browser.generateRandomName(4);
        var prijmeni = browser.generateRandomName(6);
        browser.registerSection.insertFirstAndLastName(jmeno,prijmeni);
        var email = browser.generateRandomName(6) + "@" + "test.cz";
        browser.registerSection.insertEmail(email);
        var heslo = browser.generateRandomName(6) + "C" + "3";
        browser.registerSection.insertPassword(heslo);
        browser.registerSection.insertPasswordConfirmation(heslo);
        browser.registerSection.clickRegisterButton();
    }

}
