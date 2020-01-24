package January;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void tc1() {
	  Reporter.log("Executing tc1", true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Executing beforeMethod", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("Executing afterMethod", true);
	  
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("Executing beforeClass", true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("Executing afterClass", true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("Executing beforeTest", true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("Executing afterTest", true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("Executing beforeSuite", true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("Executing afterSuite", true);
  }

}
