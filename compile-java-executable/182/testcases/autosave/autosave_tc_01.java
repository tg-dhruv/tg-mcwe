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
public class tc_01 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc_01() {
		tg.openBrowser();
		tg_int var_total = 0;
		var_total = ((Number) tg.testFunction("tf_01", new Object[]{TG_BLANK_INTEGER_ARG_1_OF_tf_01, TG_BLANK_INTEGER_ARG_2_OF_tf_01, TG_BLANK_INTEGER_ARG_3_OF_tf_01, TG_BLANK_INTEGER_ARG_4_OF_tf_01, TG_BLANK_INTEGER_ARG_5_OF_tf_01, TG_BLANK_INTEGER_ARG_6_OF_tf_01, TG_BLANK_INTEGER_ARG_7_OF_tf_01, TG_BLANK_INTEGER_ARG_8_OF_tf_01, TG_BLANK_INTEGER_ARG_9_OF_tf_01, TG_BLANK_INTEGER_ARG_10_OF_tf_01})).intValue();
		tg.printLogs(var_total);
		tg.close();
	}
}