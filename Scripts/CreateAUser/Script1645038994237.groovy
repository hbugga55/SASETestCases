import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.webui.driver.DriverFactory

options = new ChromeOptions();
options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability(ChromeOptions.CAPABILITY, options);
ChromeDriver driver = new ChromeDriver(capabilities);
DriverFactory.changeWebDriver(driver)
WebUI.navigateToUrl('https://portal.stage.fortisase.com/')
WebUI.click(findTestObject('Object Repository/Page_FortiSASE/span_SSO Login'))
WebUI.setText(findTestObject('Object Repository/Page_Fortinet SSO/input_Email_username'), 'hbugga')
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Fortinet SSO/input_Password_password'), 'l+dBxeH9yEGORX6w18GdRA==')
WebUI.click(findTestObject('Object Repository/Page_Fortinet SSO/input_Password_submit'))
WebUI.click(findTestObject('Object Repository/Page_FortiSASE/span_Configuration'))
WebUI.click(findTestObject('Object Repository/Page_FortiSASE/span_Users'))
WebUI.click(findTestObject('Object Repository/Page_FortiSASE/nu-menu-item-button_Create'))
WebUI.click(findTestObject('Object Repository/Page_FortiSASE/span_User Group_radio-control'))
WebUI.click(findTestObject('Object Repository/Page_FortiSASE/span_Next'))
WebUI.setText(findTestObject('Object Repository/Page_FortiSASE/input_Email_ng-untouched ng-pristine ng-invalid'), 'test1234@qatest.com')
WebUI.click(findTestObject('Object Repository/Page_FortiSASE/svg'))
WebUI.setEncryptedText(findTestObject('Object Repository/Page_FortiSASE/input_Password_ng-untouched ng-valid ng-dirty'), 
    'RigbBhfdqOBGNlJIWM1ClA==')
WebUI.click(findTestObject('Object Repository/Page_FortiSASE/path'))
WebUI.click(findTestObject('Object Repository/Page_FortiSASE/button_OK'))
WebUI.closeBroswer()

