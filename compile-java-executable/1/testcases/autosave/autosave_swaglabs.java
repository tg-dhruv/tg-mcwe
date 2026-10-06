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
public class swaglabs {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void swaglabs() {
		tg.openDevice();
				tg.scroll("ele_usernameele18083855191712", Direction.DOWN);
				tg.wait("ele_usernameele18083855191712", ComparisonType.IS_VISIBLE);
				tg.check.isVisible("ele_usernameele18083855191712");
				tg.type("ele_usernameele18083855191712", "standard_user", true);
				tg.scroll("ele_passwordele20083855191712", Direction.DOWN);
				tg.check.isVisible("ele_passwordele20083855191712");
				tg.type("ele_passwordele20083855191712", "secret_sauce", true);
				tg.scroll("ele_loginele21083855191712", Direction.DOWN);
				tg.click("ele_loginele21083855191712", 1);
				tg.wait(10);
		tg.close();
	}
}