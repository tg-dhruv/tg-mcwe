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
public class handpick {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void handpick() {
		tg.openDevice();
				tg.click("ele_nextarrow1792211780057", 1);
				tg.click("50%WIDTH,88%HEIGHT", 1);
				if(tg.performAssert("ele_allownotifications1792211806980", ComparisonType.IS_VISIBLE)){
				tg.click("ele_allownotifications1792211806980", 1);
				}
				tg.type("ele_mobilenumberfield1792211821297", "9999988888", false);
				tg.click("ele_nextarrow1792211822000", 1);
				tg.type("ele_pinfield1792211836049", "1234", false);
				tg.click("ele_loginarrow1792211842514", 1);
				tg.wait(5);
				tg.click("ele_potatochipsonaproducttile1792211867392", 1);
				tg.wait("ele_addbutton1792211940112", ComparisonType.IS_VISIBLE, 30);
				tg.check.isVisible("ele_addbutton1792211940112");
				tg.click("ele_addbutton1792211940112", 1);
				if(tg.performAssert("ele_closeproductimageviewer1792211977078", ComparisonType.IS_VISIBLE)){
				tg.click("ele_closeproductimageviewer1792211977078", 1);
				}
				tg.click("ele_backbutton1792212017547", 1);
				tg.wait("ele_viewcartpill1792212033220", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_viewcartpill1792212033220", 1);
		tg.close();
	}
}