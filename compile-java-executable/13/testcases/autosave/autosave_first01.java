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
public class first01 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void first01() {
		tg.openBrowser();
		tg.navigateToUrl("https://facebook.com");
		tg.wait("ele_r1h6kqsqpp788", ComparisonType.IS_VISIBLE);
		tg.click("ele_r1h6kqsqpp788", 1);
		tg.wait("ele_r1hmkqsqpp147", ComparisonType.IS_VISIBLE);
		tg.click("ele_r1hmkqsqpp147", 1);
		tg.wait("ele_login274", ComparisonType.IS_VISIBLE);
		tg.click("ele_login274", 1);
		tg.close();
	}
}