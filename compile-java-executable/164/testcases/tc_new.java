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
public class tc_new {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc_new() {
		tg.openDevice();
		tg.printLogs("START");
		tg_int var_dhruv = 0;
		var_dhruv = (int) tg.testFunction("tf_new", new Object[]{1, 2, 3, 4, 5, 6, 7, 8});
		tg.printLogs(var_dhruv);
		tg.close();
	}
}