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

class fnclickonpastbillssummarypdf_copy3 {

	public static void fnclickonpastbillssummarypdf_copy3() {
		tg.wait("ele_PastBillSummaryPDF", ComparisonType.IS_VISIBLE);
		tg.click("ele_PastBillSummaryPDF", 1);
		tg.openNewTab();
		tg.navigateToUrl("file:///home/seluser/Downloads/SummaryBillMar2026.pdf");
		tg.switchToTab(0);
	}
}