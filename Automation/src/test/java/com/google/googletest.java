package com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class googletest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chr/chromedriver.exe");
	  WebDriver driver = new ChromeDriver ();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
