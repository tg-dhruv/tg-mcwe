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
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

class fncheckautopayandclick_copy {

	public static void fncheckautopayandclick_copy() {
		START_CUSTOM_SCRIPT;
		var_AutoPayText = driver.findElement(By.xpath("//div[@class='autopay-text']")).getText();
		END_CUSTOM_SCRIPT;
		if(tg.performAssert(var_AutoPayText, ComparisonType.EQUAL_TO, "AutoPay off")){
		tg.click("ele_setupAutoPay", 1);
		} else {
		tg.click("ele_manageautopay", 1);
		}
	}
}