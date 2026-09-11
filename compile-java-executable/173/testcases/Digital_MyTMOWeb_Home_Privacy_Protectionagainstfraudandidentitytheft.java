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
public class digital_mytmoweb_home_privacy_protectionagainstfraudandidentitytheft {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_privacy_protectionagainstfraudandidentitytheft() {
		tg.openBrowser();
		var_Username = tg.saveToVariable(var_TMOWebUserName2, var_Username);
		var_Password = tg.saveToVariable(var_TMOWebPassword2, var_Password);
		tg.testFunction("fnDigitalWebLoginPROD");
		tg.testFunction("fnAcceptCookies");
		tg.testFunction("fnNaviagteToPrivacyTab");
		tg.testFunction("fnFraudandidentitytheftprotection");
		// Locator changes and the custom expression written was complication so simplified it using testgrid actions
		tg.testFunction("fnFraudandIdentity_turnoff");
		tg.close();
	}
}