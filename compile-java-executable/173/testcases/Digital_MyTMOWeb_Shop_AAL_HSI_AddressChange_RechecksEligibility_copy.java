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
public class digital_mytmoweb_shop_aal_hsi_addresschange_recheckseligibility_copy {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_shop_aal_hsi_addresschange_recheckseligibility_copy() {
		tg.openBrowser();
		var_Username = tg.saveToVariable("9132020564", var_Username);
		var_Password = tg.saveToVariable("Tmobile@2145", var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy", new Object[]{});
		tg.click("ele_homeInternet", 1);
		tg.wait("ele_seePlans", ComparisonType.IS_VISIBLE);
		tg.click("ele_seePlans", 1);
		tg.wait("ele_selectplan", ComparisonType.IS_VISIBLE);
		tg.click("ele_selectplan", 1);
		tg.wait("ele_editAddress", ComparisonType.IS_VISIBLE);
		tg.click("ele_editAddress", 1);
		var_TestReusableVariable = tg.saveToVariable("440 W BONNER RD , WAUCONDA, IL, 60084", var_TestReusableVariable);
		tg.testFunction("fnTextAddressforHSILine_copy", new Object[]{});
		tg.wait("ele_availablePlans", ComparisonType.IS_VISIBLE);
		tg.click("ele_availablePlans", 1);
		tg.wait("ele_Unfortunately5GHomeInternetareNotYetAvailable", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_Unfortunately5GHomeInternetareNotYetAvailable");
		var_GetText = tg.saveToVariable("ele_Unfortunately5GHomeInternetareNotYetAvailable", var_GetText);
		tg.printLogs(var_GetText);
		tg.click("ele_homeInternet", 1);
		tg.wait("ele_seePlans", ComparisonType.IS_VISIBLE);
		tg.click("ele_seePlans", 1);
		var_TestReusableVariable = tg.saveToVariable("18101 WESTGATE ST, BUCYRUS, KS 66013", var_TestReusableVariable);
		tg.testFunction("fnTextAddressforHSILine_copy", new Object[]{});
		tg.wait("ele_availablePlans", ComparisonType.IS_VISIBLE);
		tg.click("ele_availablePlans", 1);
		tg.wait("ele_internetOptionsAvailableAtAddress", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_internetOptionsAvailableAtAddress");
		var_GetText = tg.saveToVariable("ele_internetOptionsAvailableAtAddress", var_GetText);
		tg.printLogs(var_GetText);
		tg.testFunction("fnLogout_copy", new Object[]{});
		tg.close();
	}
}