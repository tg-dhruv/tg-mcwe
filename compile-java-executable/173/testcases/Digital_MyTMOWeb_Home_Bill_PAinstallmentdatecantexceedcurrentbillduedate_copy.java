import java.time.Duration;
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

@Listeners(TestListener.class);
public class digital_mytmoweb_home_bill_painstallmentdatecantexceedcurrentbillduedate_copy {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_bill_painstallmentdatecantexceedcurrentbillduedate_copy() {
		tg.openBrowser();
		// [DISABLED] var_Username = tg.saveToVariable(var_UNDateCantExceedCurrentBillDueDate, var_Username);
		// [DISABLED] var_Password = tg.saveToVariable(var_PWDateCantExceedCurrentBillDueDate, var_Password);
		var_Username = tg.saveToVariable("4694031697", var_Username);
		var_Password = tg.saveToVariable("Tmobile@2143", var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy", new Object[]{});
		tg.testFunction("fnAcceptCookies_copy", new Object[]{});
		tg.testFunction("fnClickViewBill_copy", new Object[]{});
		tg.testFunction("fnDontAllowNotificationPopUp_copy", new Object[]{});
		tg.testFunction("fnClickSetupPaymentArrangement_copy", new Object[]{});
		tg.wait("ele_EditButtonPaymentArrangement", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_EditButtonPaymentArrangement", 1);
		tg.wait("ele_CalenderIcon", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_CalenderIcon", 1);
		tg.wait("ele_CurrentBillDueDate", ComparisonType.IS_VISIBLE, 20);
		tg.check.isVisible("ele_ValidCalenderDueDate");
		tg.check.isVisible("ele_InvalidDueDate");
		tg.click("ele_ValidCalenderDueDate", 1);
		tg.wait(5);
		tg.wait("ele_UpdateButtonPaymentArrangement", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_UpdateButtonPaymentArrangement");
		tg.close();
	}
}