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

class tf_01 {

	public static Object tf_01(Integer num1, String num2, String num3, String num4, String num5, String num6, String num7, String num8, String num9, String num10) {
		tg_int var_TGReturn = 0;
		START_CUSTOM_SCRIPT;
		System.out.println("Addition of all num = " +
		        (num1 + num2 + num3 + num4 + num5 +
		         num6 + num7 + num8 + num9 + num10));
		END_CUSTOM_SCRIPT;
		tg.printLogs(var_TGReturn);
		return var_TGReturn;
	}
}