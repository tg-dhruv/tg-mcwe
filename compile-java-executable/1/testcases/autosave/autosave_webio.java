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
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class webio {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void webio() {
		tg.openDevice();
				tg.wait("ele_WebviewTextView1791360585375", ComparisonType.IS_VISIBLE);
				tg.click("ele_WebviewTextView1791360585375", 1);
				tg.wait(5);
				tg.wait("ele_GetStarted", ComparisonType.IS_VISIBLE);
				tg.click("ele_GetStarted", 1);
				tg.wait(5);
		tg.close();
	}
}