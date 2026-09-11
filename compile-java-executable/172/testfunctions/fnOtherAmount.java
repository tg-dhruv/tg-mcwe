import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
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

class fnotheramount {

	public static void fnotheramount() {
		tg.wait("ele_makeAPaymentHeader", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_makeAPaymentHeader", 1);
		tg.wait("ele_payYourBillHeader", ComparisonType.IS_VISIBLE);
		START_CUSTOM_SCRIPT;
		try {
		END_CUSTOM_SCRIPT;
		// Click Card option
		START_CUSTOM_SCRIPT;
		    By cardBy = By.xpath("//fieldset/div[2]/div[1]/div/label/span/span[1]");
		    WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
		    WebElement cardOption = wait.until(
		        ExpectedConditions.elementToBeClickable(cardBy)
		    );
		    ((JavascriptExecutor)driver)
		        .executeScript("arguments[0].scrollIntoView({block:'center'});", cardOption);
		    cardOption.click();
		    System.out.println("Clicked Card payment option.");
		END_CUSTOM_SCRIPT;
		// Enter Other Amount = 10
		START_CUSTOM_SCRIPT;
		    By amountBy = By.xpath("//*[@id='field-otherAmount']");
		    WebElement amountField = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(amountBy)
		    );
		    amountField.clear();
		    amountField.sendKeys("10");
		    System.out.println("Entered Other Amount: 10");
		} catch (Exception ex) {
		    System.out.println("Card selection or amount entry failed: " + ex.getMessage());
		    throw ex; // fail the test properly in TestGrid
		}
		END_CUSTOM_SCRIPT;
		tg.wait("ele_Calendar", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_Calendar", 1);
		tg.wait("ele_Date", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_Date", 1);
		tg.wait("ele_addPaymentMethod", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_addPaymentMethod", 1);
		tg.wait("ele_card", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_card", 1);
	}
}