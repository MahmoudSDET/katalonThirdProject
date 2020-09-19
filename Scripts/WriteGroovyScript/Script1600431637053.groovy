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

WebUI.openBrowser('file:///D:/Download-Sample-Site/learnks1-home.html')

Date today = new Date()

String Timenow = today.format('hh:mm a')

WebUI.setText(findTestObject('Object Repository/GroovyElements/Page_LearnKS Home/input_Open a PROMPT box_debugTextbox'), 
    Timenow)

WebUI.click(findTestObject('Page_LearnKS Home/button_Open a CONFIRM box'))

WebUI.waitForAlert(3)

testcaseAlertText = WebUI.getAlertText()

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.setText(findTestObject('GroovyElements/Page_LearnKS Home/input_Open a PROMPT box_debugTextbox'), testcaseAlertText)

