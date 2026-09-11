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

class fnsetuppaymentarrangementotppage {

	public static void fnsetuppaymentarrangementotppage() {
		tg.wait("ele_SetUpPaymentArrOTP", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_SetUpPaymentArrOTP");
		tg.click("ele_SetUpPaymentArrOTP", 1);
		tg.wait("ele_agreeAndSubmitPaymentArrangement", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_agreeAndSubmitPaymentArrangement");
		tg.click("ele_agreeAndSubmitPaymentArrangement", 1);
		tg.wait("ele_paymentArrangementConfirmation", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_paymentArrangementConfirmation");
		tg.check.isVisible("ele_donePaymentArrangement");
		tg.click("ele_donePaymentArrangement", 1);
	}
}