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
public class draft_2 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void draft_2() {
		tg.openDevice();
				tg.wait(1);
				tg.wait("ele_ImageView1791553672435", ComparisonType.IS_VISIBLE);
				tg.click("ele_ImageView1791553672435", 1);
				tg.wait("ele_LetsconnectAllowfreshnotificationsforyoutokeeptrackofyourordersoffersandmorePSwewontspamyouCoolImageView1791553687656", ComparisonType.IS_VISIBLE);
				tg.click("ele_LetsconnectAllowfreshnotificationsforyoutokeeptrackofyourordersoffersandmorePSwewontspamyouCoolImageView1791554244570", 1);
				tg.wait("ele_LetsconnectAllowfreshnotificationsforyoutokeeptrackofyourordersoffersandmorePSwewontspamyouCoolImageView1791554702788", ComparisonType.IS_VISIBLE);
				tg.check.contains("ele_LetsconnectAllowfreshnotificationsforyoutokeeptrackofyourordersoffersandmorePSwewontspamyouCoolImageView1791553687656","we");
		tg.close();
	}
}