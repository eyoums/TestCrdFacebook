package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class facebookLogout extends SeleneseTestCase {
  @Before
  public void setUp() throws Exception {
    selenium = new DefaultSelenium("localhost", 4444, "*iehta", "http://www.facebook.com/");
    selenium.start();
  }

  @Test
  public void testFacebookLogout() throws Exception {
    selenium.open("/update_security_info.php?wizard=1");
    selenium.click("navAccountLink");
    selenium.click("//input[@value='Abmelden']");
    verifyTrue(selenium.isTextPresent("email"));
    verifyTrue(selenium.isTextPresent("pass"));
  }

  @After
  public void tearDown() throws Exception {
    selenium.stop();
  }
}
