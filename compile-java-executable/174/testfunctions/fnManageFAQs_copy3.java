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

class fnmanagefaqs_copy3 {

	public static void fnmanagefaqs_copy3() {
		tg.wait("ele_FAQsLink", ComparisonType.IS_VISIBLE, 40);
		tg.click("ele_FAQsLink", 1);
		tg.wait("ele_AutoPayFaqsHeader", ComparisonType.IS_VISIBLE, 15);
		tg.check.isVisible("ele_AutoPayFaqsHeader");
		tg.wait("ele_backBtC", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_backBtC", 1);
		tg.wait("ele_backBtC", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_backBtC", 1);
	}
}