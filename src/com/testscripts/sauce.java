package com.testscripts;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestCase;

public class sauce extends SeleneseTestCase {
    public void setUp() throws Exception {
        DefaultSelenium selenium = new DefaultSelenium(
                "ondemand.saucelabs.com",
                80,
                "{\"username\": \"eyoums\"," +
                "\"access-key\": \"4a2ddf86-4702-419b-b36c-495b115b03f0\"," +
                "\"os\": \"Windows XP\"," +
                "\"browser\": \"firefox\"," +
                "\"browser-version\": \"3.6.\"," +
                "\"name\": \"This is an example test\"}",
                "http://example.saucelabs.com/");
        selenium.start();
        this.selenium = selenium;
    }
    public void testSauce() throws Exception {
        this.selenium.open("/");
        assertEquals("Cross browser testing with Selenium - Sauce Labs",
                     this.selenium.getTitle());
    }

    public void tearDown() throws Exception {
        this.selenium.stop();
    }
}
