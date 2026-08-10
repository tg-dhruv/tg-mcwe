import java.util.scanner;
import java.lang.*;
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

class tf001 {

	public static void tf001() {
				tg.wait("ele_r1h6kqsqpp142", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1h6kqsqpp142", 1);
				tg.wait("ele_r1h6kqsqpp142", ComparisonType.IS_VISIBLE);
				tg.type("ele_r1h6kqsqpp142", "fbgfghfghgfhg");
				tg.wait("ele_r1hmkqsqpp826", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1hmkqsqpp826", 1);
				tg.wait("ele_r1hmkqsqpp172", ComparisonType.IS_VISIBLE);
				tg.performDoubleClick("ele_r1hmkqsqpp172");
				tg.wait("ele_login038", ComparisonType.IS_VISIBLE);
				tg.click("ele_login038", 1);
	}
}