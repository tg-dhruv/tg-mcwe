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

class login_tg_global_functions {

	public static void login_tg_global_functions() {
				tg.wait("ele_someoneexa427", ComparisonType.IS_VISIBLE);
				tg.click("ele_someoneexa427", 1);
				tg.wait("ele_someoneexa427", ComparisonType.IS_VISIBLE);
				tg.type("ele_someoneexa427", "SVC_TST_COMM_AGENT@T-Mobile.com");
				tg.wait("ele_idsibutton284", ComparisonType.IS_VISIBLE);
				tg.click("ele_idsibutton284", 1);
				tg.wait("ele_password690", ComparisonType.IS_VISIBLE);
				tg.click("ele_password690", 1);
				tg.wait("ele_password690", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_password690", "web6N8/nrfux760voe8Zg0Pi5WxCFRycaYyAiJ0L4ns=:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_idsibutton083", ComparisonType.IS_VISIBLE);
				tg.click("ele_idsibutton083", 1);
				tg.wait(15);
	}
}