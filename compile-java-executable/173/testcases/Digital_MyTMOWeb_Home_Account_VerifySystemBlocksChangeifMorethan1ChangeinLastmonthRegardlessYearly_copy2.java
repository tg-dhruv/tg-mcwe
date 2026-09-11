import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import java.time.Duration;
import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.*;
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class digital_mytmoweb_home_account_verifysystemblockschangeifmorethan1changeinlastmonthregardlessyearly_copy2 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_account_verifysystemblockschangeifmorethan1changeinlastmonthregardlessyearly_copy2() {
		tg.openBrowser();
		var_Username = tg.saveToVariable("4252408059", var_Username);
		var_Password = tg.saveToVariable("Test@DataPlatform9Team!", var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy2", new Object[]{});
		tg.wait("ele_Account", ComparisonType.IS_VISIBLE, 19);
		tg.click("ele_Account", 1);
		tg.testFunction("fnDontAllowNotificationPopUp_copy2", new Object[]{});
		tg.wait("ele_SeeDeviceDetails", ComparisonType.IS_VISIBLE);
		tg.click("ele_SeeDeviceDetails", 1);
		tg.wait(10);
		tg.scrollToElement("ele_ChangePhoneNumberLit", Direction.DOWN);
		tg.check.isVisible("ele_ChangePhoneNumberLit");
		tg.wait("ele_YouveReachedYourLimit", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_YouveReachedYourLimit");
		tg.wait("ele_ChangePhoneNumberReachedLimit", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_ChangePhoneNumberReachedLimit", 1);
		tg.wait("ele_YouveReachedYourLimitForThisYear", ComparisonType.IS_VISIBLE);
		var_GetText = tg.saveToVariable("ele_YouveReachedYourLimitForThisMonth", var_GetText);
		if(tg.performAssert(var_GetText, ComparisonType.IS_VISIBLE)){
		tg.printLogs(var_GetText);
		} else {
		var_GetText = tg.saveToVariable("ele_YouveReachedYourLimit", var_GetText);
		tg.printLogs(var_GetText);
		}
		var_GetText = tg.saveToVariable("ele_YouCanChangeYourPhoneNumberAgainAfter", var_GetText);
		tg.printLogs(var_GetText);
		START_CUSTOM_SCRIPT;
		String dateText = driver.findElement(
		    By.xpath("//div[@id='text-091823b43e']/div/p")
		).getText();
		String date = dateText.replaceAll("\\D+", "");
		if (!date.isEmpty()) {
		    String day, month, year;
		    if (date.length() == 7) {
		        day = "0" + date.substring(0, 1);
		        month = date.substring(1, 3);
		        year = date.substring(3);
		    } else if (date.length() == 8) {
		        day = date.substring(0, 2);
		        month = date.substring(2, 4);
		        year = date.substring(4);
		    } else {
		        System.out.println("Invalid date format");
		        return;
		    }
		    String formattedDate = day + "-" + month + "-" + year;
		    System.out.println("***************************************");
		    System.out.println("Next phonenumber update date: " + formattedDate);
		} else {
		    System.out.println("No date present");
		}
		END_CUSTOM_SCRIPT;
		tg.testFunction("fnlogoutRestored_copy2", new Object[]{});
		tg.close();
	}
}