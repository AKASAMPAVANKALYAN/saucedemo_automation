package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.BasePage;

public class Hooks {
    @Before
    public void setUp() {
        BasePage.initDriver();
    }

    @After
    public void tearDown() {
        BasePage.quitDriver();
    }
}
