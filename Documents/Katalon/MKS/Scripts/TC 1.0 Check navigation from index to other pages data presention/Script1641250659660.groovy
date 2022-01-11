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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

tu = (GlobalVariable.adres + '//index.html')

WebUI.navigateToUrl(tu)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_/h2_Sygnay dwikowe'))

WebUI.click(findTestObject('Object Repository/Page_/a_Flagi'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_/th_Flaga'), 0)

WebUI.navigateToUrl(tu)

WebUI.click(findTestObject('Page_/a_Kontakt'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_/h1_Aby zobaczy mejl rozwi zagadk'))

WebUI.closeBrowser()

