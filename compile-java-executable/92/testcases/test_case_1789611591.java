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
public class test_case_1789611591 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test_case_1789611591() {
		tg.openDevice();
				tg.wait("ele_SearchGoogleortypeURLEditText1789659076394", ComparisonType.IS_VISIBLE);
				tg.click("ele_SearchGoogleortypeURLEditText1789659076394", 1);
				tg.wait("ele_hyroxcompetitionTextView1789659085603", ComparisonType.IS_VISIBLE);
				tg.click("ele_hyroxcompetitionTextView1789659085603", 1);
				tg.printLogs("Element Picker");
				tg.wait("ele_UseyourGoogleAccountTextView1789659163391", ComparisonType.IS_VISIBLE);
				tg.wait("ele_NextButton1789659185368", ComparisonType.IS_VISIBLE);
				tg.printLogs("webview");
				tg.wait("ele_Australiacardelement14022123889474", ComparisonType.IS_VISIBLE);
		tg.close();
	}
}