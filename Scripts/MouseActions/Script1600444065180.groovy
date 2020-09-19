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

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Object Repository/MouseActions/Page_My Store/a_Faded Short Sleeve T-shirts'))

WebUI.click(findTestObject('Object Repository/MouseActions/Page_Faded Short Sleeve T-shirts - My Store/span_Add to cart'))

WebUI.click(findTestObject('Object Repository/MouseActions/Page_Faded Short Sleeve T-shirts - My Store/span_Continue shopping'))

WebUI.click(findTestObject('Object Repository/MouseActions/Page_Faded Short Sleeve T-shirts - My Store/img_Call us now_logo img-responsive'))

WebUI.mouseOver(findTestObject('MouseActions/ViewShopping'))

WebUI.waitForElementVisible(findTestObject('MouseActions/Page_My Store/span_Check out'), 2)

WebUI.takeScreenshot('C:/temp/screenshot-1.png')

WebUI.click(findTestObject('Object Repository/MouseActions/Page_My Store/span_Check out'))

WebUI.takeScreenshot('C:/temp/screenshot-2.png')

CustomKeywords.'common.utilities.refreshBrowser'()

