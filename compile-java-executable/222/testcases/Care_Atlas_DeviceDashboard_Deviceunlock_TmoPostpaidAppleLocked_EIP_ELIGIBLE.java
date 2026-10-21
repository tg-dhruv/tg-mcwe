import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.net.InetSocketAddress;
import java.net.Proxy;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.LocalDate;
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
public class care_atlas_devicedashboard_deviceunlock_tmopostpaidapplelocked_eip_eligible {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void care_atlas_devicedashboard_deviceunlock_tmopostpaidapplelocked_eip_eligible() {
		tg.openBrowser();
		var_testDataLabel = tg.saveToVariable("TMO_POSTPAID_APPLE_LOCKED_EIP_ELIGIBLE", var_testDataLabel);
		var_expectedValue = tg.saveToVariable("Apple", var_expectedValue);
		tg.testFunction("fnTDMAPIRequest", new Object[]{});
		// [DISABLED] var_ban = tg.saveToVariable("403994200", var_ban);
		// [DISABLED] var_mobileNumber = tg.saveToVariable("4042075197", var_mobileNumber);
		// [DISABLED] var_password = tg.saveToVariable("pass@123", var_password);
		tg.testFunction("fnatlaslogin", new Object[]{});
		tg.wait(30);
		tg.wait("ele_AtlasHomePageLinkDEVICES", ComparisonType.IS_VISIBLE, 60);
		tg.hoverOverElement("ele_AtlasHomePageLinkDEVICES");
		tg.wait("ele_AtlasHomeLinkDevicedashboard", ComparisonType.IS_VISIBLE, 40);
		tg.click("ele_AtlasHomeLinkDevicedashboard", 1);
		tg_String var_DeviceName = "";
		tg_String var_Devicestatus = "";
		tg_String var_UnlockMethod = "";
		tg_String var_unlockeligibilitystatus = "";
		tg.takeFullScreenshot();
		tg.wait("ele_AtlasDevicesLabelDeviceName", ComparisonType.IS_VISIBLE, 60);
		var_DeviceName = tg.saveToVariable("ele_AtlasDevicesLabelDeviceName", var_DeviceName);
		tg.check.contains(var_DeviceName,var_expectedValue);
		tg.scrollToElement("ele_AtlasDevicesDeviceStatus", Direction.DOWN);
		tg.wait("ele_AtlasDevicesDeviceStatus", ComparisonType.IS_VISIBLE, 100);
		tg.wait(10);
		var_Devicestatus = tg.saveToVariable("ele_AtlasDevicesDeviceStatus", var_Devicestatus);
		tg.check.contains(var_Devicestatus,"Locked");
		var_UnlockMethod = tg.saveToVariable("ele_AtlasHomeDevicesLabelUnlockMethod", var_UnlockMethod);
		tg.check.isNotEqualTo(var_UnlockMethod,"Can't Unlock");
		tg.wait("ele_AtlasHomePageLinkBILLING", ComparisonType.IS_VISIBLE, 60);
		tg.hoverOverElement("ele_AtlasHomePageLinkBILLING");
		tg.click("ele_AtlasHomePageLinkBILLING", 1);
		tg_String var_BalanceAmount = "";
		tg_Double var_balanceAmountDouble = .0;
		tg.wait("ele_AtlasPaymentsBalance", ComparisonType.IS_VISIBLE, 60);
		var_BalanceAmount = tg.saveToVariable("ele_AtlasPaymentsBalance", var_BalanceAmount);
		START_CUSTOM_SCRIPT;
		var_balanceAmountDouble = Double.parseDouble(var_BalanceAmount.replace("$", "").replace(",", "").trim());
		END_CUSTOM_SCRIPT;
		tg.check.isGreaterThan(var_balanceAmountDouble,"0");
		START_CUSTOM_SCRIPT;
		String innerCss = "#ab-make-payment button";
		String deepFindJs =
		        "function deep(root, sel) {"
		      + "  var f = root.querySelector(sel);"
		      + "  if (f) return f;"
		      + "  var all = root.querySelectorAll('*');"
		      + "  for (var i = 0; i < all.length; i++) {"
		      + "    if (all[i].shadowRoot) {"
		      + "      var r = deep(all[i].shadowRoot, sel);"
		      + "      if (r) return r;"
		      + "    }"
		      + "  }"
		      + "  return null;"
		      + "}"
		      + "return deep(document, arguments[0]);";
		org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
		org.openqa.selenium.WebElement targetBtn = null;
		long endTime = System.currentTimeMillis() + 45000;
		try {
		    while (targetBtn == null && System.currentTimeMillis() < endTime) {
		        // 1) Search the main page, including all nested shadow roots
		        driver.switchTo().defaultContent();
		        Object result = js.executeScript(deepFindJs, innerCss);
		        if (result instanceof org.openqa.selenium.WebElement
		                && ((org.openqa.selenium.WebElement) result).isDisplayed()) {
		            targetBtn = (org.openqa.selenium.WebElement) result;
		            break;
		        }
		        // 2) Search inside each iframe
		        int frameCount = driver.findElements(org.openqa.selenium.By.tagName("iframe")).size();
		        for (int i = 0; i < frameCount && targetBtn == null; i++) {
		            driver.switchTo().defaultContent();
		            driver.switchTo().frame(i);
		            result = js.executeScript(deepFindJs, innerCss);
		            if (result instanceof org.openqa.selenium.WebElement
		                    && ((org.openqa.selenium.WebElement) result).isDisplayed()) {
		                targetBtn = (org.openqa.selenium.WebElement) result;
		            }
		        }
		        if (targetBtn == null) {
		            Thread.sleep(500);
		        }
		    }
		} catch (InterruptedException e) {
		    e.printStackTrace();
		    Thread.currentThread().interrupt();
		    throw new RuntimeException(e);
		}
		if (targetBtn == null) {
		    driver.switchTo().defaultContent();
		    throw new RuntimeException("Button '" + innerCss + "' not found in page, shadow roots, or iframes within 45 seconds");
		}
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", targetBtn);
		try {
		    targetBtn.click();
		} catch (org.openqa.selenium.WebDriverException e) {
		    js.executeScript("arguments[0].click();", targetBtn);
		}
		END_CUSTOM_SCRIPT;
		tg.wait(20);
		tg.switchToTab(1);
		START_CUSTOM_SCRIPT;
		driver.manage().window().maximize();
		END_CUSTOM_SCRIPT;
		tg.wait("ele_AtlasHomePaymentsLinkEquipmentInstallmentPlanpaym", ComparisonType.IS_VISIBLE, 60);
		tg.check.isEnabled("ele_AtlasHomePaymentsLinkEquipmentInstallmentPlanpaym");
		tg.click("ele_AtlasHomePaymentsLinkEquipmentInstallmentPlanpaym", 1);
		tg.wait("ele_AtlasPaymentsEIPSelectionRadioBtnBalance", ComparisonType.IS_VISIBLE, 60);
		tg.click("ele_AtlasPaymentsEIPSelectionRadioBtnBalance", 1);
		tg.wait("ele_AtlasPaymentsEIPSelectionBtnContinue", ComparisonType.IS_VISIBLE, 60);
		tg.click("ele_AtlasPaymentsEIPSelectionBtnContinue", 1);
		tg.wait("ele_AtlasHomePaymentsNameoncard", ComparisonType.IS_VISIBLE, 40);
		tg.type("ele_AtlasHomePaymentsNameoncard", var_cardHolderName);
		tg.wait("ele_AtlasHomePaymentsTextBoxCardNumber", ComparisonType.IS_VISIBLE, 40);
		tg.type("ele_AtlasHomePaymentsTextBoxCardNumber", var_cardNumber);
		tg.wait("ele_AtlasHomePaymentsTextBoxExpirationMonth", ComparisonType.IS_VISIBLE, 40);
		tg.type("ele_AtlasHomePaymentsTextBoxExpirationMonth", "02");
		tg.pressKey(ENTER, 1);
		tg.wait("ele_AtlasHomeBillingTextBoxExpirationYear", ComparisonType.IS_VISIBLE, 40);
		tg.type("ele_AtlasHomeBillingTextBoxExpirationYear", "2030");
		tg.pressKey(ENTER, 1);
		tg.wait("ele_AtlasHomeBillingTextBoxCVV", ComparisonType.IS_VISIBLE, 40);
		tg.type("ele_AtlasHomeBillingTextBoxCVV", var_cardCVV);
		tg.wait("ele_AtlasHomeBillingTextBoxZipCode", ComparisonType.IS_VISIBLE, 40);
		tg.type("ele_AtlasHomeBillingTextBoxZipCode", "75016");
		tg.wait("ele_AtlasHomeBillingtmocheckbox", ComparisonType.IS_VISIBLE, 30);
		tg.click("ele_AtlasHomeBillingtmocheckbox", 1);
		tg.wait("ele_AtlasHomepaymentsBtnValidateNew", ComparisonType.IS_VISIBLE, 60);
		tg.click("ele_AtlasHomepaymentsBtnValidateNew", 1);
		tg.wait(30);
		tg.scrollToElement("ele_AtlasHomepaymentsAgreeTCcheckbox", Direction.DOWN);
		tg.click("ele_AtlasHomepaymentsAgreeTCcheckbox", 1);
		tg.wait("ele_AtlasHomePaymentsBtnSubmitpayment", ComparisonType.IS_VISIBLE, 60);
		tg.click("ele_AtlasHomePaymentsBtnSubmitpayment", 1);
		// [DISABLED] tg.wait("ele_atlaspaymentpopupclosebtn", ComparisonType.IS_VISIBLE, 60);
		// [DISABLED] tg.click("ele_atlaspaymentpopupclosebtn", 1);
		tg.switchToTab(0);
		tg.testFunction("fnAtlasDevicestatusRecheckafterPayment", new Object[]{});
		tg.openNewTab();
		tg.switchToTab(1);
		tg.testFunction("fnMyTmoLogin", new Object[]{});
		tg.testFunction("fnMyTmoDeviceStatus", new Object[]{});
		tg.check.contains(var_tmodevicestatus,"Device is unlocked");
		tg.printLogs("dummy step");
		tg.close();
	}
}