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

class fnsimprotectionforalllines_copy3 {

	public static void fnsimprotectionforalllines_copy3() {
		tg.wait("ele_SIMprotection", ComparisonType.IS_VISIBLE);
		tg.click("ele_SIMprotection", 1);
		tg.wait("ele_TurnONSIMProtectionForALLLines", ComparisonType.IS_VISIBLE);
		tg.click("ele_TurnONSIMProtectionForALLLines", 1);
		tg.wait("ele_SaveChangesinSIMProtection", ComparisonType.IS_VISIBLE);
		tg.click("ele_SaveChangesinSIMProtection", 1);
		tg.wait("ele_ContinueinSIMProtection", ComparisonType.IS_VISIBLE);
		tg.click("ele_ContinueinSIMProtection", 1);
		tg.testFunction("fnClickMyProfile_copy3");
		tg.testFunction("fnClickonSecurity_copy3");
		tg.wait("ele_SIMprotection", ComparisonType.IS_VISIBLE);
		tg.click("ele_SIMprotection", 1);
		tg.wait("ele_TurnOFFSIMProtectionForAllLines", ComparisonType.IS_VISIBLE);
		tg.click("ele_TurnOFFSIMProtectionForAllLines", 1);
		tg.wait("ele_SaveChangesinSIMProtection", ComparisonType.IS_VISIBLE);
		tg.click("ele_SaveChangesinSIMProtection", 1);
		tg.wait("ele_ContinueinSIMProtection", ComparisonType.IS_VISIBLE);
		tg.click("ele_ContinueinSIMProtection", 1);
	}
}