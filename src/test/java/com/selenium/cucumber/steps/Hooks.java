package com.selenium.cucumber.steps;

import com.selenium.cucumber.support.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BaseUtil {

    private BaseUtil base;

    public Hooks(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void initializeTest(){

        System.out.println("Opening the browser : MOCK");
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        Driver = new ChromeDriver();
    }

    @After
    public void tearDownTest(Scenario scenario){

        if (scenario.isFailed()) {
            //Take screenshot
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : MOCK");
        Driver.close();
        Driver.quit();

    }
}
