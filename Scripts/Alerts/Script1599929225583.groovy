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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.globalURL)

WebUI.click(findTestObject('Object Repository/Page_LearnKS Home/button_Open an ALERT box'))

WebUI.waitForAlert(2)

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.click(findTestObject('Page_LearnKS Home/button_Open a CONFIRM box'))

WebUI.waitForAlert(2)

WebUI.dismissAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_LearnKS Home/Alert_Text_After_Dismissing'), 'You pressed Cancel!')

WebUI.click(findTestObject('Page_LearnKS Home/button_Open a PROMPT box'))

WebUI.waitForAlert(2)

WebUI.setAlertText('Mahmoud')

WebUI.acceptAlert()

WebUI.verifyTextPresent('Mahmoud', false)

