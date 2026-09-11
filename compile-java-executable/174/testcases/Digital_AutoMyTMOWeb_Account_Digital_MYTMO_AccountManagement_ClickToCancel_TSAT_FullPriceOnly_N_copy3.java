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
public class digital_automytmoweb_account_digital_mytmo_accountmanagement_clicktocancel_tsat_fullpriceonly_n_copy3 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_automytmoweb_account_digital_mytmo_accountmanagement_clicktocancel_tsat_fullpriceonly_n_copy3() {
		tg.openBrowser();
		var_Username = tg.saveToVariable("9132603071", var_Username);
		var_Password = tg.saveToVariable("Tmobile@2144", var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy3", new Object[]{});
		tg.testFunction("fnAcceptCookies_copy3", new Object[]{});
		tg.testFunction("fnDontAllowNotificationPopUp_copy3", new Object[]{});
		// [DISABLED] tg.testFunction("fnClickUpgradeOnShop_copy3", new Object[]{});
		tg.testFunction("fnClickOnShop_copy3", new Object[]{});
		tg.testFunction("fnSelectTImetoUpgrade_copy3", new Object[]{});
		tg.testFunction("fnCloseWhatDoYouWantToGoPopUp_copy3", new Object[]{});
		// [DISABLED] tg.testFunction("fnClickUpgradeOnShop_copy3", new Object[]{});
		tg.testFunction("fnClickOnFirstProductInUpgradeFlow_copy3", new Object[]{});
		// [DISABLED] tg.testFunction("fnSelectSecondProductOnPLP_copy3", new Object[]{});
		tg.testFunction("fnSelectShippingForProspect_copy3", new Object[]{});
		tg.testFunction("fnSkipTradeInProspect_copy3", new Object[]{});
		tg.testFunction("fnDeclineProtection_copy3", new Object[]{});
		tg.testFunction("fnAddToCart_copy3", new Object[]{});
		tg.testFunction("fnValidateUserHasNoEIPoption_copy3", new Object[]{});
		tg.printLogs("EX- 54305 [Auto] MyTMO_Web_Account_Digital_MYTMO_Account Management_Clicktocancel_TSAT_FullPriceOnly_NoEIP_Hardgoods - PASSED");
		tg.close();
	}
}