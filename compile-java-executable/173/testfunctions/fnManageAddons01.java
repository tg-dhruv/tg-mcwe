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

class fnmanageaddons01 {

	public static void fnmanageaddons01() {
		tg.scrollToElement("ele_SPANFamilyAllowancesO1", Direction.DOWN);
		tg.wait("ele_SPANFamilyAllowancesO1", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_SPANFamilyAllowancesO1", 1);
		tg.wait("ele_SPANENTIPMessagingFr1", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_SPANENTIPMessagingFr1", 1);
		tg.wait("ele_Continueb", ComparisonType.IS_VISIBLE, 9);
		tg.click("ele_Continueb", 1);
		tg.wait("ele_AgreeSubmit", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_AgreeSubmit", 1);
		tg.wait("ele_Manageaddons1", ComparisonType.IS_VISIBLE, 9);
		tg.click("ele_Manageaddons1", 1);
		tg.wait("ele_spantgwebc094", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_spantgwebc094", 1);
		tg.wait("ele_agree520", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_agree520", 1);
		tg.wait("ele_spantgwebc748", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_spantgwebc748", 1);
		tg.wait("ele_continue234", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_continue234", 1);
		tg.wait("ele_agreesubmi413", ComparisonType.IS_VISIBLE, 8);
		tg.click("ele_agreesubmi413", 1);
		tg.wait("ele_manageaddo870", ComparisonType.IS_VISIBLE, 10);
	}
}