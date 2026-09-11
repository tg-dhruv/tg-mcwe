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

class fnsddmethodforhsi {

	public static void fnsddmethodforhsi() {
		tg.check.isVisible("ele_PlansDropDown");
		tg.check.isVisible("ele_PlansDropDown");
		tg.click("ele_PlansDropDown", 1);
		tg.testFunction("fnAcceptCookies", new Object[]{});
		tg.wait("ele_svgtgwebcomma869", ComparisonType.IS_VISIBLE);
		tg.click("ele_HSI", 1);
		tg.wait(20);
		tg.check.isVisible("ele_HSIlogo");
		tg.testFunction("fnAcceptCookies", new Object[]{});
		tg.click("ele_checkavailabilityBtn", 1);
		tg.check.isVisible("ele_SeeAvailableinternetplansforyouraddress");
		tg.type("ele_HSIInputtextboxforAdress", "920 MARVIN ST");
		tg.click("ele_SelectrequiredAddressas920MarvinStKiowaKS67070", 1);
		tg.type("ele_UnitTextInputBox", "1991");
		tg.click("ele_seeavailableplans", 1);
		tg.wait(20);
		tg.click("ele_SelectHomeinternet5G");
		tg.click("ele_RemovePromoBtn", 1);
		tg.check.isVisible("ele_HSIPlanPage");
		tg.click("ele_selectplan803", 1);
		tg.wait(10);
		tg.check.isVisible("ele_chooseadeliverymethod");
		tg.check.isVisible("ele_notavailableat67070");
		tg.click("ele_CrossmarkbuttonOndeliverymethod", 1);
	}
}