package java.techproed.pages;

import org.openqa.selenium.support.PageFactory;

import java.techproed.utilities.Driver;

public class Page {
    public Page(){
        PageFactory.initElements(Driver.getDriver(),this);


    }
}
