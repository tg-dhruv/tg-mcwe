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
public class ur1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void ur1() {
		tg.openDevice();
				tg.click("ele_emailaddressfield1792218743664", 1);
				tg.type("ele_emailaddressfield1792218743664", "testuser@example.com", false);
				tg.click("ele_passwordfield1792218748692", 1);
				tg.type("ele_passwordfield1792218748692", "Test@12345", false);
				tg.click("ele_signinbutton1792218755904", 1);
		tg.close();
	}
}