package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import java.util.regex.Pattern;

public class facebookChangeStatus extends SeleneseTestCase {
  @Before
  public void setUp() throws Exception {
    selenium = new DefaultSelenium("localhost", 4444, "*iehta", "http://www.facebook.com/");
    selenium.start();
  }

  @Test
  public void testFacebookChangeStatus() throws Exception {
    verifyTrue(selenium.isTextPresent("exact:Was machst du gerade?"));
    selenium.type("xhpc_message_text", "God is good!!!!!!!!!!");
    selenium.click("u387563_11");
  }

  @After
  public void tearDown() throws Exception {
    selenium.stop();
  }
}