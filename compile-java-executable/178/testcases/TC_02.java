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
public class tc_02 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc_02() {
		tg.openBrowser();
				tg.wait("ele_r1h6kqsqpp545", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1h6kqsqpp545", 1);
				tg.wait("ele_r1h6kqsqpp545", ComparisonType.IS_VISIBLE);
				tg.type("ele_r1h6kqsqpp545", "test");
		tg.close();
	}
}