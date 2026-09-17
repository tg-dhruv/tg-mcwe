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
public class test {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test() {
		tg.openDevice();
				tg.scroll("ele_Countriesele9211856486763", Direction.DOWN);
				tg.check.isEnabled("ele_Countriesele9211856486763");
				tg.click("ele_Countriesele9211856486763", 1);
				tg.wait("ele_CountriesImageView1788211275566", ComparisonType.IS_VISIBLE);
				tg.click("ele_CountriesImageView1788211275566", 1);
		tg.close();
	}
}