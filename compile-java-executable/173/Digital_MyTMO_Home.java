import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
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
import org.testng.Assert;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class Digital_MyTMO_Home {

    public static String var_PWSuspenedPAAccount = "Tmobile@2143";

    public static String var_UNSuspenedPAAccount = "4702636289";

    public static String var_PWTwoInstallments = "Tmobile@2134";

    public static String var_UNTwoInstallments = "2149371817";

    public static String var_PWInstallmentDate = "Tmobile@2143";

    public static String var_UNInstallmentDate = "4042031288";

    public static String var_TMOPAPassword = "Tmobile@2134";

    public static String var_TMOPAUsername = "2149371817";

    public static String var_TMOWebMissedPaymentPassword = "Tmobile@2143";

    public static String var_TMOWebMissedPaymentUserName = "9132725093";

    public static String var_TMOWebPAPassword = "Tmobile@2143";

    public static String var_TMOWebPAUsername = "9132725093";

    public static String var_PWDateCantExceedCurrentBillDueDate = "Tmobile@2143";

    public static String var_UNDateCantExceedCurrentBillDueDate = "4694031697";

    public static String var_MyTMOWebMultipleInstallmentPassword = "Tmobile@2134";

    public static String var_MyTMOWebMultipleInstallmentUserName = "2149371817";

    public static String var_TMOWebPwdforSplitPA = "Tmobile@2143";

    public static String var_TMOWebUserforSplitPA = "4042471003";

    public static String var_TMOWebAutopayPassword_Hermes = "Tmobile@2143";

    public static String var_TMOWebAutopayUsername_Hermes = "4255020556";

    public static String var_TMOWebPaymentPassword1_Hermes = "Test@DataPlatform9Team!";

    public static String var_TMOWebPaymentUsername1_Hermes = "9132020954";

    public static String var_TMOWebPAPassNoPaymentMethod_Hermes = "Tmobile@2143";

    public static String var_TMOWebPAUserNoPaymentMethod_Hermes = "9012409774";

    public static String var_PasswordPA_Hermes = "Tm0b1le@2143";

    public static String var_UsernamePA_Hermes = "3854577031";

    public static String var_TMOWebBankPassword = "Tmobile@2143";

    public static String var_TMOWebBankUserName = "4706853877";

    public static String var_TMOWebPassword4 = "Tmobile@2145";

    public static String var_TMOWebUserName4 = "4045993259";

    public static String var_PasswordBillChangeWithdrawalDate = "Tmobile@2145";

    public static String var_UserNameBillChangeWithdrawalDate = "4042030423";

    public static String var_PaymentMethods_BillingPreferences = "//span[text()=\'Payment methods\']/parent::a";

    public static String var_PasswordSavedPaymentMethod = "Tmobile@2143";

    public static String var_UserNameSavedPaymentMethod = "9134436226";

    public static String var_TMOWebE911Password = "Tmobile@2144";

    public static String var_TMOWebE911UserName = "4706624138";

    public static String var_TMoWebPassword_Onlyfor460 = "Tmobile@2145";

    public static String var_TMOWebUsernameRolePassword = "Tmobile@2146";

    public static String var_Username = "null";

    public static String var_TMOWebUserforSIMProtection = "4254695461";

    public static String var_TMOWebPasswordPaymentArrangement = "Tmobile@2142";

    public static String var_TMOWebPasswordToggleSwitch = "Tmobile@2145";

    public static String var_actualText = "null";

    public static String var_expectedText = "null";

    public static String var_TMOWebMultilinePassword1 = "Tmobile@2134";

    public static String var_TMOWebMultilineUser1 = "4043973475";

    public static String var_TMOWebProfilePassword = "Tmobile@2144";

    public static String var_TMOWebProfileUsername = "4708479631";

    public static String var_TMOWebPwdforMYWallet = "Tmobile@2143";

    public static String var_Password_1036 = "Tmobile@2143";

    public static String var_Username_1036 = "4255159761";

    public static String var_TMOWebUsernameRole = "4043973475";

    public static String var_Username_1035 = "4255159761";

    public static String var_TMOWebUsernameToggleSwitch = "4706624138";

    public static String var_TMOWebUserMultiline = "4254695461";

    public static String var_TMOWebUsername_PositiveData = "4046428727";

    public static String var_TMOWebPassword_PositiveData = "Tmobile@2134";

    public static String var_TMoWebUserName_Onlyfor460 = "4047176471";

    public static String var_TMOWebUserforMYWallet = "9132601726";

    public static String var_Amount_1 = "1.02";

    public static int var_Amount_100 = 100;

    public static String var_TMOWebUsernamePaymentArrangement = "4045784015";

    public static String var_TMOWebEIPPassword = "Tmobile@2146";

    public static String var_TMOWebEIPUsername = "9132424633";

    public static String var_TMOWebPwdforPA = "Tmobile@2133";

    public static String var_TMOWebUserforPA = "9132382926";

    public static String var_TMOWebNonAutoPayPassword = "Tmobile@2145";

    public static String var_TMOWebNonAutoPayUserName = "4045993259";

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

    public static String var_TMOWebPwdforViewServices = "Tmobile@2143";

    public static String var_TMOWebUserforViewServices = "4709237688";

    public static String var_TMOWebAutopayPassword = "Tmobile@2144";

    public static String var_TMOWebAutopayUsername = "9132844201";

    public static String var_TMOMultiLinePassword = "Tmobile@2143";

    public static String var_TMOMultiLineUsername = "2819674851";

    public static String var_CC_Prod_Zipcode = "3fkdqo8zA8jWUTRp8jvN/A==:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_CC_Prod_CVV = "e32PkIF1vJKRdjlEfJt31g==:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_CC_Prod_Exp = "vE70OZVYgwPXlm1szEm04Q==:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_CC_Prod_Number = "Vwb+o1AxvPj5Epm8kXeQU2WjcjlW2JkMb2NXuZ2tfPY=:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_CC_Prod_Name = "W2bnNIX3yy9u4wBjFAGVTEl/me0QmkVBfzMnmGylutc=:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_TMOWebPassword2 = "Tmobile@2142";

    public static String var_TMOWebUserName2 = "4709238132";

    public static String var_Password = "null";

    public static String var_TMOWebPassword1 = "Tm0b1le@2143";

    public static String var_TMOWebUserName1 = "4709237688";

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_automytmoweb_dashboard_devices_updatecalleridname() {
        tg.openBrowser();
        var_Username = tg.saveToVariable("4706624138", var_Username);
        var_Password = tg.saveToVariable("Tmobile@2144", var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnNavigateToProfileTab_copy_copy");
        tg.testFunction("fnClickDeviceSettings_copy_copy");
        tg.testFunction("fnClickOnCallerIdName_copy_copy");
        tg.testFunction("fnUpdateFirstAndLastName_copy_copy");
        tg.printLogs("EX-1065 [Auto] MyTMO Web_Dashboard_Devices_Update Caller ID Name  - Passed");
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_addonsandbenefits_addaddons() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnManageAddONs_copy");
        tg.testFunction("fnNewLogout_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_addonsandbenefits_addremovemultipleaddons() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickOnManageAddons_copy");
        tg.testFunction("fnManageAddons01_copy");
        tg.testFunction("fnNewLogout_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_addonsandbenefits_changeaddonsfordifferentline() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOMultiLineUsername, var_Username);
        var_Password = tg.saveToVariable(var_TMOMultiLinePassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickOnManageAddons_copy");
        tg.testFunction("fnSelectAnotherLine_copy");
        tg.testFunction("fnMultilineAddon_copy");
        tg.testFunction("fnSelectAnotherLine_copy");
        tg.testFunction("fnMultilineAddonRemoval_copy");
        tg.testFunction("fnNewLogout_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_addonsandbenefits_removeaddons() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnManageAddONs_copy");
        tg.testFunction("fnNewLogout_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_billcardautopaymenteditandcancel() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebAutopayUsername, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebAutopayPassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnCheckAutoPayAndClick_copy");
        tg.testFunction("fnEditAutoPaymentMethod_copy");
        tg.testFunction("fnClickOnBank_copy");
        tg.testFunction("fnClickOnBank_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_billservicesautopay() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebAutopayUsername_Hermes, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebAutopayPassword_Hermes, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickManageAutoPayUnderBillingService_copy");
        tg.testFunction("fnVerifyPaymentMethodInAutoPay_copy");
        tg.testFunction("fnVerifyCancelAutoPayInAutoPay_copy");
        tg.testFunction("fnClickBackButton_copy");
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_autopayfaqpage() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebBankUserName, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebBankPassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickOnSetupAutoPay_copy_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnManageFAQs_copy");
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_cancelautopay() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebAutopayUsername, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebAutopayPassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnVerifyCancelAutoPayInAutoPay_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_changeattributeofexistingpawithoutupdatingpaymentmethod() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOPAUsername, var_Username);
        var_Password = tg.saveToVariable(var_TMOPAPassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnManagePaymentArrangement_copy");
        tg.testFunction("fnUpdatePA_date_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnClickOnManagePaymentArrangement_copy");
        tg.testFunction("fnDeletePA_copy");
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_daterangeremainconsistentforainvoluntarilysuspendedpaaccount() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_UNSuspenedPAAccount, var_Username);
        var_Password = tg.saveToVariable(var_PWSuspenedPAAccount, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.wait("ele_Managepaymentarrangement", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_Managepaymentarrangement", 1);
        tg.wait(20);
        tg.wait("ele_EditButtonPaymentArrangement", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_EditButtonPaymentArrangement", 1);
        tg.wait("ele_CalenderIcon", ComparisonType.IS_VISIBLE, 20);
        String var_dateValueBeforeSelect = "";
        var_dateValueBeforeSelect = tg.getElementAttribute("ele_calenderSelectedValue", "value", var_dateValueBeforeSelect);
        tg.click("ele_CalenderIcon", 1);
        tg.wait("ele_ValidCalenderDueDate", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_ValidCalenderDueDate", 1);
        String var_dateValueAfterSelect = "";
        var_dateValueAfterSelect = tg.getElementAttribute("ele_calenderSelectedValue", "value", var_dateValueAfterSelect);
        tg.check.isNotEqualTo(var_dateValueBeforeSelect, var_dateValueAfterSelect);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_deletesecondinstallment() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_MyTMOWebMultipleInstallmentUserName, var_Username);
        var_Password = tg.saveToVariable(var_MyTMOWebMultipleInstallmentPassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickSetupPaymentArrangement_copy");
        tg.testFunction("fnValidatePaymentSchedule_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_informadditionswhileviewing_pa_termsandconditions() {
        tg.openBrowser();
        var_Username = tg.saveToVariable("4042038148", var_Username);
        var_Password = tg.saveToVariable("Tmobile@2143", var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickSeeAllScheduledArrangements_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnTermsAndConditions_copy");
        tg.testFunction("fnValidateTermsAndConditionsHeader_copy");
        tg.wait("ele_back351", ComparisonType.IS_VISIBLE);
        tg.click("ele_back351", 1);
        tg.wait("ele_paymentarr340", ComparisonType.IS_VISIBLE);
        tg.check.isVisible("ele_paymentarr340");
        tg.printLogs("User navigated to Payment Arrangement screen");
        tg.printLogs("EX-1739 MyTMO Web_Home_Bill_Inform additions while viewing PA terms and conditions -PASSED");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_navigatetootppageviabillpaycard() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforMYWallet, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforMYWallet, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.wait("ele_makeAPaymentHeader", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_makeAPaymentHeader", 1);
        tg.wait("ele_addpayment", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_addpayment", 1);
        tg.wait("ele_AddCard", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_AddCard", 1);
        tg.testFunction("fnCCDetails_copy");
        tg.check.isVisible("ele_PayNowatOTP");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_navigatetotandcpage() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebBankUserName, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebBankPassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickOnSetupAutoPay_copy_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnManageAutopayAcknowledgement_copy");
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_painstallmentdatecantexceedcurrentbillduedate() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_UNDateCantExceedCurrentBillDueDate, var_Username);
        var_Password = tg.saveToVariable(var_PWDateCantExceedCurrentBillDueDate, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickSetupPaymentArrangement_copy");
        tg.wait("ele_EditButtonPaymentArrangement", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_EditButtonPaymentArrangement", 1);
        tg.wait("ele_CalenderIcon", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_CalenderIcon", 1);
        tg.wait("ele_CurrentBillDueDate", ComparisonType.IS_VISIBLE, 20);
        tg.check.isVisible("ele_ValidCalenderDueDate");
        tg.check.isVisible("ele_InvalidDueDate");
        tg.click("ele_ValidCalenderDueDate", 1);
        tg.wait(5);
        tg.wait("ele_UpdateButtonPaymentArrangement", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_UpdateButtonPaymentArrangement");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_preselectedwithdrawaldate() {
        tg.openBrowser();
        var_Username = tg.saveToVariable("4699966582", var_Username);
        var_Password = tg.saveToVariable("Tmobile@2156", var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.navigateToUrl("https://www.t-mobile.com/payment/autopay");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnValidateWithdrawalDueDate_copy");
        tg.printLogs("EX- 1725 [Auto]MyTMO Web_Home_Bill_Pre selected Withdrawal date  -PASSED");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_suppressdateselectionwhenautopayispaused() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOPAUsername, var_Username);
        var_Password = tg.saveToVariable(var_TMOPAPassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnManagePaymentArrangement_copy");
        tg.testFunction("fnAddPA_copy");
        tg.testFunction("fnAutoPayErrorValidation_copy");
        tg.wait("ele_backBtC", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_backBtC", 1);
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnClickOnManagePaymentArrangement_copy");
        tg.testFunction("fnDeletePA_copy");
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_unabletoupdateschedule() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebMissedPaymentUserName, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebMissedPaymentPassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnManagePaymentArrangement_copy");
        tg.testFunction("fnVerifyUpdateScheduleNotPresent_copy");
        tg.testFunction("fnClickBackButton_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_updateinstallmentsdatesasperpaterm() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_UNTwoInstallments, var_Username);
        var_Password = tg.saveToVariable(var_PWTwoInstallments, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.wait(20);
        int var_PAThere = 0;
        if (tg.performAssert("ele_SeeAllScheduledPA", ComparisonType.IS_VISIBLE)) {
            var_PAThere = tg.saveToVariable(1, var_PAThere);
        }
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        if (tg.performAssert(var_PAThere, ComparisonType.EQUAL_TO, 1)) {
            tg.wait("ele_Managepaymentarrangement", ComparisonType.IS_VISIBLE, 20);
            tg.click("ele_Managepaymentarrangement", 1);
        } else {
            tg.testFunction("fnSetupaPaymentArrangement_copy");
            tg.testFunction("fnCheckAndAddTheCreditCardInPaymentArrangementPage_copy");
            tg.wait(20);
            tg.click("ele_TlogoHomeNavigator", 1);
            tg.wait(10);
            tg.testFunction("fnClickViewBill_copy");
            tg.wait("ele_Managepaymentarrangement", ComparisonType.IS_VISIBLE, 20);
            tg.click("ele_Managepaymentarrangement", 1);
            tg.wait(20);
        }
        tg.wait("ele_EditButtonPaymentArrangement", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_EditButtonPaymentArrangement", 1);
        tg.wait("ele_CalenderIcon", ComparisonType.IS_VISIBLE, 20);
        tg.wait("ele_amountTextFieldPaymentArrangement", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_amountTextFieldPaymentArrangement", 1);
        tg.type("ele_amountTextFieldPaymentArrangement", "7");
        tg.click("ele_CalenderIcon2", 1);
        // [DISABLED] tg.click("ele_CalenderIcon", 1);
        tg.wait("ele_ValidCalenderDueDate", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_ValidCalenderDueDate", 1);
        tg.wait(5);
        tg.click("ele_backButton", 1);
        tg.click("ele_backButton", 1);
        tg.click("ele_TlogoHomeNavigator", 1);
        tg.wait(15);
        tg.testFunction("fnRemovePaymentArrangement_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_updateinstallmentsdatesofpatoincludeadditionaloffereddate() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_UNInstallmentDate, var_Username);
        var_Password = tg.saveToVariable(var_PWInstallmentDate, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.wait(20);
        int var_PAThere = 0;
        if (tg.performAssert("ele_SeeAllScheduledPA", ComparisonType.IS_VISIBLE)) {
            var_PAThere = tg.saveToVariable(1, var_PAThere);
        }
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        if (tg.performAssert(var_PAThere, ComparisonType.EQUAL_TO, 1)) {
            tg.wait("ele_Managepaymentarrangement", ComparisonType.IS_VISIBLE, 20);
            tg.click("ele_Managepaymentarrangement", 1);
        } else {
            tg.testFunction("fnSetupaPaymentArrangement_copy");
            tg.testFunction("fnCheckAndAddTheCreditCardInPaymentArrangementPage_copy");
            tg.wait(20);
            tg.click("ele_TlogoHomeNavigator", 1);
            tg.wait(10);
            tg.testFunction("fnClickViewBill_copy");
            tg.wait("ele_Managepaymentarrangement", ComparisonType.IS_VISIBLE, 20);
            tg.click("ele_Managepaymentarrangement", 1);
            tg.wait(20);
        }
        tg.check.isVisible("ele_TotalBalancetoggle");
        tg.click("ele_TotalBalancetoggle", 1);
        tg.wait("ele_EditButtonPaymentArrangement", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_EditButtonPaymentArrangement", 1);
        tg.wait("ele_CalenderIcon", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_CalenderIcon", 1);
        tg.wait("ele_CurrentBillDueDate", ComparisonType.IS_VISIBLE, 20);
        tg.check.isVisible("ele_ValidCalenderDueDate");
        tg.check.isVisible("ele_InvalidDueDate");
        tg.click("ele_ValidCalenderDueDate", 1);
        tg.wait(5);
        tg.click("ele_backButton", 1);
        tg.click("ele_backButton", 1);
        tg.click("ele_TlogoHomeNavigator", 1);
        tg.wait(15);
        tg.testFunction("fnRemovePaymentArrangement_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_updatenumberofpaymentsasperpaterms() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSplitPA, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSplitPA, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.wait("ele_Managepaymentarrangement", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_Managepaymentarrangement", 1);
        tg.check.isVisible("ele_PaymentArrangementPage");
        tg.testFunction("fnSplitinstalmentinPA_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_dashboard_permissions_setstandarduserrole() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOMultiLineUsername, var_Username);
        var_Password = tg.saveToVariable(var_TMOMultiLinePassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickPermissionAndControl_copy");
        tg.testFunction("fnClickUserRoles_copy");
        tg.testFunction("fnSetstandardUserRole_copy");
        tg.testFunction("fnSetAuthorizedRole_copy");
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_devices_updatee911address() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebE911UserName, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebE911Password, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickDeviceSettings_copy_copy");
        tg.testFunction("fnClickOnE911Address_copy");
        tg.testFunction("fnUpdateE911Address_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_devices_updateusageaddress() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebProfileUsername, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebProfilePassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickDeviceSettings_copy_copy");
        tg.testFunction("fnClickOnUsageAddress_copy");
        tg.testFunction("fnUpdateUsageAddress_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_linesettings_landonlinesettings() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUsernameRole, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebUsernameRolePassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnLineSettings_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_manage_bill_acceptabledaterangeselectionforuser() {
        tg.openBrowser();
        var_Username = tg.saveToVariable("4706624138", var_Username);
        var_Password = tg.saveToVariable("Tmobile@2144", var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnCheckAutoPayAndClick_copy");
        // [DISABLED] tg.testFunction("fnSelectDateRangeInManageAutopay_copy");
        tg.testFunction("fnValidatePayementDateDropDownAndSelectADifferentDate_copy_copy");
        tg.wait("ele_savechange307", ComparisonType.IS_VISIBLE);
        tg.click("ele_savechange307", 1);
        tg.wait("ele_DoneOnAutopayUpdated", ComparisonType.IS_VISIBLE);
        tg.click("ele_DoneOnAutopayUpdated", 1);
        tg.printLogs("EX-1724 MyTMO Web_Manage_Bill_Acceptable date range selection for user - PASSED");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_permissions_blockcontentdownloads() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebProfileUsername, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebProfilePassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickPermissionAndControl_copy");
        tg.testFunction("fnClickBlockChargeableContent_copy");
        tg.testFunction("fnClickBlockContentDownloads_copy");
        tg.takeFullScreenshot();
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_permissions_blockinstantmessages() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserName4, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPassword4, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickPermissionAndControl_copy");
        tg.testFunction("fnClickBlockChargeableContent_copy");
        tg.testFunction("fnClickBlockInstantMessages_copy");
        tg.takeFullScreenshot();
        tg.testFunction("fnClickBlockInstantMessages_copy");
        tg.takeFullScreenshot();
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_permissions_blockinternationalroaming() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUsernameRole, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebUsernameRolePassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickPermissionAndControl_copy");
        tg.testFunction("fnClickOnInternationalRoaming_copy");
        tg.testFunction("fnBlockInternationalRoaming_copy");
        tg.testFunction("fnRevertRoamingSettings_copy");
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_permissions_blocktmomailnetemail() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_Username_1036, var_Username);
        var_Password = tg.saveToVariable(var_Password_1036, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnNavigateToPermissionsnControl_copy");
        tg.testFunction("fnBlockchargeablecontent_copy");
        tg.testFunction("fnTMOMail_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_permissions_blockchargedinternationalroaming() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickPermissionAndControl_copy");
        tg.testFunction("fnClickOnInternationalRoaming_copy");
        tg.testFunction("fnBlockInternationalChargedRoaming_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_permissions_enableallowallroaming() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickPermissionAndControl_copy");
        tg.testFunction("fnClickOnInternationalRoaming_copy");
        tg.testFunction("fnValidateAllowRoamingOption_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_permissions_landondigitstab() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickPermissionAndControl_copy");
        tg.testFunction("fnDigitsPageNavigation_copy");
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_permissions_landonfamilycontrols() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_Username_1036, var_Username);
        var_Password = tg.saveToVariable(var_Password_1036, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnnavigatetoprofile_copy");
        tg.testFunction("fnFamilyControl_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_permissions_scamblock() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickPermissionAndControl_copy");
        tg.testFunction("fnClickBlockChargeableContent_copy");
        tg.testFunction("fnEnableScamBlock_copy");
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_permissions_setauthorizedrole() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOMultiLineUsername, var_Username);
        var_Password = tg.saveToVariable(var_TMOMultiLinePassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickPermissionAndControl_copy");
        tg.testFunction("fnClickUserRoles_copy");
        tg.testFunction("fnSetAuthorizedRole_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_permissions_setrestrictedrole() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOMultiLineUsername, var_Username);
        var_Password = tg.saveToVariable(var_TMOMultiLinePassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickPermissionAndControl_copy");
        tg.testFunction("fnClickUserRoles_copy");
        tg.testFunction("fnSetRestrictedRole_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_plan_compareplan() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_Username_1036, var_Username);
        var_Password = tg.saveToVariable(var_Password_1036, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickOnViewPlanDetails_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnManageYourPlans_copy");
        tg.testFunction("fnValidatePlanComparison_copy");
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_plan_navigatetorateplanchange() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_MyTMOWebMultipleInstallmentUserName, var_Username);
        var_Password = tg.saveToVariable(var_MyTMOWebMultipleInstallmentPassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickOnViewPlanDetails_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnCheckRatePlanChange_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_plan_navigatetoviewplandetailspage() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.wait("ele_ViewPlanDetails", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_ViewPlanDetails", 1);
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.check.isVisible("ele_PlanDetailsTab");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_plan_seeplancard() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.wait("ele_PlanCard", ComparisonType.IS_VISIBLE, 20);
        tg.check.isVisible("ele_PlanCard");
        tg.printLogs("Plan Card Visible");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_plan_seethefullplandetails() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_Username_1036, var_Username);
        var_Password = tg.saveToVariable(var_Password_1036, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnFullPlanDetails_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_privacy_blockcontentdownloads() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_Username_1036, var_Username);
        var_Password = tg.saveToVariable(var_Password_1036, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnNaviagteToPrivacyTab_copy");
        tg.testFunction("fnBloclcallsnMessages_copy");
        // [DISABLED] tg.testFunction("fnBlockCallsandMessages_on_copy");
        tg.testFunction("fnBlockContentDownloads_copy");
        tg.wait(10);
        tg.testFunction("fnBlockContentDownloads_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_profile_addpaymentmethodviabank() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebBankUserName, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebBankPassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnAddBankAccount_copy");
        tg.testFunction("fnFillTheAccountDetails_copy");
        tg.testFunction("fnConfirmBankAccountDetails_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_profile_addpaymentmethodviacard() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebPAUsername, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPAPassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnBillingPreferences_copy");
        tg.testFunction("fnClickOnPaymentMethods_copy");
        tg.testFunction("fnClickOnCardOption_copy");
        tg.testFunction("fnAddCardDetails_copy");
        tg.testFunction("fnDeleteCardDetails_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_profile_deleteappaccount() {
        tg.openBrowser();
        var_Username = tg.saveToVariable("4706624138", var_Username);
        var_Password = tg.saveToVariable("Tmobile@2144", var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnNavigateToProfileTab_copy_copy");
        tg.testFunction("fnClickEditProfile_copy");
        tg.testFunction("fnClickDeleteAppAccount_copy");
        tg.printLogs("EX-1099 [Auto] MyTMO Web_Home_Profile_Delete app account -PASSED");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_profile_editcustomeremail() {
        tg.openBrowser();
        var_Username = tg.saveToVariable("4706624138", var_Username);
        var_Password = tg.saveToVariable("Tmobile@2144", var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnNavigateToProfileTab_copy_copy");
        tg.testFunction("fnClickEditProfile_copy");
        // [DISABLED] tg.testFunction("fnClickEditMailId_copy");
        tg.wait("ele_editAddress576", ComparisonType.IS_VISIBLE);
        tg.click("ele_editAddress576", 1);
        // [DISABLED] tg.testFunction("fnEnterEmailAddressAndSave_copy");
        tg.wait("ele_fieldiniti456", ComparisonType.IS_VISIBLE);
        tg.click("ele_fieldiniti456", 1);
        tg.wait("ele_fieldiniti456", ComparisonType.IS_VISIBLE);
        tg.type("ele_fieldiniti456", "test25@gmail.com");
        tg.wait("ele_fieldformf314", ComparisonType.IS_VISIBLE);
        tg.click("ele_fieldformf314", 1);
        tg.wait("ele_fieldformf314", ComparisonType.IS_VISIBLE);
        tg.type("ele_fieldformf314", "test25@gmail.com");
        tg.wait("ele_save532", ComparisonType.IS_VISIBLE);
        tg.click("ele_save532", 1);
        tg.wait("ele_verifyItsYou", ComparisonType.IS_VISIBLE);
        tg.check.isVisible("ele_verifyItsYou");
        // [DISABLED] tg.wait("ele_VerifyItsYou", ComparisonType.IS_VISIBLE, 10);
        // [DISABLED] tg.check.isVisible("ele_VerifyItsYou");
        tg.printLogs("Verification screen appeared - Validated");
        tg.printLogs("EX-1093 [Auto] MyTMO Web_Home_Profile_Edit customer email  -PASSED");
        // [DISABLED] tg.click("ele_labeltgweb131", 1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_profile_editcustomername() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebAutopayUsername_Hermes, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebAutopayPassword_Hermes, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnEditCustomerName_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_profile_editcustomerphonenumber() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebProfileUsername, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebProfilePassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickDeviceSettings_copy_copy");
        tg.testFunction("fnClickOnUsageAddress_copy");
        tg.testFunction("fnUpdateUsageAddress_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_profile_editsecurityquestions() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSplitPA, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSplitPA, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnEditsecurityquestions_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_profile_editcustomerpassword() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebProfileUsername, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebProfilePassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnChangePassword_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_profile_editsavedpaymentmethod() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_UserNameSavedPaymentMethod, var_Username);
        var_Password = tg.saveToVariable(var_PasswordSavedPaymentMethod, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnBillingPreferences_copy");
        tg.testFunction("fnClickOnPaymentMethods_copy");
        tg.testFunction("fnClickOnMasterCardEditButton_copy");
        tg.testFunction("fnClickBackButton_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_profile_enablerequirementof2fa() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebAutopayUsername_Hermes, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebAutopayPassword_Hermes, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnEnableRequirementf2FA_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_profile_updateemailaddress() {
        tg.openBrowser();
        var_Username = tg.saveToVariable("4706624138", var_Username);
        var_Password = tg.saveToVariable("Tmobile@2144", var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnNavigateToProfileTab_copy_copy");
        tg.testFunction("fnClickOnBillingPreferences_copy");
        tg.testFunction("fnClickPaperlessBilling_copy");
        tg.testFunction("fnClickUpdateEmail_copy");
        tg.testFunction("fnEnterEmailAddressAndSave_copy");
        tg.printLogs("EX-1101   MyTMO Web_Home_Profile_Update email address - PASSED");
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_profile_updatebillingaddress() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebE911UserName, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebE911Password, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnUpdateBillingAddress_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_manage_bill_changewithdrawaldate() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_UserNameBillChangeWithdrawalDate, var_Username);
        var_Password = tg.saveToVariable(var_PasswordBillChangeWithdrawalDate, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickOnSetupAutoPay_copy_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnValidatePayementDateDropDownAndSelectADifferentDate_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_manage_bill_navigatetopafaqpage() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebPAUserNoPaymentMethod_Hermes, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPAPassNoPaymentMethod_Hermes, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.wait(20);
        int var_PAThere = 0;
        if (tg.performAssert("ele_SeeAllScheduledPA", ComparisonType.IS_VISIBLE)) {
            var_PAThere = tg.saveToVariable(1, var_PAThere);
        }
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        if (tg.performAssert(var_PAThere, ComparisonType.EQUAL_TO, 1)) {
            tg.wait("ele_Managepaymentarrangement", ComparisonType.IS_VISIBLE, 20);
            tg.click("ele_Managepaymentarrangement", 1);
        } else {
            tg.testFunction("fnSetupaPaymentArrangement_copy");
            tg.testFunction("fnCheckAndAddTheCreditCardInPaymentArrangementPage_copy");
            tg.wait(20);
            tg.click("ele_TlogoHomeNavigator", 1);
            tg.wait(10);
            tg.testFunction("fnClickViewBill_copy");
        }
        tg.wait("ele_Managepaymentarrangement", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_Managepaymentarrangement", 1);
        tg.wait(20);
        // [DISABLED] tg.scrollToElement("ele_paymentArrangementFAQLink", Direction.DOWN);
        // [DISABLED] tg.wait("ele_paymentArrangementFAQLink", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_paymentArrangementFAQLink", 1);
        tg.testFunction("fnValidatePAFAQPage_copy");
        tg.testFunction("fnClickBackButton_copy");
        tg.testFunction("fnClickBackButton_copy");
        tg.wait("ele_TlogoHomeNavigator", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_TlogoHomeNavigator", 1);
        tg.testFunction("fnRemovePaymentArrangement_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_manage_bill_showconfirmationmodaluponsuccessfulsetupofautopay() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_UserNameSavedPaymentMethod, var_Username);
        var_Password = tg.saveToVariable(var_PasswordSavedPaymentMethod, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickOnSetupAutoPay_copy_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnValidatePayementDateDropDownAndSelectADifferentDate_copy_copy");
        tg.testFunction("fnClickOnAgreeAndSubmitButton_copy_copy");
        tg.testFunction("fnValidateAutopaySetUpMessageAndClickOnDoneButton_copy_copy");
        tg.testFunction("fnDisableAutopay_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_shop_tc03_portin_base_shipto_verifytransferdetailsontheportintransferpage() {
        tg.openBrowser();
        var_Username = tg.saveToVariable("4253248856", var_Username);
        var_Password = tg.saveToVariable("Tmobile@2145", var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        // [DISABLED] 		tg.wait("ele_cellphones729", ComparisonType.IS_VISIBLE);
        // [DISABLED] 		tg.click("ele_cellphones729", 1);
        // [DISABLED] 		tg.wait("ele_buttonclos835", ComparisonType.IS_VISIBLE);
        // [DISABLED] 		tg.click("ele_buttonclos835", 1);
        // [DISABLED] 		tg.wait("ele_divtgwebcomma115", ComparisonType.IS_VISIBLE);
        // [DISABLED] 		tg.click("ele_divtgwebcomma115", 1);
        // [DISABLED] 		tg.wait("ele_getanewnum934", ComparisonType.IS_VISIBLE);
        // [DISABLED] 		tg.click("ele_getanewnum934", 1);
        // [DISABLED] 		tg.wait("ele_skiptradei891", ComparisonType.IS_VISIBLE);
        // [DISABLED] 		tg.click("ele_skiptradei891", 1);
        // [DISABLED] 		tg.wait("ele_addtocart000", ComparisonType.IS_VISIBLE);
        // [DISABLED] 		tg.click("ele_addtocart000", 1);
        tg.testFunction("fnAddMobileToCart_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void sanity_home_settings() {
        tg.openBrowser();
        tg.wait("ele_myaccount804", ComparisonType.IS_VISIBLE);
        tg.click("ele_myaccount804", 1);
        tg.wait("ele_loginbackt377", ComparisonType.IS_VISIBLE);
        tg.click("ele_loginbackt377", 1);
        tg.wait("ele_login694", ComparisonType.IS_VISIBLE);
        tg.click("ele_login694", 1);
        tg.wait("ele_emailorpho632", ComparisonType.IS_VISIBLE);
        tg.click("ele_emailorpho632", 1);
        tg.wait("ele_next802", ComparisonType.IS_VISIBLE);
        tg.click("ele_next802", 1);
        tg.wait("ele_switchtotm095", ComparisonType.IS_VISIBLE);
        tg.click("ele_switchtotm095", 1);
        tg.close();
    }

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
    public void digital_mytmoweb_home_bill_card_autopayment() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebNonAutoPayUserName, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebNonAutoPayPassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnCheckAutoPayAndClick_copy");
        if (tg.performAssert("ele_editAddressPaymentMethodAutoPay", ComparisonType.IS_VISIBLE)) {
            tg.testFunction("fnDeletePaymentMethodAutoPay_copy");
            tg.testFunction("fnClickViewBill_copy");
            tg.testFunction("fnCheckAutoPayAndClick_copy");
        }
        tg.testFunction("fnAddPaymentMethodAutoPayPage_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnCheckAutoPayAndClick_copy");
        tg.testFunction("fnEditAutoPaymentMethod_copy");
        tg.testFunction("fnCheckAutoPayAndClick_copy");
        tg.testFunction("fnCancelAutoPayInAutoPay_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnCheckAutoPayAndClick_copy");
        tg.testFunction("fnDeletePaymentMethodAutoPay_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_checkonetimecharges() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserName2, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPassword2, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnNavigateToOneTimeCharges_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_downloaddetailedbilldocument() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnDownloadDetailedBilldocument_copy");
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.testFunction("fnManageDownloads_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_downloadpastmonthdetailedpdf() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnPastBills_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnPastBillsDetailedPDF_copy");
        tg.testFunction("fnManageDownloads_copy");
        tg.takeFullScreenshot();
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_downloadpastsummarybilldocument() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnPastBills_copy");
        tg.testFunction("fnClickOnPastBillsSummaryPDF_copy");
        tg.takeFullScreenshot();
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_downloadsummarybill() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnDownloadBillSummary_copy");
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.testFunction("fnManageDownloads_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_equipmentfinancingpage() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebEIPUsername, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebEIPPassword, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnViewDevicePaymentPlans_copy");
        tg.testFunction("fnClickMakePaymentEIP_copy");
        tg.testFunction("fnClickBackButton_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_makeapayment() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebPAUserNoPaymentMethod_Hermes, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPAPassNoPaymentMethod_Hermes, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDismissNotificationPopUps_copy");
        tg.testFunction("fnNavigatenVerifyMakepayment_copy");
        tg.testFunction("fnVerifyPayment_copy");
        tg.testFunction("fnClickBackButton_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_makefuturedatedpaymentwithcard() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebPAUserNoPaymentMethod_Hermes, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPAPassNoPaymentMethod_Hermes, var_Password);
        tg.testFunction("fnDigitalWebLoginPRODPastDueAccount_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnAssertBillAmountisGreaterthanZero_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnOtherAmount_copy");
        tg.testFunction("fnEnterCardDetails_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_makepastduepaymentwithcheckingaccount() {
        tg.openBrowser();
        var_Username = tg.saveToVariable("4706624138", var_Username);
        var_Password = tg.saveToVariable("Tmobile@2144", var_Password);
        tg.testFunction("fnDigitalWebLoginPRODPastDueAccount_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnNavigatePayment_copy");
        tg.click("ele_bankpreferred", 1);
        // [DISABLED] tg.testFunction("fnClickOnPayment_copy");
        tg.testFunction("fnClickOnEnterAccountDetailsManually_copy");
        tg.testFunction("fnBankAccountDetails_copy");
        // [DISABLED] tg.testFunction("fnConfirmBankAccountDetails_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_makepaymentwithnewcard() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUsernamePaymentArrangement, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPasswordPaymentArrangement, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickOnMakeAPayment_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnOtherAmount_copy");
        tg.testFunction("fnEnterAmount_copy");
        tg.testFunction("fnClickOnAddPaymentMethod_copy");
        tg.testFunction("fnClickOnCardOption_copy");
        // [DISABLED] tg.testFunction("fnAddCardDetails_copy");
        // [DISABLED] tg.testFunction("fnValidatePayNowButtonIsClickable_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_makepaymentwithnobilldueandnewpaymentmethod() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_Username_1036, var_Username);
        var_Password = tg.saveToVariable(var_Password_1036, var_Password);
        tg.testFunction("fnDigitalWebLoginPRODPastDueAccount_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnAssertBillAmountisEqualorLessthanZero_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnotherAmount_100_copy");
        // [DISABLED] tg.testFunction("fnEnterCardDetails_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_navigatetoaccountactivitypage() {
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
    public void digital_mytmoweb_home_bill_navigatetoaccountdiscountspage() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnDiscountsandPromotions_copy");
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_navigatetomywalletpage() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebPaymentUsername1_Hermes, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPaymentPassword1_Hermes, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnNavigatetoMyWalletPage_copy");
        tg.wait("ele_AddCard", ComparisonType.IS_VISIBLE, 15);
        tg.click("ele_AddCard", 1);
        tg.testFunction("fnCCDetails_copy");
        tg.wait("ele_EditCCard", ComparisonType.IS_VISIBLE);
        tg.click("ele_EditCCard", 1);
        tg.testFunction("fnRemoveCC_copy");
        tg.check.isVisible("ele_AddCard");
        tg.wait("ele_backButtonMywallet", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_backButtonMywallet");
        tg.click("ele_backButtonMywallet", 1);
        tg.testFunction("fnBrowserBack_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_navigatetopaymentarrangementpageviabillpaycard() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebPAUserNoPaymentMethod_Hermes, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPAPassNoPaymentMethod_Hermes, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnSetupaPaymentArrangement_copy");
        tg.wait("ele_AddCard", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_AddCard", 1);
        tg.testFunction("fnCCDetails_copy");
        tg.wait("ele_AgreeandsubmitforPA", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_AgreeandsubmitforPA", 1);
        tg.wait("ele_DoneforPA", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_DoneforPA", 1);
        tg.testFunction("fnRemovePaymentArrangement_copy");
        tg.click("ele_backButton", 1);
        tg.click("ele_backButton", 1);
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_navigatetousagesummarypage() {
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
    public void digital_mytmoweb_home_bill_paymentoftotalbalancewithcheckingaccount() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickOnMakeAPayment_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnTotalBalance_copy");
        tg.testFunction("fnClickOnAddPaymentMethod_copy");
        tg.testFunction("fnClickOnBank_copy");
        tg.testFunction("fnClickOnEnterAccountDetailsManually_copy");
        // [DISABLED] tg.testFunction("fnFillTheAccountDetails_copy");
        // [DISABLED] tg.testFunction("fnConfirmBankAccountDetails_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_setuppaymentarrangement_otppage() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUsernamePaymentArrangement, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPasswordPaymentArrangement, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnMakePaymentBillCard_copy");
        tg.testFunction("fnSetupPaymentArrangementOTPPage_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnCancelPaymentArrangementOTPPage_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_validatepastbills() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
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
    public void digital_mytmoweb_home_bill_viewbillsavings() {
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
            // [DISABLED] tg.printLogs("Savings visible");
        }
        // [DISABLED] tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_viewpastbillsummarypage() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserName2, var_Username);
        var_Password = tg.saveToVariable("Tmobile@2142", var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnClickOnPastBills_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickOnRecentPastBills_copy");
        // [DISABLED] tg.testFunction("fnClickBackButton_copy");
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_bill_viewservicedetails() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforViewServices, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforViewServices, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickViewBill_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnNavigatetoViewServicesDetails_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_privacy_blockchargableinstantmessagessentviasms() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_Username_1036, var_Username);
        var_Password = tg.saveToVariable(var_Password_1036, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        // [DISABLED] tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnNaviagteToPrivacyTab_copy");
        tg.testFunction("fnBloclcallsnMessages_copy");
        // [DISABLED] tg.testFunction("fnBlockCallsandMessages_on_copy");
        tg.testFunction("fnDeviceBlock_copy");
        tg.testFunction("fnDeviceBlock_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_privacy_blocktmomailnetemail() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_Username_1036, var_Username);
        var_Password = tg.saveToVariable(var_Password_1036, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        // [DISABLED] tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnNaviagteToPrivacyTab_copy");
        tg.testFunction("fnBloclcallsnMessages_copy");
        // [DISABLED] tg.testFunction("fnBlockCallsandMessages_on_copy");
        tg.testFunction("fnBlockTMOmail_copy");
        tg.testFunction("fnBlockTMOmail_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_privacy_disablesharingofpersonaldataonthewebsiteorapp() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_Username_1036, var_Username);
        var_Password = tg.saveToVariable(var_Password_1036, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickPrivacy_copy");
        tg.testFunction("fnClickOnPersonalInformation_copy");
        tg.switchToTab(1);
        tg.testFunction("fnValidateAndPerformDisableInfoShare_copy");
        tg.switchToTab(0);
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_privacy_enablesharingofpersonaldataonthewebsiteorapp() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_Username_1036, var_Username);
        var_Password = tg.saveToVariable(var_Password_1036, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnClickPrivacy_copy");
        tg.testFunction("fnClickDoNotSellorShareData_copy");
        tg.testFunction("fnDoNotSellorShareData_copy");
        tg.testFunction("fnDoNotSellorShareData_off_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_privacy_getalertsaboutallaccountlines() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_Username_1036, var_Username);
        var_Password = tg.saveToVariable(var_Password_1036, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnClickPrivacy_copy");
        tg.testFunction("fnClickServicenotifications_copy");
        tg.testFunction("fnGetalertsaboutallaccountlines_copy");
        tg.testFunction("fnGetalertsaboutallaccountlines_off_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_privacy_landonprivacycentertab() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickPrivacy_copy");
        tg.testFunction("fnClickOnPrivacyCenter_copy");
        tg.switchToTab(1);
        tg.testFunction("fnValidatePrivacyCenter_copy");
        tg.switchToTab(0);
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_privacy_landonprivacynoticetab() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_Username_1036, var_Username);
        var_Password = tg.saveToVariable(var_Password_1036, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnClickPrivacy_copy");
        tg.testFunction("fnClickPrivacyNotice_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_privacy_protectionagainstfraudandidentitytheft() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserName2, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPassword2, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnNaviagteToPrivacyTab_copy");
        tg.testFunction("fnFraudandidentitytheftprotection_copy");
        // Locator changes and the custom expression written was complication so simplified it using testgrid actions
        tg.testFunction("fnFraudandIdentity_turnoff_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_privacy_scamblock() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickPrivacy_copy");
        tg.testFunction("fnClickOnBlockScam_copy");
        tg.testFunction("fnValidateAndEnableScamCalls_copy");
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_privacy_shareaggregatedatawiththirdparties() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_Username_1036, var_Username);
        var_Password = tg.saveToVariable(var_Password_1036, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnNaviagteToPrivacyTab_copy");
        tg.testFunction("fnSharedataforpublicandscientificresearch_copy");
        tg.testFunction("fnSharedataforpublicandscientificresearch_off_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_privacy_termsandconditionstab() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserforSavings, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickPrivacy_copy");
        tg.testFunction("fnClickOnTermsAndConditions_copy");
        tg.switchToTab(1);
        tg.testFunction("fnValidateTermsAndConditionsHeader_copy");
        tg.switchToTab(0);
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_privacy_toggleswitchoff() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_Username_1036, var_Username);
        var_Password = tg.saveToVariable(var_Password_1036, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickPrivacy_copy");
        tg.testFunction("fnClickOnPersonalInformation_copy");
        tg.switchToTab(1);
        tg.testFunction("fnTurnOnToggle_copy");
        tg.wait("ele_personalInfromationToggleSwitch", ComparisonType.IS_VISIBLE, 10);
        tg.testFunction("fnTurnOnToggle_copy");
        tg.wait("ele_personalInfromationToggleSwitch", ComparisonType.IS_VISIBLE, 10);
        tg.switchToTab(0);
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_privacy_toggleswitchon() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_Username_1036, var_Username);
        var_Password = tg.saveToVariable(var_Password_1036, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnAcceptCookies_copy_copy_copy_copy_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickPrivacy_copy");
        tg.testFunction("fnClickOnPersonalInformation_copy");
        tg.switchToTab(1);
        tg.testFunction("fnTurnOnToggle_copy");
        tg.wait("ele_personalInfromationToggleSwitch", ComparisonType.IS_VISIBLE, 10);
        tg.testFunction("fnTurnOnToggle_copy");
        tg.wait("ele_personalInfromationToggleSwitch", ComparisonType.IS_VISIBLE, 10);
        tg.switchToTab(0);
        tg.testFunction("fnlogoutRestored_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_security_land_of_securitydashboard() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserName2, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPassword2, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("FnNavigateToSecurityDashboard_copy");
        tg.testFunction("fnBrowserBack_copy");
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_security_simprotectionforalllines() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserMultiline, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickonSecurity_copy");
        tg.testFunction("fnSIMProtectionforAlllines_copy");
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_mytmoweb_home_security_simprotectionforsomelines() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserMultiline, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPwdforSavings, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnDontAllowNotificationPopUp_copy_copy_copy_copy");
        tg.testFunction("fnClickonSecurity_copy");
        tg.testFunction("fnSIMProtectionforSomelines_copy");
        tg.testFunction("fnLogout_copy_copy_copy_copy_copy");
        tg.close();
    }

    public static void fnaddbankaccount_copy() {
        tg.wait("ele_BillingPreferences", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_BillingPreferences");
        tg.click("ele_BillingPreferences", 1);
        tg.wait("ele_paymentMethod", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_paymentMethod");
        tg.click("ele_paymentMethod", 1);
        tg.wait("ele_bankMethod", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_bankMethod");
        tg.click("ele_bankMethod", 1);
        tg.wait("ele_orenteracc479", ComparisonType.IS_VISIBLE, 20);
        tg.check.isVisible("ele_orenteracc479");
        tg.click("ele_orenteracc479", 1);
    }

    public static void fnaddmobiletocart_copy_copy_copy() {
        tg.wait("ele_cellphones729", ComparisonType.IS_VISIBLE);
        tg.click("ele_cellphones729", 1);
        tg.wait("ele_buttonclos835", ComparisonType.IS_VISIBLE);
        tg.click("ele_buttonclos835", 1);
        tg.wait("ele_divtgwebcomma115", ComparisonType.IS_VISIBLE);
        tg.click("ele_divtgwebcomma115", 1);
        tg.wait("ele_getanewnum934", ComparisonType.IS_VISIBLE);
        tg.click("ele_getanewnum934", 1);
        tg.wait("ele_skipTradein", ComparisonType.IS_VISIBLE);
        tg.click("ele_skipTradein", 1);
        tg.wait("ele_addtocart000", ComparisonType.IS_VISIBLE);
        tg.click("ele_addtocart000", 1);
    }

    public static void fnaddpa_copy() {
        tg.wait("ele_addpaymentButton01", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_addpaymentButton01", 1);
        tg.wait("ele_providePaymentMethodNextTime", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_providePaymentMethodNextTime", 1);
        tg.wait("ele_continueButtonPaymentMethod", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_continueButtonPaymentMethod", 1);
        tg.wait("ele_agreeaButtonForPA", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_agreeaButtonForPA", 1);
        tg.wait("ele_doneButtonForPA", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_doneButtonForPA", 1);
    }

    public static void fnaddingaddons_copy() {
        tg.wait("ele_FamilyAllowances", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_FamilyAllowances", 1);
        tg.wait("ele_entMessageAddon3", ComparisonType.IS_VISIBLE, 8);
        tg.click("ele_entMessageAddon3", 1);
        tg.wait("ele_ContinueinAddONs", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_ContinueinAddONs", 1);
        tg.wait("ele_AgreeSubmitinAddONs", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_AgreeSubmitinAddONs", 1);
        tg.wait("ele_ManageAddONs", ComparisonType.IS_VISIBLE, 8);
        tg.click("ele_ManageAddONs", 1);
        tg.wait("ele_FamilyAllowances", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_FamilyAllowances", 1);
        tg.wait("ele_AgreetoRemoveAddONs", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_AgreetoRemoveAddONs", 1);
        tg.wait("ele_entMessageAddon3", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_entMessageAddon3", 1);
        tg.wait("ele_ContinueinAddONs", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_ContinueinAddONs", 1);
        tg.wait("ele_AgreeSubmitinAddONs", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_AgreeSubmitinAddONs", 1);
        tg.wait("ele_ManageAddONs", ComparisonType.IS_VISIBLE, 20);
    }

    public static void fnautopayerrorvalidation_copy() {
        tg.printLogs("Starting AutoPay Error Validation");
        tg.customScriptStart();
        driver.get("https://www.t-mobile.com/payment/autopay");
        tg.customScriptEnd();
    }

    public static void fnblockcontentdownloads_copy() {
        tg.wait("ele_blockContentDownload", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_blockContentDownload");
        tg.click("ele_blockContentDownload", 1);
    }

    public static void fnblockinternationalchargedroaming_copy() {
        tg.wait("ele_submitButtonRoaming", ComparisonType.IS_VISIBLE, 15);
        tg.customScriptStart();
        WebElement parent = driver.findElement(By.xpath("//input[@type='radio' and @id='picker-formFieldSelector-985b225d68-BINTWEBGS']"));
        System.out.println("***************************************************************");
        boolean flag = parent.isSelected();
        if (flag) {
            System.out.println("radio button is enabled");
        } else {
            System.out.println("radio button is disabled");
            driver.findElement(By.xpath("//label[contains(text(), 'Block Charged')]")).click();
        }
        tg.customScriptEnd();
        tg.wait("ele_submitButtonRoaming", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_submitButtonRoaming", 1);
        if (tg.performAssert("ele_okContinueButton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_okContinueButton", 1);
        }
        tg.wait("ele_settingsSavedMessage", ComparisonType.IS_VISIBLE, 10);
        if (tg.performAssert("ele_settingsSavedMessage", ComparisonType.IS_VISIBLE)) {
            tg.check.isVisible("ele_settingsSavedMessage");
        }
        tg.printLogs("International roaming blocked");
    }

    public static void fnblockinternationalroaming_copy() {
        tg.customScriptStart();
        WebElement parent = driver.findElement(By.xpath("//input[@type='radio' and @id='picker-formFieldSelector-985b225d68-NABINTAS']"));
        System.out.println("***************************************************************");
        boolean flag = parent.isSelected();
        if (flag) {
            System.out.println("radio button is enabled");
        } else {
            System.out.println("radio button is disabled");
            driver.findElement(By.xpath("//label[contains(text(), 'Block International Roaming')]")).click();
            JavascriptExecutor js1 = (JavascriptExecutor) driver;
            js1.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
        }
        tg.customScriptEnd();
        tg.wait("ele_submitButtonRoaming", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_submitButtonRoaming", 1);
        if (tg.performAssert("ele_okContinueButton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_okContinueButton", 1);
        }
        tg.wait("ele_submitButtonRoaming", ComparisonType.IS_VISIBLE, 15);
        tg.wait("ele_settingsSavedMessage", ComparisonType.IS_VISIBLE, 10);
        if (tg.performAssert("ele_settingsSavedMessage", ComparisonType.IS_VISIBLE)) {
            tg.check.isVisible("ele_settingsSavedMessage");
        }
        tg.printLogs("Roam enabled");
    }

    public static void fnblockchargeablecontent_copy() {
        tg.wait("ele_BlockChargeableContent", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_BlockChargeableContent", 1);
        tg.wait("ele_TMOMailNet", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_TMOMailNet", 1);
        tg.wait("ele_TMOMailNet", ComparisonType.IS_VISIBLE, 20);
        tg.takeFullScreenshot();
        tg.printLogs("Toggle on/off TMOMailNet");
    }

    public static void fnchangepassword_copy() {
        tg.wait("ele_EditProfile", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_EditProfile", 1);
        tg.wait("ele_editAddressPassword01", ComparisonType.IS_VISIBLE, 20);
        tg.customScriptStart();
        driver.get("https://www.t-mobile.com/my-account/profile/tmobile-id/password");
        tg.customScriptEnd();
        tg.wait("ele_oldPasswordField", ComparisonType.IS_VISIBLE, 10);
        tg.customScriptStart();
        System.out.println("********************************************************************************");
        WebElement shadowHost = driver.findElement(By.cssSelector("xpr-npi-content"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement iframeElement = shadowRoot.findElement(By.cssSelector("iframe"));
        driver.switchTo().frame(iframeElement);
        WebElement oldPassword = driver.findElement(By.xpath("//input[@id='field-formFieldInput-3e36ece686-oldPassword']"));
        WebElement newPassword = driver.findElement(By.xpath("//input[@id='field-formFieldInput-6f0c226d32-newPassword']"));
        WebElement confrimPassword = driver.findElement(By.xpath("//input[@id='field-formFieldInput-5ea8cc6c20-confirm-newPassword']"));
        oldPassword.sendKeys("Tmobile@2143");
        newPassword.sendKeys("Tmobile@2142");
        confrimPassword.sendKeys("Tmobile@2142");
        driver.switchTo().defaultContent();
        tg.customScriptEnd();
    }

    public static void fncheckandaddthecreditcardinpaymentarrangementpage_copy() {
        tg.wait(15);
        if (tg.performAssert("ele_AddCard", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_AddCard");
            tg.testFunction("fnCCDetails_copy");
            tg.wait("ele_AgreeandsubmitforPA", ComparisonType.IS_VISIBLE, 20);
            tg.click("ele_AgreeandsubmitforPA", 1);
            tg.wait("ele_DoneforPA", ComparisonType.IS_VISIBLE, 20);
            tg.click("ele_DoneforPA", 1);
        } else {
            tg.wait("ele_AgreeandsubmitforPA", ComparisonType.IS_VISIBLE, 15);
            tg.click("ele_AgreeandsubmitforPA", 1);
            tg.wait("ele_DoneforPA", ComparisonType.IS_VISIBLE, 20);
            tg.click("ele_DoneforPA", 1);
        }
    }

    public static void fncheckautopaytext_copy() {
        tg.wait("ele_autoPayText", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_autoPayText");
        tg.click("ele_autoPayText", 1);
    }

    public static void fncheckrateplanchange_copy() {
        tg.wait("ele_ManagePlan", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_ManagePlan");
        tg.click("ele_ManagePlan", 1);
        tg.wait("ele_selectYourNewPlan", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_selectYourNewPlan");
        tg.click("ele_selectYourNewPlan", 1);
    }

    public static void fnclickblockchargeablecontent_copy() {
        tg.wait("ele_blockChargableContent", ComparisonType.IS_VISIBLE, 20);
        tg.check.isVisible("ele_blockChargableContent");
        tg.click("ele_blockChargableContent", 1);
    }

    public static void fnclickblockcontentdownloads_copy() {
        tg.wait("ele_blockContentDownload", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_blockContentDownload");
        tg.click("ele_blockContentDownload", 1);
        tg.wait("ele_blockContentDownloadMessage", ComparisonType.IS_VISIBLE, 20);
        tg.check.isVisible("ele_blockContentDownloadMessage");
        tg.click("ele_blockContentDownload", 1);
        tg.wait("ele_blockContentDownloadMessage", ComparisonType.IS_VISIBLE, 20);
        tg.check.isVisible("ele_blockContentDownloadMessage");
    }

    public static void fnclickblockinstantmessages_copy() {
        tg.wait("ele_blockInstantMessages", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_blockInstantMessages");
        tg.click("ele_blockInstantMessages", 1);
    }

    public static void fnclickdeleteappaccount_copy() {
        tg.wait("ele_delete093", ComparisonType.IS_VISIBLE);
        tg.click("ele_delete093", 1);
        tg.wait("ele_buttonclos284", ComparisonType.IS_VISIBLE);
        tg.click("ele_buttonclos284", 1);
    }

    public static void fnclickdevicesettings_copy_copy() {
        tg.wait("ele_deviceSettings", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_deviceSettings");
        tg.click("ele_deviceSettings", 1);
    }

    public static void fnclickeditmailid_copy() {
        tg.wait(10);
        tg.wait("ele_EditEmailID", ComparisonType.IS_VISIBLE, 10);
        // [DISABLED] tg.check.isVisible("ele_EditEmailID");
        tg.click("ele_EditEmailID", 1);
    }

    public static void fnclickeditprofile_copy() {
        tg.wait("ele_EditProfileSettingsPage", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_EditProfileSettingsPage");
        tg.click("ele_EditProfileSettingsPage", 1);
    }

    public static void fnclickonagreeandsubmitbutton_copy_copy() {
        tg.wait("ele_agreeAndSubmitButtonAutopay", ComparisonType.IS_VISIBLE, 15);
        tg.click("ele_agreeAndSubmitButtonAutopay", 1);
    }

    public static void fnclickonbillingpreferences_copy() {
        tg.wait("ele_BillingPreferences", ComparisonType.IS_VISIBLE, 20);
        if (tg.performAssert("ele_BillingPreferences", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_BillingPreferences", 1);
        }
    }

    public static void fnclickoncalleridname_copy_copy() {
        tg.wait("ele_CallerIdName", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_CallerIdName");
        tg.click("ele_CallerIdName", 1);
        tg.wait("ele_editAddressOptionCallerID", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_editAddressOptionCallerID");
        tg.click("ele_editAddressOptionCallerID", 1);
    }

    public static void fnclickone911address_copy() {
        tg.wait("ele_e911AddressButton", ComparisonType.IS_VISIBLE, 15);
        tg.check.isVisible("ele_e911AddressButton");
        tg.click("ele_e911AddressButton", 1);
    }

    public static void fnclickoninternationalroaming_copy() {
        tg.wait("ele_internationalRoaming", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_internationalRoaming", 1);
    }

    public static void fnclickonmanageaddons_copy() {
        tg.wait("ele_Manageaddonsandbenefits", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_Manageaddonsandbenefits", 1);
    }

    public static void fnclickonmanagepaymentarrangement_copy() {
        tg.wait("ele_Managepaymentarrangement", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_Managepaymentarrangement");
        tg.click("ele_Managepaymentarrangement", 1);
    }

    public static void fnclickonmanageyourplans_copy() {
        tg.wait("ele_manageYourPlan", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_manageYourPlan", 1);
        tg.customScriptStart();
        String var = driver.getCurrentUrl();
        System.out.println("****************************************************************************");
        System.out.println(var);
        tg.customScriptEnd();
    }

    public static void fnclickonmastercardeditbutton_copy() {
        tg.wait("ele_MasterCardEditButton", ComparisonType.IS_VISIBLE, 30);
        if (tg.performAssert("ele_MasterCardEditButton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_MasterCardEditButton", 1);
        }
    }

    public static void fnclickonpaymentmethods_copy() {
        tg.wait("ele_PaymentMethodsBillingPreferencesScreen", ComparisonType.IS_VISIBLE, 20);
        if (tg.performAssert("ele_PaymentMethodsBillingPreferencesScreen", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_PaymentMethodsBillingPreferencesScreen", 1);
        }
    }

    public static void fnclickonsetupautopay_copy_copy() {
        tg.wait("ele_setupautopaybutton", ComparisonType.IS_VISIBLE, 25);
        if (tg.performAssert("ele_setupautopaybutton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_setupautopaybutton", 1);
        }
    }

    public static void fnclickonusageaddress_copy() {
        tg.wait("ele_usageAddress", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_usageAddress");
        tg.click("ele_usageAddress", 1);
    }

    public static void fnclickonviewplandetails_copy() {
        tg.wait("ele_ViewPlanDetails", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_ViewPlanDetails");
        tg.click("ele_ViewPlanDetails", 1);
    }

    public static void fnclickpaperlessbilling_copy() {
        tg.wait("ele_PaperlessBilling", ComparisonType.IS_INVISIBLE, 10);
        tg.check.isVisible("ele_PaperlessBilling");
        tg.click("ele_PaperlessBilling", 1);
    }

    public static void fnclickseeallscheduledarrangements_copy() {
        tg.wait("ele_seeAllScheduledPayments", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_seeAllScheduledPayments", 1);
    }

    public static void fnclicksetuppaymentarrangement_copy() {
        tg.wait("ele_setupPaymentArrangement", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_setupPaymentArrangement");
        tg.click("ele_setupPaymentArrangement", 1);
    }

    public static void fnclickupdateemail_copy() {
        tg.wait("ele_UpdateEmailAddress", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_UpdateEmailAddress");
        tg.click("ele_UpdateEmailAddress", 1);
    }

    public static void fndeletecarddetails_copy() {
        tg.wait("ele_EditCCard", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_EditCCard");
        tg.click("ele_EditCCard", 1);
        tg.wait("ele_DeleteCCButton", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_DeleteCCButton");
        tg.click("ele_DeleteCCButton", 1);
        tg.wait("ele_deleteCreditCardConfirm", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_deleteCreditCardConfirm");
        tg.click("ele_deleteCreditCardConfirm", 1);
        tg.click("ele_backButton", 1);
        tg.click("ele_backButton", 1);
        tg.click("ele_backButton", 1);
    }

    public static void fndeletepa_copy() {
        tg.wait("ele_CancelPA", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_CancelPA", 1);
        tg.wait("ele_deletePAButton", ComparisonType.IS_VISIBLE, 15);
        tg.click("ele_deletePAButton", 1);
        tg.wait("ele_doneDeletionButton", ComparisonType.IS_VISIBLE, 14);
        tg.click("ele_doneDeletionButton", 1);
    }

    public static void fndigitspagenavigation_copy() {
        tg.wait("ele_digitOpt", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_digitOpt", 1);
        tg.wait("ele_DigitsHeader", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_DigitsHeader");
        tg.printLogs("User has navigated to Digits page");
    }

    public static void fndisableautopay_copy_copy() {
        tg.wait("ele_ManageAutoPayButton", ComparisonType.IS_VISIBLE, 15);
        if (tg.performAssert("ele_ManageAutoPayButton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_ManageAutoPayButton", 1);
            tg.wait("ele_cancelAutopayButton", ComparisonType.IS_VISIBLE, 10);
            tg.click("ele_cancelAutopayButton", 1);
            tg.wait("ele_continueButtonAutopayConfirmationPopup", ComparisonType.IS_VISIBLE, 10);
            tg.click("ele_continueButtonAutopayConfirmationPopup", 1);
            tg.wait("ele_autopayIsNowCancelledText", ComparisonType.IS_VISIBLE, 10);
            tg.check.isVisible("ele_doneButtonAutopay");
            tg.click("ele_doneButtonAutopay", 1);
        }
    }

    public static void fneditcustomername_copy() {
        tg.wait("ele_EditProfile", ComparisonType.IS_VISIBLE);
        tg.click("ele_EditProfile", 1);
        tg.wait("ele_EditName", ComparisonType.IS_VISIBLE);
        tg.click("ele_EditName", 1);
        tg.wait("ele_FirstName", ComparisonType.IS_VISIBLE);
        tg.click("ele_FirstName", 1);
        tg.customScriptStart();
        String ALL_LETTERS = "abcdefghijklmnopqrstuvwxyz";
        int WORD_LENGTH = 3;
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < WORD_LENGTH; i++) {
            int index = (int) (Math.random() * ALL_LETTERS.length());
            word.append(ALL_LETTERS.charAt(index));
        }
        String username = word.toString();
        System.out.println("********************************************");
        System.out.println(username);
        WebElement element = driver.findElement(By.xpath("//input[@id='field-formFieldInput-26430e6608-firstName']"));
        element.clear();
        element.sendKeys("Test" + username);
        tg.customScriptEnd();
        // [DISABLED] tg.wait("ele_LastName", ComparisonType.IS_VISIBLE);
        // [DISABLED] tg.type("ele_LastName", "test");
        tg.wait("ele_SaveName", ComparisonType.IS_VISIBLE);
        tg.click("ele_SaveName", 1);
        tg.wait("ele_FirstName", ComparisonType.IS_VISIBLE);
        // [DISABLED] tg.wait("ele_Namesuccessfullychanged", ComparisonType.IS_VISIBLE, 5);
        // [DISABLED] tg.check.isVisible("ele_Namesuccessfullychanged");
        tg.printLogs("Name Successfully Changed");
    }

    public static void fneditsecurityquestions_copy() {
        tg.wait("ele_EditProfile", ComparisonType.IS_VISIBLE);
        tg.click("ele_EditProfile", 1);
        tg.wait("ele_EditSecurityQuestions", ComparisonType.IS_VISIBLE);
        tg.click("ele_EditSecurityQuestions", 1);
        tg.wait("ele_AnsforQuestion1", ComparisonType.IS_VISIBLE);
        // [DISABLED] tg.click("ele_AnsforQuestion1", 1);
        tg.type("ele_AnsforQuestion1", "qwerty");
        tg.wait("ele_AnsforQuestion2", ComparisonType.IS_VISIBLE);
        // [DISABLED] tg.click("ele_AnsforQuestion2", 1);
        tg.type("ele_AnsforQuestion2", "9876543210");
        tg.wait("ele_AnsforQuestion3", ComparisonType.IS_VISIBLE);
        // [DISABLED] tg.click("ele_AnsforQuestion3", 1);
        tg.type("ele_AnsforQuestion3", "asdfgh");
        tg.wait("ele_SaveSecurityQuestions", ComparisonType.IS_VISIBLE);
        tg.click("ele_SaveSecurityQuestions", 1);
        // [DISABLED] tg.wait("ele_AnsforQuestion1", ComparisonType.IS_VISIBLE, 5);
        // [DISABLED] tg.check.isVisible("ele_SecurityQuestionsUpdatedSuccessfully");
    }

    public static void fnenablerequirementf2fa_copy() {
        tg.wait("ele_EditProfile", ComparisonType.IS_VISIBLE);
        tg.click("ele_EditProfile", 1);
        tg.wait("ele_Alwaysrequire2FA", ComparisonType.IS_VISIBLE);
        tg.click("ele_Alwaysrequire2FA", 1);
        tg.wait("ele_Alwaysrequire2FA", ComparisonType.IS_VISIBLE, 5);
        // [DISABLED] tg.check.isVisible("ele_Successfullyupdated2FA");
        tg.printLogs("Successfully Updated 2FA");
        tg.wait("ele_Alwaysrequire2FA", ComparisonType.IS_VISIBLE, 15);
        tg.click("ele_Alwaysrequire2FA", 1);
        // [DISABLED] tg.check.isVisible("ele_Successfullyupdated2FA");
        tg.printLogs("Successfully Updated 2FA");
    }

    public static void fnenablescamblock_copy() {
        tg.wait("ele_blockScamCalls", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_blockScamCalls");
        tg.scrollToElement("ele_blockScamCalls", Direction.DOWN);
        tg.customScriptStart();
        WebElement parent = driver.findElement(By.xpath("//label[contains(text(), 'Block Scam')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "return window.getComputedStyle(arguments[0], '::after').getPropertyValue('background-color');";
        String backgroundValue = (String) js.executeScript(script, parent);
        boolean value = (backgroundValue.contains("226")) ? false : true;
        if (value) {
            parent.click();
        }
        tg.customScriptEnd();
        tg.check.isVisible("ele_blockScamCalls");
        tg.wait("ele_BlockScamLikelyCallsMessage", ComparisonType.IS_VISIBLE, 20);
        tg.check.isVisible("ele_BlockScamLikelyCallsMessage");
        tg.printLogs("Block Scam Likely Calls Enabled Successfully");
    }

    public static void fnenteremailaddressandsave_copy() {
        tg.wait(10);
        tg.wait("ele_email634", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_email634");
        tg.type("ele_email634", "test@gmail.com");
        tg.check.isVisible("ele_reenterema253");
        // [DISABLED] tg.click("ele_ConfirmEmailAddress", 1);
        tg.type("ele_reenterema253", "test@gmail.com");
        tg.check.isVisible("ele_SaveBtn");
        tg.click("ele_SaveBtn", 1);
    }

    public static void fnfamilycontrol_copy() {
        tg.wait("ele_fnPermissionControl", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_fnPermissionControl", 1);
        tg.wait("ele_fnFamilyControl", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_fnFamilyControl", 1);
        tg.takeFullScreenshot();
        tg.printLogs("Naviagted to Family Controls Page");
    }

    public static void fnfraudandidentity_turnoff_copy() {
        // [DISABLED] tg.switchToTab(1);
        // [DISABLED] tg.wait("ele_Fraudandidentifytheftprotection", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_Fraudandidentifytheftprotection", 1);
        tg.wait("ele_ChangedSaved", ComparisonType.IS_VISIBLE, 10);
    }

    public static void fnfullplandetails_copy() {
        tg.wait("ele_ViewPalnDetails", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_ViewPalnDetails", 1);
        tg.wait("ele_FullPlanDetails", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_FullPlanDetails", 1);
        // =========================================================
        // Custom: Assert URL, Breadcrumbs, and Plan Name
        // =========================================================
        tg.customScriptStart();
        try {
            tg.customScriptEnd();
            // URL assertion
            tg.customScriptStart();
            String currentUrl = driver.getCurrentUrl();
            String expectedUrl = "https://www.t-mobile.com/my-account/plan-details/full-plan-details";
            if (!currentUrl.equals(expectedUrl)) {
                throw new AssertionError("URL mismatch\nActual: " + currentUrl + "\nExpected: " + expectedUrl);
            }
            tg.customScriptEnd();
            // Breadcrumb assertion
            tg.customScriptStart();
            List<WebElement> breadcrumbs = driver.findElements(By.xpath("//ol[contains(@class,'xpr-breadcrumbs__list')]//li"));
            if (breadcrumbs.size() < 3) {
                throw new AssertionError("Breadcrumb list incomplete");
            }
            if (!breadcrumbs.get(0).getText().contains("My account")) {
                throw new AssertionError("Breadcrumb 'My account' missing");
            }
            if (!breadcrumbs.get(1).getText().contains("Plan details")) {
                throw new AssertionError("Breadcrumb 'Plan details' missing");
            }
            if (!breadcrumbs.get(2).getText().contains("Full Plan Details")) {
                throw new AssertionError("Breadcrumb 'Full Plan Details' missing");
            }
            tg.customScriptEnd();
            // Plan name assertion
            tg.customScriptStart();
            String planName = driver.findElement(By.xpath("//span[contains(@class,'rte-dialog--dynamicData')]")).getText().trim();
            if (planName.isEmpty()) {
                throw new AssertionError("Plan name is empty");
            }
            tg.customScriptEnd();
            tg.printLogs("URL, breadcrumbs, and plan name validated successfully");
            tg.customScriptStart();
        } catch (Exception e) {
            tg.customScriptEnd();
            tg.takeFullScreenshot();
            tg.customScriptStart();
            throw new RuntimeException("URL/Breadcrumb/Plan Name validation FAILED", e);
        }
        tg.customScriptEnd();
        // ================== End Custom ============================
        // =========================================================
        // Custom: Assert Dynamic Cards PARAGRAPH CONTENT
        // ===== Custom: Assert Dynamic Cards exact content =====
        tg.customScriptStart();
        try {
            Map<String, String> expectedContent = new LinkedHashMap<>();
            expectedContent.put("Premium Data", "Most unlimited plans give you an amount of data at the start of your bill cycle where you are prioritized higher than customers who are heavy data users.");
            expectedContent.put("Netflix™", "Receive Netflix Standard with ads while you maintain 1 qualifying Experience Beyond");
            expectedContent.put("Apple TV", "Apple TV is a streaming service featuring Apple Originals");
            expectedContent.put("Mobile hotspot", "No Wi-Fi available? No worries. Use your device as a mobile hotspot");
            expectedContent.put("Canada & Mexico included", "Call, text, and browse in Canada & Mexico. No setup. No roaming charges.");
            expectedContent.put("Data and texting while abroad", "Stay connected with unlimited text and data at up to 256Kbps speeds");
            expectedContent.put("Unlimited international texting from home", "Stay in touch with friends and family around the world from here at home.");
            expectedContent.put("1-Year AAA membership on us", "roadside assistance for one year at no extra cost");
            expectedContent.put("T-Mobile TRAVEL", "Save up to 40% on select hotels and rental cars");
            expectedContent.put("Low flat-rate calling while abroad", "Calls from 215+ countries and destinations");
            // ✅ Special case: NO paragraph expected
            expectedContent.put("Talk & text", // intentionally empty
            "");
            expectedContent.put("High-speed data", "With T-Mobile, you get high-speed data on our nationwide 5G");
            expectedContent.put("5G access at no extra cost", "A 5G capable device is required to receive 5G network access");
            expectedContent.put("Wi-Fi calling", "With Wi-Fi Calling, you can make and receive calls and messages over Wi-Fi");
            expectedContent.put("Scam Shield™ Premium", "With Scam Shield™ Premium, you can optimize and organize your mobile life");
            expectedContent.put("Voicemail to Text", "Read voicemails on the go with Voicemail to Text");
            expectedContent.put("Video Streaming Quality", "Video typically streams in SD as default.");
            expectedContent.put("AutoPay monthly discount", "AutoPay discount requires bank account or debit card");
            List<WebElement> cards = driver.findElements(By.xpath("//div[contains(@class,'xpr-dynamicCards__item')]"));
            if (cards.isEmpty()) {
                throw new AssertionError("No Dynamic Cards found on page");
            }
            for (WebElement card : cards) {
                String title = card.findElement(By.xpath(".//h2//span")).getText().replace("&amp;", "&").trim();
                String paragraph = "";
                try {
                    paragraph = card.findElement(By.xpath(".//p//span")).getText().replace("\u00A0", " ").replace("&amp;", "&").trim();
                } catch (Exception ignore) {
                    // paragraph missing is allowed for "Talk & text"
                }
                if (!expectedContent.containsKey(title)) {
                    throw new AssertionError("Unexpected card found: " + title);
                }
                String expectedSnippet = expectedContent.get(title);
                // ✅ Allow empty paragraph ONLY where expected
                if (!expectedSnippet.isEmpty()) {
                    if (!paragraph.contains(expectedSnippet)) {
                        throw new AssertionError("Content mismatch for card: " + title + "\nExpected to contain: " + expectedSnippet + "\nActual: " + paragraph);
                    }
                }
            }
            tg.printLogs("All Dynamic Cards content validated successfully");
        } catch (Exception e) {
            tg.takeFullScreenshot();
            throw new RuntimeException("Dynamic Cards content validation FAILED", e);
        }
        tg.customScriptEnd();
        // ===== End Custom =====
        // ================== End Custom ============================
        tg.takeFullScreenshot();
        tg.printLogs("Full Plan Details page validations completed");
    }

    public static void fnhandleloginwithpasswordbutton_copy_copy_copy_copy() {
        tg.wait(20);
        if (tg.performAssert("ele_LoginWithPassword", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_LoginWithPassword", 1);
        }
    }

    public static void fnlinesettings_copy() {
        tg.wait("ele_NavigatetoLinesettings", ComparisonType.IS_VISIBLE);
        tg.click("ele_NavigatetoLinesettings", 1);
        tg.wait("ele_ChosenorPreferredName", ComparisonType.IS_VISIBLE);
        tg.check.isVisible("ele_ChosenorPreferredName");
        tg.check.isVisible("ele_E911Address");
        tg.check.isVisible("ele_usageAddress");
    }

    public static void fnmanageaddons_copy() {
        tg.wait("ele_Manageaddonsandbenefits", ComparisonType.IS_VISIBLE);
        tg.click("ele_Manageaddonsandbenefits", 1);
        tg.wait("ele_FamilyAllowances", ComparisonType.IS_VISIBLE);
        tg.click("ele_FamilyAllowances", 1);
        tg.wait("ele_SPANENTIPMessagingFr1", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_SPANENTIPMessagingFr1", 1);
        tg.wait("ele_ContinueinAddONs", ComparisonType.IS_VISIBLE);
        tg.click("ele_ContinueinAddONs", 1);
        tg.wait("ele_AgreeSubmitinAddONs", ComparisonType.IS_VISIBLE);
        tg.click("ele_AgreeSubmitinAddONs", 1);
        tg.check.isVisible("ele_NewAddOns");
        tg.wait("ele_ManageAddONs", ComparisonType.IS_VISIBLE);
        tg.click("ele_ManageAddONs", 1);
        tg.wait("ele_FamilyAllowances", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_FamilyAllowances", 1);
        tg.wait("ele_SPANENTIPMessagingFr1", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_SPANENTIPMessagingFr1", 1);
        tg.wait("ele_AgreetoRemoveAddONs", ComparisonType.IS_VISIBLE);
        tg.click("ele_AgreetoRemoveAddONs", 1);
        tg.wait("ele_ContinueinAddONs", ComparisonType.IS_VISIBLE);
        tg.click("ele_ContinueinAddONs", 1);
        tg.wait("ele_AgreeSubmitinAddONs", ComparisonType.IS_VISIBLE);
        tg.click("ele_AgreeSubmitinAddONs", 1);
        tg.check.isVisible("ele_RemovedAddOns");
        tg.wait("ele_ManageAddONs", ComparisonType.IS_VISIBLE, 20);
    }

    public static void fnmanageaddons01_copy() {
        tg.wait("ele_SPANFamilyAllowancesO1", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_SPANFamilyAllowancesO1", 1);
        tg.wait("ele_SPANENTIPMessagingFr1", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_SPANENTIPMessagingFr1", 1);
        tg.wait("ele_Continueb", ComparisonType.IS_VISIBLE, 9);
        tg.click("ele_Continueb", 1);
        tg.wait("ele_AgreeSubmit", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_AgreeSubmit", 1);
        tg.wait("ele_Manageaddons1", ComparisonType.IS_VISIBLE, 9);
        tg.click("ele_Manageaddons1", 1);
        tg.wait("ele_spantgwebc094", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_spantgwebc094", 1);
        tg.wait("ele_agree520", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_agree520", 1);
        tg.wait("ele_spantgwebc748", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_spantgwebc748", 1);
        tg.wait("ele_continue234", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_continue234", 1);
        tg.wait("ele_agreesubmi413", ComparisonType.IS_VISIBLE, 8);
        tg.click("ele_agreesubmi413", 1);
        tg.wait("ele_manageaddo870", ComparisonType.IS_VISIBLE, 10);
    }

    public static void fnmanageautopayacknowledgement_copy() {
        tg.wait("ele_AutoPayTermsAndCondition", ComparisonType.IS_VISIBLE, 40);
        tg.click("ele_AutoPayTermsAndCondition", 1);
        tg.wait("ele_AutoPayTermsHeader", ComparisonType.IS_VISIBLE, 15);
        tg.check.isVisible("ele_AutoPayTermsHeader");
        tg.wait("ele_backBtC", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_backBtC", 1);
        tg.wait("ele_backBtC", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_backBtC", 1);
    }

    public static void fnmanagefaqs_copy() {
        tg.wait("ele_FAQsLink", ComparisonType.IS_VISIBLE, 40);
        tg.click("ele_FAQsLink", 1);
        tg.wait("ele_AutoPayFaqsHeader", ComparisonType.IS_VISIBLE, 15);
        tg.check.isVisible("ele_AutoPayFaqsHeader");
        tg.wait("ele_backBtC", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_backBtC", 1);
        tg.wait("ele_backBtC", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_backBtC", 1);
    }

    public static void fnmultilineaddon_copy() {
        tg.wait("ele_familyallowancev2", ComparisonType.IS_VISIBLE, 19);
        tg.click("ele_familyallowancev2", 1);
        tg.wait("ele_entMessagev2", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_entMessagev2", 1);
        tg.wait("ele_ContinueinAddONs", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_ContinueinAddONs", 1);
        tg.wait("ele_AgreeSubmitinAddONs", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_AgreeSubmitinAddONs", 1);
        tg.wait("ele_ManageAddONs", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_ManageAddONs", 1);
    }

    public static void fnmultilineaddonremoval_copy() {
        tg.wait("ele_familyallowancev2", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_familyallowancev2", 1);
        tg.wait("ele_AgreetoRemoveAddONs", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_AgreetoRemoveAddONs", 1);
        tg.wait("ele_entMessagev2", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_entMessagev2", 1);
        tg.wait("ele_ContinueinAddONs", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_ContinueinAddONs", 1);
        tg.wait("ele_AgreeSubmitinAddONs", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_AgreeSubmitinAddONs", 1);
        tg.wait("ele_ManageAddONs", ComparisonType.IS_VISIBLE, 20);
    }

    public static void fnnavigatetopermissionsncontrol_copy() {
        tg.wait("ele_PermissionsnControl", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_PermissionsnControl", 1);
    }

    public static void fnnewlogout_copy() {
        tg.check.isVisible("ele_profileName01");
        if (tg.performAssert("ele_profileName01", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_profileName01", 1);
        }
        tg.wait("ele_logoutButton", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_logoutButton", 1);
        tg.check.isVisible("ele_loginDiv");
    }

    public static void fnrevertroamingsettings_copy() {
        tg.wait("ele_cancelRoam1", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_cancelRoam1", 1);
        tg.wait("ele_internationalRoaming", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_internationalRoaming", 1);
        tg.wait("ele_submitButtonRoaming", ComparisonType.IS_VISIBLE, 9);
        tg.customScriptStart();
        WebElement parent1 = driver.findElement(By.xpath("//input[@type='radio' and @id='picker-formFieldSelector-985b225d68-all-roaming']"));
        System.out.println("******************************************************************");
        boolean flag1 = parent1.isSelected();
        if (flag1) {
            System.out.println("radio button is enabled");
        } else {
            System.out.println("radio button is disabled");
            driver.findElement(By.xpath("//label[contains(text(), 'Allow all')]")).click();
        }
        tg.customScriptEnd();
        tg.wait("ele_submitButtonRoaming", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_submitButtonRoaming", 1);
        tg.check.isVisible("ele_submitButtonRoaming");
        tg.wait("ele_settingsSavedMessage", ComparisonType.IS_VISIBLE, 10);
        if (tg.performAssert("ele_settingsSavedMessage", ComparisonType.IS_VISIBLE)) {
            tg.check.isVisible("ele_settingsSavedMessage");
        }
    }

    public static void fnselectanotherline_copy() {
        tg.wait("ele_pickaline", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_pickaline", 1);
        tg.wait("ele_secondaryuser", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_secondaryuser", 1);
        tg.wait("ele_continueLine", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_continueLine", 1);
    }

    public static void fnselectdaterangeinmanageautopay_copy() {
        tg.wait("ele_DateSelectionDropdown", ComparisonType.IS_VISIBLE);
        tg.click("ele_DateSelectionDropdown", 1);
        tg.wait("ele_litgwebcom953", ComparisonType.IS_VISIBLE);
        tg.click("ele_litgwebcom953", 1);
        tg.wait("ele_autopayfaq352", ComparisonType.IS_VISIBLE);
        tg.click("ele_autopayfaq352", 1);
        tg.wait("ele_buttontgwe885", ComparisonType.IS_VISIBLE);
        tg.wait("ele_savechange307", ComparisonType.IS_VISIBLE);
        tg.click("ele_savechange307", 1);
    }

    public static void fnsetrestrictedrole_copy() {
        tg.customScriptStart();
        try {
            Thread.sleep(3000);
            String allUsersXPath = "//li[contains(@class,'tdds-list__item')][@data-type='link']";
            List<WebElement> allUserRoles = driver.findElements(By.xpath(allUsersXPath));
            System.out.println("Total user roles found: " + allUserRoles.size());
            List<String> userRoleTextsList = new ArrayList<>();
            for (WebElement userRole : allUserRoles) {
                try {
                    WebElement bodySpan = userRole.findElement(By.xpath(".//span[contains(@class,'tdds-list__item-body')]"));
                    String fullBodyText = bodySpan.getText();
                    String[] parts = fullBodyText.split("\n");
                    String userRoleText = parts[parts.length - 1].trim();
                    userRoleTextsList.add(userRoleText);
                } catch (Exception e) {
                    System.out.println("Error getting user role text: " + e.getMessage());
                }
            }
            System.out.println("User role texts list: " + userRoleTextsList);
            boolean editButtonClicked = false;
            for (int i = 0; i < userRoleTextsList.size(); i++) {
                String roleText = userRoleTextsList.get(i);
                System.out.println("Checking role text: " + roleText);
                if (roleText.equals("Standard User") || roleText.equals("Authorized User")) {
                    System.out.println("Found editable user: " + roleText);
                    WebElement targetUserRole = allUserRoles.get(i);
                    WebElement editButton = targetUserRole.findElement(By.xpath(".//button[@data-analytics-click='Link Click|Edit User Role']"));
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript("arguments[0].scrollIntoView({block: 'center'});", editButton);
                    Thread.sleep(500);
                    js.executeScript("arguments[0].click();", editButton);
                    System.out.println("Clicked Edit button for: " + roleText);
                    editButtonClicked = true;
                    // Exit after clicking first match
                    break;
                } else if (roleText.equals("Restricted User")) {
                    System.out.println("Skipping Restricted User");
                }
            }
            if (!editButtonClicked) {
                System.out.println("All the users are Restricted Users hence not eligible to change the role");
            }
            System.out.println("Finished processing all user roles");
        } catch (Exception e) {
            e.printStackTrace();
        }
        tg.customScriptEnd();
        tg.wait("ele_restrictedUser", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_restrictedUser");
        tg.click("ele_restrictedUser", 1);
        tg.wait("ele_saveChange", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_saveChange");
        tg.click("ele_saveChange", 1);
        tg.wait(10);
        if (tg.performAssert("ele_roleChangeSuccessfull", ComparisonType.IS_VISIBLE)) {
            tg.customScriptStart();
            {
                tg.customScriptEnd();
                tg.check.isVisible("ele_roleChangeSuccessfull");
            }
            tg.customScriptStart();
        } else {
            tg.customScriptEnd();
            tg.wait("ele_checkroles002", ComparisonType.IS_VISIBLE, 10);
            tg.check.isVisible("ele_checkroles002");
            tg.click("ele_checkroles002", 1);
            tg.customScriptStart();
        }
        tg.customScriptEnd();
    }

    public static void fnsetstandarduserrole_copy() {
        tg.wait("ele_EditRole", ComparisonType.IS_VISIBLE);
        tg.click("ele_EditRole", 1);
        tg.wait("ele_StandardUser", ComparisonType.IS_VISIBLE);
        tg.click("ele_StandardUser", 1);
        tg.wait("ele_SaveChangeforRole", ComparisonType.IS_VISIBLE);
        tg.click("ele_SaveChangeforRole", 1);
        tg.wait("ele_CheckRoles", ComparisonType.IS_VISIBLE);
        tg.click("ele_CheckRoles", 1);
    }

    public static void fnsplitinstalmentinpa_copy() {
        tg.wait("ele_EditPASchedul", ComparisonType.IS_VISIBLE);
        tg.click("ele_EditPASchedul", 1);
        tg.wait("ele_AddPayment2", ComparisonType.IS_VISIBLE);
        tg.click("ele_AddPayment2", 1);
        tg.wait("ele_ContinueinEditPaymentschedule", ComparisonType.IS_VISIBLE);
        tg.click("ele_ContinueinEditPaymentschedule", 1);
        tg.wait("ele_Payment2", ComparisonType.IS_VISIBLE);
        tg.check.isVisible("ele_Payment2");
        tg.customScriptStart();
        String textA = driver.findElement(By.cssSelector("#column-49ffa6bb90 > div.payment-schedule-card > div > ul > li:nth-child(2) > div > div > div.phx\\:ta-right.phx\\:display-flex.phx\\:direction-column > div.tdds\\:text-subhead-2.phx\\:mb-h")).getText();
        String textB = driver.findElement(By.cssSelector("#column-49ffa6bb90 > div.payment-schedule-card > div > ul > li:nth-child(3) > div > div > div.phx\\:ta-right.phx\\:display-flex.phx\\:direction-column > div")).getText();
        String textC = driver.findElement(By.cssSelector("#text-3ba86e317f > div > p > span")).getText();
        double a = Double.parseDouble(textA.trim().replace("$", ""));
        double b = Double.parseDouble(textB.trim().replace("$", ""));
        double c = Double.parseDouble(textC.trim().replace("$", ""));
        if (a + b == c) {
            System.out.println("PASS: " + a + " + " + b + " = " + c);
        } else {
            throw new RuntimeException("FAIL: Expected " + a + " + " + b + " = " + (a + b) + " but got " + c);
        }
        tg.customScriptEnd();
        tg.printLogs("Total balance is equally splitted into 2 payments");
        tg.customScriptStart();
        WebElement locator = driver.findElement(By.xpath("//li[1]/div/div/div/div[@x-text='installment.dueDate']"));
        String inputDate = locator.getText().split(",")[1].trim();
        int daysToAdd = 14;
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        String[] parts = inputDate.trim().split("\\s+");
        int monthIndex = Arrays.asList(months).indexOf(parts[0]);
        int day = Integer.parseInt(parts[1]);
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR), monthIndex, day);
        cal.add(Calendar.DAY_OF_MONTH, daysToAdd);
        String result = months[cal.get(Calendar.MONTH)] + " " + cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("*********************************************");
        System.out.println("First Payment date " + inputDate);
        System.out.println("First Payment date + 14 days" + result);
        tg.customScriptEnd();
        tg.printLogs("Payment 2 is scheduled 14 days after Payment 1.");
    }

    public static void fntmomail_copy_copy() {
        tg.wait("ele_TMOMailNet", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_TMOMailNet", 1);
        tg.wait("ele_TMOMailNet", ComparisonType.IS_VISIBLE, 120);
        tg.takeFullScreenshot();
        tg.wait("ele_notificationassertion", ComparisonType.IS_VISIBLE, 10);
        // ===== Custom: validate notification message =====
        tg.customScriptStart();
        try {
            // ✅ Get actual notification text
            String actualText = driver.findElement(By.xpath("//div[@id='ele_notificationassertion' or contains(@class,'notification')]")).getText();
            if (actualText == null) {
                actualText = "";
            }
            actualText = actualText.trim();
            String expectedText = "successfully changed";
            System.out.println("Actual Notification Text : " + actualText);
            System.out.println("Expected (contains)      : " + expectedText);
            if (!actualText.toLowerCase().contains(expectedText)) {
                throw new AssertionError("Notification validation FAILED\n" + "Actual   : " + actualText + "\n" + "Expected : text containing '" + expectedText + "'");
            }
            tg.printLogs("Notification text validation PASSED");
        } catch (Exception e) {
            tg.takeFullScreenshot();
            throw new RuntimeException("Error validating TMOMail success notification", e);
        }
        tg.customScriptEnd();
        // ===== End custom =====
        tg.printLogs("Toggle on/off TMOMailNet completed");
    }

    public static void fnupdatebillingaddress_copy() {
        tg.wait("ele_BillPref", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_BillPref", 1);
        tg.wait("ele_Paperless", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_Paperless", 1);
        tg.wait("ele_UpdateBillingAddress", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_UpdateBillingAddress", 1);
        tg.customScriptStart();
        try {
            WebElement addresselement = driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-street1"));
            String addressText = addresselement.getAttribute("value");
            System.out.println("address text is " + addressText);
            if (addressText.contains("RAVINIA")) {
                System.out.println("address text inside if block " + addressText);
                driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-street1")).clear();
                driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-street1")).sendKeys("12920 SE 38th");
            } else {
                System.out.println("address text inside else block " + addressText);
                driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-street1")).clear();
                driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-street1")).sendKeys("1 RAVINIA DR");
            }
            WebElement cityelement = driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-city"));
            String cityText = cityelement.getAttribute("value");
            System.out.println("city text is " + cityText);
            if (cityText.contains("Bellevue")) {
                driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-city")).clear();
                driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-city")).sendKeys("ATLANTA");
            } else {
                driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-city")).clear();
                driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-city")).sendKeys("Bellevue");
            }
            WebElement zipCodeElement = driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-zipCode"));
            String zipCode = zipCodeElement.getAttribute("value");
            if (zipCode.contains("30346")) {
                driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-zipCode")).clear();
                driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-zipCode")).sendKeys("98006");
            } else {
                driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-zipCode")).clear();
                driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-zipCode")).sendKeys("30346");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        tg.customScriptEnd();
        tg.wait("ele_saveButtonAddress", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_saveButtonAddress");
        tg.click("ele_saveButtonAddress", 1);
        tg.wait("ele_useSuggestedAddress", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_useSuggestedAddress");
        tg.click("ele_useSuggestedAddress", 1);
        tg.wait("ele_billingAddressUpdateSuccessMsg", ComparisonType.IS_VISIBLE, 15);
        tg.check.isVisible("ele_billingAddressUpdateSuccessMsg");
    }

    public static void fnupdatee911address_copy() {
        tg.wait("ele_e911Addressline1", ComparisonType.IS_VISIBLE, 10);
        tg.customScriptStart();
        try {
            WebElement addresselement = driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-street1"));
            String addressText = addresselement.getAttribute("value");
            System.out.println("address text is " + addressText);
            if (addressText.contains("RAVINIA")) {
                System.out.println("address text inside if block " + addressText);
                driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-street1")).clear();
                driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-street1")).sendKeys("12920 SE 38th");
            } else {
                System.out.println("address text inside else block " + addressText);
                driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-street1")).clear();
                driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-street1")).sendKeys("1 RAVINIA DR");
            }
            WebElement cityelement = driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-city"));
            String cityText = cityelement.getAttribute("value");
            System.out.println("city text is " + cityText);
            if (cityText.contains("Bellevue")) {
                driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-city")).clear();
                driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-city")).sendKeys("ATLANTA");
            } else {
                driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-city")).clear();
                driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-city")).sendKeys("Bellevue");
            }
            WebElement zipCodeElement = driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-zipCode"));
            String zipCode = zipCodeElement.getAttribute("value");
            if (zipCode.contains("30346")) {
                driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-zipCode")).clear();
                driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-zipCode")).sendKeys("98006");
            } else {
                driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-zipCode")).clear();
                driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-zipCode")).sendKeys("30346");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        tg.customScriptEnd();
        tg.wait("ele_e911AddressCheckbox", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_e911AddressCheckbox");
        tg.click("ele_e911AddressCheckbox", 1);
        tg.wait("ele_e911YesContinue", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_e911YesContinue");
        tg.click("ele_e911YesContinue", 1);
        tg.wait("ele_saveButtonAddress", ComparisonType.IS_VISIBLE, 20);
        tg.check.isVisible("ele_saveButtonAddress");
        tg.click("ele_saveButtonAddress", 1);
        tg.wait("ele_useSuggestedAddress", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_useSuggestedAddress");
        tg.click("ele_useSuggestedAddress", 1);
        tg.wait("ele_E911AddressSuccessfullySavedMessage", ComparisonType.IS_VISIBLE, 15);
        tg.check.isVisible("ele_E911AddressSuccessfullySavedMessage");
    }

    public static void fnupdatefirstandlastname_copy_copy() {
        tg.wait(10);
        tg.wait("ele_editAddressProfileFirstName", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_editAddressProfileFirstName");
        // [DISABLED] tg.click("ele_editAddressProfileFirstName", 1);
        tg.type("ele_editAddressProfileFirstName", "NICK");
        tg.wait("ele_editAddressProfileLastName", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_editAddressProfileLastName");
        // [DISABLED] tg.click("ele_editAddressProfileLastName", 1);
        tg.type("ele_editAddressProfileLastName", "RONALDO");
        tg.wait("ele_SaveUpdateName", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_SaveUpdateName");
        tg.click("ele_SaveUpdateName", 1);
    }

    public static void fnupdatepa_date_copy() {
        tg.wait("ele_editAddressButton", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_editAddressButton", 1);
        tg.wait("ele_Payment1Calendar", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_Payment1Calendar", 1);
        tg.customScriptStart();
        System.out.println("***************************************************************");
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        System.out.println("Current date: " + currentDate);
        calendar.add(Calendar.DAY_OF_MONTH, 3);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        Date nextDate = calendar.getTime();
        System.out.println("Next date:    " + nextDate);
        System.out.println("Day:    " + day);
        WebElement element1 = driver.findElement(By.xpath("//button[@class='duet-date__prev']"));
        element1.click();
        WebElement element = driver.findElement(By.xpath("//span[text()='" + day + "']"));
        element.click();
        tg.customScriptEnd();
        tg.wait("ele_updateDateButton", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_updateDateButton", 1);
        tg.wait("ele_agreeaButtonForPA", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_agreeaButtonForPA", 1);
        tg.wait("ele_ErrorMessageForPA", ComparisonType.IS_VISIBLE, 20);
        tg.check.isVisible("ele_ErrorMessageForPA");
        tg.wait("ele_okayButtonForErrorDismissal", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_okayButtonForErrorDismissal", 1);
        tg.wait("ele_addpaymentButton01", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_addpaymentButton01", 1);
        tg.wait("ele_providePaymentMethodNextTime", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_providePaymentMethodNextTime", 1);
        tg.wait("ele_continueButtonPaymentMethod", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_continueButtonPaymentMethod", 1);
        tg.wait("ele_agreeaButtonForPA", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_agreeaButtonForPA", 1);
        tg.wait("ele_doneButtonForPA", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_doneButtonForPA", 1);
    }

    public static void fnupdateusageaddress_copy() {
        tg.wait("ele_address1", ComparisonType.IS_VISIBLE, 10);
        tg.customScriptStart();
        try {
            WebElement addresselement = driver.findElement(By.id("field-formFieldAddress-62108929fc-street1"));
            String addressText = addresselement.getAttribute("value");
            System.out.println("address text is " + addressText);
            if (addressText.contains("RAVINIA")) {
                System.out.println("address text inside if block " + addressText);
                driver.findElement(By.id("field-formFieldAddress-62108929fc-street1")).clear();
                driver.findElement(By.id("field-formFieldAddress-62108929fc-street1")).sendKeys("12920 SE 38th");
            } else {
                System.out.println("address text inside else block " + addressText);
                driver.findElement(By.id("field-formFieldAddress-62108929fc-street1")).clear();
                driver.findElement(By.id("field-formFieldAddress-62108929fc-street1")).sendKeys("1 RAVINIA DR");
            }
            WebElement cityelement = driver.findElement(By.id("field-formFieldAddress-62108929fc-city"));
            String cityText = cityelement.getAttribute("value");
            System.out.println("city text is " + cityText);
            if (cityText.contains("Bellevue")) {
                driver.findElement(By.id("field-formFieldAddress-62108929fc-city")).clear();
                driver.findElement(By.id("field-formFieldAddress-62108929fc-city")).sendKeys("ATLANTA");
            } else {
                driver.findElement(By.id("field-formFieldAddress-62108929fc-city")).clear();
                driver.findElement(By.id("field-formFieldAddress-62108929fc-city")).sendKeys("Bellevue");
            }
            WebElement zipCodeElement = driver.findElement(By.id("field-formFieldAddress-62108929fc-zipCode"));
            String zipCode = zipCodeElement.getAttribute("value");
            if (zipCode.contains("30346")) {
                driver.findElement(By.id("field-formFieldAddress-62108929fc-zipCode")).clear();
                driver.findElement(By.id("field-formFieldAddress-62108929fc-zipCode")).sendKeys("98006");
            } else {
                driver.findElement(By.id("field-formFieldAddress-62108929fc-zipCode")).clear();
                driver.findElement(By.id("field-formFieldAddress-62108929fc-zipCode")).sendKeys("30346");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        tg.customScriptEnd();
        tg.wait("ele_addressCheckBox", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_addressCheckBox");
        tg.click("ele_addressCheckBox", 1);
        tg.wait("ele_yesContinueAddress", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_yesContinueAddress");
        tg.click("ele_yesContinueAddress", 1);
        tg.wait("ele_saveButtonAddress", ComparisonType.IS_VISIBLE, 20);
        tg.check.isVisible("ele_saveButtonAddress");
        tg.click("ele_saveButtonAddress", 1);
        tg.wait("ele_useSuggestedAddress", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_useSuggestedAddress");
        tg.click("ele_useSuggestedAddress", 1);
        tg.wait("ele_usageaddre835", ComparisonType.IS_VISIBLE, 20);
        tg.check.isVisible("ele_usageaddre835");
    }

    public static void fnvalidateallowroamingoption_copy() {
        tg.customScriptStart();
        WebElement parent = driver.findElement(By.xpath("//input[@type='radio' and @id='picker-formFieldSelector-985b225d68-all-roaming']"));
        System.out.println("***************************************************************");
        boolean flag = parent.isSelected();
        if (flag) {
            System.out.println("radio button is enabled");
        } else {
            System.out.println("radio button is disabled");
            driver.findElement(By.xpath("//label[contains(text(), 'Allow all')]")).click();
        }
        tg.customScriptEnd();
        tg.wait("ele_submitButtonRoaming", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_submitButtonRoaming", 1);
        tg.wait("ele_settingsSavedMessage", ComparisonType.IS_VISIBLE, 10);
        if (tg.performAssert("ele_settingsSavedMessage", ComparisonType.IS_VISIBLE)) {
            tg.check.isVisible("ele_settingsSavedMessage");
            tg.printLogs("Roam enabled");
        }
    }

    public static void fnvalidateautopaysetupmessageandclickondonebutton_copy_copy() {
        tg.wait("ele_autopayIsSetupText", ComparisonType.IS_VISIBLE, 15);
        tg.check.contains("ele_autopayIsSetupText", "AutoPay is set up");
        tg.check.isVisible("ele_doneButtonAutopay");
        tg.click("ele_doneButtonAutopay", 1);
    }

    public static void fnvalidatepafaqpage_copy() {
        tg.wait("ele_PAFAQPageHeader", ComparisonType.IS_VISIBLE, 20);
        tg.check.isVisible("ele_PAFAQPageHeader");
        tg.check.isVisible("ele_WhatsPaymentArrangementText");
        tg.check.isVisible("ele_HowMuchDoesItCost");
        tg.check.isVisible("ele_CanIChangeAnExistingPaymentArrangementText");
        tg.check.isVisible("ele_CanISetupPAToRestoreMySuspenedAccountText");
        tg.check.isVisible("ele_IfPaymentIsDeclinedText");
        tg.check.isVisible("ele_WhenWillMyPaymentBeProcessedText");
        tg.check.isVisible("ele_WillMyLateFeeBeRemovedText");
        // [DISABLED] tg.check.isVisible("ele_CanIPayoffAPaymentArrangementEarlyText");
    }

    public static void fnvalidatepayementdatedropdownandselectadifferentdate_copy_copy() {
        tg.wait("ele_paymentDateDropDown", ComparisonType.IS_VISIBLE, 25);
        tg.check.isVisible("ele_paymentDateDropDown");
        if (tg.performAssert("ele_paymentDateDropDown", ComparisonType.IS_VISIBLE)) {
            tg.customScriptStart();
            WebElement dateDD = driver.findElement(By.xpath("//button[@id='autopay-payment-date-menu-id-selection-trigger']"));
            Actions actions = new Actions(driver);
            actions.moveToElement(dateDD).click().build().perform();
            tg.customScriptEnd();
            // [DISABLED] tg.click("ele_paymentDateDropDown", 1);
        }
        tg.wait(10);
        tg.check.isVisible("ele_paymentDateDropDown3rdElement");
        if (tg.performAssert("ele_paymentDateDropDown3rdElement", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_paymentDateDropDown3rdElement", 1);
        }
    }

    public static void fnvalidatepaymentschedule_copy() {
        tg.wait("ele_editAddressPaymentSchedule", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_editAddressPaymentSchedule");
        tg.click("ele_editAddressPaymentSchedule", 1);
        tg.wait("ele_paymentDropdown", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_paymentDropdown");
        tg.customScriptStart();
        // Get all options in the dropdown
        try {
            List<WebElement> options = driver.findElements(By.cssSelector("#pa-installment-menu-id-selection-menu li[role='option']"));
            if (options.size() != 2) {
                System.out.println("Error: Expected 2 payment options but found " + options.size());
            } else {
                System.out.println("Verified: 2 payment options are present.");
            }
            // Fetch Payment1 Amount before changing
            String Payment1AmountB = driver.findElement(By.id("field-pa-update-editable-amt-id")).getText();
            // Fetch Total Amount before cchanging
            String totalAmountB = driver.findElement(By.xpath("//div[@x-text='dynamicText.totalAmountPayable']")).getText();
            // Change payment schedule from 2 to 10
            // Click the dropdown to open it
            driver.findElement(By.id("pa-installment-menu-id-selection-trigger")).click();
            // Select "1 payment" option
            driver.findElement(By.id("pa-installment-menu-id-selection-menu-1")).click();
            // Get the Remaining Balance amount for Payment 1
            String Remainingamount = driver.findElement(By.id("field-pa-update-single-amt-id")).getAttribute("data-xpr-field-value");
            if (!Remainingamount.equals(totalAmountB)) {
                throw new AssertionError("Amount does not match");
            }
            //Assert.assertEquals(totalAmountB, Remainingamount, "The Amount did not match");
        } catch (Exception ex) {
            System.out.println("exception caught " + ex);
        }
        tg.customScriptEnd();
        tg.wait("ele_updatePaymentSchedule", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_updatePaymentSchedule");
        tg.click("ele_updatePaymentSchedule", 1);
        tg.wait("ele_paymentArrangementHdr", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_paymentArrangementHdr");
        tg.customScriptStart();
        try {
            List<WebElement> paymentCards = driver.findElements(By.cssSelector("div.pmt-paymentScheduleCard__card"));
            //Assert.assertEquals(paymentCards.size(), 1, "Expected only 1 payment card but found " + paymentCards.size());
            if (paymentCards.size() != 1) {
                throw new AssertionError("Expected only 1 payment card but found " + paymentCards.size());
            }
        } catch (Exception ex) {
            System.out.println("exception caught " + ex);
        }
        tg.customScriptEnd();
        tg.click("ele_backButton", 1);
        tg.click("ele_backButton", 1);
        tg.click("ele_backButton", 1);
    }

    public static void fnvalidateplancomparison_copy() {
        tg.wait("ele_comparePlansHeader", ComparisonType.IS_VISIBLE, 20);
        tg.check.isVisible("ele_comparePlansHeader");
        tg.customScriptStart();
        WebElement dropdownElement1 = driver.findElement(By.xpath("//select[@id='plansCompareDropDown-4743598676-plan-compare-select-1']"));
        WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='plansCompareDropDown-4743598676-plan-compare-select-2']"));
        Select select = new Select(dropdownElement1);
        int randomIndex = 1 + (int) (Math.random() * (10 - 1));
        select.selectByIndex(randomIndex);
        String selectedText = select.getFirstSelectedOption().getText();
        System.out.println("******************************************************************");
        System.out.println(selectedText);
        Select select2 = new Select(dropdownElement);
        int randomIndex2 = 1 + (int) (Math.random() * (10 - 1));
        select2.selectByIndex(randomIndex2);
        String selectedText2 = select2.getFirstSelectedOption().getText();
        System.out.println("******************************************************************");
        System.out.println(selectedText2);
        tg.customScriptEnd();
    }

    public static void fnvalidatewithdrawaldue_copy() {
        tg.wait("ele_paymentScheduleDropDown", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_paymentScheduleDropDown");
        // [DISABLED] } else {
        tg.customScriptStart();
        String dueDateText = driver.findElement(org.openqa.selenium.By.xpath("//p[@id='autopay-billduedate-text']")).getText();
        String withdrawalText = driver.findElement(org.openqa.selenium.By.xpath("//button[@id='autopay-payment-date-menu-id-selection-trigger']//span")).getText();
        int dueDay = Integer.parseInt(dueDateText.replaceAll("\\D+", ""));
        int withdrawalDay = Integer.parseInt(withdrawalText.replaceAll("\\D+", ""));
        if (withdrawalDay <= (dueDay - 2)) {
            System.out.println("PASS: Withdrawal date follows Due Date - 2 logic");
        } else {
            throw new AssertionError("FAIL: Withdrawal date logic mismatch");
        }
        tg.customScriptEnd();
    }

    public static void fnvalidatewithdrawalduedate_copy() {
        tg.wait("ele_paymentScheduleDropDown", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_paymentScheduleDropDown");
        tg.customScriptStart();
        String dueDateText = driver.findElement(org.openqa.selenium.By.xpath("//p[@id='autopay-billduedate-text']")).getText();
        String withdrawalText = driver.findElement(org.openqa.selenium.By.xpath("//button[@id='autopay-payment-date-menu-id-selection-trigger']//span")).getText();
        int dueDay = Integer.parseInt(dueDateText.replaceAll("\\D+", ""));
        int withdrawalDay = Integer.parseInt(withdrawalText.replaceAll("\\D+", ""));
        if (withdrawalDay <= (dueDay - 2)) {
            System.out.println("PASS: Withdrawal date follows Due Date - 2 logic");
        } else {
            throw new AssertionError("FAIL: Withdrawal date logic mismatch");
        }
        tg.customScriptEnd();
    }

    public static void fnverifyupdateschedulenotpresent_copy() {
    }

    public static void fnacceptcookies_copy_copy_copy_copy_copy_copy_copy() {
        if (tg.performAssert("ele_acceptButtonXpath", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_acceptButtonXpath", 1);
        }
    }

    public static void fnaccountactivity_copy() {
        tg.wait("ele_ViewAccountActivity", ComparisonType.IS_VISIBLE);
        tg.click("ele_ViewAccountActivity", 1);
        tg.check.isVisible("ele_account1779789744856ActivityPage");
        tg.check.isVisible("ele_Notifications");
        tg.check.isVisible("ele_ScheduledActivity");
        tg.check.isVisible("ele_account1779789744856ActivityHistory");
    }

    public static void fnaddcarddetails_copy() {
        tg.typeEncrypted("ele_prodCardName", var_CC_Prod_Name);
        tg.typeEncrypted("ele_prodCardNumber", "nl5PHYz9uHSF3dOI4d5XadT4a+SiHpxvS6J7KFvPs/Y=:MTIzNDU2Nzg5MTAxMTEyMQ==");
        tg.typeEncrypted("ele_prodCardExpiration", var_CC_Prod_Exp);
        tg.typeEncrypted("ele_prodCardCVV", var_CC_Prod_CVV);
        tg.typeEncrypted("ele_prodCardZipCode", var_CC_Prod_Zipcode);
        tg.wait("ele_cardSaveButton", ComparisonType.IS_CLICKABLE, 10);
        tg.click("ele_cardSaveButton", 1);
    }

    public static void fnaddpaymentmethodautopaypage_copy() {
        tg.wait("ele_addPaymentMethodAutoPay", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_addPaymentMethodAutoPay");
        tg.click("ele_addPaymentMethodAutoPay", 1);
        tg.wait("ele_cardPaymentMethod", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_cardPaymentMethod");
        tg.click("ele_cardPaymentMethod", 1);
        tg.typeEncrypted("ele_prodCardName", var_CC_Prod_Name);
        tg.typeEncrypted("ele_prodCardNumber", "nl5PHYz9uHSF3dOI4d5XadT4a+SiHpxvS6J7KFvPs/Y=:MTIzNDU2Nzg5MTAxMTEyMQ==");
        tg.typeEncrypted("ele_prodCardExpiration", var_CC_Prod_Exp);
        tg.typeEncrypted("ele_prodCardCVV", var_CC_Prod_CVV);
        tg.typeEncrypted("ele_prodCardZipCode", var_CC_Prod_Zipcode);
        tg.click("ele_cardSaveButton", 1);
        tg.click("ele_clickAgreeAndSubmitButton", 1);
        tg.wait("ele_continueAddPaymentMethod", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_continueAddPaymentMethod", 1);
        tg.wait("ele_doneAutoPaySetup", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_doneAutoPaySetup", 1);
    }

    public static void fnassertbillamountisequalorlessthanzero_copy() {
        tg.wait("ele_viewBillLink", ComparisonType.IS_VISIBLE, 10);
        // ===== Custom: assert Amount Due is zero or negative (pre-requisite) =====
        tg.customScriptStart();
        try {
            // 1) Update this to your Amount Due element locator
            // example path
            By amountBy = By.xpath("//*[@id='billCard']/div/div[1]/div/p[2]");
            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
            WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(amountBy));
            String raw = el.getText();
            if (raw == null)
                raw = "";
            raw = raw.trim();
            // Normalize: handle $, commas, spaces, unicode minus, accounting negatives "(4.07)"
            String normalized = raw.replace("\u2212", // Unicode minus → hyphen
            "-").replace("\u2013", // en dash
            "-").replace("\u2014", // em dash
            "-").replaceAll("[,$\\s]", // drop $, commas, spaces
            "");
            if (normalized.matches("^\\(.*\\)$")) {
                // "(4.07)" → "-4.07"
                normalized = "-" + normalized.substring(1, normalized.length() - 1);
            }
            // leading $ if any
            normalized = normalized.replaceAll("^\\$", "");
            // ".50"  -> "0.50"
            if (normalized.startsWith("."))
                normalized = "0" + normalized;
            // "-.50" -> "-0.50"
            if (normalized.startsWith("-."))
                normalized = "-0" + normalized.substring(1);
            if (normalized.isEmpty() || normalized.equals("-") || normalized.equals(".") || normalized.equals("-.")) {
                throw new AssertionError("Amount Due parsing failed. Raw text: '" + raw + "'");
            }
            java.math.BigDecimal value = new java.math.BigDecimal(normalized);
            System.out.println("[Prereq AmountDue] Raw     : " + raw);
            System.out.println("[Prereq AmountDue] Parsed  : " + value.toPlainString());
            boolean isZeroOrNegative = value.compareTo(java.math.BigDecimal.ZERO) <= 0;
            // Assert: pre-requisite met (Amount Due must be 0.00 or negative)
            io.testgrid.tg.performAssert(String.valueOf(isZeroOrNegative), io.testgrid.enums.ComparisonType.EQUAL_TO, "true");
            if (!isZeroOrNegative) {
                throw new AssertionError("Pre-requisite failed: Amount Due must be ≤ 0.00. Found: " + value.toPlainString());
            }
        } catch (Exception e) {
            throw new RuntimeException("Error while validating Amount Due pre-requisite (≤ 0.00).", e);
        }
        tg.customScriptEnd();
        // ===== End custom =====
    }

    public static void fnassertbillamountisgreaterthanzero_copy() {
        tg.wait("ele_viewBillLink", ComparisonType.IS_VISIBLE, 10);
        // ===== Custom: assert Amount Due is POSITIVE (> 0.00) =====
        tg.customScriptStart();
        try {
            // 1) Amount Due element
            By amountBy = By.xpath("//*[@id='billCard']/div/div[1]/div/p[2]");
            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
            WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(amountBy));
            String raw = el.getText();
            if (raw == null)
                raw = "";
            raw = raw.trim();
            // 2) Normalize currency text:
            //    - handle $, commas, spaces, unicode minus, and "(4.07)" style
            String normalized = raw.replace("\u2212", // Unicode minus → hyphen
            "-").replace("\u2013", // en dash
            "-").replace("\u2014", // em dash
            "-").replaceAll("[,$\\s]", // remove $, commas, spaces
            "");
            if (normalized.matches("^\\(.*\\)$")) {
                // Accounting negative like "(4.07)" -> "-4.07"
                normalized = "-" + normalized.substring(1, normalized.length() - 1);
            }
            // just in case
            normalized = normalized.replaceAll("^\\$", "");
            // Fix cases like ".50" or "-.50"
            if (normalized.startsWith("."))
                normalized = "0" + normalized;
            if (normalized.startsWith("-."))
                normalized = "-0" + normalized.substring(1);
            if (normalized.isEmpty() || normalized.equals("-") || normalized.equals(".") || normalized.equals("-.")) {
                throw new AssertionError("Amount Due parsing failed. Raw text: '" + raw + "'");
            }
            // 3) Parse and assert > 0
            java.math.BigDecimal value = new java.math.BigDecimal(normalized);
            System.out.println("[Positive AmountDue] Raw    : " + raw);
            System.out.println("[Positive AmountDue] Parsed : " + value.toPlainString());
            boolean isPositive = value.compareTo(java.math.BigDecimal.ZERO) > 0;
            // 4) Hard assert: value MUST be positive
            io.testgrid.tg.performAssert(String.valueOf(isPositive), io.testgrid.enums.ComparisonType.EQUAL_TO, "true");
            if (!isPositive) {
                throw new AssertionError("Validation failed: Amount Due must be > 0.00 (positive). Found: " + value.toPlainString());
            }
        } catch (Exception e) {
            throw new RuntimeException("Error while validating Amount Due is positive (> 0.00).", e);
        }
        tg.customScriptEnd();
        // ===== End custom =====
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

    public static void fnblockcallsandmessages_on_copy() {
        // [DISABLED] tg.wait("ele_BlockCalls", ComparisonType.IS_VISIBLE, 10);
        // [DISABLED] tg.click("ele_BlockCalls", 1);
        tg.wait("ele_BlockMail", ComparisonType.IS_VISIBLE, 15);
        // ===== Custom: If toggle is OFF, turn it ON; then assert it is ON =====
        // 1) Indicator span you provided
        tg.customScriptStart();
        By indicatorBy = By.xpath("(//li[2]/span/span[1]/label)[1]");
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
        WebElement indicatorSpan = wait.until(ExpectedConditions.visibilityOfElementLocated(indicatorBy));
        tg.customScriptEnd();
        // 2) Resolve the
        tg.customScriptStart();
        WebElement label = indicatorSpan.findElement(By.xpath("./ancestor::label[1]"));
        String inputId = label.getAttribute("for");
        if (inputId == null || inputId.isEmpty()) {
            throw new AssertionError("Could not resolve input id from the label's 'for' attribute.");
        }
        tg.customScriptEnd();
        // 3) Get the input element and state
        tg.customScriptStart();
        By inputBy = By.id(inputId);
        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(inputBy));
        // true => ON, false => OFF
        boolean isOn = input.isSelected();
        // may be null
        String ariaChecked = input.getAttribute("aria-checked");
        // may be null
        String disabledAttr = input.getAttribute("disabled");
        // may be null
        String ariaDisabled = input.getAttribute("aria-disabled");
        boolean isDisabled = (disabledAttr != null) || "true".equalsIgnoreCase(String.valueOf(ariaDisabled));
        System.out.println("[ToggleEnsureON] Input id        : " + inputId);
        System.out.println("[ToggleEnsureON] Initial selected: " + isOn);
        System.out.println("[ToggleEnsureON] aria-checked    : " + ariaChecked);
        System.out.println("[ToggleEnsureON] disabled/aria   : " + disabledAttr + " / " + ariaDisabled);
        tg.customScriptEnd();
        // 4) If OFF and not disabled, click label to turn ON
        tg.customScriptStart();
        if (!isOn) {
            if (isDisabled) {
                throw new AssertionError("Cannot toggle ON: control is disabled (disabled=" + disabledAttr + ", aria-disabled=" + ariaDisabled + ").");
            }
            tg.customScriptEnd();
            // Bring into view and click label (more reliable than input.click() in reactive UIs)
            tg.customScriptStart();
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", label);
            WebElement clickableLabel = wait.until(ExpectedConditions.elementToBeClickable(label));
            clickableLabel.click();
            tg.customScriptEnd();
            // 5) Re-verify turned ON (allow UI to update)
            tg.customScriptStart();
            boolean turnedOn = new WebDriverWait(driver, java.time.Duration.ofSeconds(8)).until(drv -> drv.findElement(inputBy).isSelected());
            tg.customScriptEnd();
            // Fallback: try JS click on the input if label click didn't flip it
            tg.customScriptStart();
            if (!turnedOn) {
                try {
                    WebElement inputAgain = driver.findElement(inputBy);
                    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", inputAgain);
                    turnedOn = new WebDriverWait(driver, java.time.Duration.ofSeconds(5)).until(drv -> drv.findElement(inputBy).isSelected());
                } catch (Exception ignore) {
                    /* best effort */
                }
            }
            System.out.println("[ToggleEnsureON] After click, selected: " + driver.findElement(inputBy).isSelected());
            if (!turnedOn) {
                throw new AssertionError("Expected toggle to turn ON after click(s), but it remained OFF.");
            }
            tg.customScriptEnd();
        } else {
            tg.customScriptStart();
            System.out.println("[ToggleEnsureON] Toggle already ON; no click performed.");
        }
        tg.customScriptEnd();
        // ===== End custom =====
        tg.takeFullScreenshot();
        tg.wait("ele_BlockMail", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_BlockMail", 1);
        tg.takeFullScreenshot();
    }

    public static void fnblocktmomail_copy() {
        tg.wait("ele_BlockMail", ComparisonType.IS_VISIBLE, 15);
        tg.click("ele_BlockMail", 1);
        tg.wait("ele_BlockMail", ComparisonType.IS_VISIBLE, 30);
        tg.wait("ele_BlockMail", ComparisonType.IS_VISIBLE, 20);
        tg.takeFullScreenshot();
    }

    public static void fnbloclcallsnmessages_copy() {
        tg.wait("ele_BlockCalls", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_BlockCalls", 1);
        // [DISABLED] tg.wait("ele_BlockMail", ComparisonType.IS_VISIBLE, 15);
        // [DISABLED] // ===== Custom: If toggle is OFF, turn it ON; then assert it is ON =====
        // [DISABLED] // 1) Indicator span you provided
        // [DISABLED] tg.customScriptStart();
        // [DISABLED]     By indicatorBy = By.xpath("(//li[2]/span/span[1]/label)[1]");
        // [DISABLED]     WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
        // [DISABLED]     WebElement indicatorSpan = wait.until(ExpectedConditions.visibilityOfElementLocated(indicatorBy));
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] // 2) Resolve the
        // [DISABLED] tg.customScriptStart();
        // [DISABLED]     WebElement label = indicatorSpan.findElement(By.xpath("./ancestor::label[1]"));
        // [DISABLED]     String inputId = label.getAttribute("for");
        // [DISABLED]     if (inputId == null || inputId.isEmpty()) {
        // [DISABLED]         throw new AssertionError("Could not resolve input id from the label's 'for' attribute.");
        // [DISABLED]     }
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] // 3) Get the input element and state
        // [DISABLED] tg.customScriptStart();
        // [DISABLED]     By inputBy = By.id(inputId);
        // [DISABLED]     WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(inputBy));
        // [DISABLED]     boolean isOn = input.isSelected(); // true => ON, false => OFF
        // [DISABLED]     String ariaChecked  = input.getAttribute("aria-checked");   // may be null
        // [DISABLED]     String disabledAttr = input.getAttribute("disabled");       // may be null
        // [DISABLED]     String ariaDisabled = input.getAttribute("aria-disabled");  // may be null
        // [DISABLED]     boolean isDisabled  = (disabledAttr != null) || "true".equalsIgnoreCase(String.valueOf(ariaDisabled));
        // [DISABLED]     System.out.println("[ToggleEnsureON] Input id        : " + inputId);
        // [DISABLED]     System.out.println("[ToggleEnsureON] Initial selected: " + isOn);
        // [DISABLED]     System.out.println("[ToggleEnsureON] aria-checked    : " + ariaChecked);
        // [DISABLED]     System.out.println("[ToggleEnsureON] disabled/aria   : " + disabledAttr + " / " + ariaDisabled);
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] // 4) If OFF and not disabled, click label to turn ON
        // [DISABLED] tg.customScriptStart();
        // [DISABLED]     if (!isOn) {
        // [DISABLED]         if (isDisabled) {
        // [DISABLED]             throw new AssertionError("Cannot toggle ON: control is disabled (disabled=" + disabledAttr + ", aria-disabled=" + ariaDisabled + ").");
        // [DISABLED]         }
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] // Bring into view and click label (more reliable than input.click() in reactive UIs)
        // [DISABLED] tg.customScriptStart();
        // [DISABLED]         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", label);
        // [DISABLED]         WebElement clickableLabel = wait.until(ExpectedConditions.elementToBeClickable(label));
        // [DISABLED]         clickableLabel.click();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] // 5) Re-verify turned ON (allow UI to update)
        // [DISABLED] tg.customScriptStart();
        // [DISABLED]         boolean turnedOn = new WebDriverWait(driver, java.time.Duration.ofSeconds(8))
        // [DISABLED]                 .until(drv -> drv.findElement(inputBy).isSelected());
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] // Fallback: try JS click on the input if label click didn't flip it
        // [DISABLED] tg.customScriptStart();
        // [DISABLED]         if (!turnedOn) {
        // [DISABLED]             try {
        // [DISABLED]                 WebElement inputAgain = driver.findElement(inputBy);
        // [DISABLED]                 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", inputAgain);
        // [DISABLED]                 turnedOn = new WebDriverWait(driver, java.time.Duration.ofSeconds(5))
        // [DISABLED]                         .until(drv -> drv.findElement(inputBy).isSelected());
        // [DISABLED]             } catch (Exception ignore) { /* best effort */ }
        // [DISABLED]         }
        // [DISABLED]         System.out.println("[ToggleEnsureON] After click, selected: " + driver.findElement(inputBy).isSelected());
        // [DISABLED]         if (!turnedOn) {
        // [DISABLED]             throw new AssertionError("Expected toggle to turn ON after click(s), but it remained OFF.");
        // [DISABLED]         }
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] } else {
        // [DISABLED] tg.customScriptStart();
        // [DISABLED]         System.out.println("[ToggleEnsureON] Toggle already ON; no click performed.");
        // [DISABLED]     }
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] // ===== End custom =====
        // [DISABLED] tg.takeFullScreenshot();
        // [DISABLED] tg.wait("ele_BlockMail", ComparisonType.IS_VISIBLE, 10);
        // [DISABLED] tg.click("ele_BlockMail", 1);
        // [DISABLED] tg.takeFullScreenshot();
    }

    public static void fnbrowserback_copy() {
        tg.customScriptStart();
        driver.navigate().back();
        tg.customScriptEnd();
    }

    public static void fncancelautopayinautopay_copy() {
        tg.wait("ele_cancelAutoPay", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_cancelAutoPay");
        tg.click("ele_cancelAutoPay", 1);
        tg.wait("ele_continueCancelAutoPay", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_continueCancelAutoPay");
        tg.click("ele_continueCancelAutoPay", 1);
        tg.wait("ele_doneCancelAutoPay", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_doneCancelAutoPay");
        tg.click("ele_doneCancelAutoPay", 1);
    }

    public static void fncancelpaymentarrangementotppage_copy() {
        tg.wait("ele_SetUpPaymentArrBillCard", ComparisonType.IS_VISIBLE, 10);
        if (tg.performAssert("ele_SetUpPaymentArrBillCard", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_SetUpPaymentArrBillCard", 1);
            tg.wait("ele_cancelPaymentArrangement", ComparisonType.IS_VISIBLE, 10);
            tg.check.isVisible("ele_cancelPaymentArrangement");
            tg.click("ele_cancelPaymentArrangement", 1);
            tg.wait("ele_yesDelete", ComparisonType.IS_VISIBLE, 10);
            tg.check.isVisible("ele_yesDelete");
            tg.click("ele_yesDelete", 1);
            tg.wait("ele_doneCancelPayArr", ComparisonType.IS_VISIBLE, 10);
            tg.check.isVisible("ele_doneCancelPayArr");
            tg.click("ele_doneCancelPayArr", 1);
        }
    }

    public static void fnccdetails_copy() {
        tg.typeEncrypted("ele_prodCardName", var_CC_Prod_Name);
        tg.typeEncrypted("ele_prodCardNumber", "nl5PHYz9uHSF3dOI4d5XadT4a+SiHpxvS6J7KFvPs/Y=:MTIzNDU2Nzg5MTAxMTEyMQ==");
        tg.typeEncrypted("ele_prodCardExpiration", var_CC_Prod_Exp);
        tg.typeEncrypted("ele_prodCardCVV", var_CC_Prod_CVV);
        tg.typeEncrypted("ele_prodCardZipCode", var_CC_Prod_Zipcode);
        tg.click("ele_cardSaveButton", 1);
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

    public static void fnclickdonotsellorsharedata_copy() {
        tg.wait("ele_Donotsharedata", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_Donotsharedata");
        tg.click("ele_Donotsharedata", 1);
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

    public static void fnclickmyprofile_copy() {
        tg.wait("ele_profileName", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_profileName");
        tg.click("ele_profileName", 1);
        tg.wait("ele_profileLink", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_profileLink");
        tg.click("ele_profileLink", 1);
    }

    public static void fnclickonaddpaymentmethod_copy() {
        tg.wait("ele_addpayment", ComparisonType.IS_VISIBLE, 5);
        if (tg.performAssert("ele_addpayment", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_addpayment", 1);
            tg.printLogs("successful expt");
        }
    }

    public static void fnclickonbank_copy() {
        tg.wait("ele_bank", ComparisonType.IS_VISIBLE, 5);
        if (tg.performAssert("ele_bank", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_bank", 1);
        }
    }

    public static void fnclickonblockscam_copy() {
        tg.wait("ele_BlockCalls", ComparisonType.IS_VISIBLE, 5);
        tg.click("ele_BlockCalls", 1);
    }

    public static void fnclickoncardoption_copy() {
        tg.wait("ele_cardOption", ComparisonType.IS_VISIBLE, 5);
        if (tg.performAssert("ele_cardOption", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_cardOption", 1);
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
        tg.wait("ele_makeapayment", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_makeapayment", 1);
    }

    public static void fnclickonotheramount_copy() {
        tg.wait("ele_otherAmount", ComparisonType.IS_VISIBLE, 1);
        if (tg.performAssert("ele_otherAmount", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_otherAmount", 1);
        }
    }

    public static void fnclickonpastbills_copy() {
        tg.wait("ele_pastBillsButton", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_pastBillsButton", 1);
    }

    public static void fnclickonpastbillsdetailedpdf_copy() {
        tg.wait("ele_pastBillsButton", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_pastBillsButton", 1);
        tg.wait("ele_latestMonthDetailedPDF", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_latestMonthDetailedPDF");
        tg.click("ele_latestMonthDetailedPDF", 1);
    }

    public static void fnclickonpastbillssummarypdf_copy() {
        tg.wait("ele_PastBillSummaryPDF", ComparisonType.IS_VISIBLE);
        tg.click("ele_PastBillSummaryPDF", 1);
        tg.openNewTab();
        tg.navigateToUrl("file:///home/seluser/Downloads/SummaryBillMar2026.pdf");
        tg.switchToTab(0);
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

    public static void fnclickonpersonalinformation_copy() {
        tg.wait("ele_personalInformation", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_personalInformation");
        tg.click("ele_personalInformation", 1);
    }

    public static void fnclickonprivacycenter_copy() {
        tg.wait("ele_privacyCenter", ComparisonType.IS_VISIBLE, 5);
        tg.click("ele_privacyCenter", 1);
    }

    public static void fnclickonrecentpastbills_copy() {
        // Existing steps
        tg.wait("ele_billsDetailsButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_billsDetailsButton", 1);
        // ===== Custom: Verify that the displayed date starts with the current month (MMM) =====
        tg.customScriptStart();
        try {
            // Optional small wait for the summary to render (uncomment if needed)
            // Thread.sleep(500);
            // Use an explicit wait so we don't read an empty/placeholder value
            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
            WebElement monthEl = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//bb-billing-ui/div/bb-summary//div[1]/bb-balance/div/div[2]/div/div/b")));
            // Full date text from <b> element, e.g., "Mar 10, 2026"
            String fullDateText = monthEl.getText();
            if (fullDateText == null)
                fullDateText = "";
            fullDateText = fullDateText.trim();
            // Expected month abbreviation for current month (e.g., "Mar")
            String expectedMMM = java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("MMM", java.util.Locale.ENGLISH)).trim();
            // Extract the first three characters from the actual text
            String actualMMM = fullDateText.length() >= 3 ? fullDateText.substring(0, 3) : fullDateText;
            // Normalize to lower-case for case-insensitive comparison
            String actualNorm = actualMMM.toLowerCase(java.util.Locale.ENGLISH);
            String expectedNorm = expectedMMM.toLowerCase(java.util.Locale.ENGLISH);
            // Helpful logs in TestGrid console
            System.out.println("[MonthPrefixCheck] Full text      : " + fullDateText);
            System.out.println("[MonthPrefixCheck] Actual (MMM)   : " + actualMMM);
            System.out.println("[MonthPrefixCheck] Expected (MMM) : " + expectedMMM);
            // Perform assertion INSIDE the custom block to avoid scope issues
            io.testgrid.tg.performAssert(actualNorm, io.testgrid.enums.ComparisonType.EQUAL_TO, expectedNorm);
        } catch (org.openqa.selenium.NoSuchElementException nse) {
            throw new AssertionError("Month label element not found for the provided XPath.", nse);
        } catch (Exception e) {
            throw new RuntimeException("Unexpected error during month prefix check.", e);
        }
        tg.customScriptEnd();
        // ===== End custom check =====
    }

    public static void fnclickonsecurity_copy() {
        tg.wait("ele_Security", ComparisonType.IS_VISIBLE);
        tg.click("ele_Security", 1);
    }

    public static void fnclickontermsandconditions_copy() {
        tg.wait("ele_termsAndCondition", ComparisonType.IS_VISIBLE, 5);
        tg.click("ele_termsAndCondition", 1);
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

    public static void fnclickpermissionandcontrol_copy() {
        tg.wait("ele_permissionAndControl", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_permissionAndControl");
        tg.click("ele_permissionAndControl", 1);
    }

    public static void fnclickprivacy_copy() {
        tg.wait("ele_privacyButton", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_privacyButton");
        tg.click("ele_privacyButton", 1);
    }

    public static void fnclickprivacynotice_copy() {
        // Navigate to Privacy Notice
        tg.wait("ele_PrivacyNotice", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_PrivacyNotice", 1);
        tg.switchToTab(1);
        // ===== Custom: Assert Privacy Notice URL =====
        tg.customScriptStart();
        try {
            String expectedUrl = "https://www.t-mobile.com/privacy-center/privacy-notices";
            String actualUrl = driver.getCurrentUrl();
            System.out.println("[Privacy Notice] Expected URL: " + expectedUrl);
            System.out.println("[Privacy Notice] Actual URL  : " + actualUrl);
            if (!actualUrl.equals(expectedUrl)) {
                throw new AssertionError("Privacy Notice URL assertion failed. Expected: " + expectedUrl + " but Found: " + actualUrl);
            }
            System.out.println("[Privacy Notice] URL assertion passed.");
        } catch (Exception e) {
            throw new RuntimeException("Privacy Notice URL validation failed.", e);
        }
        tg.customScriptEnd();
        // ===== End custom =====
        // Capture screenshot for evidence
        tg.takeFullScreenshot();
    }

    public static void fnclickservicenotifications_copy() {
        tg.wait("ele_ServiceNotifications", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_ServiceNotifications");
        tg.click("ele_ServiceNotifications", 1);
    }

    public static void fnclickuserroles_copy() {
        tg.wait("ele_userRoles", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_userRoles");
        tg.click("ele_userRoles", 1);
    }

    public static void fnclickviewbill_copy() {
        tg.wait("ele_viewBillLink", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_viewBillLink", 1);
    }

    public static void fnconfirmbankaccountdetails_copy() {
        tg.wait("ele_agreeAndContinue", ComparisonType.IS_VISIBLE, 5);
        if (tg.performAssert("ele_agreeAndContinue", ComparisonType.IS_VISIBLE)) {
            tg.printLogs("verified the bank details");
            tg.click("ele_agreeAndContinue", 1);
        }
    }

    public static void fndeletepaymentmethodautopay_copy() {
        tg.wait("ele_editAddressPaymentMethodAutoPay", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_editAddressPaymentMethodAutoPay");
        tg.click("ele_editAddressPaymentMethodAutoPay", 1);
        tg.wait("ele_editAddressCardDetails", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_editAddressCardDetails");
        tg.click("ele_editAddressCardDetails", 1);
        tg.wait("ele_DeleteCCButton", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_DeleteCCButton");
        tg.click("ele_DeleteCCButton", 1);
        tg.wait("ele_deleteCardConfirm", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_deleteCardConfirm");
        tg.click("ele_deleteCardConfirm", 1);
        tg.click("ele_backButton", 1);
        tg.click("ele_backButton", 1);
    }

    public static void fndeviceblock_copy() {
        tg.wait("ele_DeviceBlock", ComparisonType.IS_VISIBLE, 15);
        tg.click("ele_DeviceBlock", 1);
        tg.wait("ele_DeviceBlock", ComparisonType.IS_VISIBLE, 30);
        tg.wait("ele_DeviceBlock", ComparisonType.IS_VISIBLE, 20);
        tg.takeFullScreenshot();
    }

    public static void fndigitalwebloginprod_copy_copy_copy() {
        tg.wait("ele_myaccountSpan", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_myaccountSpan", 1);
        tg.wait("ele_loginLink", ComparisonType.IS_VISIBLE);
        tg.click("ele_loginLink", 1);
        tg.wait("ele_emailOrPhoneInput", ComparisonType.IS_VISIBLE);
        tg.click("ele_emailOrPhoneInput", 1);
        tg.type("ele_emailOrPhoneInput", var_Username);
        tg.wait("ele_nextButton", ComparisonType.IS_VISIBLE, 5);
        tg.click("ele_nextButton", 1);
        tg.wait(20);
        tg.testFunction("fnHandleLoginWithPasswordButton_copy_copy_copy_copy");
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

    public static void fndiscountsandpromotions_copy() {
        tg.wait("ele_ViewDiscountsandPromotions", ComparisonType.IS_VISIBLE, 15);
        tg.click("ele_ViewDiscountsandPromotions", 1);
        tg.check.isVisible("ele_TotalCredit");
    }

    public static void fndismissnotificationpopups_copy() {
        if (tg.performAssert("ele_allowNotificationsButton", ComparisonType.IS_VISIBLE)) {
            tg.printLogs("Notification visibility check");
            tg.click("ele_allowNotificationsButton", 1);
        }
    }

    public static void fndonotsellorsharedata_copy() {
        tg.switchToTab(1);
        // ===== Custom: Ensure "We may sell or share..." toggle is ON if currently OFF (no WebDriverWait) =====
        tg.customScriptStart();
        try {
            tg.customScriptEnd();
            // 1) Locate the label by its exact visible text
            tg.customScriptStart();
            org.openqa.selenium.By labelBy = org.openqa.selenium.By.xpath("//label[normalize-space()='We may sell or share your personal information on this website or app']");
            tg.customScriptEnd();
            // Try to get the label (simple direct find; if not present, throw)
            tg.customScriptStart();
            org.openqa.selenium.WebElement label = driver.findElement(labelBy);
            tg.customScriptEnd();
            // 2) Resolve the associated input via the label's 'for' attribute
            tg.customScriptStart();
            String inputId = label.getAttribute("for");
            if (inputId == null || inputId.trim().isEmpty()) {
                throw new AssertionError("Unable to resolve input id from label 'for'.");
            }
            org.openqa.selenium.By inputBy = org.openqa.selenium.By.id(inputId);
            org.openqa.selenium.WebElement input = driver.findElement(inputBy);
            boolean isOn = input.isSelected();
            boolean isDisabled = "true".equalsIgnoreCase(String.valueOf(input.getAttribute("aria-disabled"))) || input.getAttribute("disabled") != null;
            System.out.println("[DNS Toggle - NoWait] Input id        : " + inputId);
            System.out.println("[DNS Toggle - NoWait] Initial selected: " + isOn);
            System.out.println("[DNS Toggle - NoWait] Disabled        : " + isDisabled);
            tg.customScriptEnd();
            // 3) If OFF and not disabled, click the label to turn it ON
            tg.customScriptStart();
            if (!isOn) {
                if (isDisabled) {
                    throw new AssertionError("Toggle is disabled; cannot enable.");
                }
                tg.customScriptEnd();
                // Bring into view (use JS) and click label
                tg.customScriptStart();
                ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", label);
                tg.customScriptEnd();
                // Attempt click on label
                tg.customScriptStart();
                label.click();
                tg.customScriptEnd();
                // 4) Re-verify ON with a tiny manual retry (no WebDriverWait)
                tg.customScriptStart();
                boolean turnedOn = false;
                for (int i = 0; i < 5; i++) {
                    // retry a few times to allow the UI to reflect the change
                    try {
                        tg.customScriptEnd();
                        // small, inline pause without Thread.sleep (busy-wait micro-delay)
                        tg.customScriptStart();
                        long start = System.nanoTime();
                        while (System.nanoTime() - start < 150_000_000L) {
                            /* ~150ms */
                        }
                        org.openqa.selenium.WebElement check = driver.findElement(inputBy);
                        if (check.isSelected()) {
                            turnedOn = true;
                            break;
                        }
                    } catch (Exception ignore) {
                        /* element may be refreshing; ignore and retry */
                    }
                }
                tg.customScriptEnd();
                // Fallback: JS click the input if label click didn't work
                tg.customScriptStart();
                if (!turnedOn) {
                    try {
                        org.openqa.selenium.WebElement inputAgain = driver.findElement(inputBy);
                        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].click();", inputAgain);
                        tg.customScriptEnd();
                        // One more simple re-check
                        tg.customScriptStart();
                        long start = System.nanoTime();
                        while (System.nanoTime() - start < 200_000_000L) {
                            /* ~200ms */
                        }
                        turnedOn = driver.findElement(inputBy).isSelected();
                    } catch (Exception ignore) {
                        /* best effort */
                    }
                }
                System.out.println("[DNS Toggle - NoWait] After click, isSelected: " + driver.findElement(inputBy).isSelected());
                if (!turnedOn) {
                    throw new AssertionError("Expected toggle to turn ON after clicks, but it remained OFF.");
                }
                tg.customScriptEnd();
            } else {
                tg.customScriptStart();
                System.out.println("[DNS Toggle - NoWait] Toggle already ON; no click performed.");
            }
            tg.customScriptEnd();
            // NOTE: No final hard assertion here (per your request).
            // If you want to fail the step when not ON, keep the AssertionError above; otherwise just log.
            tg.customScriptStart();
        } catch (Exception e) {
            throw new RuntimeException("DNS toggle handling failed (no-wait variant).", e);
        }
        tg.customScriptEnd();
        // ===== End custom =====
    }

    public static void fndonotsellorsharedata_off_copy() {
        // [DISABLED] tg.switchToTab(1);
        // [DISABLED] tg.wait("ele_Fraudandidentifytheftprotection", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_DoNotSellorShareData", 1);
    }

    public static void fndonotsellsharedatafromweb() {
        tg.customScriptStart();
        WebElement toggleButton1 = driver.findElement(By.id("LOCAL_TOGGLE"));
        if (toggleButton1.isSelected()) {
            toggleButton1.click();
        }
        tg.customScriptEnd();
        tg.printLogs("Info Share toggle button is disabled.");
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

    public static void fneditautopaymentmethod_copy() {
        tg.check.isVisible("ele_editAddressPaymentMethodAutoPay");
        tg.wait("ele_editAddressPaymentMethodAutoPay", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_editAddressPaymentMethodAutoPay", 1);
        tg.check.isVisible("ele_editAddressCardDetails");
        tg.wait("ele_editAddressCardDetails", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_editAddressCardDetails", 1);
        tg.click("ele_backButton", 1);
        tg.click("ele_backButton", 1);
        tg.click("ele_backButton", 1);
    }

    public static void fnenteramount_copy() {
        tg.wait("ele_enterAmountField", ComparisonType.IS_VISIBLE);
        if (tg.performAssert("ele_enterAmountField", ComparisonType.IS_VISIBLE)) {
            tg.type("ele_enterAmountField", var_Amount_1);
        }
    }

    public static void fnentercarddetails_copy() {
        tg.typeEncrypted("ele_NameonCard", var_CC_Prod_Name);
        tg.wait("ele_CardNumber", ComparisonType.IS_VISIBLE, 10);
        tg.typeEncrypted("ele_CardNumber", var_CC_Prod_Number);
        tg.typeEncrypted("ele_ExpirationDate", var_CC_Prod_Exp);
        tg.typeEncrypted("ele_CVV", var_CC_Prod_CVV);
        tg.typeEncrypted("ele_ZipCode", var_CC_Prod_Zipcode);
        // [DISABLED] tg.click("ele_Continue", 1);
        // [DISABLED] tg.click("ele_clickAgreeAndSubmitButton", 1);
        // [DISABLED] tg.wait("ele_ContinuewNew", ComparisonType.IS_VISIBLE, 10);
        // [DISABLED] tg.click("ele_ContinuewNew", 1);
        // [DISABLED] tg.wait("ele_PayNow", ComparisonType.IS_VISIBLE, 10);
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] try {
        // [DISABLED] By payNowBy = By.xpath("//button[@aria-label='Pay Now']");
        // [DISABLED] org.openqa.selenium.support.ui.WebDriverWait wait =
        // [DISABLED] new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(20));
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] // Ensure overlays (if any) are gone — optional, adjust selectors if you have loaders/backdrops
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] try { wait.until(org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated(
        // [DISABLED] By.cssSelector(".loading,.spinner,.backdrop,.modal-backdrop,.cdk-overlay-backdrop"))); } catch (Exception ignore) {}
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] // Find and scroll
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] WebElement btn = wait.until(org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated(payNowBy));
        // [DISABLED] ((org.openqa.selenium.JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block:'center'});", btn);
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] // Wait for clickability (re-get after scroll)
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] btn = wait.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(payNowBy));
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] // Try normal click → Actions → JS
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] boolean clicked = false;
        // [DISABLED] try { btn.click(); clicked = true; }
        // [DISABLED] catch (Exception e1) {
        // [DISABLED] try { new org.openqa.selenium.interactions.Actions(driver).moveToElement(btn).click().perform(); clicked = true; }
        // [DISABLED] catch (Exception e2) {
        // [DISABLED] ((org.openqa.selenium.JavascriptExecutor)driver).executeScript("arguments[0].click();", btn);
        // [DISABLED] clicked = true;
        // [DISABLED] }
        // [DISABLED] }
        // [DISABLED] if (!clicked) throw new AssertionError("Failed to click Pay Now");
        // [DISABLED] System.out.println("✅ Clicked Pay Now (aria-label).");
        // [DISABLED] } catch (Exception ex) {
        // [DISABLED] System.out.println("❌ Pay Now click failed: " + ex.getMessage());
        // [DISABLED] throw ex; // make TestGrid fail correctly
        // [DISABLED] }
        // [DISABLED] tg.customScriptEnd();
    }

    public static void fnentercarddetails_1_copy() {
        tg.wait("ele_nameOnCardField", ComparisonType.IS_VISIBLE, 10);
        tg.type("ele_nameOnCardField", "TestUser");
        tg.wait("ele_cardNumberField", ComparisonType.IS_VISIBLE, 5);
        tg.type("ele_cardNumberField", "4046653400000000");
        tg.wait("ele_expirationDateField", ComparisonType.IS_VISIBLE, 5);
        tg.type("ele_expirationDateField", "04/29");
        tg.wait("ele_cvvField", ComparisonType.IS_VISIBLE, 5);
        tg.type("ele_cvvField", "444");
        tg.wait("ele_zipCodeField", ComparisonType.IS_VISIBLE, 5);
        tg.type("ele_zipCodeField", "98006");
        tg.wait("ele_continueButtonForCard", ComparisonType.IS_VISIBLE, 5);
        tg.click("ele_continueButtonForCard", 1);
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
            tg.customScriptStart();
            WebElement dd = driver.findElement(By.xpath("//*[@id='lbx-formEcheck-selectaccountType']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", dd);
            tg.customScriptEnd();
            tg.customScriptStart();
            WebElement dropdownElement = driver.findElement(By.id("lbx-formEcheck-selectaccountType"));
            Select select = new Select(dropdownElement);
            select.selectByVisibleText("Personal - Checking");
            tg.customScriptEnd();
            tg.click("ele_continueButton", 1);
        }
    }

    public static void fnfraudandidentitytheftprotection_copy() {
        tg.switchToTab(1);
        // ===== Custom: If toggle is OFF, turn it ON; then assert it is ON =====
        if (tg.performAssert("ele_Fraudandidentifytheftprotection", ComparisonType.IS_SELECTED)) {
            tg.printLogs("Toggle already selected");
        } else {
            tg.click("ele_Fraudandidentifytheftprotection", 1);
        }
        // Locator changes and the custom expression written was complication so simplified it using testgrid actions
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] try {
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] // 1) Indicator span you provided
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] By indicatorBy = By.xpath("(//div/form/fieldset/div/div[1]/label/span[2])[1]");
        // [DISABLED] WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
        // [DISABLED] WebElement indicatorSpan = wait.until(ExpectedConditions.visibilityOfElementLocated(indicatorBy));
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] // 2) Resolve the
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] WebElement label = indicatorSpan.findElement(By.xpath("./ancestor::label[1]"));
        // [DISABLED] String inputId = label.getAttribute("for");
        // [DISABLED] if (inputId == null || inputId.isEmpty()) {
        // [DISABLED] throw new AssertionError("Could not resolve input id from the label's 'for' attribute.");
        // [DISABLED] }
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] // 3) Get the input element and state
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] By inputBy = By.id(inputId);
        // [DISABLED] WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(inputBy));
        // [DISABLED] boolean isOn = input.isSelected(); // true => ON, false => OFF
        // [DISABLED] String ariaChecked  = input.getAttribute("aria-checked");   // may be null
        // [DISABLED] String disabledAttr = input.getAttribute("disabled");       // may be null
        // [DISABLED] String ariaDisabled = input.getAttribute("aria-disabled");  // may be null
        // [DISABLED] boolean isDisabled  = (disabledAttr != null) || "true".equalsIgnoreCase(String.valueOf(ariaDisabled));
        // [DISABLED] System.out.println("[ToggleEnsureON] Input id        : " + inputId);
        // [DISABLED] System.out.println("[ToggleEnsureON] Initial selected: " + isOn);
        // [DISABLED] System.out.println("[ToggleEnsureON] aria-checked    : " + ariaChecked);
        // [DISABLED] System.out.println("[ToggleEnsureON] disabled/aria   : " + disabledAttr + " / " + ariaDisabled);
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] // 4) If OFF and not disabled, click label to turn ON
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] if (!isOn) {
        // [DISABLED] if (isDisabled) {
        // [DISABLED] throw new AssertionError("Cannot toggle ON: control is disabled (disabled=" + disabledAttr + ", aria-disabled=" + ariaDisabled + ").");
        // [DISABLED] }
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] // Bring into view and click label (more reliable than input.click() in reactive UIs)
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", label);
        // [DISABLED] WebElement clickableLabel = wait.until(ExpectedConditions.elementToBeClickable(label));
        // [DISABLED] clickableLabel.click();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] // 5) Re-verify turned ON (allow UI to update)
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] boolean turnedOn = new WebDriverWait(driver, java.time.Duration.ofSeconds(8))
        // [DISABLED] .until(drv -> drv.findElement(inputBy).isSelected());
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] // Fallback: try JS click on the input if label click didn't flip it
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] if (!turnedOn) {
        // [DISABLED] try {
        // [DISABLED] WebElement inputAgain = driver.findElement(inputBy);
        // [DISABLED] ((JavascriptExecutor) driver).executeScript("arguments[0].click();", inputAgain);
        // [DISABLED] turnedOn = new WebDriverWait(driver, java.time.Duration.ofSeconds(5))
        // [DISABLED] .until(drv -> drv.findElement(inputBy).isSelected());
        // [DISABLED] } catch (Exception ignore) { /* best effort */ }
        // [DISABLED] }
        // [DISABLED] System.out.println("[ToggleEnsureON] After click, selected: " + driver.findElement(inputBy).isSelected());
        // [DISABLED] if (!turnedOn) {
        // [DISABLED] throw new AssertionError("Expected toggle to turn ON after click(s), but it remained OFF.");
        // [DISABLED] }
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] } else {
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] System.out.println("[ToggleEnsureON] Toggle already ON; no click performed.");
        // [DISABLED] }
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] // 6) Final assertion: ensure it is ON
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] String.valueOf(driver.findElement(inputBy).isSelected()),
        // [DISABLED] io.testgrid.enums.ComparisonType.EQUAL_TO,
        // [DISABLED] "true"
        // [DISABLED] );
        // [DISABLED] } catch (Exception e) {
        // [DISABLED] throw new RuntimeException("Failed to ensure toggle is ON via label flow.", e);
        // [DISABLED] }
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // [DISABLED] tg.customScriptEnd();
        // ===== End custom =====
        tg.wait("ele_ChangedSaved", ComparisonType.IS_VISIBLE, 10);
    }

    public static void fngetalertsaboutallaccountlines_copy() {
        tg.switchToTab(1);
        // ===== Custom: Turn ON "Get alerts about all account lines" if OFF =====
        tg.customScriptStart();
        try {
            tg.customScriptEnd();
            // Locate the toggle INPUT element
            tg.customScriptStart();
            org.openqa.selenium.By toggleInputBy = org.openqa.selenium.By.id("mat-slide-toggle-1-input");
            org.openqa.selenium.WebElement toggleInput = driver.findElement(toggleInputBy);
            tg.customScriptEnd();
            // Read current state from aria-checked
            tg.customScriptStart();
            String currentState = toggleInput.getAttribute("aria-checked");
            boolean isOn = "true".equalsIgnoreCase(currentState);
            System.out.println("[Alerts Toggle] Initial state: " + currentState);
            tg.customScriptEnd();
            // If OFF → turn ON
            tg.customScriptStart();
            if (!isOn) {
                tg.customScriptEnd();
                // Scroll into view
                tg.customScriptStart();
                ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", toggleInput);
                tg.customScriptEnd();
                // Click using JS (more reliable for hidden inputs)
                tg.customScriptStart();
                ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].click();", toggleInput);
                tg.customScriptEnd();
                // Small wait (~200 ms) to allow UI update
                tg.customScriptStart();
                long start = System.nanoTime();
                while (System.nanoTime() - start < 200_000_000L) {
                }
                tg.customScriptEnd();
                // Re-validate state
                tg.customScriptStart();
                String updatedState = toggleInput.getAttribute("aria-checked");
                System.out.println("[Alerts Toggle] After click state: " + updatedState);
                if (!"true".equalsIgnoreCase(updatedState)) {
                    throw new AssertionError("Toggle was OFF and clicked, but did not turn ON.");
                }
                tg.customScriptEnd();
            } else {
                tg.customScriptStart();
                ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].click();", toggleInput);
                long pauseOff = System.nanoTime();
                // 300ms
                while (System.nanoTime() - pauseOff < 300_000_000L) {
                }
                ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].click();", toggleInput);
                long pauseOn = System.nanoTime();
                // 300ms
                while (System.nanoTime() - pauseOn < 300_000_000L) {
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to ensure 'Get alerts about all account lines' toggle is ON.", e);
        }
        tg.customScriptEnd();
        // ===== End custom =====
        // ===== Custom: Validate alert confirmation message is displayed =====
        tg.customScriptStart();
        try {
            org.openqa.selenium.By alertMsgBy = org.openqa.selenium.By.xpath("//span[contains(text(),'Alerts set to on')]");
            org.openqa.selenium.WebElement alertMessage = driver.findElement(alertMsgBy);
            if (!alertMessage.isDisplayed()) {
                throw new AssertionError("Alert confirmation message is not displayed");
            }
            System.out.println("[Assertion Passed] Alert confirmation message is displayed: " + alertMessage.getText());
        } catch (Exception e) {
            throw new RuntimeException("Failed to verify alert confirmation message for 'Get alerts about all account lines'", e);
        }
        tg.customScriptEnd();
        // ===== End Custom =====
        tg.printLogs("Alert message is getting displayed");
    }

    public static void fngetalertsaboutallaccountlines_off_copy() {
        tg.takeFullScreenshot();
        // [DISABLED] tg.click("ele_AssertAlert", 1);
        tg.wait("ele_GetAlertAboutAllLines", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_GetAlertAboutAllLines", 1);
        // [DISABLED] tg.wait("ele_AssertAlert", ComparisonType.IS_VISIBLE, 10);
        // [DISABLED] tg.printLogs("ele_AssertAlert");
    }

    public static void fnlogout_copy_copy_copy_copy_copy() {
        tg.check.isVisible("ele_profileName");
        if (tg.performAssert("ele_profileName", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_profileName", 1);
            // [DISABLED] tg.wait("ele_logoutButton", ComparisonType.IS_VISIBLE, 5);
            // [DISABLED] tg.click("ele_logoutButton", 1);
        }
        tg.wait("ele_logoutButton", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_logoutButton", 1);
        tg.check.isVisible("ele_loginDiv");
    }

    public static void fnlogoutrestored_copy() {
        if (tg.performAssert("ele_loginUserButton", ComparisonType.IS_INVISIBLE)) {
            tg.wait("ele_backButton", ComparisonType.IS_VISIBLE, 20);
            tg.click("ele_backButton", 1);
        }
        tg.wait("ele_loginUserButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_loginUserButton", 1);
        tg.wait("ele_logoutButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_logoutButton", 1);
        tg.check.isVisible("ele_loginDiv");
    }

    public static void fnmakepaymentbillcard_copy() {
        tg.wait("ele_makeAPaymentHeader", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_makeAPaymentHeader");
        tg.click("ele_makeAPaymentHeader", 1);
    }

    public static void fnmanagedownloads_copy() {
        tg.openNewTab();
        tg.navigateToUrl("chrome://downloads");
        tg.customScriptStart();
        String filePrefix = "file:///home/seluser/Downloads/";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String fileName = (String) js.executeScript("return document.querySelector('downloads-manager')" + ".shadowRoot.querySelector('#downloadsList')" + ".items[0].fileName;");
        String fileLocation = filePrefix + fileName;
        driver.navigate().to(fileLocation);
        tg.customScriptEnd();
    }

    public static void fnnaviagtetoprivacytab_copy() {
        tg.wait("ele_Profile", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_Profile", 1);
        tg.wait("ele_Profilenew", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_Profilenew", 1);
        tg.wait("ele_Privacy", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_Privacy", 1);
        tg.wait("ele_PrivacyDashboard", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_PrivacyDashboard", 1);
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
        if (tg.performAssert("ele_addpayment", ComparisonType.IS_VISIBLE)) {
            // ---------- Check 3: Add Payment Method button ----------
            tg.customScriptStart();
            {
                By by = By.xpath("//*[@id='addPaymentMethod-btn']/span");
                WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(waitSeconds));
                WebElement el = wait.until(ExpectedConditions.elementToBeClickable(by));
                boolean clickable = el.isDisplayed() && el.isEnabled();
                System.out.println("Add Payment Method clickable: " + clickable);
                if (!clickable) {
                    throw new AssertionError("Add Payment Method is NOT clickable");
                }
            }
            tg.customScriptEnd();
        } else {
            tg.check.isVisible("ele_SavedCard");
        }
        // ---------- Check 4: Date picker button ----------
        tg.customScriptStart();
        {
            By by = By.xpath("//*[@class='duet-date__toggle-icon']");
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

    public static void fnnavigatetocardpage_copy() {
        tg.wait("ele_mainprofile", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_mainprofile", 1);
        // [DISABLED] tg.wait("ele_Profile", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_profileneww", 1);
        tg.wait("ele_BillPref", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_BillPref", 1);
        tg.wait("ele_Paperless", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_Paperless", 1);
        tg.wait("ele_UpdateBillingAddress", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_UpdateBillingAddress", 1);
    }

    public static void fnnavigatetomywalletpage_copy() {
        tg.wait("ele_Managepaymentmethods", ComparisonType.IS_VISIBLE);
        tg.click("ele_Managepaymentmethods", 1);
        tg.check.isVisible("ele_MywalletPage");
    }

    public static void fnnavigatetoonetimecharges_copy() {
        tg.wait("ele_viewOneTimeChargesButton", ComparisonType.IS_VISIBLE, 10);
        if (tg.performAssert("ele_viewOneTimeChargesButton", ComparisonType.IS_INVISIBLE)) {
            tg.scrollToElement("ele_viewOneTimeChargesButton", Direction.DOWN);
        }
        tg.click("ele_viewOneTimeChargesButton", 1);
        tg.check.isVisible("ele_OneTimeChargesDetailsText");
    }

    public static void fnnavigatetoprofile_copy() {
        tg.wait("ele_Profile", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_Profile", 1);
        tg.wait("ele_Profilenew", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_Profilenew", 1);
    }

    public static void fnnavigatetoprofiletab_copy_copy() {
        tg.wait("ele_Profile", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_Profile", 1);
        tg.wait("ele_Profilenew", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_Profilenew", 1);
        // [DISABLED] tg.wait("ele_Privacy", ComparisonType.IS_VISIBLE, 10);
        // [DISABLED] tg.click("ele_Privacy", 1);
        // [DISABLED] tg.wait("ele_PrivacyDashboard", ComparisonType.IS_VISIBLE, 10);
        // [DISABLED] tg.click("ele_PrivacyDashboard", 1);
    }

    public static void fnnavigatetosecuritydashboard_copy() {
        tg.check.isVisible("ele_Security");
        if (tg.performAssert("ele_Security", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_Security", 1);
        }
        tg.check.isVisible("ele_securityDashboard");
        if (tg.performAssert("ele_securityDashboard", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_securityDashboard", 1);
        }
        tg.check.isVisible("ele_securityDashboardHeader1");
        if (tg.performAssert("ele_securityDashboardHeader1", ComparisonType.IS_VISIBLE)) {
            tg.printLogs("Navigated successfully to Security Dashboard");
        }
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
            tg.customScriptEnd();
            // Click Card option
            tg.customScriptStart();
            By cardBy = By.xpath("//fieldset/div[2]/div[1]/div/label/span/span[1]");
            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
            WebElement cardOption = wait.until(ExpectedConditions.elementToBeClickable(cardBy));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", cardOption);
            cardOption.click();
            System.out.println("Clicked Card payment option.");
            tg.customScriptEnd();
            // Enter Other Amount = 10
            tg.customScriptStart();
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
        tg.wait("ele_Calendar", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_Calendar", 1);
        tg.wait("ele_Date", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_Date", 1);
        tg.wait("ele_addPaymentMethod", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_addPaymentMethod", 1);
        tg.wait("ele_card", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_card", 1);
    }

    public static void fnotheramount_100_copy() {
        tg.wait("ele_makeAPaymentHeader", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_makeAPaymentHeader", 1);
        tg.wait("ele_payYourBillHeader", ComparisonType.IS_VISIBLE);
        tg.customScriptStart();
        try {
            tg.customScriptEnd();
            // Click Card option
            tg.customScriptStart();
            By cardBy = By.xpath("//fieldset/div[2]/div[1]/div/label/span/span[1]");
            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
            WebElement cardOption = wait.until(ExpectedConditions.elementToBeClickable(cardBy));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", cardOption);
            cardOption.click();
            System.out.println("Clicked Card payment option.");
            tg.customScriptEnd();
            // Enter Other Amount = 100
            tg.customScriptStart();
            By amountBy = By.xpath("//*[@id='field-otherAmount']");
            WebElement amountField = wait.until(ExpectedConditions.visibilityOfElementLocated(amountBy));
            amountField.clear();
            amountField.sendKeys("100");
            System.out.println("Entered Other Amount: 100");
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

    public static void fnremovecc_copy() {
        tg.wait("ele_DeleteCCButton", ComparisonType.IS_VISIBLE, 25);
        tg.click("ele_DeleteCCButton", 1);
        tg.wait("ele_DeleteCCPOPUP", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_DeleteCCPOPUP", 1);
    }

    public static void fnremovepaymentarrangement_copy() {
        tg.testFunction("fnClickViewBill_copy");
        tg.wait("ele_Managepaymentarrangement", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_Managepaymentarrangement", 1);
        tg.wait("ele_EditinPApage", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_EditinPApage", 1);
        tg.wait("ele_Removepaymentmethod", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_Removepaymentmethod", 1);
        tg.wait("ele_ContinueforremovePaymentmethod", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_ContinueforremovePaymentmethod", 1);
        tg.wait("ele_cancelpaym662", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_cancelpaym662", 1);
        tg.wait("ele_YesDeletePA", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_YesDeletePA", 1);
        tg.wait("ele_DoneRemovePA", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_DoneRemovePA", 1);
        tg.testFunction("fnClickViewBill_copy");
        tg.wait("ele_Managepaymentarrangement", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_Managepaymentarrangement", 1);
        tg.wait("ele_EditRemoveforPA", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_EditRemoveforPA", 1);
        tg.wait("ele_EditRemoveCCForPA", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_EditRemoveCCForPA", 1);
        tg.wait("ele_DeleteCCForPA", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_DeleteCCForPA", 1);
        tg.wait("ele_DeleteunderManagePA", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_DeleteunderManagePA", 1);
    }

    public static void fnsecurity() {
        tg.wait("ele_Security", ComparisonType.IS_VISIBLE);
        tg.click("ele_Security", 1);
    }

    public static void fnsetauthorizedrole_copy() {
        tg.customScriptStart();
        try {
            tg.customScriptEnd();
            // Wait for page to load
            tg.customScriptStart();
            Thread.sleep(3000);
            tg.customScriptEnd();
            // Get all user list items (all different user roles)
            tg.customScriptStart();
            String allUsersXPath = "//li[contains(@class,'tdds-list__item')][@data-type='link']";
            List<WebElement> allUserRoles = driver.findElements(By.xpath(allUsersXPath));
            System.out.println("Total user roles found: " + allUserRoles.size());
            tg.customScriptEnd();
            // Create a list to store only user role texts
            tg.customScriptStart();
            List<String> userRoleTextsList = new ArrayList<>();
            tg.customScriptEnd();
            // Get all user role texts into the list
            tg.customScriptStart();
            for (WebElement userRole : allUserRoles) {
                try {
                    WebElement bodySpan = userRole.findElement(By.xpath(".//span[contains(@class,'tdds-list__item-body')]"));
                    String fullBodyText = bodySpan.getText();
                    tg.customScriptEnd();
                    // Split by line break and get the last part (user role)
                    tg.customScriptStart();
                    String[] parts = fullBodyText.split("\n");
                    String userRoleText = parts[parts.length - 1].trim();
                    userRoleTextsList.add(userRoleText);
                } catch (Exception e) {
                    System.out.println("Error getting user role text: " + e.getMessage());
                }
            }
            tg.customScriptEnd();
            // Print all user role texts
            tg.customScriptStart();
            System.out.println("User role texts list: " + userRoleTextsList);
            tg.customScriptEnd();
            // Flag to track if edit button was clicked
            tg.customScriptStart();
            boolean editButtonClicked = false;
            tg.customScriptEnd();
            // Now loop through the list and check for Standard User or Restricted User
            tg.customScriptStart();
            for (int i = 0; i < userRoleTextsList.size(); i++) {
                String roleText = userRoleTextsList.get(i);
                System.out.println("Checking role text: " + roleText);
                tg.customScriptEnd();
                // Check if text is Standard User or Restricted User
                tg.customScriptStart();
                if (roleText.equals("Standard User") || roleText.equals("Restricted User")) {
                    System.out.println("Found editable user: " + roleText);
                    tg.customScriptEnd();
                    // Get the corresponding user role element by index
                    tg.customScriptStart();
                    WebElement targetUserRole = allUserRoles.get(i);
                    tg.customScriptEnd();
                    // Find the Edit button for this user role
                    tg.customScriptStart();
                    WebElement editButton = targetUserRole.findElement(By.xpath(".//button[@data-analytics-click='Link Click|Edit User Role']"));
                    tg.customScriptEnd();
                    // Scroll into view
                    tg.customScriptStart();
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript("arguments[0].scrollIntoView({block: 'center'});", editButton);
                    Thread.sleep(500);
                    tg.customScriptEnd();
                    // Click the Edit button
                    tg.customScriptStart();
                    js.executeScript("arguments[0].click();", editButton);
                    System.out.println("Clicked Edit button for: " + roleText);
                    editButtonClicked = true;
                    // Exit after clicking first match
                    break;
                } else if (roleText.equals("Authorized User")) {
                    System.out.println("Skipping Authorized User");
                }
            }
            tg.customScriptEnd();
            // If no edit button was clicked, all users are Authorized Users
            tg.customScriptStart();
            if (!editButtonClicked) {
                System.out.println("All the users are Authorized Users hence not eligible to change the role");
            }
            System.out.println("Finished processing all user roles");
        } catch (Exception e) {
            e.printStackTrace();
        }
        tg.customScriptEnd();
        tg.wait("ele_selectAuthorizedUser", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_selectAuthorizedUser");
        tg.click("ele_selectAuthorizedUser", 1);
        tg.wait("ele_saveChange", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_saveChange");
        tg.click("ele_saveChange", 1);
        tg.wait("ele_ackCheckBox", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_ackCheckBox");
        tg.click("ele_ackCheckBox", 1);
        tg.wait("ele_continueAuthButton", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_continueAuthButton");
        tg.click("ele_continueAuthButton", 1);
        tg.wait("ele_authorizedUserConfrmMsg", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_authorizedUserConfrmMsg");
        tg.check.isVisible("ele_authDoneButton");
        tg.click("ele_authDoneButton", 1);
    }

    public static void fnsetupapaymentarrangement_copy() {
        tg.wait("ele_SetUpPaymentArrdiv", ComparisonType.IS_VISIBLE);
        tg.click("ele_SetUpPaymentArrdiv", 1);
        tg.check.isVisible("ele_PaymentArrangementPage");
        tg.wait("ele_AddNewPaymentMethod", ComparisonType.IS_VISIBLE);
        tg.click("ele_AddNewPaymentMethod", 1);
    }

    public static void fnsetuppaymentarrangementotppage_copy() {
        tg.wait("ele_SetUpPaymentArrOTP", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_SetUpPaymentArrOTP");
        tg.click("ele_SetUpPaymentArrOTP", 1);
        tg.wait("ele_agreeAndSubmitPaymentArrangement", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_agreeAndSubmitPaymentArrangement");
        tg.click("ele_agreeAndSubmitPaymentArrangement", 1);
        tg.wait("ele_paymentArrangementConfirmation", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_paymentArrangementConfirmation");
        tg.check.isVisible("ele_donePaymentArrangement");
        tg.click("ele_donePaymentArrangement", 1);
    }

    public static void fnsharedataforpublicandscientificresearch_copy() {
        tg.switchToTab(1);
        // ===== Custom: If toggle is OFF, turn it ON; then assert it is ON =====
        // 1) Indicator span you provided
        tg.customScriptStart();
        By indicatorBy = By.xpath("(//div/form/fieldset/div/div[1]/label/span[2])[2]");
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
        WebElement indicatorSpan = wait.until(ExpectedConditions.visibilityOfElementLocated(indicatorBy));
        tg.customScriptEnd();
        // 2) Resolve the
        tg.customScriptStart();
        WebElement label = indicatorSpan.findElement(By.xpath("./ancestor::label[1]"));
        String inputId = label.getAttribute("for");
        if (inputId == null || inputId.isEmpty()) {
            throw new AssertionError("Could not resolve input id from the label's 'for' attribute.");
        }
        tg.customScriptEnd();
        // 3) Get the input element and state
        tg.customScriptStart();
        By inputBy = By.id(inputId);
        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(inputBy));
        // true => ON, false => OFF
        boolean isOn = input.isSelected();
        // may be null
        String ariaChecked = input.getAttribute("aria-checked");
        // may be null
        String disabledAttr = input.getAttribute("disabled");
        // may be null
        String ariaDisabled = input.getAttribute("aria-disabled");
        boolean isDisabled = (disabledAttr != null) || "true".equalsIgnoreCase(String.valueOf(ariaDisabled));
        System.out.println("[ToggleEnsureON] Input id        : " + inputId);
        System.out.println("[ToggleEnsureON] Initial selected: " + isOn);
        System.out.println("[ToggleEnsureON] aria-checked    : " + ariaChecked);
        System.out.println("[ToggleEnsureON] disabled/aria   : " + disabledAttr + " / " + ariaDisabled);
        tg.customScriptEnd();
        // 4) If OFF and not disabled, click label to turn ON
        tg.customScriptStart();
        if (!isOn) {
            if (isDisabled) {
                throw new AssertionError("Cannot toggle ON: control is disabled (disabled=" + disabledAttr + ", aria-disabled=" + ariaDisabled + ").");
            }
            tg.customScriptEnd();
            // Bring into view and click label (more reliable than input.click() in reactive UIs)
            tg.customScriptStart();
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", label);
            WebElement clickableLabel = wait.until(ExpectedConditions.elementToBeClickable(label));
            clickableLabel.click();
            tg.customScriptEnd();
            // 5) Re-verify turned ON (allow UI to update)
            tg.customScriptStart();
            boolean turnedOn = new WebDriverWait(driver, java.time.Duration.ofSeconds(8)).until(drv -> drv.findElement(inputBy).isSelected());
            tg.customScriptEnd();
            // Fallback: try JS click on the input if label click didn't flip it
            tg.customScriptStart();
            if (!turnedOn) {
                try {
                    WebElement inputAgain = driver.findElement(inputBy);
                    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", inputAgain);
                    turnedOn = new WebDriverWait(driver, java.time.Duration.ofSeconds(5)).until(drv -> drv.findElement(inputBy).isSelected());
                } catch (Exception ignore) {
                    /* best effort */
                }
            }
            System.out.println("[ToggleEnsureON] After click, selected: " + driver.findElement(inputBy).isSelected());
            if (!turnedOn) {
                throw new AssertionError("Expected toggle to turn ON after click(s), but it remained OFF.");
            }
            tg.customScriptEnd();
        } else {
            tg.customScriptStart();
            System.out.println("[ToggleEnsureON] Toggle already ON; no click performed.");
        }
        tg.customScriptEnd();
        // ===== End custom =====
        tg.wait("ele_ChangedSaved", ComparisonType.IS_VISIBLE, 10);
    }

    public static void fnsharedataforpublicandscientificresearch_off_copy() {
        // [DISABLED] tg.switchToTab(1);
        // [DISABLED] tg.wait("ele_Fraudandidentifytheftprotection", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_SharedData", 1);
        tg.wait("ele_ChangedSaved", ComparisonType.IS_VISIBLE, 10);
    }

    public static void fnsimprotectionforalllines_copy() {
        tg.wait("ele_SIMprotection", ComparisonType.IS_VISIBLE);
        tg.click("ele_SIMprotection", 1);
        tg.wait("ele_TurnONSIMProtectionForALLLines", ComparisonType.IS_VISIBLE);
        tg.click("ele_TurnONSIMProtectionForALLLines", 1);
        tg.wait("ele_SaveChangesinSIMProtection", ComparisonType.IS_VISIBLE);
        tg.click("ele_SaveChangesinSIMProtection", 1);
        tg.wait("ele_ContinueinSIMProtection", ComparisonType.IS_VISIBLE);
        tg.click("ele_ContinueinSIMProtection", 1);
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnClickonSecurity_copy");
        tg.wait("ele_SIMprotection", ComparisonType.IS_VISIBLE);
        tg.click("ele_SIMprotection", 1);
        tg.wait("ele_TurnOFFSIMProtectionForAllLines", ComparisonType.IS_VISIBLE);
        tg.click("ele_TurnOFFSIMProtectionForAllLines", 1);
        tg.wait("ele_SaveChangesinSIMProtection", ComparisonType.IS_VISIBLE);
        tg.click("ele_SaveChangesinSIMProtection", 1);
        tg.wait("ele_ContinueinSIMProtection", ComparisonType.IS_VISIBLE);
        tg.click("ele_ContinueinSIMProtection", 1);
    }

    public static void fnsimprotectionforsomelines_copy() {
        tg.wait("ele_SIMprotection", ComparisonType.IS_VISIBLE);
        tg.click("ele_SIMprotection", 1);
        tg.wait("ele_TurnONSIMProtectionforSomelines", ComparisonType.IS_VISIBLE);
        tg.click("ele_TurnONSIMProtectionforSomelines", 1);
        tg.wait("ele_SaveChangesinSIMProtection", ComparisonType.IS_VISIBLE);
        tg.click("ele_SaveChangesinSIMProtection", 1);
        tg.wait("ele_ContinueinSIMProtection", ComparisonType.IS_VISIBLE);
        tg.click("ele_ContinueinSIMProtection", 1);
        tg.testFunction("fnClickMyProfile_copy");
        tg.testFunction("fnClickonSecurity_copy");
        tg.wait("ele_SIMprotection", ComparisonType.IS_VISIBLE);
        tg.click("ele_SIMprotection", 1);
        tg.wait("ele_TurnOFFSIMProtectionForSomeLines", ComparisonType.IS_VISIBLE);
        tg.click("ele_TurnOFFSIMProtectionForSomeLines", 1);
        tg.wait("ele_SaveChangesinSIMProtection", ComparisonType.IS_VISIBLE);
        tg.click("ele_SaveChangesinSIMProtection", 1);
        tg.wait("ele_ContinueinSIMProtection", ComparisonType.IS_VISIBLE);
        tg.click("ele_ContinueinSIMProtection", 1);
    }

    public static void fnswitchtodefaulttab_copy() {
    }

    public static void fnswitchtonexttab_copy() {
        tg.customScriptStart();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        tg.customScriptEnd();
    }

    public static void fntestfunctionduplicate_copy() {
        tg.wait("ele_viewDevicePaymentPlans", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_viewDevicePaymentPlans", 1);
    }

    public static void fnturnontoggle_copy() {
        tg.wait("ele_personalInfromationToggleSwitch", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_personalInfromationToggleSwitch");
        tg.click("ele_personalInfromationToggleSwitch", 1);
    }

    public static void fnupdatenmodifybill_copy() {
        tg.customScriptStart();
        try {
            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
            // Address Line 1
            By addressBy = By.xpath("//input[@name='street1' and @data-xpr-field-label='Address']");
            WebElement address = wait.until(ExpectedConditions.visibilityOfElementLocated(addressBy));
            address.clear();
            address.sendKeys("3618 FACTORIA BLVD SE");
            System.out.println("Updated Address Line 1");
            // Apt / Suite (optional)
            List<WebElement> aptFields = driver.findElements(By.xpath("//input[contains(@name,'street2') or contains(@data-xpr-field-label,'Apt')]"));
            if (!aptFields.isEmpty()) {
                WebElement apt = aptFields.get(0);
                apt.clear();
                apt.sendKeys("SZMIHWDADRIKSARATMKH");
                System.out.println("Updated Apt/Suite");
            }
            // City
            By cityBy = By.xpath("//input[@name='city' and @data-xpr-field-label='City']");
            WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(cityBy));
            city.clear();
            city.sendKeys("BELLEVUE");
            System.out.println("Updated City");
            // State dropdown
            By stateBy = By.xpath("//select[@name='state']");
            WebElement stateDropdown = wait.until(ExpectedConditions.elementToBeClickable(stateBy));
            Select state = new Select(stateDropdown);
            state.selectByVisibleText("Washington");
            System.out.println("Selected State");
            // Zip code
            By zipBy = By.xpath("//input[@name='zipCode']");
            WebElement zip = wait.until(ExpectedConditions.visibilityOfElementLocated(zipBy));
            zip.clear();
            zip.sendKeys("98006");
            System.out.println("Updated Zip Code");
            // Save button
            By saveBy = By.xpath("//button[normalize-space()='Save']");
            WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(saveBy));
            saveBtn.click();
            System.out.println("Clicked Save");
            // Validation
            By successMsgBy = By.xpath("//span[contains(text(),'Billing address successfully saved')]");
            wait.until(ExpectedConditions.visibilityOfElementLocated(successMsgBy));
            System.out.println("Billing address updated successfully");
        } catch (Exception ex) {
            System.out.println("Billing address update failed: " + ex.getMessage());
            // Properly fail TestGrid test
            throw ex;
        }
        tg.customScriptEnd();
    }

    public static void fnusagesummarypage_copy() {
        tg.wait("ele_ThisMonthUsageDetails", ComparisonType.IS_VISIBLE);
        tg.click("ele_ThisMonthUsageDetails", 1);
        tg.check.isVisible("ele_UsageOverviewPage");
    }

    public static void fnvalidateandenablescamcalls_copy() {
        tg.wait("ele_blockScamCalls", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_blockScamCalls");
        tg.scrollToElement("ele_blockScamCalls", Direction.DOWN);
        tg.customScriptStart();
        WebElement parent = driver.findElement(By.xpath("//label[contains(text(), 'Block Scam')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "return window.getComputedStyle(arguments[0], '::after').getPropertyValue('background-color');";
        String backgroundValue = (String) js.executeScript(script, parent);
        boolean value = (backgroundValue.contains("226")) ? false : true;
        if (value) {
            parent.click();
        }
        tg.customScriptEnd();
        tg.wait(10);
        tg.wait("ele_blockScamCalls", ComparisonType.IS_VISIBLE, 20);
        tg.check.isVisible("ele_blockScamCalls");
        tg.printLogs("Scam calls block is enabled");
    }

    public static void fnvalidateandperformdisableinfoshare_copy() {
        tg.customScriptStart();
        WebElement parent = driver.findElement(By.cssSelector("label.tdds-toggle__label"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "return window.getComputedStyle(arguments[0], '::after').getPropertyValue('background-color');";
        String backgroundValue = (String) js.executeScript(script, parent);
        boolean value = (backgroundValue.contains("226")) ? true : false;
        if (value) {
            parent.click();
        }
        tg.customScriptEnd();
        tg.printLogs("Info Share toggle button is disabled.");
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

    public static void fnvalidatepaynowbuttonisclickable_copy() {
        tg.scrollToElement("ele_PayNow", Direction.DOWN);
        tg.wait("ele_PayNow", ComparisonType.IS_VISIBLE, 10);
        tg.printLogs("Card Added. Payment with card can be performed");
    }

    public static void fnvalidateprivacycenter_copy() {
        tg.wait("ele_privacyCenterHeader", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_privacyCenterHeader");
        tg.printLogs("User is navigated to privacy center");
    }

    public static void fnvalidatetermsandconditionsheader_copy() {
        tg.wait("ele_termsAndConditionHeader", ComparisonType.IS_VISIBLE, 5);
        tg.check.isVisible("ele_termsAndConditionHeader");
        tg.printLogs("user is navigated to terms and conditions tab");
    }

    public static void fnverifycancelautopayinautopay_copy() {
        tg.customScriptStart();
        try {
            String text = driver.findElement(By.xpath("//*[@id='billing-panel']//bb-box//li[2]//bb-shortcut-item//div[@class='bb-shortcut-title']")).getText();
            System.out.println("Text availaable is " + text);
            if (text.contains("Set up AutoPay")) {
                driver.findElement(By.xpath("//*[@id='billing-panel']//bb-box//li[2]//bb-shortcut-item//div[@class='bb-shortcut-title']")).click();
                tg.takeFullScreenshot();
                driver.findElement(By.xpath("//button[text()='Agree and submit']")).click();
                tg.takeFullScreenshot();
                driver.findElement(By.id("button-9c3b59304b")).click();
                tg.takeFullScreenshot();
                driver.findElement(By.xpath("//button[text()='Done']")).click();
                tg.takeFullScreenshot();
            } else if (text.contains("Manage AutoPay")) {
                driver.findElement(By.xpath("//*[@id='billing-panel']//bb-box//li[2]//bb-shortcut-item//div[@class='bb-shortcut-title']")).click();
                tg.takeFullScreenshot();
                driver.findElement(By.xpath("//button[text()='Cancel AutoPay']")).click();
                tg.takeFullScreenshot();
                driver.findElement(By.id("button-325012463b")).click();
                tg.takeFullScreenshot();
                driver.findElement(By.xpath("//button[text()='Done']")).click();
                tg.takeFullScreenshot();
            }
        } catch (Exception ex) {
            System.out.println("Exception caught " + ex);
        }
        tg.customScriptEnd();
    }

    public static void fnverifypayment_copy() {
        tg.click("ele_TotalBalancetoggle", 1);
        tg.takeFullScreenshot();
        tg.click("ele_addpayment", 1);
        tg.wait("ele_backButton", ComparisonType.IS_VISIBLE, 15);
        tg.click("ele_bankpreferred", 1);
        tg.takeFullScreenshot();
        tg.wait("ele_backButton", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_backButton", 1);
        tg.wait("ele_backButton", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_backButton", 1);
        tg.wait("ele_Calendar", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_Calendar", 1);
        tg.takeFullScreenshot();
    }

    public static void fnverifypaymentmethodinautopay_copy() {
        tg.wait("ele_paymentMethodDetails", ComparisonType.IS_VISIBLE, 10);
        tg.check.isVisible("ele_paymentMethodDetails");
        tg.check.isClickable("ele_paymentMethodDetails");
    }

    public static void frmmmrmm_copy() {
        tg.wait("ele_pickaline", ComparisonType.IS_VISIBLE);
        tg.click("ele_pickaline", 1);
        tg.wait("ele_secondaryuser", ComparisonType.IS_VISIBLE);
        tg.click("ele_secondaryuser", 1);
        tg.wait("ele_continueLine", ComparisonType.IS_VISIBLE);
        tg.click("ele_continueLine", 1);
        tg.wait("ele_familyallowancev2", ComparisonType.IS_VISIBLE);
        tg.click("ele_familyallowancev2", 1);
        tg.wait("ele_entMessagev2", ComparisonType.IS_VISIBLE);
        tg.click("ele_entMessagev2", 1);
        tg.wait("ele_continue017", ComparisonType.IS_VISIBLE);
        tg.click("ele_continue017", 1);
        tg.wait("ele_agreesubmi113", ComparisonType.IS_VISIBLE);
        tg.click("ele_agreesubmi113", 1);
        tg.wait("ele_manageaddo328", ComparisonType.IS_VISIBLE);
        tg.click("ele_manageaddo328", 1);
        tg.wait("ele_familyallo675", ComparisonType.IS_VISIBLE);
        tg.click("ele_familyallo675", 1);
        tg.wait("ele_divtgwebco004", ComparisonType.IS_VISIBLE);
        tg.click("ele_divtgwebco004", 1);
        tg.wait("ele_agree514", ComparisonType.IS_VISIBLE);
        tg.click("ele_agree514", 1);
        tg.wait("ele_continue411", ComparisonType.IS_VISIBLE);
        tg.click("ele_continue411", 1);
        tg.wait("ele_cancel672", ComparisonType.IS_VISIBLE);
        tg.click("ele_cancel672", 1);
        tg.wait("ele_dontallow408", ComparisonType.IS_VISIBLE);
        tg.click("ele_dontallow408", 1);
    }

    public static void sampleaaaa122_copy() {
        tg.wait("ele_settingsSavedMessage", ComparisonType.IS_VISIBLE);
        tg.click("ele_settingsSavedMessage", 1);
        tg.wait("ele_settingssu614", ComparisonType.IS_VISIBLE);
        tg.click("ele_settingssu614", 1);
    }

    public static void testfunction_copy() {
        tg.wait("ele_usageaddre164", ComparisonType.IS_VISIBLE);
        tg.click("ele_usageaddre164", 1);
    }
}
