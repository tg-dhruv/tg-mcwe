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
public class settingapp {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void settingapp() {
		tg.openDevice();
		tg.wait("ele_SearchField_medium_11771664260145", ComparisonType.IS_VISIBLE);
		tg.click("ele_SearchField_medium_11771664260145", 1);
		tg.wait("ele_SearchField_medium_11771664275681", ComparisonType.IS_VISIBLE);
		tg.click("ele_SearchField_medium_11771664275681", 1);
		tg.close();
	}
}