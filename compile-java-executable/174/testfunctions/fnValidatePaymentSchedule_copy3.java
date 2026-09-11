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

class fnvalidatepaymentschedule_copy3 {

	public static void fnvalidatepaymentschedule_copy3() {
				tg.check.isVisible("ele_editPaymentSchedule");
				tg.click("ele_editPaymentSchedule", 1);
				tg.wait("ele_paymentDropdown", ComparisonType.IS_VISIBLE, 10);
				tg.check.isVisible("ele_paymentDropdown");
		START_CUSTOM_SCRIPT;
		// Get all options in the dropdown
		try {
		List<WebElement> options = driver.findElements(By.cssSelector("#pa-installment-menu-id-selection-menu li[role='option']"));
		if (options.size() != 2) {
		    System.out.println("Error: Expected 2 payment options but found " + options.size());
		} else {
		    System.out.println("Verified: 2 payment options are present.");
		}
		// Fetch Payment1 Amount before changing
		String Payment1AmountB = driver.findElement(By.id("field-pa-update-editable-amt-id")).getText();
		// Fetch Total Amount before cchanging
		String totalAmountB = driver.findElement(By.xpath("//div[@x-text='dynamicText.totalAmountPayable']")).getText();
		// Change payment schedule from 2 to 10
		// Click the dropdown to open it
		        driver.findElement(By.id("pa-installment-menu-id-selection-trigger")).click();
		        // Select "1 payment" option
		        driver.findElement(By.id("pa-installment-menu-id-selection-menu-1")).click();
		        // Get the Remaining Balance amount for Payment 1
		        String Remainingamount = driver.findElement(By.id("field-pa-update-single-amt-id")).getAttribute("data-xpr-field-value");
		       if (!Remainingamount.equals(totalAmountB))
		       {
		           throw new AssertionError("Amount does not match");
		       }
		       //Assert.assertEquals(totalAmountB, Remainingamount, "The Amount did not match");
		}
		catch(Exception ex)
		{
		    System.out.println("exception caught "+ex);
		}
		END_CUSTOM_SCRIPT;
				tg.wait("ele_updatePaymentSchedule", ComparisonType.IS_VISIBLE, 10);
				tg.check.isVisible("ele_updatePaymentSchedule");
				tg.click("ele_updatePaymentSchedule", 1);
				tg.wait("ele_paymentArrangementHdr", ComparisonType.IS_VISIBLE, 10);
				tg.check.isVisible("ele_paymentArrangementHdr");
		START_CUSTOM_SCRIPT;
		try
		{
		 List<WebElement> paymentCards = driver.findElements(By.cssSelector("div.pmt-paymentScheduleCard__card"));
		//Assert.assertEquals(paymentCards.size(), 1, "Expected only 1 payment card but found " + paymentCards.size());
		if (paymentCards.size() != 1) 
		{
		            throw new AssertionError("Expected only 1 payment card but found " + paymentCards.size());
		        }
		}
		catch(Exception ex)
		{
		    System.out.println("exception caught "+ex);
		}
		END_CUSTOM_SCRIPT;
				tg.click("ele_backButton", 1);
				tg.click("ele_backButton", 1);
				tg.click("ele_backButton", 1);
	}
}