import java.time.Duration;
import org.openqa.selenium.*;import org.openqa.selenium.support.ui.WebDriverWait;import org.openqa.selenium.support.ui.ExpectedConditions;import static io.testgrid.baseClass.driver;import org.openqa.selenium.interactions.Actions;import org.openqa.selenium.By;import org.testng.Assert;;
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
import static io.testgrid.enums.KeyboardKeys.*;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class digital_mytmoweb_shop_portin_base_shipto_verifytransferdetailsontheportintransferpage_copy2 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_shop_portin_base_shipto_verifytransferdetailsontheportintransferpage_copy2() {
		tg.openBrowser();
		var_Username = tg.saveToVariable("4253248856", var_Username);
		var_Password = tg.saveToVariable("Tmobile@2145", var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy2");
		tg.testFunction("fnAcceptCookies_copy2");
		// [DISABLED] tg.wait("ele_cellphones729", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_cellphones729", 1);
		// [DISABLED] tg.wait("ele_buttonclos835", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_buttonclos835", 1);
		// [DISABLED] tg.wait("ele_divtgwebcomma115", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_divtgwebcomma115", 1);
		// [DISABLED] tg.wait("ele_getanewnum934", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_getanewnum934", 1);
		// [DISABLED] tg.wait("ele_skiptradei891", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_skiptradei891", 1);
		// [DISABLED] tg.wait("ele_addtocart000", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_addtocart000", 1);
		tg.testFunction("fnAddMobileToCart_copy2");
		tg.close();
	}
}