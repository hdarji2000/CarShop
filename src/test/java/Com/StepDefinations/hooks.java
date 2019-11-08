package Com.StepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
    driverClass dClass = new driverClass();
    @Before
    public void open(){
        dClass.openBrowser();

    }

    @After
    public void close(){
        dClass.closeBrowser();
    }
}
