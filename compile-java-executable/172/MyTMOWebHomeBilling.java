import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
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
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;

@Listeners(TestListener.class)
public class MyTMOWebHomeBilling {

    public static String var_TMOWebEIPPassword = "Tmobile@2134";

    public static String var_TMOWebEIPUsername = "9132424633";

    public static String var_TMOWebPwdforPA = "Tmobile@2143";

    public static String var_TMOWebUserforPA = "4706624039";

    public static String var_TMOWebNonAutoPayPassword = "Tmobile@2143";

    public static String var_TMOWebNonAutoPayUserName = "4255020556";

    public static String var_AccountNumber = "4353434455";

    public static String var_RoutingNumber = "125000105";

    public static String var_AccountName = "TestUser";

    public static String var_AutoPayText = "on";

    public static String var_TMOTotalBalancePassword = "Tmobile@2143";

    public static String var_TMOTotalBalanceUsername = "4047168561";

    public static int var_Amount = 10;

    public static String var_TMOWebUsername3 = "5014997134";

    public static String var_TMOWebPassword3 = "Tmob1le@2143";

    public static String var_TestReusableVariable = "null";

    public static String var_TMOWebPwdforSavings = "Tmobile@2143";

    public static String var_TMOWebUserforSavings = "4706623489";

    public static String var_TMOWebPwdforViewServices = "Tm0b1le@2143";

    public static String var_TMOWebUserforViewServices = "4709237688";

    public static String var_TMOWebAutopayPassword = "Tmobile@213";

    public static String var_TMOWebAutopayUsername = "9132844201";

    public static String var_TMOMultiLinePassword = "Tmobile@2143";

    public static String var_TMOMultiLineUsername = "2819674851";

    public static String var_CC_Prod_Zipcode = "3fkdqo8zA8jWUTRp8jvN/A==:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_CC_Prod_CVV = "e32PkIF1vJKRdjlEfJt31g==:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_CC_Prod_Exp = "vE70OZVYgwPXlm1szEm04Q==:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_CC_Prod_Number = "nl5PHYz9uHSF3dOI4d5XadT4a+SiHpxvS6J7KFvPs/Y=:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_CC_Prod_Name = "W2bnNIX3yy9u4wBjFAGVTEl/me0QmkVBfzMnmGylutc=:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_TMOWebPassword2 = "Tmobile@2143";

    public static String var_TMOWebUserName2 = "4709238132";

    public static String var_Password = "null";

    public static String var_Username = "null";

    public static String var_TMOWebPassword1 = "Tm0b1le@2143";

    public static String var_TMOWebUserName1 = "4709237688";

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_billbreakdownbyline() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOMultiLineUsername, var_Username);
        var_Password = tg.saveToVariable(var_TMOMultiLinePassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnValidateMultilineBillBreakDown_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_downloadsummarybill() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserName2, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPassword2, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnDownloadBillSummary_copy");
        tg.testFunction("fnClickBackButton_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalmytmohomebilldownloadpastsummarybilldocument() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnPastBills_copy");
        tg.testFunction("fnClickOnPastBillsSummaryPDF_copy");
        tg.testFunction("fnClickBackButton_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalmytmohomebillviewpastbillsummarypage() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserName2, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPassword2, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnPastBills_copy");
        tg.testFunction("fnClickOnRecentPastBills_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickBackButton_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalmytmopaymentoftotalbalance() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOTotalBalanceUsername, var_Username);
        var_Password = tg.saveToVariable(var_TMOTotalBalancePassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickOnMakeAPayment_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnTotalBalance_copy");
        tg.testFunction("fnClickOnAddPaymentMethod_copy");
        tg.testFunction("fnClickOnBank_copy");
        tg.testFunction("fnClickOnEnterAccountDetailsManually_copy");
        tg.testFunction("fnFillTheAccountDetails_copy");
        tg.testFunction("fnConfirmBankAccountDetails_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalmytmovalidatepastbills() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserName2, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPassword2, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnPastBills_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.customScriptStart();
        List<WebElement> l1 = driver.findElements(By.xpath("//button[@class='past-bill-link']/span[text()='Detailed PDF']"));
        System.out.println("Number of Past bills available" + l1.size() / 2);
        if (l1.isEmpty()) {
            throw new RuntimeException("no past bills, use another account");
        }
        tg.customScriptEnd();
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalmytmoviewbillsavings() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.wait("ele_savingsTitle", ComparisonType.IS_VISIBLE);
        if (tg.performAssert("ele_savingsTitle", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_ViewSavings", 1);
            tg.printLogs("Savings visible");
        }
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalmytmowebbillcardautopayment() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebNonAutoPayUserName, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebNonAutoPayPassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnCheckAutoPayAndClick_copy");
        tg.testFunction("fnAddAutoPaymentUsingCard");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalmytmowebbillcardautopaymenteditandcancel() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebAutopayUsername, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebAutopayPassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnCheckAutoPayAndClick_copy");
        tg.testFunction("fnClickEditAutoPaymentMethod");
        tg.testFunction("fnClickOnBank_copy");
        tg.testFunction("fnClickOnBank_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalmytmowebbilldownloaddetailedbilldocument() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnDownloadDetailedBilldocument_copy");
        tg.testFunction("fnClickBackButton_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalmytmowebbillequipmentfinancingpage() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebEIPUsername, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebEIPPassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnViewDevicePaymentPlans_copy");
        tg.testFunction("fnClickMakePaymentEIP_copy");
        tg.testFunction("fnClickBackButton_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalmytmowebhomebillcheckonetimecharges() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserName2, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPassword2, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDismissNotificationPopUps_copy");
        tg.testFunction("fnNavigateToOneTimeCharges_copy");
        tg.testFunction("fnClickBackButton_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalmytmowebhomebilldownloadpastmonthdetailedpdf() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebAutopayUsername, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebAutopayPassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnPastBills_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnPastBillsDetailedPDF_copy");
        tg.testFunction("fnClickBackButton_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalmytmowebhomebillmakeapayment() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUsername3, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPassword2, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDismissNotificationPopUps_copy");
        tg.testFunction("fnNavigatenVerifyMakepayment_copy");
        tg.testFunction("fnClickBackButton_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalmytmowebhomebillmakefuturedatedpaymentwithcard() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUsername3, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPassword2, var_Password);
        tg.testFunction("fnDigitalWebLoginPRODPastDueAccount_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnOtherAmount_copy");
        tg.testFunction("fnEnterCardDetails_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalmytmowebhomebillmakepastduepaymentwithcheckingaccount() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUsername3, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPassword2, var_Password);
        tg.testFunction("fnDigitalWebLoginPRODPastDueAccount_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnNavigatePayment_copy");
        tg.testFunction("fnClickOnPayment_copy");
        tg.testFunction("fnClickOnEnterAccountDetailsManually_copy");
        tg.testFunction("fnBankAccountDetails_copy");
        tg.testFunction("fnConfirmBankAccountDetails_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalmytmowebhomebillnavigatetopaymentarrangementpageviabillpaycard() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforPA, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforPA, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnSetupaPaymentArrangement_copy");
        tg.testFunction("fnClickBackButton_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalmytmowebhomebillservicesautopay() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebAutopayUsername, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebAutopayPassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickManageAutoPayUnderBillingService_copy");
        tg.testFunction("fnVerifyPaymentMethodInAutoPay_copy");
        tg.testFunction("fnVerifyCancelAutoPayInAutoPay_copy");
        tg.testFunction("fnClickBackButton_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalmytmowebhomebillviewservicedetails() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforViewServices, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforViewServices, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDismissNotificationPopUps_copy");
        tg.testFunction("fnNavigatetoViewServicesDetails_copy");
        tg.testFunction("fnClickBackButton_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalmytmowebhomenavigatetoaccountactivitypage() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnAccountActivity_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalmytmowebhomenavigatetomywalletpage() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnNavigatetoMyWalletPage_copy");
        tg.testFunction("fnClickBackButton_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalmytmowebhomenavigatetousagesummarypage() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnUsageSummaryPage_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tgtesttestfunction() {
        tg.openBrowser();
        tg.wait(3);
        if (tg.performAssert("ele_addPaymentMethodAutoPay", ComparisonType.IS_CLICKABLE)) {
        }
        tg.close();
    }

    public static void fnacceptcookies_copy_copy_copy_copy_copy_copy_copy() {
        if (tg.performAssert("ele_acceptButtonXpath", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_acceptButtonXpath", 1);
        }
    }

    public static void fnaccountactivity_copy() {
        tg.wait("ele_ViewAccountActivity", ComparisonType.IS_VISIBLE);
        tg.click("ele_ViewAccountActivity", 1);
        tg.check.isVisible("ele_AccountActivityPage");
        tg.check.isVisible("ele_Notifications");
        tg.check.isVisible("ele_ScheduledActivity");
        tg.check.isVisible("ele_AccountActivityHistory");
    }

    public static void fnaddautopaymentusingcard() {
        tg.wait("ele_addPaymentMethodAutoPay", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_addPaymentMethodAutoPay");
        tg.click("ele_addPaymentMethodAutoPay", 1);
        tg.wait("ele_cardPaymentMethod", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_cardPaymentMethod");
        tg.click("ele_cardPaymentMethod", 1);
        tg.typeEncrypted("ele_prodCardName", var_CC_Prod_Name);
        tg.typeEncrypted("ele_prodCardNumber", var_CC_Prod_Number);
        tg.typeEncrypted("ele_prodCardExpiration", var_CC_Prod_Exp);
        tg.typeEncrypted("ele_prodCardCVV", var_CC_Prod_CVV);
        tg.typeEncrypted("ele_prodCardZipCode", var_CC_Prod_Zipcode);
        tg.click("ele_cardSaveButton", 1);
        tg.click("ele_clickAgreeAndSubmitButton", 1);
        tg.wait("ele_continueAddPaymentMethod", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_continueAddPaymentMethod", 1);
        tg.wait("ele_doneAutoPaySetup", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_doneAutoPaySetup", 1);
        tg.wait("ele_viewBillLink", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_viewBillLink");
        tg.click("ele_viewBillLink", 1);
        tg.testFunction("fnCheckAutoPayAndClick_copy");
        tg.wait("ele_editPaymentMethodAutoPay", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_editPaymentMethodAutoPay");
        tg.click("ele_editPaymentMethodAutoPay", 1);
        tg.wait("ele_editCardDetails", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_editCardDetails", 1);
        tg.click("ele_backButton", 1);
        tg.click("ele_backButton", 1);
        tg.click("ele_backButton", 1);
        tg.testFunction("fnCheckAutoPayAndClick_copy");
        tg.wait("ele_cancelAutoPay", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_cancelAutoPay");
        tg.click("ele_cancelAutoPay", 1);
        tg.click("ele_doneCancelAutoPay", 1);
    }

    public static void fnbankaccountdetails_copy() {
        tg.wait("ele_nameOnAccountField", ComparisonType.IS_VISIBLE, 10);
        if (tg.performAssert("ele_nameOnAccountField", ComparisonType.IS_VISIBLE)) {
            tg.type("ele_nameOnAccountField", var_AccountName);
            tg.wait("ele_routingNumberField", ComparisonType.IS_VISIBLE, 2);
            tg.type("ele_routingNumberField", var_RoutingNumber);
            tg.wait("ele_accountNumberField1", ComparisonType.IS_VISIBLE, 2);
            tg.type("ele_accountNumberField1", var_AccountNumber);
            tg.wait("ele_reEnterAccountNumber", ComparisonType.IS_VISIBLE, 2);
            tg.type("ele_reEnterAccountNumber", var_AccountNumber);
            tg.customScriptStart();
            try {
                tg.customScriptEnd();
                // Scroll dropdown into view
                tg.customScriptStart();
                WebElement dd = driver.findElement(By.xpath("//*[@id='lbx-formEcheck-selectaccountType']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", dd);
                tg.customScriptEnd();
                // Try native
                tg.customScriptStart();
                if ("select".equalsIgnoreCase(dd.getTagName())) {
                    new org.openqa.selenium.support.ui.Select(dd).selectByVisibleText("Personal - Checking");
                    System.out.println("Selected 'Personal - Checking' via native <select>.");
                    tg.customScriptEnd();
                } else {
                    // Custom dropdown fallback: click to open, then click option by text
                    tg.customScriptStart();
                    dd.click();
                    tg.customScriptEnd();
                    // Wait for option to be clickable and click it
                    tg.customScriptStart();
                    org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(10));
                    By option = By.xpath("//*[normalize-space(.)='Personal - Checking']");
                    WebElement opt = wait.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(option));
                    opt.click();
                    System.out.println("Selected 'Personal - Checking' via custom dropdown.");
                }
            } catch (Exception ex) {
                System.out.println("Account Type selection failed: " + ex.getMessage());
                // rethrow to ensure TestGrid marks the step/test as failed
                throw ex;
            }
            try {
                By submitBy = By.xpath("//*[@id='lbx-formEcheck-submit']");
                tg.customScriptEnd();
                // Wait for presence/visibility and clickability
                tg.customScriptStart();
                org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(15));
                WebElement submit = wait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(submitBy));
                tg.customScriptEnd();
                // Scroll into view (center) to avoid overlay/viewport issues
                tg.customScriptStart();
                ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", submit);
                tg.customScriptEnd();
                // Wait until clickable and click
                tg.customScriptStart();
                submit = wait.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(submitBy));
                submit.click();
                System.out.println("Clicked Submit (id=lbx-formEcheck-submit).");
            } catch (Exception ex) {
                System.out.println("Submit click failed: " + ex.getMessage());
                // rethrow to ensure TestGrid marks the step as failed
                throw ex;
            }
            tg.customScriptEnd();
        }
        tg.customScriptStart();
        try {
            By agreeBy = By.xpath("//*[@id='lbx-echeckConfirmationPage-submit']");
            // Build a wait
            org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(15));
            // Wait for visibility
            WebElement agreeBtn = wait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(agreeBy));
            // Scroll into view to avoid intercept/viewport issues
            ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", agreeBtn);
            // Wait until clickable and click
            agreeBtn = wait.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(agreeBy));
            agreeBtn.click();
            System.out.println("Clicked 'Agree & Continue' (id=lbx-echeckConfirmationPage-submit).");
        } catch (Exception ex) {
            System.out.println("'Agree & Continue' click failed: " + ex.getMessage());
            // rethrow so TestGrid marks the step as failed
            throw ex;
        }
        tg.customScriptEnd();
    }

    public static void fnccdetails_copy() {
        tg.typeEncrypted("ele_prodCardName", var_CC_Prod_Name);
        tg.typeEncrypted("ele_prodCardNumber", var_CC_Prod_Number);
        tg.typeEncrypted("ele_prodCardExpiration", var_CC_Prod_Exp);
        tg.typeEncrypted("ele_prodCardCVV", var_CC_Prod_CVV);
        tg.typeEncrypted("ele_prodCardZipCode", var_CC_Prod_Zipcode);
        tg.click("ele_cardSaveButton", 1);
        tg.click("ele_clickAgreeAndSubmitButton", 1);
    }

    public static void fncheckautopayandclick_copy() {
        tg.customScriptStart();
        var_AutoPayText = driver.findElement(By.xpath("//div[@class='autopay-text']")).getText();
        tg.customScriptEnd();
        if (tg.performAssert(var_AutoPayText, ComparisonType.EQUAL_TO, "AutoPay off")) {
            tg.click("ele_setupAutoPay", 1);
        } else {
            tg.click("ele_manageautopay", 1);
        }
    }

    public static void fnchoosecalendar_copy() {
        tg.click("ele_Calendar", 1);
        tg.wait("ele_Date", ComparisonType.IS_VISIBLE);
        tg.click("ele_Date", 1);
    }

    public static void fnclickbackbutton_copy() {
        tg.check.isVisible("ele_backButton");
        if (tg.performAssert("ele_backButton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_backButton", 1);
        }
    }

    public static void fnclickeditautopaymentmethod() {
        tg.check.isVisible("ele_editPaymentMethodAutoPay");
        tg.wait("ele_editPaymentMethodAutoPay", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_editPaymentMethodAutoPay", 1);
        tg.check.isVisible("ele_editCardDetails");
        tg.wait("ele_editCardDetails", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_editCardDetails", 1);
    }

    public static void fnclickmakepaymenteip_copy() {
        tg.wait("ele_makePaymentButton", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_makePaymentButton");
        tg.click("ele_makePaymentButton", 1);
    }

    public static void fnclickmanageautopay_copy() {
        tg.wait("ele_manageautopay", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_manageautopay", 1);
    }

    public static void fnclickmanageautopayunderbillingservice_copy() {
        tg.wait("ele_manageAutoPayBillingServices", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_manageAutoPayBillingServices", 1);
    }

    public static void fnclickonaddpaymentmethod_copy() {
        tg.wait("ele_addPaymentMethod", ComparisonType.IS_VISIBLE, 5);
        if (tg.performAssert("ele_addPaymentMethod", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_addpayment", 1);
        }
    }

    public static void fnclickonbank_copy() {
        tg.wait("ele_bank", ComparisonType.IS_VISIBLE, 5);
        if (tg.performAssert("ele_bank", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_bank", 1);
        }
    }

    public static void fnclickondeviceoption_copy() {
        tg.wait("ele_viewDevicePaymentPlans", ComparisonType.IS_VISIBLE);
        if (tg.performAssert("ele_viewDevicePaymentPlans", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_viewDevicePaymentPlans", 1);
        }
    }

    public static void fnclickonenteraccountdetailsmanually_copy() {
        tg.wait("ele_enterAccountDetailsManual", ComparisonType.IS_VISIBLE, 5);
        if (tg.performAssert("ele_enterAccountDetailsManual", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_enterAccountDetailsManual", 1);
        }
    }

    public static void fnclickonmakeapayment_copy() {
        tg.wait("ele_makeapayme185", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_makeapayment");
    }

    public static void fnclickonpastbills_copy() {
        tg.wait("ele_pastBillsButton", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_pastBillsButton", 1);
    }

    public static void fnclickonpastbillsdetailedpdf_copy() {
        tg.wait("ele_pastBillsButton", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_pastBillsButton", 1);
        tg.wait("ele_latestMonthDetailedPDF", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_latestMonthDetailedPDF", 1);
    }

    public static void fnclickonpastbillssummarypdf_copy() {
        tg.wait("ele_PastBillSummaryPDF", ComparisonType.IS_VISIBLE);
        tg.click("ele_PastBillSummaryPDF", 1);
    }

    public static void fnclickonpaybill_copy() {
        tg.wait("ele_denynotification", ComparisonType.IS_VISIBLE);
        tg.click("ele_denynotification", 1);
        tg.wait("ele_otherAmount", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_otherAmount", 1);
        tg.wait("ele_otherAmount", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_Calendar", 1);
        tg.wait("ele_Date", ComparisonType.IS_VISIBLE);
        tg.click("ele_Date", 1);
    }

    public static void fnclickonpayment_copy() {
        tg.wait("ele_addpayment", ComparisonType.IS_VISIBLE);
        tg.click("ele_addpayment", 1);
        tg.wait("ele_bankpreferred", ComparisonType.IS_VISIBLE);
        tg.click("ele_bankpreferred", 1);
        tg.wait("ele_enteredetailsmanual", ComparisonType.IS_VISIBLE);
        tg.click("ele_enteredetailsmanual", 1);
    }

    public static void fnclickonrecentpastbills_copy() {
        tg.wait("ele_billsDetailsButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_billsDetailsButton", 1);
    }

    public static void fnclickontotalbalance_copy() {
        if (tg.performAssert("ele_totalBalance", ComparisonType.IS_SELECTED)) {
            tg.printLogs("totalBalance is disabled");
        }
        tg.printLogs("totalBalance is enabled");
    }

    public static void fnclickonviewdevicepaymentplans_copy() {
        tg.wait("ele_viewDevicePaymentPlans", ComparisonType.IS_VISIBLE, 10);
        if (tg.performAssert("ele_viewDevicePaymentPlans", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_viewDevicePaymentPlans", 1);
        }
    }

    public static void fnclickviewbill_copy() {
        tg.wait("ele_viewBillLink", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_viewBillLink", 1);
    }

    public static void fnconfirmbankaccountdetails_copy() {
        tg.wait("ele_agreeAndContinue", ComparisonType.IS_VISIBLE, 5);
        if (tg.performAssert("ele_agreeAndContinue", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_agreeAndContinue", 1);
        }
    }

    public static void fndigitalwebloginprod_copy_copy_copy() {
        tg.wait("ele_myaccountSpan", ComparisonType.IS_VISIBLE);
        tg.click("ele_myaccountSpan", 1);
        tg.wait("ele_loginLink", ComparisonType.IS_VISIBLE);
        tg.click("ele_loginLink", 1);
        tg.wait("ele_emailOrPhoneInput", ComparisonType.IS_VISIBLE);
        tg.click("ele_emailOrPhoneInput", 1);
        tg.type("ele_emailOrPhoneInput", var_Username);
        tg.wait("ele_nextButton", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_nextButton", 1);
        tg.wait("ele_passwordInput", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_passwordInput", 1);
        tg.wait("ele_passwordInput", ComparisonType.IS_VISIBLE);
        tg.type("ele_passwordInput", var_Password);
        tg.wait("ele_LoginButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_LoginButton", 1);
        tg.printLogs("Complete Login");
    }

    public static void fndigitalwebloginprodpastdueaccount_copy() {
        tg.wait("ele_myaccountSpan", ComparisonType.IS_VISIBLE);
        tg.click("ele_myaccountSpan", 1);
        tg.wait("ele_loginLink", ComparisonType.IS_VISIBLE);
        tg.click("ele_loginLink", 1);
        tg.wait("ele_emailOrPhoneInput", ComparisonType.IS_VISIBLE);
        tg.click("ele_emailOrPhoneInput", 1);
        tg.type("ele_emailOrPhoneInput", var_Username);
        tg.wait("ele_nextButton", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_nextButton", 1);
        tg.wait("ele_passwordInput", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_passwordInput", 1);
        tg.wait("ele_passwordInput", ComparisonType.IS_VISIBLE);
        tg.type("ele_passwordInput", var_Password);
        tg.wait("ele_LoginButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_LoginButton", 1);
        tg.printLogs("Complete Login");
    }

    public static void fndismissnotificationpopups_copy() {
        if (tg.performAssert("ele_allowNotificationsButton", ComparisonType.IS_VISIBLE)) {
            tg.printLogs("Notification visibility check");
            tg.click("ele_allowNotificationsButton", 1);
        }
    }

    public static void fndontallownotificationpopup_copy_copy_copy_copy() {
        tg.wait("ele_dontAllowNotification", ComparisonType.IS_VISIBLE, 10);
        if (tg.performAssert("ele_dontAllowNotification", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_dontAllowNotification", 1);
        }
    }

    public static void fndownloadbillsummary_copy() {
        tg.wait("ele_downloadMyBillPDF", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_downloadMyBillPDF", 1);
        tg.wait("ele_downloadButton", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_downloadButton", 1);
    }

    public static void fndownloaddetailedbilldocument_copy() {
        tg.wait("ele_downloadMyBillPDF", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_downloadMyBillPDF", 1);
        tg.wait("ele_DownloadDetailedBill", ComparisonType.IS_VISIBLE);
        tg.click("ele_DownloadDetailedBill", 1);
    }

    public static void fnduplicatefunctionnew_copy() {
        tg.wait("ele_viewDevicePaymentPlans", ComparisonType.IS_VISIBLE);
        tg.click("ele_viewDevicePaymentPlans", 1);
    }

    public static void fnentercarddetails_copy() {
        tg.typeEncrypted("ele_NameonCard", var_CC_Prod_Name);
        tg.wait("ele_CardNumber", ComparisonType.IS_VISIBLE, 10);
        tg.typeEncrypted("ele_CardNumber", var_CC_Prod_Number);
        tg.typeEncrypted("ele_ExpirationDate", var_CC_Prod_Exp);
        tg.typeEncrypted("ele_CVV", var_CC_Prod_CVV);
        tg.typeEncrypted("ele_ZipCode", var_CC_Prod_Zipcode);
        tg.click("ele_Continue", 1);
        tg.click("ele_clickAgreeAndSubmitButton", 1);
        tg.wait("ele_ContinuewNew", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_ContinuewNew", 1);
        tg.wait("ele_PayNow", ComparisonType.IS_VISIBLE, 10);
        tg.customScriptStart();
        try {
            By payNowBy = By.xpath("//button[@aria-label='Pay Now']");
            org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(20));
            tg.customScriptEnd();
            // Ensure overlays (if any) are gone — optional, adjust selectors if you have loaders/backdrops
            tg.customScriptStart();
            try {
                wait.until(org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loading,.spinner,.backdrop,.modal-backdrop,.cdk-overlay-backdrop")));
            } catch (Exception ignore) {
            }
            tg.customScriptEnd();
            // Find and scroll
            tg.customScriptStart();
            WebElement btn = wait.until(org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated(payNowBy));
            ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", btn);
            tg.customScriptEnd();
            // Wait for clickability (re-get after scroll)
            tg.customScriptStart();
            btn = wait.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(payNowBy));
            tg.customScriptEnd();
            // Try normal click → Actions → JS
            tg.customScriptStart();
            boolean clicked = false;
            try {
                btn.click();
                clicked = true;
            } catch (Exception e1) {
                try {
                    new org.openqa.selenium.interactions.Actions(driver).moveToElement(btn).click().perform();
                    clicked = true;
                } catch (Exception e2) {
                    ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].click();", btn);
                    clicked = true;
                }
            }
            if (!clicked)
                throw new AssertionError("Failed to click Pay Now");
            System.out.println("✅ Clicked Pay Now (aria-label).");
        } catch (Exception ex) {
            System.out.println("❌ Pay Now click failed: " + ex.getMessage());
            // make TestGrid fail correctly
            throw ex;
        }
        tg.customScriptEnd();
    }

    public static void fnfilltheaccountdetails_copy() {
        tg.wait("ele_nameOnAccountField", ComparisonType.IS_VISIBLE, 10);
        if (tg.performAssert("ele_nameOnAccountField", ComparisonType.IS_VISIBLE)) {
            tg.type("ele_nameOnAccountField", var_AccountName);
            tg.wait("ele_routingNumberField", ComparisonType.IS_VISIBLE, 2);
            tg.type("ele_routingNumberField", var_RoutingNumber);
            tg.wait("ele_accountNumberField1", ComparisonType.IS_VISIBLE, 2);
            tg.type("ele_accountNumberField1", var_AccountNumber);
            tg.wait("ele_reEnterAccountNumber", ComparisonType.IS_VISIBLE, 2);
            tg.type("ele_reEnterAccountNumber", var_AccountNumber);
            tg.scrollToElement("ele_accounTypeDropdown", Direction.DOWN);
            tg.click("ele_accounTypeDropdown", 1);
            tg.click("ele_personalCheckingDropDownOption", 1);
            tg.click("ele_continueButton", 1);
        }
        if (tg.performAssert("ele_continueButton", ComparisonType.IS_VISIBLE)) {
            tg.printLogs("success !!");
        }
    }

    public static void fnlogout_copy_copy_copy_copy_copy() {
        tg.check.isVisible("ele_profileName");
        if (tg.performAssert("ele_profileName", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_profileName", 1);
            tg.wait("ele_logoutButton", ComparisonType.IS_VISIBLE, 5);
            tg.click("ele_logoutButton", 1);
        }
    }

    public static void fnlogoutrestored_copy() {
        if (tg.performAssert("ele_loginUserButton", ComparisonType.IS_INVISIBLE)) {
            tg.wait("ele_backButton", ComparisonType.IS_VISIBLE);
            tg.click("ele_backButton", 1);
        }
        tg.wait("ele_loginUserButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_loginUserButton", 1);
        tg.wait("ele_logoutButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_logoutButton", 1);
        tg.check.isVisible("ele_loginDiv");
    }

    public static void fnnavigatenverifymakepayment_copy() {
        tg.wait("ele_makeAPaymentHeader", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_makeAPaymentHeader", 1);
        tg.wait("ele_payYourBillHeader", ComparisonType.IS_VISIBLE);
        tg.wait("ele_addPaymentMethod", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_addPaymentMethod", 1);
        tg.wait("ele_bankpreferred", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_backButton", 1);
        tg.customScriptStart();
        int waitSeconds = 15;
        tg.customScriptEnd();
        // ---------- Check 1: Pay Now button ----------
        tg.customScriptStart();
        {
            By by = By.xpath("//button[@aria-label='Pay Now']");
            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(waitSeconds));
            WebElement el = wait.until(ExpectedConditions.elementToBeClickable(by));
            boolean clickable = el.isDisplayed() && el.isEnabled();
            System.out.println("Pay Now clickable: " + clickable);
            if (!clickable) {
                throw new AssertionError("Pay Now is NOT clickable");
            }
        }
        tg.customScriptEnd();
        // ---------- Check 2: Total balance radio (use clickable container, not inner
        tg.customScriptStart();
        {
            tg.customScriptEnd();
            // Move up to the nearest clickable container; spans are often not 'enabled'
            tg.customScriptStart();
            By by = By.xpath("//span[text()='Total balance']/ancestor::*[self::label or self::div][1]");
            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(waitSeconds));
            WebElement el = wait.until(ExpectedConditions.elementToBeClickable(by));
            boolean clickable = el.isDisplayed() && el.isEnabled();
            System.out.println("Total balance (container) clickable: " + clickable);
            if (!clickable) {
                throw new AssertionError("Total balance container is NOT clickable");
            }
        }
        tg.customScriptEnd();
        // ---------- Check 3: Add Payment Method button ----------
        tg.customScriptStart();
        {
            By by = By.xpath("//button[@id='addPaymentMethod-btn']");
            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(waitSeconds));
            WebElement el = wait.until(ExpectedConditions.elementToBeClickable(by));
            boolean clickable = el.isDisplayed() && el.isEnabled();
            System.out.println("Add Payment Method clickable: " + clickable);
            if (!clickable) {
                throw new AssertionError("Add Payment Method is NOT clickable");
            }
        }
        tg.customScriptEnd();
        // ---------- Check 4: Date picker button ----------
        tg.customScriptStart();
        {
            By by = By.xpath("//div[3]/duet-date-picker/div/div[1]/button");
            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(waitSeconds));
            WebElement el = wait.until(ExpectedConditions.elementToBeClickable(by));
            boolean clickable = el.isDisplayed() && el.isEnabled();
            System.out.println("Date picker clickable: " + clickable);
            if (!clickable) {
                throw new AssertionError("Date picker is NOT clickable");
            }
        }
        tg.customScriptEnd();
    }

    public static void fnnavigatepayment_copy() {
        tg.wait("ele_makeAPaymentHeader", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_makeAPaymentHeader", 1);
        tg.wait("ele_payYourBillHeader", ComparisonType.IS_VISIBLE);
        tg.wait("ele_addPaymentMethod", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_addPaymentMethod", 1);
        tg.wait("ele_bankpreferred", ComparisonType.IS_VISIBLE, 10);
    }

    public static void fnnavigatetomywalletpage_copy() {
        tg.wait("ele_Managepaymentmethods", ComparisonType.IS_VISIBLE);
        tg.click("ele_Managepaymentmethods", 1);
        tg.check.isVisible("ele_MywalletPage");
        tg.wait("ele_card902", ComparisonType.IS_VISIBLE);
        tg.click("ele_card902", 1);
    }

    public static void fnnavigatetoonetimecharges_copy() {
        tg.wait("ele_viewOneTimeChargesButton", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_viewOneTimeChargesButton", 1);
        tg.check.isVisible("ele_OneTimeChargesDetailsText");
    }

    public static void fnnavigatetoviewservicesdetails_copy() {
        tg.wait("ele_viewServiceLink", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_viewServiceLink", 1);
        tg.wait("ele_servicesPage", ComparisonType.IS_VISIBLE, 10);
    }

    public static void fnotheramount_copy() {
        tg.wait("ele_makeAPaymentHeader", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_makeAPaymentHeader", 1);
        tg.wait("ele_payYourBillHeader", ComparisonType.IS_VISIBLE);
        tg.customScriptStart();
        try {
            // Click Card option
            By cardBy = By.xpath("//fieldset/div[2]/div[1]/div/label/span/span[1]");
            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
            WebElement cardOption = wait.until(ExpectedConditions.elementToBeClickable(cardBy));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", cardOption);
            cardOption.click();
            System.out.println("Clicked Card payment option.");
            // Enter Other Amount = 10
            By amountBy = By.xpath("//*[@id='field-otherAmount']");
            WebElement amountField = wait.until(ExpectedConditions.visibilityOfElementLocated(amountBy));
            amountField.clear();
            amountField.sendKeys("10");
            System.out.println("Entered Other Amount: 10");
        } catch (Exception ex) {
            System.out.println("Card selection or amount entry failed: " + ex.getMessage());
            // fail the test properly in TestGrid
            throw ex;
        }
        tg.customScriptEnd();
        tg.wait("ele_addPaymentMethod", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_addPaymentMethod", 1);
        tg.wait("ele_card", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_card", 1);
    }

    public static void fnsetupapaymentarrangement_copy() {
        tg.wait("ele_SetUpPaymentArrdiv", ComparisonType.IS_VISIBLE);
        tg.click("ele_SetUpPaymentArrdiv", 1);
        tg.check.isVisible("ele_PaymentArrangementPage");
    }

    public static void fntestfunctionduplicate_copy() {
        tg.wait("ele_viewDevicePaymentPlans", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_viewDevicePaymentPlans", 1);
    }

    public static void fnusagesummarypage_copy() {
        tg.wait("ele_ThisMonthUsageDetails", ComparisonType.IS_VISIBLE);
        tg.click("ele_ThisMonthUsageDetails", 1);
        tg.check.isVisible("ele_UsageOverviewPage");
    }

    public static void fnvalidatemultilinebillbreakdown_copy() {
        tg.wait("ele_ByLineButton", ComparisonType.IS_VISIBLE, 10);
        tg.customScriptStart();
        try {
            tg.customScriptEnd();
            tg.click("ele_ByLineButton");
            tg.customScriptStart();
        } catch (Exception e) {
            throw new RuntimeException("no multiline break downs. Use correct ban");
        }
        tg.customScriptEnd();
    }

    public static void fnverifycancelautopayinautopay_copy() {
        tg.wait("ele_cancelAutoPay", ComparisonType.IS_VISIBLE, 10);
        tg.check.isEnabled("ele_cancelAutoPay");
    }

    public static void fnverifypaymentmethodinautopay_copy() {
        tg.wait("ele_paymentMethodDetails", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_paymentMethodDetails");
        tg.check.isClickable("ele_paymentMethodDetails");
    }
}
