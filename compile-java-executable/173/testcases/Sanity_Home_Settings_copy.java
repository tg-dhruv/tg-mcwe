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
public class sanity_home_settings_copy {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void sanity_home_settings_copy() {
		tg.openBrowser();
				tg.wait("ele_myaccount804", ComparisonType.IS_VISIBLE);
				tg.click("ele_myaccount804", 1);
				tg.wait("ele_loginbackt377", ComparisonType.IS_VISIBLE);
				tg.click("ele_loginbackt377", 1);
				tg.wait("ele_login694", ComparisonType.IS_VISIBLE);
				tg.click("ele_login694", 1);
				tg.wait("ele_emailorpho632", ComparisonType.IS_VISIBLE);
				tg.click("ele_emailorpho632", 1);
				tg.wait("ele_next802", ComparisonType.IS_VISIBLE);
				tg.click("ele_next802", 1);
				tg.wait("ele_switchtotm095", ComparisonType.IS_VISIBLE);
				tg.click("ele_switchtotm095", 1);
		tg.close();
	}
}