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

class fnclickonpayment_copy {

	public static void fnclickonpayment_copy() {
		tg.wait("ele_addpayment", ComparisonType.IS_VISIBLE);
		tg.click("ele_addpayment", 1);
		tg.wait("ele_bankpreferred", ComparisonType.IS_VISIBLE);
		tg.click("ele_bankpreferred", 1);
		tg.wait("ele_enteredetailsmanual", ComparisonType.IS_VISIBLE);
		tg.click("ele_enteredetailsmanual", 1);
	}
}