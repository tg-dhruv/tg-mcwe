import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
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

class fncancelpaymentarrangementotppage_copy3 {

	public static void fncancelpaymentarrangementotppage_copy3() {
		tg.wait("ele_SetUpPaymentArrBillCard", ComparisonType.IS_VISIBLE, 10);
		if(tg.performAssert("ele_SetUpPaymentArrBillCard", ComparisonType.IS_VISIBLE)){
		tg.click("ele_SetUpPaymentArrBillCard", 1);
		tg.wait("ele_cancelPaymentArrangement", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_cancelPaymentArrangement");
		tg.click("ele_cancelPaymentArrangement", 1);
		tg.wait("ele_yesDelete", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_yesDelete");
		tg.click("ele_yesDelete", 1);
		tg.wait("ele_doneCancelPayArr", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_doneCancelPayArr");
		tg.click("ele_doneCancelPayArr", 1);
		}
	}
}