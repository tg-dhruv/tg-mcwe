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

class fneditsecurityquestions {

	public static void fneditsecurityquestions() {
		tg.wait("ele_EditProfile", ComparisonType.IS_VISIBLE);
		tg.click("ele_EditProfile", 1);
		tg.wait("ele_EditSecurityQuestions", ComparisonType.IS_VISIBLE);
		tg.click("ele_EditSecurityQuestions", 1);
		tg.wait("ele_AnsforQuestion1", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_AnsforQuestion1", 1);
		tg.type("ele_AnsforQuestion1", "qwerty");
		tg.wait("ele_AnsforQuestion2", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_AnsforQuestion2", 1);
		tg.type("ele_AnsforQuestion2", "9876543210");
		tg.wait("ele_AnsforQuestion3", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_AnsforQuestion3", 1);
		tg.type("ele_AnsforQuestion3", "asdfgh");
		tg.wait("ele_SaveSecurityQuestions", ComparisonType.IS_VISIBLE);
		tg.click("ele_SaveSecurityQuestions", 1);
		// [DISABLED] tg.wait("ele_AnsforQuestion1", ComparisonType.IS_VISIBLE, 5);
		// [DISABLED] tg.check.isVisible("ele_SecurityQuestionsUpdatedSuccessfully");
	}
}