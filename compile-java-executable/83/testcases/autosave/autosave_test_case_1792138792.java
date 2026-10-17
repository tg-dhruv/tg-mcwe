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
public class test_case_1792138792 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test_case_1792138792() {
		tg.openDevice();
				tg.click("ele_nextarrowvisionele3082249873302", 1);
				tg.scroll("ele_mobilenumberele15082336362249", Direction.DOWN);
				tg.type("ele_mobilenumberele15082336362249", "9999988888", true);
				tg.click("ele_nextvisionele5082336362249", 1);
				tg.scroll("ele_otpele14082422116803", Direction.DOWN);
				tg.type("ele_otpele14082422116803", "1234", true);
				tg.click("ele_nextvisionele3082422116803", 1);
				tg.swipe(Direction.UP);
				tg.scroll("ele_broccoliproductele32082541449472", Direction.DOWN);
				tg.check.isVisible("ele_broccoliproductele32082541449472");
				tg.scroll("ele_bathuaproductele22082541449472", Direction.DOWN);
				tg.check.isVisible("ele_bathuaproductele22082541449472");
				tg.scroll("ele_broccoliproductele32082541449472", Direction.DOWN);
				tg.click("ele_broccoliproductele32082541449472", 1);
				tg.check.isVisible("ele_broccoliproductdetailsele14082626828372");
				tg.check.contains("ele_broccoliproductdetailsele14082626828372","Broccoli");
				tg.check.isVisible("ele_quantitysliderele20082626828372");
				tg.swipe(Direction.RIGHT);
		tg.close();
	}
}