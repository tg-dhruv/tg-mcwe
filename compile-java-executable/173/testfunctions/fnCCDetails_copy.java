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

class fnccdetails_copy {

	public static void fnccdetails_copy() {
		tg.typeEncrypted("ele_prodCardName", var_CC_Prod_Name);
		tg.typeEncrypted("ele_prodCardNumber", "nl5PHYz9uHSF3dOI4d5XadT4a+SiHpxvS6J7KFvPs/Y=:MTIzNDU2Nzg5MTAxMTEyMQ==");
		tg.typeEncrypted("ele_prodCardExpiration", var_CC_Prod_Exp);
		tg.typeEncrypted("ele_prodCardCVV", var_CC_Prod_CVV);
		tg.typeEncrypted("ele_prodCardZipCode", var_CC_Prod_Zipcode);
		tg.click("ele_cardSaveButton", 1);
	}
}