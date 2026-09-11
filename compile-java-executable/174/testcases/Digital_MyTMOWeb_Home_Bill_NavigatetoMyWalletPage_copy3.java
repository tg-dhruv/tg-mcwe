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
public class digital_mytmoweb_home_bill_navigatetomywalletpage_copy3 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_bill_navigatetomywalletpage_copy3() {
		tg.openBrowser();
		var_Username = tg.saveToVariable(var_TMOWebPaymentUsername1_Hermes, var_Username);
		var_Password = tg.saveToVariable(var_TMOWebPaymentPassword1_Hermes, var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy3");
		tg.testFunction("fnAcceptCookies_copy3");
		tg.testFunction("fnClickViewBill_copy3");
		tg.testFunction("fnDontAllowNotificationPopUp_copy3");
		tg.testFunction("fnNavigatetoMyWalletPage_copy3");
		tg.wait("ele_AddCard", ComparisonType.IS_VISIBLE, 15);
		tg.click("ele_AddCard", 1);
		tg.testFunction("fnCCDetails_copy3");
		tg.wait("ele_EditCCard", ComparisonType.IS_VISIBLE);
		tg.click("ele_EditCCard", 1);
		tg.testFunction("fnRemoveCC_copy3");
		tg.check.isVisible("ele_AddCard");
		tg.wait("ele_backButtonMywallet", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_backButtonMywallet");
		tg.click("ele_backButtonMywallet", 1);
		tg.testFunction("fnBrowserBack_copy3");
		tg.testFunction("fnlogoutRestored_copy3");
		tg.close();
	}
}