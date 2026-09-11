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
public class digital_mytmoweb_account_verifytsatelliteesimrateplan_canceloption_visible_singlelineuser_copy {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_account_verifytsatelliteesimrateplan_canceloption_visible_singlelineuser_copy() {
		tg.openBrowser();
		var_Username = tg.saveToVariable(var_TSalelliteUN, var_Username);
		var_Password = tg.saveToVariable(var_TSalellitePW, var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy", new Object[]{});
		tg.testFunction("fnAcceptCookies_copy", new Object[]{});
		tg.wait(20);
		tg.check.isVisible("ele_CancelTSatelliteService");
		var_GetText = tg.saveToVariable("ele_CancelTSatelliteService", var_GetText);
		tg.printLogs(var_GetText);
		tg.testFunction("fnlogoutRestored_copy", new Object[]{});
		tg.close();
	}
}