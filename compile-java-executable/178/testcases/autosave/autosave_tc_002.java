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
public class tc_002 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc_002() {
		tg.openBrowser();
				tg.wait("ele_element427", ComparisonType.IS_VISIBLE);
				tg.click("ele_element427", 1);
				tg.wait("ele_forgottenp222", ComparisonType.IS_VISIBLE);
				tg.click("ele_forgottenp222", 1);
				tg.wait("ele_r877", ComparisonType.IS_VISIBLE);
				tg.click("ele_r877", 1);
				tg.wait("ele_r461", ComparisonType.IS_VISIBLE);
				tg.click("ele_r461", 1);
		tg.close();
	}
}