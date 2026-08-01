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
public class tc_mcw_1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc_mcw_1() {
		tg.openDevice();
		tg_String var_total = "0";
		var_total = (String) tg.testFunction("tf_mcw", new Object[]{1, 1, 1, 1, "1"});
		tg.close();
	}
}