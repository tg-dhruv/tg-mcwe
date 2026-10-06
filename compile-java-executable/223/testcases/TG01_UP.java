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
public class tg01_up {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tg01_up() {
		tg.openBrowser();
				tg.wait(1);
				tg.wait(2);
				tg.wait("ele_emailele4135818749731", ComparisonType.IS_VISIBLE);
				tg.type("ele_emailele4135818749731", "alex.morgan@example.com");
				tg.type("ele_passwordele6135818749731", "AlexMorgan2026!");
				tg.wait("ele_loginele8135818749731", ComparisonType.IS_CLICKABLE);
				tg.click("ele_loginele8135818749731", 1);
		tg.close();
	}
}