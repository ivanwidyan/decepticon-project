package com.decepticon.module.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class UiUtility extends PageObject {

    public static List<String> ListWebElement(List<WebElementFacade> webElementFacade) {
        int a = 0;

        List<String> List = new ArrayList<>();
        for (WebElementFacade wf : webElementFacade) {

            List.add(wf.getText());
            System.out.println(a + 1 + ". " + List.get(a));
            a++;
        }
        return List;

    }

    public WebElementFacade fromXpathtoWebElement(String xpath){
        return find(By.xpath(xpath));
    }
    public WebElementFacade fromXpathtoWebElementString(String xpath){
        return find(By.xpath(String.format(xpath)));
    }

    public List<WebElementFacade> xpathToWebElement(String xpath) {
        List<WebElementFacade> webElementFacades = findAll(new By.ByXPath(xpath));

        return webElementFacades;
    }

    protected Boolean verifyUrlIsOpened(String url) {
        System.out.println("currentUrl: " + getDriver().getCurrentUrl());
        System.out.println("expected: " + url);
        return getDriver().getCurrentUrl().contains(url);
    }
}
