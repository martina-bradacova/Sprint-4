import org.junit.jupiter.api.Test;

public class TestQueens_27 extends TestRunner {

    void login (String email, String password) {
        browser.loginSection.clickLoginMenuLink();
        browser.loginSection.insertEmail(email);
        browser.loginSection.insertPassword(password);
        browser.loginSection.clickLoginButton();
    }

//      27 - Create application as a parent

    @Test
    void nova_prihlaska_s_platnymi_povinnymi_udaji_bankovni_prevod(){
        login("rodicsprint4@email.cz", "Rodicsprint4");
        browser.headerMenu.goToApplicationsSection();
        browser.applicationSection.clickCreateNewApplicationButton();
        browser.applicationSection.selectProgrammingSection();
        browser.applicationSection.clickCreatePythonApplicationButton();
        browser.applicationDetailsSection.selectTerm("04.06. - 08.06.2025");
        browser.applicationDetailsSection.insertStudentFirstName("Žák");
        browser.applicationDetailsSection.insertStudentLastName("Sprint4");
        browser.applicationDetailsSection.insertBirthdate("15.05.2017");
        browser.applicationDetailsSection.selectBankTransferPaymentMethod();
        browser.applicationDetailsSection.clickAcceptTermsCheckbox();
        browser.applicationDetailsSection.clickCreateApplicationButton();
        asserter.applicationDetailSection.checkTerm("04.06. - 08.06.2025");
        asserter.applicationDetailSection.checkPaymentMethod("Bankovní převod");
        asserter.applicationDetailSection.checkRemainingAmountToPay("1 800 Kč");
        asserter.applicationDetailSection.checkMessageContainsStudentLastName("Sprint4");
        asserter.applicationDetailSection.checkFirstName("Žák");
        asserter.applicationDetailSection.checkLastName("Sprint4");
        asserter.applicationDetailSection.checkDateOfBirth("15.05.2017");
    }

    @Test
    void nova_prihlaska_s_platnymi_povinnymi_udaji_slozenka(){
        login("rodicsprint4@email.cz", "Rodicsprint4");
        browser.headerMenu.goToApplicationsSection();
        browser.applicationSection.clickCreateNewApplicationButton();
        browser.applicationSection.selectProgrammingSection();
        browser.applicationSection.clickCreatePythonApplicationButton();
        browser.applicationDetailsSection.selectTerm("04.06. - 08.06.2025");
        browser.applicationDetailsSection.insertStudentFirstName("Žák");
        browser.applicationDetailsSection.insertStudentLastName("Sprint4");
        browser.applicationDetailsSection.insertBirthdate("15.05.2017");
        browser.applicationDetailsSection.selectSlipPaymentMethod();
        browser.applicationDetailsSection.clickAcceptTermsCheckbox();
        browser.applicationDetailsSection.clickCreateApplicationButton();
        asserter.applicationDetailSection.checkTerm("04.06. - 08.06.2025");
        asserter.applicationDetailSection.checkPaymentMethod("Složenka");
        asserter.applicationDetailSection.checkRemainingAmountToPay("1 800 Kč");
        asserter.applicationDetailSection.checkMessageContainsStudentLastName("Sprint4");
        asserter.applicationDetailSection.checkFirstName("Žák");
        asserter.applicationDetailSection.checkLastName("Sprint4");
        asserter.applicationDetailSection.checkDateOfBirth("15.05.2017");
    }

    @Test
    void nova_prihlaska_s_platnymi_povinnymi_udaji_FKSP (){
        login("rodicsprint4@email.cz", "Rodicsprint4");
        browser.headerMenu.goToApplicationsSection();
        browser.applicationSection.clickCreateNewApplicationButton();
        browser.applicationSection.selectProgrammingSection();
        browser.applicationSection.clickCreatePythonApplicationButton();
        browser.applicationDetailsSection.selectTerm("04.06. - 08.06.2025");
        browser.applicationDetailsSection.insertStudentFirstName("Žák");
        browser.applicationDetailsSection.insertStudentLastName("Sprint4");
        browser.applicationDetailsSection.insertBirthdate("15.05.2017");
        browser.applicationDetailsSection.selectFKSPPaymentMethod();
        browser.applicationDetailsSection.clickAcceptTermsCheckbox();
        browser.applicationDetailsSection.clickCreateApplicationButton();
        asserter.applicationDetailSection.checkTerm("04.06. - 08.06.2025");
        asserter.applicationDetailSection.checkPaymentMethod("FKSP");
        asserter.applicationDetailSection.checkFirstName("Žák");
        asserter.applicationDetailSection.checkLastName("Sprint4");
        asserter.applicationDetailSection.checkDateOfBirth("15.05.2017");
    }

    @Test
    void nova_prihlaska_s_platnymi_povinnymi_udaji_hotove (){
        login("rodicsprint4@email.cz", "Rodicsprint4");
        browser.headerMenu.goToApplicationsSection();
        browser.applicationSection.clickCreateNewApplicationButton();
        browser.applicationSection.selectProgrammingSection();
        browser.applicationSection.clickCreatePythonApplicationButton();
        browser.applicationDetailsSection.selectTerm("04.06. - 08.06.2025");
        browser.applicationDetailsSection.insertStudentFirstName("Žák");
        browser.applicationDetailsSection.insertStudentLastName("Sprint4");
        browser.applicationDetailsSection.insertBirthdate("15.05.2017");
        browser.applicationDetailsSection.selectCashPaymentMethod();
        browser.applicationDetailsSection.clickAcceptTermsCheckbox();
        browser.applicationDetailsSection.clickCreateApplicationButton();
        asserter.applicationDetailSection.checkTerm("04.06. - 08.06.2025");
        asserter.applicationDetailSection.checkPaymentMethod("Hotově");
        asserter.applicationDetailSection.checkFirstName("Žák");
        asserter.applicationDetailSection.checkLastName("Sprint4");
        asserter.applicationDetailSection.checkDateOfBirth("15.05.2017");
    }

    @Test
    void nova_prihlaska_s_platnymi_vsemi_udaji() {
        login("rodicsprint4@email.cz", "Rodicsprint4");
        browser.headerMenu.goToApplicationsSection();
        browser.applicationSection.clickCreateNewApplicationButton();
        browser.applicationSection.selectProgrammingSection();
        browser.applicationSection.clickCreatePythonApplicationButton();
        browser.applicationDetailsSection.selectTerm("04.06. - 08.06.2025");
        browser.applicationDetailsSection.insertStudentFirstName("Žák");
        browser.applicationDetailsSection.insertStudentLastName("Sprint4");
        browser.applicationDetailsSection.insertBirthdate("15.05.2017");
        browser.applicationDetailsSection.selectBankTransferPaymentMethod();
        browser.applicationDetailsSection.clickHealthDisabilityCheckbox();
        browser.applicationDetailsSection.insertHealthDisabilityNote("Alergie na prach.");
        browser.applicationDetailsSection.insertNote("Neumí česky.");
        browser.applicationDetailsSection.clickAcceptTermsCheckbox();
        browser.applicationDetailsSection.clickCreateApplicationButton();
        asserter.applicationDetailSection.checkTerm("04.06. - 08.06.2025");
        asserter.applicationDetailSection.checkPaymentMethod("Bankovní převod");
        asserter.applicationDetailSection.checkRemainingAmountToPay("1 800 Kč");
        asserter.applicationDetailSection.checkMessageContainsStudentLastName("Sprint4");
        asserter.applicationDetailSection.checkFirstName("Žák");
        asserter.applicationDetailSection.checkLastName("Sprint4");
        asserter.applicationDetailSection.checkDateOfBirth("15.05.2017");
        asserter.applicationDetailSection.checkHealthDisabilityNote("Alergie na prach.");
        asserter.applicationDetailSection.checkNote("Neumí česky.");
    }

    @Test
    void nove_prihlasky_jsou_v_seznamu_prihlasek (){
        login("rodicsprint4@email.cz", "Rodicsprint4");
        var prijmeni=browser.generateRandomName(8);
        browser.headerMenu.goToApplicationsSection();
        browser.applicationSection.search(prijmeni);
        asserter.applicationSection.checkApplicationsTableIsEmpty();

        browser.applicationSection.clickCreateNewApplicationButton();
        browser.applicationSection.selectProgrammingSection();
        browser.applicationSection.clickCreatePythonApplicationButton();
        browser.applicationDetailsSection.selectTerm("04.06. - 08.06.2025");
        browser.applicationDetailsSection.insertStudentFirstName("Žák");
        browser.applicationDetailsSection.insertStudentLastName(prijmeni);
        browser.applicationDetailsSection.insertBirthdate("15.05.2017");
        browser.applicationDetailsSection.selectBankTransferPaymentMethod();
        browser.applicationDetailsSection.clickAcceptTermsCheckbox();
        browser.applicationDetailsSection.clickCreateApplicationButton();

        browser.headerMenu.goToApplicationsSection();
        browser.applicationSection.search(prijmeni);
        asserter.applicationSection.checkNumberOfApplications(1);
    }

}
