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
public class cotestertest {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void cotestertest() {
		tg.openDevice();
				tg.scroll("ele_Networkinternetelement28212506083798", Direction.DOWN);
				tg.wait("ele_Networkinternetelement28212506083798", ComparisonType.IS_VISIBLE);
				tg.click("ele_Networkinternetelement28212506083798", 1);
				tg.swipe(Direction.UP);
				tg.swipe(Direction.UP);
				tg.swipe(Direction.UP);
				tg.scroll("ele_Navigateupelement7212738275393", Direction.DOWN);
				tg.click("ele_Navigateupelement7212738275393", 1);
		tg.close();
	}
}