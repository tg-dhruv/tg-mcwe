import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
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
import org.testng.Assert;

class fnhsisdd_copy2 {

	public static void fnhsisdd_copy2() {
		tg.wait(5);
		tg.wait("ele_CartButton", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_CartButton", 1);
		tg.wait(20);
		if(tg.performAssert("ele_HomeInternetLineText", ComparisonType.IS_VISIBLE)){
		tg.wait("ele_HomeInternetLineText", ComparisonType.IS_VISIBLE, 20);
		tg.check.isVisible("ele_HomeInternetLineText");
		tg.wait("ele_MoreOptionsIcon", ComparisonType.IS_VISIBLE);
		tg.click("ele_MoreOptionsIcon", 1);
		tg.wait("ele_RemoveLine", ComparisonType.IS_VISIBLE);
		tg.click("ele_RemoveLine", 1);
		tg.wait("ele_RemoveConfirmButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_RemoveConfirmButton", 1);
		}
		if(tg.performAssert("ele_YourCartIsEmptyText", ComparisonType.IS_VISIBLE)){
		tg.wait("ele_THomeNavigatorCartPage", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_THomeNavigatorCartPage");
		tg.click("ele_THomeNavigatorCartPage", 1);
		tg.wait("ele_LoopbackDropdown", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_LoopbackDropdown", 1);
		tg.wait("ele_BackToMyAccountButton", ComparisonType.IS_VISIBLE, 15);
		tg.click("ele_BackToMyAccountButton", 1);
		tg.wait(15);
		tg.hoverOverElement("ele_shop016");
		tg.wait("ele_HomeInternetLink", ComparisonType.IS_VISIBLE, 15);
		tg.click("ele_HomeInternetLink", 1);
		tg.wait(20);
		tg.wait("ele_seePlans", ComparisonType.IS_VISIBLE, 15);
		tg.click("ele_seePlans", 1);
		tg.wait(30);
		// [DISABLED] tg.scrollToElement("ele_AwayUnlimitedPlanSelectButton", Direction.DOWN);
		tg.wait("ele_AwayUnlimitedPlanSelectButton", ComparisonType.IS_VISIBLE, 15);
		var_GetText = tg.saveToVariable("ele_awayunlimi866", var_GetText);
		tg.printLogs(var_GetText);
		START_CUSTOM_SCRIPT;
		String pricePlan = driver.findElement(By.xpath("(//span[@class='upf-planCard-price-value' and not(contains(@style,'display: none'))])[1]")).getText();
		String address = driver.findElement(By.xpath("//*[@id='text-5654401d4f']//p"))
		        .getText()
		        .replace("Service location:", "")
		        .replace("\n", " ")
		        .replace("Edit", "")
		        .replace(",", "")  
		        .replaceAll("\\s+", " ")
		        .trim();
		System.out.println("Address: " + address);
		END_CUSTOM_SCRIPT;
		tg.click("ele_AwayUnlimitedPlanSelectButton", 1);
		tg.scrollToElement("ele_shipping", Direction.DOWN);
		tg.wait("ele_shipping", ComparisonType.IS_VISIBLE, 15);
		tg.click("ele_shipping", 1);
		tg.wait(15);
		tg.scrollToElement("ele_PlanContinueButton", Direction.DOWN);
		tg.click("ele_PlanContinueButton", 1);
		tg.wait("ele_HangTightWereGettingYourCartReady", ComparisonType.IS_VISIBLE, 10);
		// [DISABLED] var_GetText = tg.saveToVariable("ele_HangTightWereGettingYourCartReady", var_GetText);
		tg.wait("ele_HomeInternetLineText", ComparisonType.IS_VISIBLE, 20);
		tg.check.contains("ele_HomeInternetLineText","Home internet line");
		tg.check.isVisible("ele_FiveGGatewayText");
		tg.check.contains("ele_FiveGGatewayText","5G Gateway TMO-G4AR 5G White - B");
		tg.check.contains(var_GetText,"AWAY™ – Unlimited Plan");
		tg.check.isEnabled("ele_CheckOUt");
		START_CUSTOM_SCRIPT;
		String priceCart = driver.findElement(By.xpath("//*[@class='cart-magentaCartItems__item--small']/span[1]")).getText();
		String price = priceCart.replace("$", "").replace(".00", "");
		List<WebElement> addressLines = driver.findElements(By.xpath("//*[@id='text-0e073bf38a']/div/p"));
		String cartAddress = "";
		for (WebElement line : addressLines) {
		    cartAddress += line.getText() + " ";
		}
		cartAddress = cartAddress
		        .replaceAll("-\\d{4}", "")   
		        .replaceAll(",", "")       
		        .replaceAll("\\s+", " ")     
		        .trim();
		Assert.assertEquals(price, pricePlan);
		Assert.assertEquals(cartAddress, address);
		System.out.println("Validation Passed: The price and address match, confirming that the product was added correctly to the cart.");
		END_CUSTOM_SCRIPT;
		tg.wait("ele_THomeNavigatorCartPage", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_THomeNavigatorCartPage", 1);
		tg.wait("ele_LoopbackDropdown", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_LoopbackDropdown", 1);
		}
	}
}