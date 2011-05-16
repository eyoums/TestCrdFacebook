package com.testscripts;

import com.thoughtworks.selenium.*;
//This is the driver's import. You'll use this for instantiating a
//browser and making it do what you need.

//Selenium-IDE add the Pattern module because it's sometimes used for
//regex validations. You can remove the module if it's not used in your
//script.

public class NewTest extends SeleneseTestCase {
//We create our Selenium test case

   public void setUp() throws Exception 
   {
     setUp("http://www.google.com/", "*firefox");
          // We instantiate and start the browser
   }

   public void testNew() throws Exception {
        selenium.open("/");
        selenium.type("q", "selenium rc");
        selenium.click("btnG");
        selenium.waitForPageToLoad("30000");
        assertTrue(selenium.isTextPresent("*selenium rc*"));
        // These are the real test steps
  }
}
