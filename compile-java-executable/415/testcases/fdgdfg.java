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
public class fdgdfg {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void fdgdfg() {
		tg.openBrowser();
				tg.wait("ele_r1h6kqsqpp662", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1h6kqsqpp662", 1);
				tg.wait("ele_r1h6kqsqpp054", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1h6kqsqpp054", 1);
				tg.wait("ele_r1h6kqsqpp650", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1h6kqsqpp650", 1);
				tg.wait("ele_r1hmkqsqpp158", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1hmkqsqpp158", 1);
				tg.wait("ele_r1hmkqsqpp158", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_r1hmkqsqpp158", "guK4yb5+dDy/Lrl3CZI15w==:MTIzNDU2Nzg5MTAxMTEyMQ==");
		tg.close();
	}
}