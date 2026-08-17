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

class tf_03 {

	public static Object tf_03(Integer a, Integer b, Integer c, Integer d, Integer e, Integer f, Integer g, Integer h, Integer i, Integer j) {
		tg_int var_TGReturn = 0;
		START_CUSTOM_SCRIPT;
		var_TGReturn = a + b +c;
		END_CUSTOM_SCRIPT;
		return var_TGReturn;
	}
}