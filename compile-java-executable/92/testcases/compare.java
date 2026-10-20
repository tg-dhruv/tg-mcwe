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
public class compare {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void compare() {
		tg.openDevice();
				tg.check.isVisible("ele_potatochipsonamix1792494809657");
				tg.click("ele_quantityslider1792494828118", 1);
				tg.wait("ele_quantitysliderposition1792494854965", ComparisonType.IS_VISIBLE, 30);
				tg.check.isEqualTo("ele_quantitysliderposition1792494854965","46%");
				tg_String var_itemname = "";
				var_itemname = tg.saveToVariable("ele_potatochipsonamix1792494809657", var_itemname);
				tg.check.contains(var_itemname,"Potato Chipsona", false);
		tg.close();
	}
}