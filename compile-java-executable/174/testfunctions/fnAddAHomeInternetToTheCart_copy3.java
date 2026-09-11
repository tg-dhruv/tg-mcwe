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

class fnaddahomeinternettothecart_copy3 {

	public static void fnaddahomeinternettothecart_copy3() {
		tg.wait(5);
		tg.wait("ele_CartButton", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_CartButton", 1);
		tg.wait(20);
		// [DISABLED] tg.check.isVisible("ele_HomeInternetLineText");
		if(tg.performAssert("ele_HomeInternetLineText", ComparisonType.IS_VISIBLE)){
		tg.check.isVisible("ele_HomeInternetLineText");
		tg.check.contains("ele_HomeInternetLineText","Home internet line");
		tg.check.isVisible("ele_FiveGGatewayText");
		tg.check.contains("ele_FiveGGatewayText","5G Gateway TMO-G4AR 5G White - B");
		// [DISABLED] tg.scrollToElement("ele_youMustReturnTheGateway", Direction.DOWN);
		// [DISABLED] tg.check.isVisible("ele_youMustReturnTheGateway");
		// [DISABLED] tg.check.isVisible("ele_youMustReturnTheGateway");
		}
		if(tg.performAssert("ele_HomeInternetLineText", ComparisonType.IS_INVISIBLE)){
		tg.check.isVisible("ele_THomeNavigatorCartPage");
		tg.click("ele_THomeNavigatorCartPage", 1);
		tg.wait("ele_LoopbackDropdown", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_LoopbackDropdown", 1);
		tg.wait("ele_BackToMyAccountButton", ComparisonType.IS_VISIBLE, 15);
		tg.click("ele_BackToMyAccountButton", 1);
		tg.wait(15);
		tg.hoverOverElement("ele_shop016");
		tg.wait("ele_HomeInternetLink", ComparisonType.IS_VISIBLE, 15);
		tg.click("ele_HomeInternetLink", 1);
		tg.wait(20);
		tg.wait("ele_seePlans", ComparisonType.IS_VISIBLE, 15);
		tg.click("ele_seePlans", 1);
		tg.wait(30);
		// [DISABLED] tg.scrollToElement("ele_AwayUnlimitedPlanSelectButton", Direction.DOWN);
		tg.wait("ele_AwayUnlimitedPlanSelectButton", ComparisonType.IS_VISIBLE, 15);
		tg.click("ele_AwayUnlimitedPlanSelectButton", 1);
		tg.scrollToElement("ele_shipping", Direction.DOWN);
		tg.wait("ele_shipping", ComparisonType.IS_VISIBLE, 15);
		tg.click("ele_shipping", 1);
		tg.wait(15);
		tg.scrollToElement("ele_PlanContinueButton", Direction.DOWN);
		tg.click("ele_PlanContinueButton", 1);
		tg.wait("ele_HomeInternetLineText", ComparisonType.IS_VISIBLE, 30);
		}
	}
}