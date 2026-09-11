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
public class digital_mytmoweb_home_bill_downloadsummarybill_copy2 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_bill_downloadsummarybill_copy2() {
		tg.openBrowser();
		var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
		var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy2");
		tg.testFunction("fnAcceptCookies_copy2");
		tg.testFunction("fnClickViewBill_copy2");
		tg.testFunction("fnDontAllowNotificationPopUp_copy2");
		tg.testFunction("fnDownloadBillSummary_copy2");
		tg.testFunction("fnLogout_copy2");
		tg.testFunction("fnManageDownloads_copy2");
		tg.close();
	}
}