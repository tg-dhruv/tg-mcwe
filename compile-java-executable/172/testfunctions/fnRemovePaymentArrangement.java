import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
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

class fnremovepaymentarrangement {

	public static void fnremovepaymentarrangement() {
		tg.testFunction("fnClickViewBill");
		tg.wait("ele_Managepaymentarrangement", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_Managepaymentarrangement", 1);
		tg.wait("ele_EditinPApage", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_EditinPApage", 1);
		tg.wait("ele_Removepaymentmethod", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_Removepaymentmethod", 1);
		tg.wait("ele_ContinueforremovePaymentmethod", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_ContinueforremovePaymentmethod", 1);
		tg.wait("ele_cancelpaym662", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_cancelpaym662", 1);
		tg.wait("ele_YesDeletePA", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_YesDeletePA", 1);
		tg.wait("ele_DoneRemovePA", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_DoneRemovePA", 1);
		tg.testFunction("fnClickViewBill");
		tg.wait("ele_Managepaymentarrangement", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_Managepaymentarrangement", 1);
		tg.wait("ele_EditRemoveforPA", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_EditRemoveforPA", 1);
		tg.wait("ele_EditRemoveCCForPA", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_EditRemoveCCForPA", 1);
		tg.wait("ele_DeleteCCForPA", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_DeleteCCForPA", 1);
		tg.wait("ele_DeleteunderManagePA", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_DeleteunderManagePA", 1);
	}
}