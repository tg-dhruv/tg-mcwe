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
public class digital_mytmoweb_shopprospect_phone_witheip_withoutprotection {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_shopprospect_phone_witheip_withoutprotection() {
		tg.openBrowser();
		tg.testFunction("fnClickOnPhonesProspect", new Object[]{});
		tg.testFunction("fnClickOnFirstProductInUpgradeFlow", new Object[]{});
		tg.testFunction("fnSelectShippingForProspect", new Object[]{});
		tg.testFunction("fnClickGetNewNumber", new Object[]{});
		tg.testFunction("fnSkipTradeInProspect", new Object[]{});
		tg.testFunction("fnDeclineProtectionProspect", new Object[]{});
		tg.testFunction("fnClickOnAdddToCartProspect", new Object[]{});
		tg.testFunction("fnSelectNumberOfLinesProspect", new Object[]{});
		tg.wait(20);
		tg.close();
	}
}