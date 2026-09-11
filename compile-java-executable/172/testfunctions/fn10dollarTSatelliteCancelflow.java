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

class fn10dollartsatellitecancelflow {

	public static void fn10dollartsatellitecancelflow() {
		tg.check.isVisible("ele_Tsatelliteplan");
		tg.wait(10);
		tg.click("ele_CancelTsatelliteservicebtn", 1);
		tg.wait(10);
		tg.check.isVisible("ele_CancelTSatelliteservicereviewpage");
		tg.testFunction("fnDontAllowNotificationPopUp");
		tg.check.isVisible("ele_BANnumber");
		tg.check.isVisible("ele_tsatelliteplaName");
		tg.check.isVisible("ele_plannameasTSatelliteandpriceas10dollar");
		tg.check.isVisible("ele_Effectivedateforcancellation");
		tg.check.isVisible("ele_gobackBtn");
		tg.click("ele_AgreeSubmitbtn", 1);
		tg.wait(20);
		tg.wait("ele_RedirecttoTSatelliteservicecncledpage", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_Serviceaccessenddate");
		tg.click("ele_ReturntoAccountBtn", 1);
		tg.wait(20);
		tg.check.isVisible("ele_MyTmoWelcomepage");
	}
}