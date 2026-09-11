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

class fnvalidatepafaqpage {

	public static void fnvalidatepafaqpage() {
		tg.wait("ele_PAFAQPageHeader", ComparisonType.IS_VISIBLE, 20);
		tg.check.isVisible("ele_PAFAQPageHeader");
		tg.check.isVisible("ele_WhatsPaymentArrangementText");
		tg.check.isVisible("ele_HowMuchDoesItCost");
		tg.check.isVisible("ele_CanIChangeAnExistingPaymentArrangementText");
		tg.check.isVisible("ele_CanISetupPAToRestoreMySuspenedAccountText");
		tg.check.isVisible("ele_IfPaymentIsDeclinedText");
		tg.check.isVisible("ele_WhenWillMyPaymentBeProcessedText");
		tg.check.isVisible("ele_WillMyLateFeeBeRemovedText");
		// [DISABLED] tg.check.isVisible("ele_CanIPayoffAPaymentArrangementEarlyText");
	}
}