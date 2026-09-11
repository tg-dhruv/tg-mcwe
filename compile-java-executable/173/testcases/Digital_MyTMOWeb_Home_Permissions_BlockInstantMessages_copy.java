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
public class digital_mytmoweb_home_permissions_blockinstantmessages_copy {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_permissions_blockinstantmessages_copy() {
		tg.openBrowser();
		var_Username = tg.saveToVariable(var_TMOWebUserName4, var_Username);
		var_Password = tg.saveToVariable(var_TMOWebPassword4, var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy");
		tg.testFunction("fnAcceptCookies_copy");
		tg.testFunction("fnClickMyProfile_copy");
		tg.testFunction("fnDontAllowNotificationPopUp_copy");
		tg.testFunction("fnClickPermissionAndControl_copy");
		tg.testFunction("fnClickBlockChargeableContent_copy");
		tg.testFunction("fnClickBlockInstantMessages_copy");
		tg.takeFullScreenshot();
		tg.testFunction("fnClickBlockInstantMessages_copy");
		tg.takeFullScreenshot();
		tg.testFunction("fnlogoutRestored_copy");
		tg.close();
	}
}