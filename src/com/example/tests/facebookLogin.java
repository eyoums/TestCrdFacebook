package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import java.util.regex.Pattern;

public class facebookLogin extends SeleneseTestCase {
  @Before
  public void setUp() throws Exception {
    selenium = new DefaultSelenium("localhost", 4444, "*iehta", "http://www.facebook.com");
    //setUp("http://www.facebook.com/", "*firefox");
    selenium.start();
  }

  @Test
  public void testFacebookLogin() throws Exception {
    selenium.open("/");
    selenium.type("email", "mem_stephanie@hotmail.com");
    selenium.type("pass", "0311Dave");
    selenium.click("//input[@type='submit']");
    verifyTrue(selenium.isTextPresent("Konto"));
    verifyTrue(selenium.isTextPresent("Stephanie Mbambe Eyoum"));
    //selenium.waitForPageToLoad("30000");
    verifyTrue(selenium.isTextPresent("Abmelden"));

  }

  @After
  public void tearDown() throws Exception {
    selenium.stop();
  }
}