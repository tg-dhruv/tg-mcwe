import com.mongodb.*;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
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
public class login_copy {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void login_copy() {
		tg.openBrowser();
				tg.wait("ele_test", ComparisonType.IS_VISIBLE);
				tg.wait("ele_login505", ComparisonType.EQUAL_TO, "login", 10);
				tg.wait("ele_login505", ComparisonType.EQUAL_TO, "55");
				tg.wait("ele_login505", ComparisonType.EQUAL_TO, "33");
				if(tg.performAssert("ele_login", ComparisonType.EQUAL_TO, 2)){
				tg.wait("ele_login", ComparisonType.IS_VISIBLE);
				}
				if(tg.performAssert("ele_login", ComparisonType.LESS_THAN , 5)){
				}
				tg.wait("ele_login608", ComparisonType.IS_VISIBLE);
				tg.wait("ele_closefrien995", ComparisonType.IS_VISIBLE);
				tg.wait("ele_closefrien3261", ComparisonType.IS_VISIBLE);
				tg.click("ele_closefrien3261", 1);
				tg.wait("ele_trueorigin5172", ComparisonType.IS_VISIBLE);
				tg.click("ele_trueorigin5172", 1);
				tg.wait("ele_seeeveryda7613", ComparisonType.IS_VISIBLE);
				tg.click("ele_seeeveryda7613", 1);
				tg.wait("ele_metaai522", ComparisonType.IS_VISIBLE);
				tg.click("ele_metaai522", 1);
				tg.wait("ele_loginwithf107", ComparisonType.IS_VISIBLE);
				tg.click("ele_loginwithf107", 1);
				tg.wait("ele_pathTGWEBCOMMA0386", ComparisonType.IS_VISIBLE);
				tg.click("ele_pathTGWEBCOMMA0386", 1);
				tg.wait("ele_logintofac331", ComparisonType.IS_VISIBLE);
				tg.wait("ele_createnewa052", ComparisonType.IS_VISIBLE);
				tg.wait("ele_svgtgwebco054", ComparisonType.IS_VISIBLE);
				tg.click("ele_svgtgwebco054", 1);
				tg.wait("ele_trueorigin726", ComparisonType.IS_VISIBLE);
				tg.click("ele_trueorigin726", 1);
				tg.wait("ele_login813", ComparisonType.IS_VISIBLE);
				tg.click("ele_login813", 1);
				tg.wait("ele_r1h6kqsqpp545", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1h6kqsqpp545", 1);
				tg.wait("ele_r1h6kqsqpp545", ComparisonType.IS_VISIBLE);
				tg.type("ele_r1h6kqsqpp545", "test");
		tg.close();
	}
}