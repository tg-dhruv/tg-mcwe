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
public class digital_mytmoweb_home_profile_updateemailaddress_copy2 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_profile_updateemailaddress_copy2() {
		tg.openBrowser();
		var_Username = tg.saveToVariable("4706624138", var_Username);
		var_Password = tg.saveToVariable("Tmobile@2144", var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy2");
		tg.testFunction("fnAcceptCookies_copy2");
		tg.testFunction("fnNavigateToProfileTab_copy2");
		tg.testFunction("fnClickOnBillingPreferences_copy2");
		tg.testFunction("fnClickPaperlessBilling_copy2");
		tg.testFunction("fnClickUpdateEmail_copy2");
		tg.testFunction("fnEnterEmailAddressAndSave_copy2");
		tg.printLogs("EX-1101   MyTMO Web_Home_Profile_Update email address - PASSED");
		tg.testFunction("fnLogout_copy2");
		tg.close();
	}
}