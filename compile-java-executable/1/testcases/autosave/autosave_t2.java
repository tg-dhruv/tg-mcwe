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
public class t2 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void t2() {
		tg.openDevice();
				tg.wait("ele_WondersoftheworldImageView1786122932677", ComparisonType.IS_VISIBLE);
				tg.click("ele_WondersoftheworldImageView1786122932677", 1);
				tg.wait("ele_CountriesImageView1786129332553", ComparisonType.IS_VISIBLE);
				tg.click("ele_CountriesImageView1786129332553", 1);
				tg.wait("ele_cardimageImageView1786129371809", ComparisonType.IS_VISIBLE);
				tg.wait("ele_CountriesImageView1786130581814", ComparisonType.IS_VISIBLE);
				tg.click("ele_CountriesImageView1786130581814", 1);
				tg.wait("ele_AustraliaTextView1786130697006", ComparisonType.IS_VISIBLE);
				tg.click("ele_AustraliaTextView1786130697006", 1);
		tg.close();
	}
}