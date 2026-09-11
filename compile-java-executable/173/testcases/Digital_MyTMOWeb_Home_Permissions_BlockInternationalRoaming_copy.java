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
import java.time.Duration;
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
public class digital_mytmoweb_home_permissions_blockinternationalroaming_copy {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_permissions_blockinternationalroaming_copy() {
		tg.openBrowser();
		var_Username = tg.saveToVariable("6192474603", var_Username);
		var_Password = tg.saveToVariable("Test@DataPlatform9Team!", var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy", new Object[]{});
		tg.wait("ele_profileName", ComparisonType.IS_VISIBLE, 10);
		tg.testFunction("fnAcceptCookies_copy", new Object[]{});
		tg.testFunction("fnClickMyProfile_copy", new Object[]{});
		tg.testFunction("fnDontAllowNotificationPopUp_copy", new Object[]{});
		tg.testFunction("fnClickPermissionAndControl_copy", new Object[]{});
		tg.testFunction("fnClickOnInternationalRoaming_copy", new Object[]{});
		tg.testFunction("fnBlockInternationalRoaming_copy", new Object[]{});
		tg.testFunction("fnRevertRoamingSettings_copy", new Object[]{});
		tg.testFunction("fnLogout_copy", new Object[]{});
		tg.close();
	}
}