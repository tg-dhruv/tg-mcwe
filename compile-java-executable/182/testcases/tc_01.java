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
public class tc_01 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc_01() {
		tg.openBrowser();
		tg_int var_total = 0;
		var_total = ((Number) tg.testFunction("tf_01", new Object[]{1, "1", "1", "1", "1", "1", "1", "1", "1", "1"})).intValue();
		tg.printLogs(var_total);
		tg.close();
	}
}