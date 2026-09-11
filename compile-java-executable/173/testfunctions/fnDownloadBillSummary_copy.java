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

class fndownloadbillsummary_copy {

	public static void fndownloadbillsummary_copy() {
		tg.wait("ele_downloadMyBillPDF", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_downloadMyBillPDF", 1);
		tg.wait("ele_downloadButton", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_downloadButton", 1);
	}
}