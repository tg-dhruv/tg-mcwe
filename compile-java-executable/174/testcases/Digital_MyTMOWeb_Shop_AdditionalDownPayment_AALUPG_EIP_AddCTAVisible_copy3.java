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
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class digital_mytmoweb_shop_additionaldownpayment_aalupg_eip_addctavisible_copy3 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_shop_additionaldownpayment_aalupg_eip_addctavisible_copy3() {
		tg.openBrowser();
		var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
		var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy3", new Object[]{});
		// [DISABLED] tg.testFunction("fnAcceptCookies_copy3", new Object[]{});
		tg.testFunction("fnAddMobileDeviceToCartUPGWithSkipTradeInDeclineProtection_copy3", new Object[]{});
		tg.wait("ele_additionalDownPaymentLine", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_additionalDownPaymentLine", 1);
		tg.wait("ele_addCTAButton", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_addCTAButton", 1);
		tg.wait("ele_amountEnter", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_amountEnter", 1);
		tg.wait(10);
		tg.type("ele_amountEnter", "1000");
		tg.wait("ele_addCTA", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_addCTA", 1);
		tg.wait("ele_includedLineDisplayed", ComparisonType.IS_VISIBLE);
		tg.click("ele_includedLineDisplayed", 1);
		tg.wait("ele_devicePaymentLine", ComparisonType.IS_VISIBLE);
		tg.click("ele_devicePaymentLine", 1);
		tg.wait("ele_devicePaymentAmountUpdated", ComparisonType.IS_VISIBLE);
		tg.click("ele_devicePaymentAmountUpdated", 1);
		tg.wait("ele_amountFor24Months", ComparisonType.IS_VISIBLE);
		tg.click("ele_amountFor24Months", 1);
		tg.testFunction("fnRemoveMobileDeviceInCartPageAndLogout_copy3", new Object[]{});
		tg.close();
	}
}