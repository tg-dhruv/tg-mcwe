import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
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

class fndisableautopay_copy {

	public static void fndisableautopay_copy() {
		tg.wait("ele_ManageAutoPayButton", ComparisonType.IS_VISIBLE, 15);
		if(tg.performAssert("ele_ManageAutoPayButton", ComparisonType.IS_VISIBLE)){
		tg.click("ele_ManageAutoPayButton", 1);
		tg.wait("ele_cancelAutopayButton", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_cancelAutopayButton", 1);
		tg.wait("ele_continueButtonAutopayConfirmationPopup", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_continueButtonAutopayConfirmationPopup", 1);
		tg.wait("ele_autopayIsNowCancelledText", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_doneButtonAutopay");
		tg.click("ele_doneButtonAutopay", 1);
		}
	}
}