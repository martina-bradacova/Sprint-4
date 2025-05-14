package cz.czechitas.automation;

import org.junit.jupiter.api.Test;

public class TestQueens_28 extends TestRunner {

    void login (String email, String password) {
        browser.loginSection.clickLoginMenuLink();
        browser.loginSection.insertEmail(email);
        browser.loginSection.insertPassword(password);
        browser.loginSection.clickLoginButton();
    }

//      28 - Create booking as a teacher

    @Test
    void teacher_primestsky_tabor(){
        browser.headerMenu.goToKindergartenAndSchoolSection();
        browser.orderSection.insertICO("12345678");
        browser.waitFor(5);
        var odberatel=browser.generateRandomName(8);
        browser.orderDetailSection.insertClient(odberatel);
        browser.orderDetailSection.insertFullAddress("Školní 5, 61200, Brno");
        browser.orderDetailSection.insertSubstitute("Paní Školníková");
        browser.orderDetailSection.insertContactPersonNameAndSurname("Pan", "Škola");
        browser.orderDetailSection.insertContactPersonTelephone("+420777888999");
        browser.orderDetailSection.insertContactPersonEmail("skola@email.cz");
        browser.orderDetailSection.insertStartDate("01.01.2026");
        browser.orderDetailSection.insertEndDate("07.01.2026");
        browser.orderSection.selectSuburbanCampOption();
        browser.orderDetailSection.selectForenoonSuburbanCampVariant();
        browser.orderDetailSection.insertChildrenCountToSuburbanCamp(10);
        browser.orderDetailSection.insertInAgeToSuburbanCamp(7);
        browser.orderDetailSection.insertAdultsCountToSuburbanCamp(3);
        browser.orderDetailSection.saveSuburbanCampOrder();
        asserter.generalSection.checkCurrentUrl("https://team8-2022brno.herokuapp.com/objednavka/pridat");

        browser.waitFor(7);
        login ("da-app.master@czechitas.cz", "AppRoot123");
        browser.internalMenu.goToOrdersSection();
        browser.orderSection.search(odberatel);
        asserter.orderSection.checkNumberOfOrders(1);
    }

    @Test
    void teacher_skola_v_prirode (){
        browser.headerMenu.goToKindergartenAndSchoolSection();
        browser.orderSection.insertICO("23456789");
        browser.waitFor(5);
        var odberatel=browser.generateRandomName(8);
        browser.orderDetailSection.insertClient(odberatel);
        browser.orderDetailSection.insertFullAddress("Školní 10, 61200, Brno");
        browser.orderDetailSection.insertSubstitute("Pan Školník");
        browser.orderDetailSection.insertContactPersonNameAndSurname("Paní", "Školka");
        browser.orderDetailSection.insertContactPersonTelephone("+420555666777");
        browser.orderDetailSection.insertContactPersonEmail("skolka@email.cz");
        browser.orderDetailSection.insertStartDate("01.01.2026");
        browser.orderDetailSection.insertEndDate("07.01.2026");
        browser.orderSection.selectSchoolInNatureOption();
        browser.orderDetailSection.insertChildrenCountToSchoolInNature(10);
        browser.orderDetailSection.insertInAgeToSchoolInNature(10);
        browser.orderDetailSection.insertAdultsCountToSchoolInNature(3);
        browser.orderDetailSection.insertStartTime("7:00");
        browser.orderDetailSection.selectBreakfastStartToSchoolInNature();
        browser.orderDetailSection.insertEndTime("12:00");
        browser.orderDetailSection.selectBreakfastEndToSchoolInNature();
        browser.orderDetailSection.saveSchoolInNatureOrder();
        asserter.generalSection.checkCurrentUrl("https://team8-2022brno.herokuapp.com/objednavka/pridat");

        browser.waitFor(7);
        login ("da-app.admin@czechitas.cz", "Czechitas123");
        browser.internalMenu.goToOrdersSection();
        browser.orderSection.search(odberatel);
        asserter.orderSection.checkNumberOfOrders(1);
    }

    @Test
    void MA_primestsky_tabor(){
        login ("da-app.master@czechitas.cz", "AppRoot123");
        var odberatel=browser.generateRandomName(8);
        browser.internalMenu.goToOrdersSection();
        browser.orderSection.search(odberatel);
        asserter.orderSection.checkOrdersTableIsEmpty();

        browser.orderSection.clickAddButton();
        browser.orderSection.insertICO("98765432");
        browser.waitFor(5);
        browser.orderDetailSection.insertClient(odberatel);
        browser.orderDetailSection.insertFullAddress("Školní 15, 61200, Brno");
        browser.orderDetailSection.insertSubstitute("Paní Školnice");
        browser.orderDetailSection.insertContactPersonNameAndSurname("Pan", "Školka");
        browser.orderDetailSection.insertContactPersonTelephone("+420111222333");
        browser.orderDetailSection.insertContactPersonEmail("skolkka@email.cz");
        browser.orderDetailSection.insertStartDate("01.01.2026");
        browser.orderDetailSection.insertEndDate("07.01.2026");
        browser.orderSection.selectSuburbanCampOption();
        browser.orderDetailSection.selectForenoonSuburbanCampVariant();
        browser.orderDetailSection.insertChildrenCountToSuburbanCamp(10);
        browser.orderDetailSection.insertInAgeToSuburbanCamp(7);
        browser.orderDetailSection.insertAdultsCountToSuburbanCamp(3);
        browser.orderDetailSection.saveSuburbanCampOrder();
        asserter.generalSection.checkCurrentUrl("https://team8-2022brno.herokuapp.com/objednavka/pridat");

        browser.internalMenu.goToOrdersSection();
        browser.orderSection.search(odberatel);
        asserter.orderSection.checkNumberOfOrders(1);
    }

    @Test
    void MA_skola_v_prirode (){
        login ("da-app.master@czechitas.cz", "AppRoot123");
        var odberatel=browser.generateRandomName(8);
        browser.internalMenu.goToOrdersSection();
        browser.orderSection.search(odberatel);
        asserter.orderSection.checkOrdersTableIsEmpty();

        browser.orderSection.clickAddButton();
        browser.orderSection.insertICO("98765432");
        browser.waitFor(5);
        browser.orderDetailSection.insertClient(odberatel);
        browser.orderDetailSection.insertFullAddress("Školní 20, 61200, Brno");
        browser.orderDetailSection.insertSubstitute("Paní Školnice");
        browser.orderDetailSection.insertContactPersonNameAndSurname("Pan", "Školka");
        browser.orderDetailSection.insertContactPersonTelephone("+420222333444");
        browser.orderDetailSection.insertContactPersonEmail("skolkka@email.cz");
        browser.orderDetailSection.insertStartDate("01.01.2026");
        browser.orderDetailSection.insertEndDate("07.01.2026");
        browser.orderSection.selectSchoolInNatureOption();
        browser.orderDetailSection.insertChildrenCountToSchoolInNature(10);
        browser.orderDetailSection.insertInAgeToSchoolInNature(10);
        browser.orderDetailSection.insertAdultsCountToSchoolInNature(3);
        browser.orderDetailSection.insertStartTime("12:00");
        browser.orderDetailSection.selectLunchStartToSchoolInNature();
        browser.orderDetailSection.insertEndTime("14:00");
        browser.orderDetailSection.selectLunchEndToSchoolInNature();
        browser.orderDetailSection.saveSchoolInNatureOrder();
        asserter.generalSection.checkCurrentUrl("https://team8-2022brno.herokuapp.com/objednavka/pridat");

        browser.internalMenu.goToOrdersSection();
        browser.orderSection.search(odberatel);
        asserter.orderSection.checkNumberOfOrders(1);
    }

    @Test
    void A_primestsky_tabor(){
        login ("da-app.admin@czechitas.cz", "Czechitas123");
        var odberatel=browser.generateRandomName(8);
        browser.internalMenu.goToOrdersSection();
        browser.orderSection.search(odberatel);
        asserter.orderSection.checkOrdersTableIsEmpty();

        browser.orderSection.clickAddButton();
        browser.orderSection.insertICO("87654321");
        browser.waitFor(5);
        browser.orderDetailSection.insertClient(odberatel);
        browser.orderDetailSection.insertFullAddress("Školní 25, 61200, Brno");
        browser.orderDetailSection.insertSubstitute("Paní Školnice");
        browser.orderDetailSection.insertContactPersonNameAndSurname("Pan", "Školka");
        browser.orderDetailSection.insertContactPersonTelephone("+420222444666");
        browser.orderDetailSection.insertContactPersonEmail("skolkkka@email.cz");
        browser.orderDetailSection.insertStartDate("01.01.2026");
        browser.orderDetailSection.insertEndDate("07.01.2026");
        browser.orderSection.selectSuburbanCampOption();
        browser.orderDetailSection.selectForenoonSuburbanCampVariant();
        browser.orderDetailSection.insertChildrenCountToSuburbanCamp(10);
        browser.orderDetailSection.insertInAgeToSuburbanCamp(7);
        browser.orderDetailSection.insertAdultsCountToSuburbanCamp(3);
        browser.orderDetailSection.saveSuburbanCampOrder();
        asserter.generalSection.checkCurrentUrl("https://team8-2022brno.herokuapp.com/objednavka/pridat");

        browser.internalMenu.goToOrdersSection();
        browser.orderSection.search(odberatel);
        asserter.orderSection.checkNumberOfOrders(1);
    }

    @Test
    void A_skola_v_prirode (){
        login ("da-app.admin@czechitas.cz", "Czechitas123");
        var odberatel=browser.generateRandomName(8);
        browser.internalMenu.goToOrdersSection();
        browser.orderSection.search(odberatel);
        asserter.orderSection.checkOrdersTableIsEmpty();

        browser.orderSection.clickAddButton();
        browser.orderSection.insertICO("98765432");
        browser.waitFor(5);
        browser.orderDetailSection.insertClient(odberatel);
        browser.orderDetailSection.insertFullAddress("Školní 30, 61200, Brno");
        browser.orderDetailSection.insertSubstitute("Paní Školnice");
        browser.orderDetailSection.insertContactPersonNameAndSurname("Pan", "Školka");
        browser.orderDetailSection.insertContactPersonTelephone("+420222333444");
        browser.orderDetailSection.insertContactPersonEmail("skolkkaa@email.cz");
        browser.orderDetailSection.insertStartDate("01.01.2026");
        browser.orderDetailSection.insertEndDate("07.01.2026");
        browser.orderSection.selectSchoolInNatureOption();
        browser.orderDetailSection.insertChildrenCountToSchoolInNature(10);
        browser.orderDetailSection.insertInAgeToSchoolInNature(10);
        browser.orderDetailSection.insertAdultsCountToSchoolInNature(3);
        browser.orderDetailSection.insertStartTime("15:00");
        browser.orderDetailSection.selectDinnerStartToSchoolInNature();
        browser.orderDetailSection.insertEndTime("18:00");
        browser.orderDetailSection.selectDinnerEndToSchoolInNature();
        browser.orderDetailSection.saveSchoolInNatureOrder();
        asserter.generalSection.checkCurrentUrl("https://team8-2022brno.herokuapp.com/objednavka/pridat");

        browser.internalMenu.goToOrdersSection();
        browser.orderSection.search(odberatel);
        asserter.orderSection.checkNumberOfOrders(1);
    }

}
