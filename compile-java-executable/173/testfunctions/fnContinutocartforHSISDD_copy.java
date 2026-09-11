import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
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

class fncontinutocartforhsisdd_copy {

	public static void fncontinutocartforhsisdd_copy() {
				tg.wait("ele_continueshoppingBtn", ComparisonType.IS_VISIBLE);
				tg.click("ele_continueshoppingBtn", 1);
				tg.wait(10);
				tg.wait("ele_homeinternetOption", ComparisonType.IS_VISIBLE);
				tg.click("ele_homeinternetOption", 1);
				tg.wait("ele_universale019", ComparisonType.IS_VISIBLE);
		// [DISABLED] 		tg.click("ele_universale019", 1);
		// [DISABLED] 		tg.wait("ele_universale019", ComparisonType.IS_VISIBLE);
				tg.type("ele_universale019", "902 MARVIN ST");
				tg.wait("ele_buttontgwe840", ComparisonType.IS_VISIBLE);
				tg.click("ele_buttontgwe840", 1);
		// [DISABLED] 		tg.wait("ele_universale345", ComparisonType.IS_VISIBLE);
		// [DISABLED] 		tg.click("ele_universale345", 1);
				tg.wait("ele_universale345", ComparisonType.IS_VISIBLE);
				tg.type("ele_universale345", "1991");
				tg.wait("ele_confirm508", ComparisonType.IS_VISIBLE);
				tg.click("ele_confirm508", 1);
				tg.wait(20);
				tg.click("ele_SelectHomeinternet5G", 1);
		// [DISABLED] 		tg.click("ele_seeavailableplans", 1);
				tg.check.isVisible("ele_HSIPlanPage");
				tg.click("ele_selectplan803", 1);
				tg.wait(10);
				tg.check.isInvisible("ele_chooseadeliverymethod");
	}
}