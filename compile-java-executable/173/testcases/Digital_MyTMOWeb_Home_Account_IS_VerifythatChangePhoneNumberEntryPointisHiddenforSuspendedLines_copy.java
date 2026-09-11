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
public class digital_mytmoweb_home_account_is_verifythatchangephonenumberentrypointishiddenforsuspendedlines_copy {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_account_is_verifythatchangephonenumberentrypointishiddenforsuspendedlines_copy() {
		tg.openBrowser();
		var_Username = tg.saveToVariable(var_TMOWebsuspendusername, var_Username);
		var_Password = tg.saveToVariable(var_TMOWebsuspenduserpwd, var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy");
		tg.wait("ele_Account", ComparisonType.IS_VISIBLE, 25);
		tg.click("ele_Account", 1);
		tg.testFunction("fnDontAllowNotificationPopUp_copy");
		tg.wait("ele_SeeDeviceDetails", ComparisonType.IS_VISIBLE, 25);
		tg.click("ele_SeeDeviceDetails", 1);
		tg.wait(10);
		tg.check.isInvisible("ele_ChangePhoneNumber");
		tg.check.isVisible("ele_AccountisSuspended");
		var_GetText = tg.saveToVariable("ele_AccountisSuspended", var_GetText);
		tg.printLogs(var_GetText);
		tg.testFunction("fnLogout_copy");
		tg.close();
	}
}