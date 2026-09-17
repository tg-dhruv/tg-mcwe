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
public class tc_012 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc_012() {
		tg.openDevice();
				tg.wait("ele_searchproviderlogoImageView1789659770433", ComparisonType.IS_VISIBLE);
				tg.click("ele_searchproviderlogoImageView1789659770433", 1);
				tg.wait("ele_SearchGoogleortypeURLEditText1789659774963", ComparisonType.IS_VISIBLE);
				tg.click("ele_SearchGoogleortypeURLEditText1789659774963", 1);
				tg.wait("ele_SearchGoogleortypeURLEditText1789659779683", ComparisonType.IS_VISIBLE);
				tg.click("ele_SearchGoogleortypeURLEditText1789659779683", 1);
				tg.wait("ele_SearchGoogleortypeURLEditText1789659779683", ComparisonType.IS_VISIBLE);
				tg.type("ele_SearchGoogleortypeURLEditText1789659779683", "test", true);
				tg.wait("ele_testTextView1789659788712", ComparisonType.IS_VISIBLE);
				tg.click("ele_testTextView1789659788712", 1);
				tg.printLogs("element picker");
				tg.wait("ele_homebuttonImageButton1789659828953", ComparisonType.IS_VISIBLE);
				tg.wait("ele_View1789659843957", ComparisonType.IS_VISIBLE);
				tg.wait("ele_ThereissomethingwrongwiththeproxyserverortheaddressisincorrectTextView1789659860614", ComparisonType.IS_VISIBLE);
				tg.wait("ele_div085", ComparisonType.IS_VISIBLE);
		tg.close();
	}
}