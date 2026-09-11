import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.testng.Assert;
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

@Listeners(TestListener.class);
public class digital_mytmoweb_manage_bill_showconfirmationmodaluponsuccessfulsetupofautopay {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_manage_bill_showconfirmationmodaluponsuccessfulsetupofautopay() {
		tg.openBrowser();
				var_Username = tg.saveToVariable(var_UserNameSavedPaymentMethod, var_Username);
				var_Password = tg.saveToVariable(var_PasswordSavedPaymentMethod, var_Password);
				tg.testFunction("fnDigitalWebLoginPROD", new Object[]{});
				tg.testFunction("fnClickOnSetupAutoPay", new Object[]{});
				tg.testFunction("fnDontAllowNotificationPopUp", new Object[]{});
				tg.testFunction("fnValidatePayementDateDropDownAndSelectADifferentDate", new Object[]{});
				tg.testFunction("fnClickOnAgreeAndSubmitButton", new Object[]{});
				tg.testFunction("fnValidateAutopaySetUpMessageAndClickOnDoneButton", new Object[]{});
				tg.testFunction("fnDisableAutopay", new Object[]{});
		tg.close();
	}
}