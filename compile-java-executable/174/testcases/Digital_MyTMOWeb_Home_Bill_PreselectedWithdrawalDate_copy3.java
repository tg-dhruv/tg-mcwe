import java.time.Duration;
import org.openqa.selenium.*;import org.openqa.selenium.support.ui.WebDriverWait;import org.openqa.selenium.support.ui.ExpectedConditions;import static io.testgrid.baseClass.driver;import org.openqa.selenium.interactions.Actions;import org.openqa.selenium.By;import org.testng.Assert;;
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
import static io.testgrid.enums.KeyboardKeys.*;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class digital_mytmoweb_home_bill_preselectedwithdrawaldate_copy3 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_bill_preselectedwithdrawaldate_copy3() {
		tg.openBrowser();
		var_Username = tg.saveToVariable("4699966582", var_Username);
		var_Password = tg.saveToVariable("Tmobile@2156", var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy3");
		tg.testFunction("fnAcceptCookies_copy3");
		tg.navigateToUrl("https://www.t-mobile.com/payment/autopay");
		tg.testFunction("fnDontAllowNotificationPopUp_copy3");
		tg.testFunction("fnValidateWithdrawalDueDate_copy3");
		tg.printLogs("EX- 1725 [Auto]MyTMO Web_Home_Bill_Pre selected Withdrawal date  -PASSED");
		tg.close();
	}
}