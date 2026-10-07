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
public class test_case_1791371232 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test_case_1791371232() {
		tg.openDevice();
				tg.check.isVisible("ele_citynameele13110805844368");
				tg.check.isVisible("ele_temperatureele21110805844368");
				tg.check.isVisible("ele_weatherdescriptionele23110805844368");
				tg.check.isVisible("ele_lastupdateele24110805844368");
				tg.check.isClickable("ele_searchcityele16110805844368");
		tg.close();
	}
}