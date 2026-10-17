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
public class test_case_1792149107 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test_case_1792149107() {
		tg.openDevice();
				tg.click("ele_nextarrowvisionele4111250852111", 1);
				tg.scroll("ele_mobilenumberele15111324966700", Direction.DOWN);
				tg.type("ele_mobilenumberele15111324966700", "9999988888", true);
				tg.click("ele_nextvisionele5111324966700", 1);
				tg.scroll("ele_otpele14111547237296", Direction.DOWN);
				tg.type("ele_otpele14111547237296", "1234", true);
				tg.click("ele_nextvisionele3111547237296", 1);
				tg.scroll("ele_potatochipsonaproductele21111636122397", Direction.DOWN);
				tg.check.isVisible("ele_potatochipsonaproductele21111636122397");
				tg.click("ele_potatochipsonaproductele21111636122397", 1);
				tg.check.isVisible("ele_emptycartmessageele12112628689533");
				tg.click("ele_backvisionele1112628689533", 1);
		tg.close();
	}
}