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
public class tdm2 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tdm2() {
		tg.openBrowser();
		JSONObject var_CSVdata = tg.getJsonData("https://equifaxhosted.testgrid.io/s/csv-to-json/20260808/AYHgt6.json");
		tg_String var_Fname = "null";
		tg_String var_Lname = "null";
		tg_int var_Count = 1;
		while(tg.verify.isLessThan(var_Count, 3)){
		tg.printLogs(var_Count);
		var_Fname = tg.saveToVariable(var_Fname, var_CSVdata, "$.records["+var_Count+"].FirstName");
		tg.printLogs(var_Fname);
		var_Lname = tg.saveToVariable(var_Lname, var_CSVdata, "$.records["+var_Count+"].LastName");
		tg.printLogs(var_Lname);
		tg.wait(2);
		// [DISABLED] tg.type("ele_FirstNameText", var_Fname);
		// [DISABLED] tg.wait(2);
		// [DISABLED] tg.type("ele_LastNameTextField", var_Lname);
		tg.wait(2);
		var_Count = tg.increments(var_Count, 1);
		}
		tg.close();
	}
}