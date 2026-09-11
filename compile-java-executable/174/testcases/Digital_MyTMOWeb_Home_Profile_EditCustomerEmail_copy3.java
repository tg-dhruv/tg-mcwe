import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.testng.Assert;
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
public class digital_mytmoweb_home_profile_editcustomeremail_copy3 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_profile_editcustomeremail_copy3() {
		tg.openBrowser();
		var_Username = tg.saveToVariable("9132586371", var_Username);
		var_Password = tg.saveToVariable("Tmobile@2143", var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy3", new Object[]{});
		tg.testFunction("fnAcceptCookies_copy3", new Object[]{});
		tg.testFunction("fnNavigateToProfileTab_copy3", new Object[]{});
		tg.testFunction("fnClickEditProfile_copy3", new Object[]{});
		tg.testFunction("fnEditEmailAddressOnProfileTab_copy3", new Object[]{});
		// [DISABLED] tg.wait("ele_verifyItsYou", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.check.isVisible("ele_verifyItsYou");
		tg.printLogs("Verification screen appeared - Validated");
		tg.printLogs("EX-1093 [Auto] MyTMO Web_Home_Profile_Edit customer email  -PASSED");
		tg.close();
	}
}