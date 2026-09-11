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
public class digital_mytmoweb_account_accountmanagement_clicktocancel_tsat_blade_visibleforpah_permissionuser_copy2 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_account_accountmanagement_clicktocancel_tsat_blade_visibleforpah_permissionuser_copy2() {
		tg.openBrowser();
		var_Username = tg.saveToVariable("9132957119", var_Username);
		var_Password = tg.saveToVariable("Tmobile@2134", var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy2", new Object[]{});
		tg.wait(10);
		tg.testFunction("fnDontAllowNotificationPopUp_copy2", new Object[]{});
		tg.wait("ele_CancelTSatelliteService", ComparisonType.IS_VISIBLE);
		tg.click("ele_CancelTSatelliteService", 1);
		tg.wait(10);
		tg.check.isVisible("ele_CancelTsatelliteServiceHeader");
		tg.printLogs("Cancel T-Satellite service is visible for PAH user");
		tg.testFunction("fnLogout_copy2", new Object[]{});
		tg.close();
	}
}