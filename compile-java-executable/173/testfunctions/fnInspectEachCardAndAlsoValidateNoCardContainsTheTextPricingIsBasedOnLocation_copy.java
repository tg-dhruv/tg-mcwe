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

class fninspecteachcardandalsovalidatenocardcontainsthetextpricingisbasedonlocation_copy {

	public static void fninspecteachcardandalsovalidatenocardcontainsthetextpricingisbasedonlocation_copy() {
		tg.wait(10);
		if(tg.performAssert("ele_LimitedTimeOnlyPopupCloseMessage", ComparisonType.IS_VISIBLE)){
		tg.click("ele_LimitedTimeOnlyPopupCloseMessage", 1);
		}
		tg.wait(10);
		if(tg.performAssert("ele_BackUpAndAwayButton", ComparisonType.IS_VISIBLE)){
		tg.click("ele_BackUpAndAwayButton", 1);
		}
		tg.wait(10);
		tg.check.isVisible("ele_Away30PerMonth");
		tg.check.contains("ele_Away30PerMonth","30");
		tg.check.isVisible("ele_Away120PerMonth");
		tg.check.contains("ele_Away120PerMonth","120");
		tg.check.isVisible("ele_Away170PerMonth");
		tg.check.contains("ele_Away170PerMonth","170");
		tg.check.isVisible("ele_AddressEditButtonHSIPage");
		tg.click("ele_AddressEditButtonHSIPage", 1);
		tg.wait(10);
		if(tg.performAssert("ele_PlanPageEditButtonConfirmation", ComparisonType.IS_VISIBLE)){
		tg.click("ele_PlanPageEditButtonConfirmation", 1);
		}
		tg.wait(10);
		tg.check.isVisible("ele_AddressTextFieldHSIPlanPage");
		tg.click("ele_AddressEditButtonHSIPage", 1);
		// [DISABLED] tg.check.isVisible("ele_UnitTextFieldHSIPage");
		tg.type("ele_AddressTextFieldHSIPlanPage", "1 Ravinia");
		tg.wait(6);
		tg.wait("ele_ArkanascityAddress", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_ArkanascityAddress", 1);
		tg.check.isVisible("ele_UnitTextFieldHSIPage");
		tg.click("ele_UnitTextFieldHSIPage", 1);
		tg.type("ele_UnitTextFieldHSIPage", "1");
		tg.wait(3);
		tg.click("ele_SeeAvailablePlanHSI", 1);
		tg.wait(10);
		if(tg.performAssert("ele_LimitedTimeOnlyPopupCloseMessage", ComparisonType.IS_VISIBLE)){
		tg.click("ele_LimitedTimeOnlyPopupCloseMessage", 1);
		}
		tg.wait(10);
		if(tg.performAssert("ele_BackUpAndAwayButton", ComparisonType.IS_VISIBLE)){
		tg.click("ele_BackUpAndAwayButton", 1);
		}
		tg.check.isVisible("ele_Away30PerMonth");
		tg.check.isVisible("ele_Away120PerMonth");
		tg.check.isVisible("ele_Away170PerMonth");
		tg.click("ele_AddressEditButtonHSIPage", 1);
		tg.wait(10);
		if(tg.performAssert("ele_PlanPageEditButtonConfirmation", ComparisonType.IS_VISIBLE)){
		tg.click("ele_PlanPageEditButtonConfirmation", 1);
		}
		tg.wait(10);
		tg.click("ele_AddressTextFieldHSIPlanPage", 1);
		tg.type("ele_AddressTextFieldHSIPlanPage", "1 Ravinia");
		tg.wait(6);
		tg.click("ele_HendersonAddress", 1);
		tg.wait(6);
		tg.click("ele_UnitTextFieldHSIPage", 1);
		tg.type("ele_UnitTextFieldHSIPage", "1");
		tg.wait(6);
		tg.click("ele_SeeAvailablePlanHSI", 1);
		tg.wait(10);
		if(tg.performAssert("ele_LimitedTimeOnlyPopupCloseMessage", ComparisonType.IS_VISIBLE)){
		tg.click("ele_LimitedTimeOnlyPopupCloseMessage", 1);
		}
		tg.wait(10);
		if(tg.performAssert("ele_BackUpAndAwayButton", ComparisonType.IS_VISIBLE)){
		tg.click("ele_BackUpAndAwayButton", 1);
		}
		tg.wait(10);
		tg.check.isVisible("ele_Away30PerMonth");
		tg.check.isVisible("ele_Away120PerMonth");
		tg.check.isVisible("ele_Away170PerMonth");
	}
}