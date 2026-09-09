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
public class tc_new {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc_new() {
		tg.openBrowser();
				tg.printLogs(var_name);
				tg.wait("ele_logintoins788", ComparisonType.IS_VISIBLE);
				tg.click("ele_logintoins788", 1);
				tg.wait("ele_loginwithf333", ComparisonType.IS_VISIBLE);
				tg.click("ele_loginwithf333", 1);
		tg.close();
	}
}