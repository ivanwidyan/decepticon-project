package com.decepticon.steps;

import com.decepticon.module.constant.Consts;
import com.decepticon.module.ui.HomePage;
import com.decepticon.module.utils.CommonAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;

public class HomePageSteps extends ScenarioSteps {

    private CommonAction commonAction;

    private HomePage homePage;

    @Given("open home page")
    public void openHomePage() {
        commonAction.openPage("https://www.makemytrip.com/");
    }

    @When("at home page click button Hotel")
    public void atHomePageClickButtonHotel() {
        homePage.clickMenuHotel();
    }

    @When("at home page click button City")
    public void atHomePageClickButtonCity() {
        homePage.clickSectionCity();
    }

    @When("at home page city section fill text box city with {string}")
    public void atHomePageCitySectionFillTextBoxCityWithIndonesia(String value) {
        System.out.println(value);
        homePage.typeTextBoxCity(value);
    }

    @When("at home page city section click list button City equals to {string}")
    public void atHomePageCitySectionClickListButtonCityEqualsToBali(String value) {
        homePage.clickListCity(value);
    }

    @When("at home page click button Check In equals to {string}")
    public void atHomePageClickButtonCheckInEqualsToJune(String value) {
        String[] dateSplit = value.split(Consts.SPACE);
        String date = dateSplit[Consts.FIRST_INDEX];
        String month = dateSplit[Consts.SECOND_INDEX];
        while (!homePage.isDateIsMatch(month, date)) {
            homePage.clickButtonNextDate();
        }
        homePage.clickDate(month, date);
    }

    @When("at home page click button Check Out equals to {string}")
    public void atHomePageClickButtonCheckOutEqualsToJune(String value) {
        String[] dateSplit = value.split(Consts.SPACE);
        String date = dateSplit[Consts.FIRST_INDEX];
        String month = dateSplit[Consts.SECOND_INDEX];
        while (!homePage.isDateIsMatch(month, date)) {
            homePage.clickButtonNextDate();
        }
        homePage.clickDate(month, date);
    }

    @When("at home page click button Room & Guest")
    public void atHomePageClickButtonRoomGuest() {
        homePage.clickSectionRoom();
    }

    @When("at home page room section click button Adults equals to {string}")
    public void atHomePageRoomSectionClickButtonAdultsEqualsTo(String value) {
        homePage.clickNumberOfAdults(value);
    }

    @When("at home page room section click button Children equals to {string}")
    public void atHomePageRoomSectionClickButtonChildrenEqualsTo(String value) {
        homePage.clickNumberOfChildren(value);
    }

    @When("at home page room section click button Add Another Room")
    public void atHomePageRoomSectionClickButtonAddAnotherRoom() {
        homePage.clickButtonAddRooms();
    }

    @When("at home page room section click button Apply")
    public void atHomePageRoomSectionClickButtonApply() {
        homePage.clickButtonApplyRoom();
    }

    @When("at home page click button Travelling For")
    public void atHomePageClickButtonTravellingFor() {
        homePage.clickSectionTravelFor();
    }

    @When("at home page travel section click list button Travelling For equals to {string}")
    public void atHomePageTravelSectionClickListButtonTravellingForEqualsToWork(String value) {
        homePage.clickSelectTravelFor(value);
    }

    @When("at home page click button Search")
    public void atHomePageClickButtonSearch() {
        homePage.clickButtonSearch();
    }
}