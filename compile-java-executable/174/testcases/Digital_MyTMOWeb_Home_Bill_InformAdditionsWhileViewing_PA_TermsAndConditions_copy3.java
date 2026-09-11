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
public class digital_mytmoweb_home_bill_informadditionswhileviewing_pa_termsandconditions_copy3 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_bill_informadditionswhileviewing_pa_termsandconditions_copy3() {
		tg.openBrowser();
		// [DISABLED] var_Username = tg.saveToVariable("4042038148", var_Username);
		// [DISABLED] var_Password = tg.saveToVariable("Tmobile@2143", var_Password);
		var_Username = tg.saveToVariable("4253899378", var_Username);
		var_Password = tg.saveToVariable("Tmobile@2143", var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy3", new Object[]{});
		tg.testFunction("fnAcceptCookies_copy3", new Object[]{});
		tg.testFunction("fnClickSeeAllScheduledArrangements_copy3", new Object[]{});
		tg.testFunction("fnDontAllowNotificationPopUp_copy3", new Object[]{});
		tg.testFunction("fnClickOnTermsAndConditions_copy3", new Object[]{});
		tg.testFunction("fnValidateTermsAndConditionsHeader_copy3", new Object[]{});
		tg.wait("ele_back351", ComparisonType.IS_VISIBLE);
		tg.click("ele_back351", 1);
		tg.wait("ele_paymentarr340", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_paymentarr340");
		tg.printLogs("User navigated to Payment Arrangement screen");
		tg.printLogs("EX-1739 MyTMO Web_Home_Bill_Inform additions while viewing PA terms and conditions -PASSED");
		tg.close();
	}
}