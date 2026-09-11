import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import java.time.Duration;
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

class fnvalidateplancomparison {

	public static void fnvalidateplancomparison() {
		tg.wait("ele_comparePlansHeader", ComparisonType.IS_VISIBLE, 20);
		tg.check.isVisible("ele_comparePlansHeader");
		tg.click("ele_comparePlansHeader", 1);
		// [DISABLED] tg.wait("ele_comparepla463", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_comparepla463", 1);
		tg.selectDropdownByValue("ele_chooseExperienceBeyondPlan","Experience More");
		tg.wait("ele_original714", ComparisonType.IS_VISIBLE);
		tg.click("ele_original714", 1);
		tg.wait("ele_planbasics136", ComparisonType.IS_VISIBLE);
		tg.click("ele_planbasics136", 1);
		tg.wait("ele_planbasics296", ComparisonType.IS_VISIBLE);
		tg.click("ele_planbasics296", 1);
		tg.wait("ele_phoneupgra362", ComparisonType.IS_VISIBLE);
		tg.click("ele_phoneupgra362", 1);
		tg.wait("ele_phoneupgra575", ComparisonType.IS_VISIBLE);
		tg.performDoubleClick("ele_phoneupgra575");
		tg.wait("ele_phoneupgra394", ComparisonType.IS_VISIBLE);
		tg.performDoubleClick("ele_phoneupgra394");
		tg.wait("ele_entertainm582", ComparisonType.IS_VISIBLE);
		tg.click("ele_entertainm582", 1);
		tg.wait("ele_internatio787", ComparisonType.IS_VISIBLE);
		tg.click("ele_internatio787", 1);
		tg.wait("ele_otherbenef668", ComparisonType.IS_VISIBLE);
		tg.click("ele_otherbenef668", 1);
		tg.wait("ele_discounts016", ComparisonType.IS_VISIBLE);
		tg.click("ele_discounts016", 1);
		tg.wait("ele_buttonclos708", ComparisonType.IS_VISIBLE);
		tg.click("ele_buttonclos708", 1);
	}
}