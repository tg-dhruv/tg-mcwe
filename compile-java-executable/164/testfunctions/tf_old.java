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
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

class tf_old {

	public static Object tf_old(Integer a, Integer b, Integer c, Integer d) {
		tg_int var_TGReturn = 0;
		tg.wait(1);
		START_CUSTOM_SCRIPT;
		var_TGReturn = a + b + c -d ;
		END_CUSTOM_SCRIPT;
		tg.printLogs(var_TGReturn);
		return var_TGReturn;
	}
}